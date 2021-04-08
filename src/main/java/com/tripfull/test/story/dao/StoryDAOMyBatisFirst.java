package com.tripfull.test.story.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StoryDAOMyBatisFirst extends SqlSessionDaoSupport{
/*
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public void insertBoard(BoardVO vo) {
		getSqlSession().insert("BoardDAOTemp.insertBoard", vo);
	}
	
	public void updateBoard(BoardVO vo) {
		getSqlSession().update("BoardDAOTemp.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		getSqlSession().delete("BoardDAOTemp.deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		return getSqlSession().selectOne("BoardDAOTemp.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		// 검색 기능 전
		//return myBatis.selectList("BoardDAOTemp.getBoardList", vo);
		if(vo.getSearchCondition().equals("TITLE")){
			return getSqlSession().selectList("BoardDAOTemp.getBoardList_T", vo);
		}else if(vo.getSearchCondition().equals("CONTENT")){
			return getSqlSession().selectList("BoardDAOTemp.getBoardList_C", vo);			
		}else {
			return getSqlSession().selectList("BoardDAOTemp.getBoardList_T", vo);
		}
	}
	*/
}
