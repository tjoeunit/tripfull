package com.tripfull.biz.members.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripfull.biz.members.MembersService;
import com.tripfull.biz.members.MembersVO;

@Service
public class MembersServiceImpl implements MembersService {

	@Autowired
	private MembersDAO membersDAO;
	
	@Override
	public void insertMembers(MembersVO vo) {
		membersDAO.insertMembers(vo);
	}
}
