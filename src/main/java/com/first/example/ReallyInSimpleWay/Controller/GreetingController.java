package com.first.example.ReallyInSimpleWay.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/information")
	public Model greeting( Model model) {
		//model.addAttribute("name", name);
		return model;
	}

}