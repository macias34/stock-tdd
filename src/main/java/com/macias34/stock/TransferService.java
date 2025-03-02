package com.macias34.stock;

class TransferService {
    boolean transfer(Stock sourceStock, Stock targetStock, Item notebook, Quantity quantity) {
        sourceStock.withdraw(notebook, quantity);
        targetStock.supply(notebook, quantity);
        return true;
    }
}
