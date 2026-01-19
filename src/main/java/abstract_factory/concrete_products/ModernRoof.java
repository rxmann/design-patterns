package abstract_factory.concrete_products;

import abstract_factory.product_interface.Roof;

public class ModernRoof implements Roof {
    @Override
    public void cover() {
        System.out.println("Modern Roof COVER.");
    }
}
