package decorator.notifier.decorator.impl;

import decorator.notifier.component.Notifier;
import decorator.notifier.decorator.NotifierDecorator;

public class SlackNotifier extends NotifierDecorator {

    public SlackNotifier(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SLACK: " + message);
    }
}
