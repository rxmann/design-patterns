package adapter.incompatible;

import java.util.ArrayList;
import java.util.List;

import adapter.User;

public class CsvParser {

    // Simulates: name,email
    public List<User> readCsv(String filePath) {

        List<String> lines = List.of(
                "rxman,rxman@gmail.com",
                "alex,alex@gmail.com");

        List<User> users = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",");
            users.add(new User(parts[0], parts[1]));
        }

        return users;
    }
}
