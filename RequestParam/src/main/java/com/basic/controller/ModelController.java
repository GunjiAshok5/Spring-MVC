package com.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelController {

	@GetMapping(value="wel")
	public String getWelcomeMsg(@RequestParam String name, Model model) {
		
		model.addAttribute("book",name +"  welcome to Gunji Ashok Java Tech");
		return "index";
	}
}
