package decorator.pizza.component.impl;

import decorator.pizza.component.Pizza;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public Double getPrice() {
        return 100.0;
    }
}