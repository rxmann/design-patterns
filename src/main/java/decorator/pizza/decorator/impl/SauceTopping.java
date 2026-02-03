package decorator.pizza.decorator.impl;

import decorator.pizza.component.Pizza;
import decorator.pizza.decorator.PizzaDecorator;

public class SauceTopping  extends PizzaDecorator {
    public SauceTopping(Pizza topping) {
        super(topping);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 20.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sauce";
    }
}
