package observer;

import java.util.List;
import java.util.ArrayList;

public class ChatRoom {

    private List<ChatUser> users = new ArrayList<>();

    public void registerUser(ChatUser user) {
        users.add(user);
    }

    public void removeUser(ChatUser user) {
        users.remove(user);
    }

    public void notifyUsers(String message) {
        for (ChatUser user : users) {
            user.receiveMessage(message);
        }
    }

}
