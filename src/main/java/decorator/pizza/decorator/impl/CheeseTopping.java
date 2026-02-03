package decorator.pizza.decorator.impl;

import decorator.pizza.component.Pizza;
import decorator.pizza.decorator.PizzaDecorator;

public class CheeseTopping  extends PizzaDecorator {
    public CheeseTopping(Pizza topping) {
        super(topping);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 50.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}