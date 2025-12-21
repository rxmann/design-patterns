package singleton;

public class EagerSingletonGoF {
    private static EagerSingletonGoF instance = new EagerSingletonGoF();

    private EagerSingletonGoF() {
        // prevents instantiation with new keyword
    }

    public static EagerSingletonGoF getInstance() {
        return instance;
    }
}

