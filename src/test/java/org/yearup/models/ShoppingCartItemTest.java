package org.yearup.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**The ShoppingCartItemTest ensures that our financial calculations are accurate to the penny*/

class ShoppingCartItemTest {
    @Test
    void getLineTotal_shouldReturnCorrectAmount_whenQuantityIsGreaterThanOne() {
        // Arrange (Set up the data)
        Product product = new Product();
        product.setPrice(new BigDecimal("10.00")); // Price is $10.00

        ShoppingCartItem item = new ShoppingCartItem();
        item.setProduct(product);
        item.setQuantity(2); // Buy 2 of them

        // Act (Do the calculation)
        BigDecimal expected = new BigDecimal("20.00");
        BigDecimal actual = item.getLineTotal();

        // Assert (Check if they match)
        // Note: For BigDecimal, we use compareTo == 0 instead of equals()
        assertEquals(0, actual.compareTo(expected), "Total should be 20.00");
    }

}