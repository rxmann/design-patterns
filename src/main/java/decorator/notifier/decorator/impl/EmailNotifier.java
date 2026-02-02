package decorator.notifier.decorator.impl;

import decorator.notifier.component.Notifier;
import decorator.notifier.decorator.NotifierDecorator;

public class EmailNotifier extends NotifierDecorator {

    public EmailNotifier(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending EMAIL: " + message);
    }
}
