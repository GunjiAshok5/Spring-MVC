package com.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

	@GetMapping(value="/car/{carId}/hyd")
	public ModelAndView getCarColor(@PathVariable Integer carId) {
		
		ModelAndView mav=new ModelAndView();
		String color=null;
		if(carId>=100) {
			color="Red";
		}else{
			color="Black";
		}
		mav.addObject("book","car color is :"+ color);
		mav.setViewName("/index");
		return mav;
	}
}
