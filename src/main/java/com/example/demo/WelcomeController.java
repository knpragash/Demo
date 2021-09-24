package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		
		model.addAttribute("message", "Hi Pragash");
		return "welcome";
	}
	
	@GetMapping("/hello")
	public String welcome2(Model model) {
		
		model.addAttribute("message", "Success");
		return "welcome2";
	}

}
