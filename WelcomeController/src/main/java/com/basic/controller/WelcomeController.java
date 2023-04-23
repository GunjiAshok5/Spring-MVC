package com.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping(value="/welcome")
	public ModelAndView welcome() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("welcome","Welcome to controller");
		mav.setViewName("index");
		return mav;
	}
	
	
	@GetMapping(value="/greet")
	public ModelAndView greet() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("welcome","Good Morning!...");
		mav.setViewName("index");
		return mav;
	}
	
}
