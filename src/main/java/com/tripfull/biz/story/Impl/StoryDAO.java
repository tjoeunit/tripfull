package com.tripfull.biz.story.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripfull.biz.story.StoryVO;

@Repository
public class StoryDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertStory(StoryVO vo) {
		mybatis.insert("StoryDAOTemplate.insertStory", vo);
	}
	
	public void updateStory(StoryVO vo) {
		mybatis.update("StoryDAOTemplate.updateStory", vo);
	}
	
	public void deleteStory(StoryVO vo) {
		mybatis.delete("StoryDAOTemplate.deleteStory", vo);
	}
	
	public StoryVO getStory(StoryVO vo) {
		return mybatis.selectOne("StoryDAOTemplate.getStory", vo);
	}
	
	public List<StoryVO> getStoryList(StoryVO vo) {
		// 검색 기능 전
		return mybatis.selectList("StoryDAOTemp.getStoryList", vo);			//구현해야 함!
		/*
		 * if(vo.getStorySearchCondition().equals("TITLE")){ return
		 * mybatis.selectList("StoryDAOTemplate.getStoryList_T", vo); }else
		 * if(vo.getStorySearchCondition().equals("CONTENT")){ return
		 * mybatis.selectList("StoryDAOTemplate.getStoryList_C", vo); }else { return
		 * mybatis.selectList("StoryDAOTemplate.getStoryList_T", vo); }
		 */
	}
}
