package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//request  mapping  (type + method)
@Controller
@RequestMapping("/user")
public class UserController {
	

	@RequestMapping("/joinform")
	public String joinForm(){
		return "/WEB-INF/views/joinform.jsp";
	}

	
	@RequestMapping(value="/join", method=RequestMethod.POST) //post방식으로만 접근이 가능. 안적어주면 두개다 가능
	public String join(@ModelAttribute UserVo vo){
		System.out.println( vo );
		return "redirect:/user/joinsuccess"; //request.getConextPath();
	}
	 
	@ResponseBody
	@RequestMapping("/joinsuccess")
	public String joinSuccess(){
		
		return "joinsuccess";
	}
}
