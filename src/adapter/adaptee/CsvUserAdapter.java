package adapter.adaptee;

import java.util.List;

import adapter.User;
import adapter.incompatible.CsvParser;

public class CsvUserAdapter implements adapter.target.UserParser {

    private CsvParser parser;

    public CsvUserAdapter(CsvParser csvParser) {
        this.parser = csvParser;
    }

    @Override
    public List<User> parseUsers() {
        return parser.readCsv(null);
    }

}
