package com.interview.problem.service;

import com.interview.problem.dao.InventoryDAO;
import com.interview.problem.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    @Qualifier(value = "usInventoryDAO")
    private InventoryDAO unitedStatesInventoryDAO;

	@Autowired
	@Qualifier(value = "euroInventoryDAO")
	private InventoryDAO euroInventoryDAO;

    @Override
    public List<Inventory> getUSInventory() {
        return unitedStatesInventoryDAO.getInventory();
    }

    @Override
    public List<Inventory> getEuroInventory() {
        return null;
        // return euroInventoryDAO.getInventory();
    }

    @Override
    public void addItemCategoryCodeDesc(List<Inventory> inventoryList) {
        for(int i = 0; i < 5; i++) {
            switch (inventoryList.get(i).getItemCategoryCode()) {
                case "A" :
                    inventoryList.get(i).setItemCategoryCodeDesc("Consumable");
                    break;
                case "B" :
                    inventoryList.get(i).setItemCategoryCodeDesc("Non-Consumable");
                    break;
                default:
                    break;
            }
        }
    }
}
