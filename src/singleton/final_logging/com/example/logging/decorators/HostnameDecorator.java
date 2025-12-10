package singleton.final_logging.com.example.logging.decorators;

import java.net.InetAddress;

import singleton.final_logging.com.example.logging.core.Logger;

public class HostnameDecorator extends AbstractLogDecorator {

    public HostnameDecorator(Logger logger) {
        super(logger);
    }

    @Override
    protected String decorate(String message) {
        String hostname;
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            hostname = "Unknown Host";
        }
        return String.format("[%s] %s", hostname, message);
    }
}

