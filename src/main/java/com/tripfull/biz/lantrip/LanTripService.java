package com.tripfull.biz.lantrip;

import java.util.List;

public interface LanTripService {
	// CRUD 기능의 메서드 구현
	
	// 글 등록
	void insertLTBoard(LanTripVO vo);
	
	// 글 목록 조회
	List<LanTripVO> getLTBoardList(LanTripVO vo);
	
	// 글 상세 조회
	LanTripVO getLTBoard(LanTripVO vo);
	
	// 글 수정
	void updateLTBoard(LanTripVO vo);
	
	// 글 삭제
	void deleteLTBoard(LanTripVO vo);
}





