package adapter.adaptee;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import adapter.User;

public class JsonParser {

    private final ObjectMapper mapper = new ObjectMapper();

    // Incompatible API on purpose
    public List<User> loadUsersFromJson(String filePath) {

        try {
            return mapper.readValue(
                    new File(filePath),
                    new TypeReference<List<User>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse JSON", e);
        }
    }
}
