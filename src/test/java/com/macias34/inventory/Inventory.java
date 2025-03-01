package com.macias34.inventory;

import java.util.HashMap;
import java.util.Map;

class Inventory {

    private Map<String, Integer> inventoryEntries = new HashMap<>();

    void supply(String item, int quantity) {
        int newQuantity = inventoryEntries.getOrDefault(item, 0) + quantity;
        inventoryEntries.put(item, newQuantity);
    }

    int getInventoryLevel(String item) {
        return inventoryEntries.get(item);
    }
}
