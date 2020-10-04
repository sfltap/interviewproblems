package com.interview.problem.controller;

import com.interview.problem.model.Greeting;
import com.interview.problem.model.Inventory;
import com.interview.problem.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/unitedStatesInventory")
    public String usInventoryList(Model model) {
        List<Inventory> usInventory = inventoryService.getUSInventory();
        inventoryService.addItemCategoryCodeDesc(usInventory);
        model.addAttribute("inventory", usInventory);
        return "usInventory";
    }
    @GetMapping("/getEuropeanInventory")
    public String euroInventoryList(Model model) {
        List<Inventory> euroInventory = inventoryService.getEuroInventory();
        model.addAttribute("inventory", euroInventory);
        return "euroInventory";
    }
}
