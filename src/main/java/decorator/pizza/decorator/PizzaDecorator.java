package decorator.pizza.decorator;

import decorator.pizza.component.Pizza;

public class PizzaDecorator implements Pizza {

    private final Pizza topping;

    public PizzaDecorator(Pizza topping) {
        this.topping = topping;
    }

    @Override
    public String getDescription() {
        return topping.getDescription();
    }

    @Override
    public Double getPrice() {
        return topping.getPrice();
    }
}