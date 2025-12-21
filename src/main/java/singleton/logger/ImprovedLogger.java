package  singleton.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.time.LocalDateTime;

public class ImprovedLogger {
    public static void main(String[] args) {

        SingletonFileLogger logger = SingletonFileLogger.getInstance("app.log");
        logger.log("Imporved singleton logger message with decorate.");

        SingletonFileLogger anotherLogger = SingletonFileLogger.getInstance("ig.log");
        anotherLogger.log("Same improved singleton logger improved.");

    }
}

abstract class AbstractLogger {
    protected PrintWriter writer;

    public final void log(String message) {
        String decoratedMessage = decorate(message);
        writer.println(decoratedMessage);
        writer.flush();
    }

    protected String decorate(String message) {
        try {
            // Decorate the message with the computer name, current time, and the original
            // message
            String computerName = InetAddress.getLocalHost().getHostName();
            LocalDateTime now = LocalDateTime.now();
            return String.format("[%s] [%s] %s", computerName, now, message);
        } catch (IOException e) {
            // Fallback if hostname can't be resolved
            LocalDateTime now = LocalDateTime.now();
            return String.format("[Unknown Host] [%s] %s", now, message);
        }
    }
}

class SingletonFileLogger extends AbstractLogger {

    private static SingletonFileLogger instance;

    private SingletonFileLogger(String fileName) throws IOException {
        writer = new PrintWriter(new FileWriter(fileName, true));
    }

    public static synchronized SingletonFileLogger getInstance(String fileName) {
        if (instance == null) {
            try {
                instance = new SingletonFileLogger(fileName);
            } catch (IOException e) {
                throw new RuntimeException("Failed to initialize logger", e);
            }
        }
        return instance;
    }

}
