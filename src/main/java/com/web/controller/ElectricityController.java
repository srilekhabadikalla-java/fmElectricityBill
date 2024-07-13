package com.web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Ebill;

@Controller

public class ElectricityController {
	
	@RequestMapping("/")
	public String displayForm(Model model) {
		Ebill bill=new Ebill();
		model.addAttribute(bill);
		return "ebill";
	}

	@RequestMapping("/bill")
	public String displayResult(@ModelAttribute Ebill bill,Model model) {
		model.addAttribute("bills", bill);
		int units=bill.getCr()-bill.getPr();
		double rate=0;
		double tb=0.0;
		if (units<300) {
			rate=1.75;
		}
		else if(units>=300 && units<500) {
			rate=3.25;
		}
		else {
			rate=7.25;
		}
		tb=units*rate;
		model.addAttribute("units",units);
		model.addAttribute("tb", tb);
		
		return "res";
	}
}

