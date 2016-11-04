package com.bit2016.hellospring.controller;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	// 메서드 단독 request mapping 
	@RequestMapping("/main")
	public String main(){
		return "main";
	}
	
	// ------------------비추천 --------------
	//				기술이 침투되어 있다. 
	@ResponseBody
	@RequestMapping("/main2")
	public String main2(HttpServletRequest request, Writer out){
		String name = request.getParameter("name");
		return "main"+name;
	}
}
