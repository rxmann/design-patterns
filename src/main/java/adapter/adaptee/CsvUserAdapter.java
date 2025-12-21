package adapter.adaptee;

import java.util.List;

import adapter.User;
import adapter.incompatible.CsvParser;
import adapter.target.UserParser;

public class CsvUserAdapter implements UserParser {

    private CsvParser parser;

    public CsvUserAdapter(CsvParser csvParser) {
        this.parser = csvParser;
    }

    @Override
    public List<User> parseUsers() {
        return parser.readCsv(null);
    }

}
