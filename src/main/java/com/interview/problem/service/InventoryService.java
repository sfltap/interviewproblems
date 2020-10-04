package com.interview.problem.service;

import com.interview.problem.model.Inventory;

import java.util.List;

public interface InventoryService {
    List<Inventory> getUSInventory();
    List<Inventory> getEuroInventory();
    void addItemCategoryCodeDesc(List<Inventory> inventoryList);

}
