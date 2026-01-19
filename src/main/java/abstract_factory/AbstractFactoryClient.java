package abstract_factory;

import abstract_factory.ab_factory_interface.HouseFactory;
import abstract_factory.concrete_factory.ModernHouseFactory;
import abstract_factory.concrete_factory.TraditionalHouseFactory;
import abstract_factory.product_interface.Door;
import abstract_factory.product_interface.Roof;

public class AbstractFactoryClient {


    public static void main(String[] args) {

        HouseFactory factory = new TraditionalHouseFactory();

        Door door = factory.createDoor();
        Roof roof = factory.createRoof();

        door.open();
        roof.cover();

        factory = new ModernHouseFactory();
        door = factory.createDoor();
        door.open();


    }

}
