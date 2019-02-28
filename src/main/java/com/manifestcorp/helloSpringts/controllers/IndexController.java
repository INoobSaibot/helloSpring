package com.manifestcorp.helloSpringts.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Value("${this.is.a.property}")
	String str;
	
	@RequestMapping({"/products",""})
	public String index(Model model) {
		model.addAttribute("message", str);
		return "index";
	}
}
