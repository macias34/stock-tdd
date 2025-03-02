package com.macias34.stock;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StockTransferring {

    @Test
    void transferring_moves_items_from_target_to_source_stock() {
        // Given
        Item notebook = new Item("notebook");
        Stock sourceStock = new Stock();
        sourceStock.supply(notebook, new Quantity(5));
        Stock targetStock = new Stock();
        TransferService transferService = new TransferService();

        // When
        boolean transferResult =
                transferService.transfer(sourceStock, targetStock, notebook, new Quantity(5));

        // Then
        assertThat(transferResult).isTrue();
        assertThat(sourceStock.getQuantityFor(notebook)).isEqualTo(new Quantity(0));
        assertThat(targetStock.getQuantityFor(notebook)).isEqualTo(new Quantity(5));
    }
}
