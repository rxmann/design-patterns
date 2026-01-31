package composite.component;

public abstract class AbstractMenuItem implements MenuComponent {

    protected String name;
    protected double price;

    protected AbstractMenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
