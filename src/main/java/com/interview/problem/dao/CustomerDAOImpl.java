package com.interview.problem.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.interview.problem.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    private List<Customer> customerList;

	@Override
	public List<Customer> getCustomerList() {
		return customerList;
	}

    @PostConstruct
    public void setUpInventory() {
        // IGNORE THIS COMPLETELY IF YOU'RE LOOKING AT THIS.
        this.customerList = new ArrayList<Customer>(){{
            add(new Customer(1,"Sydney","Applebaum"));
            add(new Customer(2,"Carl","Kringe"));
            add(new Customer(3,"Rachel","Kissinger"));
            add(new Customer(4,"Bob","Jones"));
            add(new Customer(5,"Susan","Loran"));

        }};
    }
}
