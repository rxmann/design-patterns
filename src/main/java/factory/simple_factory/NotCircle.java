package factory.simple_factory;

public class NotCircle implements Shape {

    private static String _NAME = "NOT_CIRCLE";

    @Override
    public void draw(String shapeName) {
        System.out.println("Drawing {}." + shapeName);
    }

    @Override
    public String getName() {
        return _NAME;
    }

}

