package com.macias34.inventory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InventorySupplying {

    @Test
    void supply_registers_item_in_inventory_when_encountered_first_time() {
        // Given
        Inventory inventory = new Inventory();

        // When
        inventory.supply("notebook", 5);

        // Then
        assertThat(inventory.getInventoryLevel("notebook")).isEqualTo(5);
    }

    @Test
    void supply_increases_quantity_for_item_already_in_inventory() {
        // Given
        Inventory inventory = new Inventory();
        inventory.supply("notebook", 5);

        // When
        inventory.supply("notebook", 10);

        // Then
        assertThat(inventory.getInventoryLevel("notebook")).isEqualTo(15);
    }
}
