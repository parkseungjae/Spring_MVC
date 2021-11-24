package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController02 {
	@RequestMapping(value = "member2/index")
	public String memberIndex(Model model) {
		model.addAttribute("index","기본페이지 입니다.");
		return "member2/index";
	}

	@RequestMapping(value = "member2/login")
	public ModelAndView memberlogin() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("login", "로그인 페이지입니다.");
		mav.setViewName("member2/login");
		return mav;

	}

	@RequestMapping(value = "member2/logout")
	public String memberlogout(Model model) {
		model.addAttribute("logout", "로그아웃 페이지입니다");
		return "member2/logout";
	}

}
