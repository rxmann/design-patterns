package decorator.pizza.component.impl;

import decorator.pizza.component.Pizza;

public class ThinCrustPizza implements Pizza  {
    @Override
    public String getDescription() {
        return "Thin Crust Pizza";
    }

    @Override
    public Double getPrice() {
        return 80.0;
    }
}