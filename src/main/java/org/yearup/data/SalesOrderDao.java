package org.yearup.data;

import org.yearup.models.Profile;
import org.yearup.models.SalesOrder;
import org.yearup.models.ShoppingCart;

public interface SalesOrderDao {
    SalesOrder create(Profile profile, ShoppingCart cart);
}
