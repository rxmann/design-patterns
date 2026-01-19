package abstract_factory.concrete_factory;

import abstract_factory.ab_factory_interface.HouseFactory;
import abstract_factory.concrete_products.TraditionalDoor;
import abstract_factory.concrete_products.TraditionalRoof;
import abstract_factory.product_interface.Door;
import abstract_factory.product_interface.Roof;

public class TraditionalHouseFactory implements HouseFactory {
    public Door createDoor() {
        return new TraditionalDoor();
    }

    public Roof createRoof() {
        return new TraditionalRoof();
    }
}
