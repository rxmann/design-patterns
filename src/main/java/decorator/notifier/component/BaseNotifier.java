package decorator.notifier.component;

public class BaseNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Base notify: " + message);
    }
}