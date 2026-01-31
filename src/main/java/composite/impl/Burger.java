package composite.impl;

import composite.component.AbstractMenuItem;

public class Burger extends AbstractMenuItem {

    public Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing burger: " + name);
    }

    @Override
    public void show() {
        System.out.println("- " + name + " : $" + price);
    }
}
