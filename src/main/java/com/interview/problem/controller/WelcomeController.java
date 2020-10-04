package com.interview.problem.controller;

import com.interview.problem.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}


}
