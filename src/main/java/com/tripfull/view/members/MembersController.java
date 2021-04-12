package com.tripfull.view.members;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tripfull.biz.members.MembersService;
import com.tripfull.biz.members.MembersVO;


@Controller
public class MembersController {

	@Autowired
	private MembersService membersService;
	
	//회원 등록
	@RequestMapping("/insertMembers.do")
	public String insertBoard(MembersVO vo, HttpSession session) throws Exception {
	System.out.println("회원가입 처리");		
		
		membersService.insertMembers(vo);
		
		return "redirect:index.do";
		
	}
	
}
