package com.care.root.member.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService ms;
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	
	@PostMapping("successLogin")
	public String successLogin(MemberDTO dto) {
		if(ms.chkLogin(dto) == 1) {
			return "redirect:member/successLogin";			
		}else {
			return "redirect:member/login";						
		}
		
	}
	
}
