package com.macias34.stock;

record Quantity(int value) {
    Quantity subtract(Quantity quantity) {
        return new Quantity(value() - quantity.value());
    }
}
