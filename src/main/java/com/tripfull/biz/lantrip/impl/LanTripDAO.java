package com.tripfull.biz.lantrip.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripfull.biz.lantrip.LanTripVO;

@Repository
public class LanTripDAO extends SqlSessionDaoSupport{

	SqlSession myBatis = getSqlSession();
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public void insertLTBoard(LanTripVO vo) {
		getSqlSession().insert("BoardDAOTemp.insertBoard", vo);
	}
	
	public void updateLTBoard(LanTripVO vo) {
		getSqlSession().update("BoardDAOTemp.updateBoard", vo);
	}
	
	public void deleteLTBoard(LanTripVO vo) {
		getSqlSession().delete("BoardDAOTemp.deleteBoard", vo);
	}
	
	public LanTripVO getLTBoard(LanTripVO vo) {
		return getSqlSession().selectOne("BoardDAOTemp.getBoard", vo);
	}
	
	public List<LanTripVO> getLTBoardList(LanTripVO vo){
		// 검색 기능 전
		return myBatis.selectList("BoardDAOTemp.getBoard", vo);
		/*if(vo.getSearchCondition().equals("TITLE")) {
			return getSqlSession().selectList("BoardDAOTemp.getBoardList_T", vo);
		}else if(vo.getSearchCondition().equals("CONTENT")){
			return getSqlSession().selectList("BoardDAOTemp.getBoardList_C", vo);
		}else {
			return getSqlSession().selectList("BoardDAOTemp.getBoardList_T", vo);
		}*/
	}

	
}
