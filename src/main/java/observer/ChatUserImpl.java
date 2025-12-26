package observer;

public class ChatUserImpl implements ChatUser {

    private final String username;

    public ChatUserImpl(String username) {
        this.username = username;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(username + " received: " + message);
    }
}