package com.restfuldatabaseaccess.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlResponseController {

	@RequestMapping(value="/hello")
	public String sayHello(Model model) {
		model.addAttribute("message","Hello World!");
		return "test";
	}
}
