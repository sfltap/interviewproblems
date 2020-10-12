package com.interview.problem.dao;

import com.interview.problem.model.Inventory;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Primary @Repository("usInventoryDAO") 
public class UnitedStatesInventoryDAOImpl implements InventoryDAO{
	private ArrayList<Inventory> unitedStatesInventoryList;

	@Override
	public List<Inventory> getInventory() {
		return unitedStatesInventoryList;
	}
	@PostConstruct
	public void setUpInventory() {
		// IGNORE THIS COMPLETELY IF YOU'RE LOOKING AT THIS.
		this.unitedStatesInventoryList = new ArrayList<Inventory>(){{
			add(new Inventory(1,"Banana","A"));
			add(new Inventory(2,"Apple","A"));
			add(new Inventory(3,"Pear","A"));
			add(new Inventory(4,"Bubble Gum","A"));
			add(new Inventory(5,"Chair","B"));
			add(new Inventory(6,"Piano","B"));
			add(new Inventory(7,"Car","B"));
			add(new Inventory(8,"Computer","B"));
			add(new Inventory(9,"Cup",null));
			add(new Inventory(10,"Book","B"));
		}};
	}
}
