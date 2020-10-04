package com.interview.problem.controller;

import com.interview.problem.model.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class CustomerController {

    @GetMapping("/customerList")
    public String customerList(Model model) {
        return "customerList";
    }
}
