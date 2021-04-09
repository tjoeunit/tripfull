package com.tripfull.biz.board;

import java.util.List;

public interface BoardService {

	// 글 목록 조회 
	List<flightBoardVO> getBoardList(flightBoardVO vo);
	
	//글 상세 조회
	flightBoardVO getBoard(flightBoardVO vo);
	
}
