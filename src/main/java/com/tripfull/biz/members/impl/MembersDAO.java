package com.tripfull.biz.members.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tripfull.biz.members.MembersVO;

@Repository
public class MembersDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertMembers(MembersVO vo){
		mybatis.insert("MembersDAOTemp.insertMembers", vo);
	}
	
	
	
	
	
	
	
}
