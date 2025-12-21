package singleton;

public enum SingletonEnum {
    INSTANCE;

    private SingletonEnum() {
        System.out.println("INIT ENUM SINGLETON");
    }

}

