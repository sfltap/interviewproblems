package com.interview.problem.model;

public class Inventory {
    public int id;
    public String itemDesc;

    /*
    A: Consumable
    B: Non-consumable
     */
    public String itemCategoryCode;

    public String itemCategoryCodeDesc;

    public Inventory() {
    }

    public Inventory(int id, String itemDesc, String itemCategoryCode) {
        this.id = id;
        this.itemDesc = itemDesc;
        this.itemCategoryCode = itemCategoryCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemCategoryCode() {
        return itemCategoryCode;
    }

    public void setItemCategoryCode(String itemCategoryCode) {
        this.itemCategoryCode = itemCategoryCode;
    }

    public String getItemCategoryCodeDesc() {
        return itemCategoryCodeDesc;
    }

    public void setItemCategoryCodeDesc(String itemCategoryCodeDesc) {
        this.itemCategoryCodeDesc = itemCategoryCodeDesc;
    }
}
