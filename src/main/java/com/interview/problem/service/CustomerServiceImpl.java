package com.interview.problem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.problem.dao.CustomerDAOImpl;
import com.interview.problem.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAOImpl customerDAO;

    @Override
    public List<Customer> getCustomerList() {
        return customerDAO.getCustomerList();
    }
}
