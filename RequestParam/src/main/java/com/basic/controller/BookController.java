package com.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	@GetMapping(value="/welcome")
	public ModelAndView getBookData(@RequestParam String name, String author) {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("book",name + " By " +author+ "  Book is out of stock");
		mav.setViewName("index");
		
		return mav;
	}
	
}
