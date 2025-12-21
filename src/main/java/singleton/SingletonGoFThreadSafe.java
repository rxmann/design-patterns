package singleton;

class SingletonGoFThreadSafe {
    private static SingletonGoFThreadSafe instance;

    private SingletonGoFThreadSafe() {
    }

    // include synchronization to make it thread-safe
    public static synchronized SingletonGoFThreadSafe getInstance() {
        // Check if the instance is null, and if so, create the instance
        // This is done inside the synchronized block to prevent multiple threads
        // from creating multiple instances
        if (instance == null) {
            instance = new SingletonGoFThreadSafe();
        }

        return instance;
    }
}

