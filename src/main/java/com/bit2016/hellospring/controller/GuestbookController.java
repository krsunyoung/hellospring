package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//request mapping ( type 단독)
@Controller
@RequestMapping("/guestbook/*") //* 을 붙여주면 메소드 이름으로 자동으로 mapping 된다. 값만 없을뿐 @는 써줘야 한다.
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping
	public String list(){
		return "guestbook list";
	}

	@ResponseBody
	@RequestMapping
	public String add(){
		return "guestbook add";
	}

	@ResponseBody
	@RequestMapping
	public String delete(){
		return "guestbook delete";
	}
}
