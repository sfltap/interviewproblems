package com.interview.problem.dao;

import com.interview.problem.model.Inventory;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository("euroInventoryDAO")
public class EuroInventoryDAOImpl implements InventoryDAO {
	private ArrayList<Inventory> euroInventoryList;

	@Override
	public List<Inventory> getInventory() {
		return euroInventoryList;
	}
	@PostConstruct
	public void setUpInventory() {
		// IGNORE THIS COMPLETELY IF YOU'RE LOOKING AT THIS.
		this.euroInventoryList = new ArrayList<Inventory>(){{
			add(new Inventory(1,"EuroBanana","A"));
			add(new Inventory(2,"EuroApple","A"));
			add(new Inventory(3,"EuroPear","A"));
			add(new Inventory(4,"EuroBubble Gum","A"));
			add(new Inventory(5,"EuroChair","B"));
			add(new Inventory(6,"EuroPiano","B"));
			add(new Inventory(7,"EuroCar","B"));
			add(new Inventory(8,"EuroComputer","B"));
			add(new Inventory(9,"EuroCup","B"));
			add(new Inventory(10,"EuroBook","B"));
		}};
	}
}
