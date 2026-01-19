package abstract_factory.concrete_products;

import abstract_factory.product_interface.Door;

public class TraditionalDoor implements Door {
    @Override
    public void open() {
        System.out.println("Traditional Door OPEN.");
    }
}
