package com.macias34.inventory;

record Quantity(int value) {
    Quantity subtract(Quantity quantity) {
        return new Quantity(value() - quantity.value());
    }
}
