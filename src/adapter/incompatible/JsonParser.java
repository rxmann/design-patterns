package adapter.incompatible;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import adapter.User;

public class JsonParser {

    // Simulates JSON objects
    public List<User> loadUsersFromJson(String filePath) {

        // pretend this came from JSON parsing
        List<Map<String, String>> jsonObjects = List.of(
                Map.of("name", "john", "email", "john@gmail.com"),
                Map.of("name", "jane", "email", "jane@gmail.com"));

        List<User> users = new ArrayList<>();

        for (Map<String, String> obj : jsonObjects) {
            users.add(new User(
                    obj.get("name"),
                    obj.get("email")));
        }

        return users;
    }
}
