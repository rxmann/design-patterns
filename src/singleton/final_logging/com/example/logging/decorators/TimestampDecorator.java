package singleton.final_logging.com.example.logging.decorators;

import java.time.LocalDateTime;

import singleton.final_logging.com.example.logging.core.Logger;

public class TimestampDecorator extends AbstractLogDecorator {

    public TimestampDecorator(Logger logger) {
        super(logger);
    }

    @Override
    protected String decorate(String message) {
        LocalDateTime now = LocalDateTime.now();
        return String.format("[%s] %s", now, message);
    }
}

