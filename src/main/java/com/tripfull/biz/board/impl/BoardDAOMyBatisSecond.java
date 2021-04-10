package com.tripfull.biz.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripfull.biz.board.flightBoardVO;

@Repository
public class BoardDAOMyBatisSecond {
	
	@Autowired
	private SqlSessionTemplate mybatis;	
	
	public void insertBoard(flightBoardVO vo){
		mybatis.insert("BoardDAOTemp.insertBoard", vo);
	  }
	
    public void updateBoard(flightBoardVO vo){
    	mybatis.update("BoardDAOTemp.updateBoard", vo);
	}
	  
	public void deleteBoard(flightBoardVO vo){
		  mybatis.delete("BoardDAOTemp.deleteBoard", vo);
	}  
	  
	public flightBoardVO getBoard(flightBoardVO vo) {
	  return mybatis.selectOne("BoardDAOTemp.getBoard", vo);
	}//  값을 반환하는 셀렉문 , 하나만 반환하면 selectOne
	  
	public List<flightBoardVO> getBoardList(flightBoardVO vo) {
		  // 검색 기능 전 
		  return mybatis.selectList("BoardDAOTemp.getBoardList", vo);
		 
    } 
}
