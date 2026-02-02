package decorator;

import decorator.notifier.component.BaseNotifier;
import decorator.notifier.component.Notifier;
import decorator.notifier.decorator.impl.EmailNotifier;
import decorator.notifier.decorator.impl.SmsNotifier;
import decorator.notifier.decorator.impl.SlackNotifier;

public class DecoratorTest {

    public static void main(String[] args) {

        Notifier notifier =
                new SlackNotifier(
                        new SmsNotifier(
                                new EmailNotifier(
                                        new BaseNotifier()
                                )
                        )
                );

        notifier.send("Server is DOWN!");
    }
}
