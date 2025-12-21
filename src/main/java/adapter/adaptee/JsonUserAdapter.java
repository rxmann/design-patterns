package adapter.adaptee;

import java.util.List;

import adapter.User;
import adapter.incompatible.JsonParser;
import adapter.target.UserParser;

public class JsonUserAdapter implements UserParser {

    private JsonParser parser;

    public JsonUserAdapter(JsonParser jsonParser) {
        this.parser = jsonParser;
    }

    @Override
    public List<User> parseUsers() {
        return parser.loadUsersFromJson("sadfs");
    }

}
