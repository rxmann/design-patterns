package factory;

import factory.gof_factory.CircleCreator;
import factory.gof_factory.NotCircleCreator;
import factory.simple_factory.Shape;
import factory.simple_factory.ShapeFactory;
import factory.simple_factory.ShapeType;

// aka Parameterized Factory Method
public class SimpleFactoryTest {

    public static void main(String[] args) {
        // Simple Factory
        System.out.println("SIMPLE FACTORY TEST");
        Shape shape1 = ShapeFactory.createShape(ShapeType.CIRCLE);
        System.out.println(shape1.getName());
        Shape shape2 = ShapeFactory.createShape(ShapeType.NOT_CIRCLE);
        System.out.println(shape2.getName());
        shape2.draw(shape2.getName());

        // GOF factory
        System.out.println("GOF FACTORY TEST");
        Shape circleGoF = new CircleCreator().create();
        Shape notCircleGof = new NotCircleCreator().create();

        System.out.println(circleGoF.getName());
        System.out.println(notCircleGof.getName());

    }

}
