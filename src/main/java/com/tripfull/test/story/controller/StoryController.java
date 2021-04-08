package com.tripfull.test.story.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/story/*")
public class StoryController {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void getList() throws Exception {
	  
	   
	 }
}
