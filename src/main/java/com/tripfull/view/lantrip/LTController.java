package com.tripfull.view.lantrip;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.tripfull.biz.lantrip.LanTripService;
import com.tripfull.biz.lantrip.LanTripVO;

@Controller
@SessionAttributes("lanTrip")
public class LTController {
	@Autowired
	private LanTripService lanTripService;
	
	// 글 등록
	@RequestMapping("/insertBoard.do")
	public String insertBoard(LanTripVO vo, HttpSession session) throws Exception {
		System.out.println("글 등록 처리");
		
		// 썸네일 파일 업로드 처리
		String thumbLTFolder = session.getServletContext().getRealPath("/LTUpload/thumb");
		
		MultipartFile uploadLTThumb = vo.getLantrip_thumb();
		if(!uploadLTThumb.isEmpty()) {
			String fileName = uploadLTThumb.getOriginalFilename();
			uploadLTThumb.transferTo(new File(thumbLTFolder+fileName));
		}
		
		lanTripService.insertLTBoard(vo);
		return "redirect:getBoardList.do";
		
/*	에러나서 주석처리	// 이미지 파일 업로드 처리
		String imgLTFolder = session.getServletContext().getRealPath("/LTUpload/img");
				
		MultipartFile uploadLTImg = vo.getLantrip_img();
		if(!uploadLTImg.isEmpty()) {
			String fileName = uploadLTImg.getOriginalFilename();
			uploadLTImg.transferTo(new File(imgLTFolder+fileName));
		}
				
		lanTripService.insertLTBoard(vo);
		return "redirect:getBoardList.do";*/
	}

	// 글 수정 매개변수 앞에서 사용되어지는 어노테이션 @ModelAttribute
	// 객체의 이름을 변경하고 싶을 때 아래 내용은 식별자가 BoardVO의 디폴트인 boardVO로 지정이 되어있고 어노테이션을 통해 board로 변경 
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") LanTripVO vo) {
		System.out.println("글 수정 처리" + vo);
		
		lanTripService.updateLTBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(LanTripVO vo) {
		System.out.println("글 삭제 처리");
		
		lanTripService.deleteLTBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	// 검색기능 이용을 위한 정의, key형태로 데이터 정리 "제목"이 key, "TITLE"는 value
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
	// 글 목록 검색
/*	@RequestMapping("/getBoardList.do")
	public String getBoardList(LanTripVO vo, Model model) {
		System.out.println("글 목록 검색 처리");
		// 검색 기능 추가 Null check
		if(vo.getSearchCondition() == null) {
			vo.setSearchCondition("TITLE");
		}
		
		if(vo.getSearchKeyword() == null) {
			vo.setSearchKeyword("");
		}
		
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		model.addAttribute("boardList", boardList);
		return "getBoardList.jsp";
	}	*/
	
	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(LanTripVO vo, Model model) {
		System.out.println("글 상세 조회 처리");
		
		LanTripVO board = lanTripService.getLTBoard(vo);
		
		model.addAttribute("board", board);
		
		return "getLanTripBoard.jsp";				
	}	
	
}
