package singleton;

public class SingletonBillPugh {

    private static class SingletonContext {
        private static final SingletonBillPugh _instance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonContext._instance;
    }

}

