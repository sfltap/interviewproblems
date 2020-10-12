package com.interview.problem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.interview.problem.model.Customer;
import com.interview.problem.service.CustomerService;

@Controller
public class CustomerController {
    @Autowired
        private CustomerService customerService;
    @GetMapping("/customerList")
    public String customerList(Model model) {
        List<Customer> customerList = customerService.getCustomerList();
        model.addAttribute("customer", customerList);
        return "customerList";
    }
}
