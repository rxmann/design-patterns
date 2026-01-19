package abstract_factory.concrete_factory;

import abstract_factory.ab_factory_interface.HouseFactory;
import abstract_factory.concrete_products.ModernDoor;
import abstract_factory.concrete_products.ModernRoof;
import abstract_factory.product_interface.Door;
import abstract_factory.product_interface.Roof;

public class ModernHouseFactory implements HouseFactory {
    public Door createDoor() {
        return new ModernDoor();
    }

    public Roof createRoof() {
        return new ModernRoof();
    }
}