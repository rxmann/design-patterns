package abstract_factory.concrete_products;

import abstract_factory.product_interface.Door;

public class ModernDoor implements Door {
    @Override
    public void open() {
        System.out.println("Moder Door OPEN.");
    }
}
