package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.CalculateTotalShoppingCartValue;

public class CalculateTotalShoppingCartValueService implements Service{

    @Override
    public void invoke() {
        System.out.println("CalculateTotalShoppingCartValueService ----------------------");
        CalculateTotalShoppingCartValue calculateTotalShoppingCartValue = new CalculateTotalShoppingCartValue();
        calculateTotalShoppingCartValue.invoke();
        System.out.println("----------------------------------------");
    }
}
