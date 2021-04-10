package com.tripfull.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripfull.biz.board.flightBoardVO;

@Repository
public class BoardDAOMyBatisFirst extends SqlSessionDaoSupport{
	
/*
	1. applicationContext.xml 파일에 SqlSessionFactory를 만들었다. 이걸 마이바티스에서는 SqlSessionDaoSupport로 제공한다.
	*SqlSessionDaoSupport 안에 setSqlSessionFactory 메서드가 정의되어있다.  
	*그래서 최상위 클래스를 상속시킨것이다.
	2. extends 한다. 
	3. override 하면 파라메터에 SqlSessionFactory 빈이 들어가있다. 초기화, 이대로 부모클래스에 정의되어있다.
	4. Autowired을 설정한다.
	5. 부모 메서드에다가 다시 전달한다.	
	주입은 필드 setter메서드 빈 객체 	 
*/	
 
	SqlSession  myBatis = 	getSqlSession();
	
  @Autowired 
  // SqlSessionFactory 빈 주입
  // setter메서드도 주입이 가능하다.
  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	  super.setSqlSessionFactory(sqlSessionFactory);
  } // 연결하고 끊어주니까 실시간으로 다시 불러와야한다. 아니면 에러가 난다. 
  		
  public void insertBoard(flightBoardVO vo){
	  getSqlSession().insert("BoardDAOTemp.insertBoard", vo);
  }// 위에서 받은 자료를 토대로 반환해준다.
  // 부모클래스에 정의된 메서드 활용
  // springboard-mapping.xml 에 mapper namespace, insert id 지정
  
  public void updateBoard(flightBoardVO vo){
	  getSqlSession().update("BoardDAOTemp.updateBoard", vo);
  }
  
  public void deleteBoard(flightBoardVO vo){
	  getSqlSession().delete("BoardDAOTemp.deleteBoard", vo);
  }  
  
  public flightBoardVO getBoard(flightBoardVO vo) {
	  return getSqlSession().selectOne("BoardDAOTemp.getBoard", vo);
  }//  값을 반환하는 셀렉문 , 하나만 반환하면 selectOne
  
  public List<flightBoardVO> getBoardList(flightBoardVO vo) {
	  // 검색 기능 전 
	  return myBatis.selectList("BoardDAOTemp.getBoardList", vo);	 
  }  
}
