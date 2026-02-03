package decorator.pizza.decorator.impl;

import decorator.pizza.component.Pizza;
import decorator.pizza.decorator.PizzaDecorator;

public class ChickenTopping extends PizzaDecorator {
    public ChickenTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 50.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chicken";
    }
}
