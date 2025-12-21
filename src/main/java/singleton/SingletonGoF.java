package singleton;

public class SingletonGoF {
    private static SingletonGoF instance = null;

    private SingletonGoF() {
        // prevents instantiation with new keyword
    }

    public static SingletonGoF getInstance() {
        // ondemand instantiation, so lazy loaded
        if (instance == null) {
            instance = new SingletonGoF();
        }
        return instance;
    }
}

