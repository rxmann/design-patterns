package factory.gof_factory;

import factory.simple_factory.NotCircle;
import factory.simple_factory.Shape;

public class NotCircleCreator extends ShapeCreator {

    @Override
    public Shape create() {
        return new NotCircle();
    }

}
