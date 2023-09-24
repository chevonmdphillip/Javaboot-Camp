package com.chevonphillip.inventory.main;

import com.chevonphillip.inventory.Inventory;
import com.chevonphillip.inventory.Product;
import com.chevonphillip.inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product iPhone = new Product(1, "iPhone", 999.99);
        Inventory iPhoneInventory = new Inventory(iPhone, 10);
        Warehouse warehouse = new Warehouse(1, "iPhone Warehouse", iPhoneInventory.toString());
        System.out.println(warehouse);


    }
}
