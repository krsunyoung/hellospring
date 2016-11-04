package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/write")
	public String write(@RequestParam("name") String name, 
			/*추천*/		@RequestParam(value = "content", required=true, defaultValue="")
						String content){
		
		return "board : write " +name  + ": " +content;
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete( @RequestParam(value="no", required=true, defaultValue="0") int no){
		
		return "board : delete " + no ;
	}
	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view( @PathVariable ("no") int no ){
		
		return "board : view " + no ;
	}

}
