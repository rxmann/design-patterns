package composite.impl;

import composite.component.AbstractMenuItem;

public class Drink extends AbstractMenuItem {

    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing drink: " + name);
    }

    @Override
    public void show() {
        System.out.println("- " + name + " : $" + price);
    }
}
