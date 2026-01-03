package observer.example.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {

    private Integer port;
    private ServerSocket serverSocket;
    private ExecutorService executorPool = Executors.newCachedThreadPool();
    protected List<ClientManager> clientManagers = Collections.synchronizedList(new ArrayList<>());

    public ChatServer(Integer port) {
        this.port = port;
    }

    public void start() throws Exception {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server listening at port: " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientManager clientManager = new ClientManager(clientSocket, this);
                clientManagers.add(clientManager);
                executorPool.execute(clientManager);

            }

        } catch (Exception e) {
            System.out.println("Error in server: " + e.getMessage());
        }
    }

    public void broadcastMessage(String message) {
        for (ClientManager clientManager : clientManagers) {
            clientManager.sendMessage(message);
        }
    }

    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer(1234);
        server.start();
    }

}
