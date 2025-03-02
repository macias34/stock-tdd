package com.macias34.inventory;

import java.util.HashMap;
import java.util.Map;

class Stock {

    private final Map<Item, Quantity> stockEntries = new HashMap<>();

    void supply(Item item, Quantity quantity) {
        stockEntries.put(item, quantity);
    }

    void withdraw(Item item, Quantity quantity) {
        Quantity quantityAfterWithdrawing = getQuantityFor(item).subtract(quantity);
        stockEntries.put(item, quantityAfterWithdrawing);
    }

    Quantity getQuantityFor(Item item) {
        return stockEntries.get(item);
    }
}
