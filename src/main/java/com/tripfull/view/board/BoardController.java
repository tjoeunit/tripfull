package com.tripfull.view.board;

import java.io.File;
import java.io.IOException;
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

import com.tripfull.biz.board.BoardService;
import com.tripfull.biz.board.flightBoardVO;

@Controller
@SessionAttributes("board") 
//모델에 저장할때 세션영역에도 자료 저장해줘

public class BoardController {
	@Autowired 
	//주입하기
	private BoardService boardService;
	
	// 글 목록 검색
	@RequestMapping("/getBoardList.do") 
	public String getBoardList(flightBoardVO vo, Model model){
		System.out.println("글 목록 검색 처리");	
		
		List<flightBoardVO> boardList = boardService.getBoardList(vo);
		
		model.addAttribute("boardList", boardList);
		// "boardList" 저장할 이름 , boardList : "boardList"에 저장 될 값
		return "airlineTicket.jsp";
	}	// 모델에는 2개의 값이 담긴다. 모델엔 뷰니까 모델값과 뷰값
	
}

