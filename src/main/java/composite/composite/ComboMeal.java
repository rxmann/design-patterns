package composite.composite;

import composite.component.MenuComponent;

import java.util.ArrayList;
import java.util.List;

public class ComboMeal implements MenuComponent {

    private String name;
    private List<MenuComponent> items = new ArrayList<>();

    public ComboMeal(String name) {
        this.name = name;
    }

    // child management
    public void add(MenuComponent component) {
        items.add(component);
    }

    public void remove(MenuComponent component) {
        items.remove(component);
    }

    public List<MenuComponent> getItems() {
        return items;
    }

   @Override
    public double getPrice() {
        double total = 0;
        for (MenuComponent item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing combo: " + name);
        for (MenuComponent item : items) {
            item.prepare();
        }
    }

    @Override
    public void show() {
        System.out.println("Combo: " + name);
        for (MenuComponent item : items) {
            item.show();
        }
    }
}
