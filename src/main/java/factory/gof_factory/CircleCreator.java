package factory.gof_factory;

import factory.simple_factory.Circle;
import factory.simple_factory.Shape;

public class CircleCreator extends ShapeCreator {

    @Override
    public Shape create() {
        return new Circle();
    }

}

