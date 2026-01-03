package observer.example.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) throws Exception {
        try (Socket socket = new Socket("localhost", 1234)) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true
            );

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                out.println(username);

                // Thread to read messages from server
                new Thread(() -> {
                    try {
                        String msg;
                        while ((msg = in.readLine()) != null) {
                            System.out.println(msg);
                        }
                    } catch (IOException e) {
                        System.out.println("Disconnected from server");
                    }
                }).start();

                // Main thread sends messages
                while (true) {
                    String message = scanner.nextLine();
                    out.println(message);
                }
            }
        }
    }
}
