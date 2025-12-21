package factory.simple_factory;

public class Circle implements Shape {

    private static String _NAME = "CIRCLE";

    @Override
    public void draw(String shapeName) {
        System.out.println("Drawing {}." + shapeName);
    }

    @Override
    public String getName() {
        return _NAME;
    }

}

