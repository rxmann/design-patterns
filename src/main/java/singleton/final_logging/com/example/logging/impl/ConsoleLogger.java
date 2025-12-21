package singleton.final_logging.com.example.logging.impl;

import singleton.final_logging.com.example.logging.core.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}



