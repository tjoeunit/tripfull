package com.tripfull.test.story.service;

import java.util.List;

import com.tripfull.product.story.StoryVO;

public interface StoryService {
	// CRUD 기능의 추상 메서드 구현
	
	//글 등록
	void insertBoard(StoryVO vo);
	
	//글 목록 조회
	List<StoryVO> getBoardList(StoryVO vo);
	
	//글 상세 조회
	StoryVO getBoard(StoryVO vo);
	
	//글 수정
	void updateBoard(StoryVO vo);
	
	//글 삭제
	void deleteBoard(StoryVO vo);
}
