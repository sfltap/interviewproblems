package com.interview.problem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.interview.problem.model.Feedback;

@Controller
public class FeedbackController {
	
	@GetMapping("/feedback")
	public String feedbackForm(Model model) {
		model.addAttribute("feedback", new Feedback());
		return "feedback";
	}

	@PostMapping("/feedback")
	public String greetingSubmit(@ModelAttribute Feedback feedback, Model model) {
		model.addAttribute("feedback", feedback);
		return "feedbackResult";
	}

}

//TODO: add @Validation for the feedback so that the annotations work in the view/html
