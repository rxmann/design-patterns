package factory.simple_factory;

public class ShapeFactory {

    public static Shape createShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case NOT_CIRCLE -> new NotCircle();
        };
    }

}

