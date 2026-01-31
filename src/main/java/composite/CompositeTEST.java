package composite;

import composite.component.MenuComponent;
import composite.composite.ComboMeal;
import composite.impl.Burger;
import composite.impl.Drink;
import composite.impl.Fries;

public class CompositeTEST {

    public static void main(String[] args) {

        MenuComponent burger = new Burger("Cheese Burger", 5.0);
        MenuComponent fries = new Fries("Large Fries", 2.5);
        MenuComponent drink = new Drink("Cola", 1.5);

        ComboMeal combo1 = new ComboMeal("Basic Combo");
        combo1.add(burger);
        combo1.add(fries);

        ComboMeal megaCombo = new ComboMeal("Mega Combo");
        megaCombo.add(combo1);
        megaCombo.add(drink);

        MenuComponent order = megaCombo;

        order.show();
        System.out.println("----------------");
        order.prepare();
        System.out.println("----------------");
        System.out.println("Total Price: $" + order.getPrice());
    }
}
