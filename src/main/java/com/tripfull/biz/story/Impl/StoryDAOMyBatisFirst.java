package com.tripfull.biz.story.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripfull.biz.story.StoryVO;


@Repository
public class StoryDAOMyBatisFirst extends SqlSessionDaoSupport{

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public void insertStory(StoryVO vo) {
		getSqlSession().insert("StoryDAOTemp.insertStory", vo);
	}
	
	public void updateStory(StoryVO vo) {
		getSqlSession().update("StoryDAOTemp.updateStory", vo);
	}
	
	public void deleteStory(StoryVO vo) {
		getSqlSession().delete("StoryDAOTemp.deleteStory", vo);
	}
	
	public StoryVO getStory(StoryVO vo) {
		return getSqlSession().selectOne("StoryDAOTemp.getStory", vo);
	}
	
	public List<StoryVO> getStoryList(StoryVO vo) {
		// 검색 기능 전
		//return myBatis.selectList("StoryDAOTemp.getStoryList", vo);
		
		// 검색 기능 후
		if(vo.getStorySearchCondition().equals("TITLE")){
			return getSqlSession().selectList("StoryDAOTemp.getStoryList_T", vo);
		}else if(vo.getStorySearchCondition().equals("CONTENT")){
			return getSqlSession().selectList("StoryDAOTemp.getStoryList_C", vo);			
		}else {
			return getSqlSession().selectList("StoryDAOTemp.getStoryList_T", vo);
		}
	}

}

