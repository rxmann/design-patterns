package composite.impl;

import composite.component.AbstractMenuItem;

public class Fries extends AbstractMenuItem {

    public Fries(String name, double price) {
        super(name, price);
    }

   @Override
    public void prepare() {
        System.out.println("Preparing fries: " + name);
    }

    @Override
    public void show() {
        System.out.println("- " + name + " : $" + price);
    }
}
