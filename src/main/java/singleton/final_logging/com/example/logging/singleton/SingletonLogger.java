package singleton.final_logging.com.example.logging.singleton;

import singleton.final_logging.com.example.logging.core.Logger;

public class SingletonLogger implements Logger {
    private static SingletonLogger instance;
    private Logger logger;

    private SingletonLogger(Logger logger) {
        this.logger = logger;
    }

    public static synchronized SingletonLogger getInstance(Logger logger) {
        if (instance == null) {
            instance = new SingletonLogger(logger);
        }
        return instance;
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }
}

