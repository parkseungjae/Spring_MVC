package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "/index") // url경로
	public String memberIndex(Model model) {
		return "member/index";// 파일경로
	}

	@RequestMapping("logout")
	public String memberLogout(Model model) {
		model.addAttribute("key", "로그아웃되었습니다");
		return "member/logout";
	}

	@RequestMapping("/login")
	public ModelAndView memberLogin() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("login", "로그인 성공!");
		mav.setViewName("member/login");
		return mav;
	}
}
