package decorator.pizza;

import decorator.pizza.component.Pizza;
import decorator.pizza.component.impl.ThinCrustPizza;
import decorator.pizza.decorator.impl.CheeseTopping;
import decorator.pizza.decorator.impl.ChickenTopping;
import decorator.pizza.decorator.impl.SauceTopping;

public class PizzaTest {
    public static void main(String[] args) {


        Pizza pizza =
                new CheeseTopping(
                        new SauceTopping(
                                new ChickenTopping(
                                        new ThinCrustPizza()
                                )
                        )
                );
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());

    }
}
