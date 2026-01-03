package observer.example.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManager implements Runnable {

    private Socket socket;
    private ChatServer server;
    private PrintWriter out;
    private String username;

    public ClientManager(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            OutputStream outputStream = socket.getOutputStream();
            out = new PrintWriter(outputStream, true);

            this.username = bufferedReader.readLine();
            server.broadcastMessage(username + " has joined the chat!");

            String clientMessage;
            while ((clientMessage = bufferedReader.readLine()) != null) {
                server.broadcastMessage(username + ": " + clientMessage);
            }

        } catch (Exception e) {
            System.out.println("Error in ClientManager: " + e.getMessage());
        } finally {
            server.clientManagers.remove(this);
            server.broadcastMessage(username + " has left the chat.");
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Error closing a socket: " + e.getMessage());
            }
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

}
