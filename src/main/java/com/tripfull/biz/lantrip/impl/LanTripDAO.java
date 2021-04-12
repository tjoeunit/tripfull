package com.tripfull.biz.lantrip.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripfull.biz.lantrip.LanTripVO;

@Repository
public class LanTripDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;	
	
	public void insertLanTrip(LanTripVO vo){
		mybatis.insert("BoardDAOTemp.insertLanTrip", vo);
	  }
	
    public void updateLanTrip(LanTripVO vo){
    	mybatis.update("BoardDAOTemp.updateLanTrip", vo);
	}
	  
	public void deleteLanTrip(LanTripVO vo){
		  mybatis.delete("BoardDAOTemp.deleteLanTrip", vo);
	}  
	  
	public LanTripVO getLanTrip(LanTripVO vo) {
	  return mybatis.selectOne("BoardDAOTemp.getLanTrip", vo);
	}
	  
	public List<LanTripVO> getLanTripList(LanTripVO vo) {
		  // 검색 기능 전 
		  return mybatis.selectList("BoardDAOTemp.getLanTripList", vo);
		 
    } 
}
