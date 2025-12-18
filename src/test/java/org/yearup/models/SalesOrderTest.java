package org.yearup.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SalesOrderTest {
    @Test
    void salesOrder_shouldStoreAndRetrieveValuesCorrectly() {
        // Arrange (Set up your test data)
        SalesOrder order = new SalesOrder();
        String expectedAddress = "123 Java Street";
        BigDecimal expectedShipping = new BigDecimal("5.99"); //testing BigDecimal for the shipping cost
        String expectedZip = "90210";

        // Act (Put the data IN)
        order.setShippingAddress(expectedAddress);
        order.setShippingCost(expectedShipping);
        order.setZip(expectedZip);

        // Assert (Check if the data comes OUT correctly)
        assertEquals(expectedAddress, order.getShippingAddress(), "Address should match");
        assertEquals(expectedShipping, order.getShippingCost(), "Shipping cost should match");
        assertEquals(expectedZip, order.getZip(), "Zip code should match");
    }

}