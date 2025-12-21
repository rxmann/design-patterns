package adapter.factory;

import java.rmi.UnexpectedException;

import adapter.adaptee.CsvUserAdapter;
import adapter.adaptee.JsonUserAdapter;
import adapter.incompatible.CsvParser;
import adapter.incompatible.JsonParser;
import adapter.target.UserParser;

public class UserAdapterFactory {

    public static UserParser getUserParser(String fileType) throws UnexpectedException {
        return switch (fileType) {
            case "JSON" -> new JsonUserAdapter(new JsonParser());
            case "CSV" -> new CsvUserAdapter(new CsvParser());
            default -> throw new UnexpectedException("");
        };

    }

}
