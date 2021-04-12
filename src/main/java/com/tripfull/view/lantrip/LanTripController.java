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
public class LanTripController {
	@Autowired
	private LanTripService lanTripService;
	
// 글 등록
	@RequestMapping("/insertLanTrip.do")
	public String insertLanTrip(LanTripVO vo, HttpSession session) throws Exception {
		System.out.println("랜선여행 등록 처리");
		
		// 썸네일 파일 업로드 처리
		String thumbLTFolder = session.getServletContext().getRealPath("/LTUpload/thumb");
		
		MultipartFile uploadLTThumb = vo.getLantrip_thumb();
		if(!uploadLTThumb.isEmpty()) {
			String LTfileName = uploadLTThumb.getOriginalFilename();
			uploadLTThumb.transferTo(new File(thumbLTFolder+LTfileName));
		}
		
		// DB연동처리
		lanTripService.insertLanTrip(vo);
		
		// 화면전환
		return "redirect:getLTList.do";
	}

// 글 수정
	@RequestMapping("/updateLanTrip.do")
	public String updateBoard(@ModelAttribute("lanTrip") LanTripVO vo) {
		System.out.println("글 수정 처리" + vo);
		
		lanTripService.updateLanTrip(vo);
		return "redirect:getLTList.do";
	}
	
	// 글 삭제
	@RequestMapping("/deleteLanTrip.do")
	public String deleteLanTrip(LanTripVO vo) {
		System.out.println("글 삭제 처리");
		
		lanTripService.deleteLanTrip(vo);
		return "redirect:getLTList.do";
	}
	
	// 검색기능 이용을 위한 정의, key형태로 데이터 정리 "제목"이 key, "TITLE"는 value
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
// 글 목록 보기
	@RequestMapping("/getLTList.do")
	public String getLTList(LanTripVO vo, Model model) {
		System.out.println("글 목록 검색 처리");
		
	/*// 검색 기능 추가 Null check
		if(vo.getLantrip_searchcondition() == null) {
			vo.getLantrip_searchcondition("");
		}
		
		if(vo.getLantrip_searchKeyword() == null) {
			vo.getLantrip_searchKeyword("");
		}*/
		
		model.addAttribute("lanTripList", lanTripService.getLanTripList(vo));
		
		return "getLTList.jsp";
	}
	
	// 글 상세 조회
	@RequestMapping("/getLanTrip.do")
	public String getLanTrip(LanTripVO vo, Model model) {
		System.out.println("글 상세 조회 처리");
		
		LanTripVO board = lanTripService.getLanTrip(vo);
		
		model.addAttribute("lanTrip", board);
		
		return "getLTBoard.jsp";				
	}	
	
}
