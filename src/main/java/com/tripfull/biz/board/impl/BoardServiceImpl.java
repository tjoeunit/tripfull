package com.tripfull.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripfull.biz.board.BoardService;
import com.tripfull.biz.board.flightBoardVO;



@Service
// 빈생성 요청 어노테이션 
public class BoardServiceImpl implements BoardService {
// 인터 페이스 하고 모든 메서드 쓰고 나서 서비스 폴더에 뉴 해서 클래스 생성하고 인터페이스 에서 추가 시키기 
	// DI 는 이름변경 , 코드 수정을 최소화 할 수 있따 .
	//주입하겠다. 
	
	@Autowired
	//private BoardDAO boardDAO;
	//private BoardDAOMyBatisFirst boardDAO;	
	private BoardDAOMyBatisSecond boardDAO;	
	// 이 한줄만 변경하면 마이바티스를 사용할 수 있다.
	
	@Override
	public List<flightBoardVO> getBoardList(flightBoardVO vo) {
		List<flightBoardVO> list = boardDAO.getBoardList(vo);
		return list; // 메인쪽으로 리턴 
	}

	@Override
	public flightBoardVO getBoard(flightBoardVO vo) {
		flightBoardVO board = boardDAO.getBoard(vo);
		return board;
	}



}
