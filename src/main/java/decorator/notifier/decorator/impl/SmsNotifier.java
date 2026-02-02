package decorator.notifier.decorator.impl;

import decorator.notifier.component.Notifier;
import decorator.notifier.decorator.NotifierDecorator;

public class SmsNotifier extends NotifierDecorator {

    public SmsNotifier(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}
