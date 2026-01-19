package abstract_factory.ab_factory_interface;

import abstract_factory.product_interface.Door;
import abstract_factory.product_interface.Roof;

public interface HouseFactory {
    Door createDoor();
    Roof createRoof();
}
