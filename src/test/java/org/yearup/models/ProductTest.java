package org.yearup.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
/**The ProductsControllerTest verifies that our API endpoints are up and running correctly.*/
class ProductTest {
    @Test
    void product_shouldStoreAndRetrieveValuesCorrectly() {
        // Arrange
        Product product = new Product();
        String expectedName = "Test Laptop";
        BigDecimal expectedPrice = new BigDecimal("999.99");

        // Act
        product.setName(expectedName);
        product.setPrice(expectedPrice);

        // Assert
        assertEquals(expectedName, product.getName(), "Product name should match what was set");
        assertEquals(expectedPrice, product.getPrice(), "Price should match what was set");
    }

}