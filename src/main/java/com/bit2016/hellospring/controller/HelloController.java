package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(@RequestParam("name") String name, Model model){
		//parameter를 받고 싶으면 requestparam을 써주면 된다.
		model.addAttribute("name",name);
		return "/WEB-INF/views/hello.jsp";
		//servlet jsp가 작동하고 있는데 안보이는것.
	}
	//viewResolver 로 가지고 않는다. body가 있으면 view로 가서 출력해준다.
	@ResponseBody
	@RequestMapping("/hello2")
	public String hello2(){
		return "hello2";
		
	}
	
	@RequestMapping("/hello3")
	public ModelAndView hello3(@RequestParam("name")String name){
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
		
	}
}
