package singleton;

public class SingletonGoFDCL {

    private volatile static SingletonGoFDCL _instance;

    private SingletonGoFDCL() {

    }

    public static SingletonGoFDCL getInstance() {
        if (_instance == null) {
            synchronized (SingletonGoFDCL.class) {
                if (_instance == null)
                    _instance = new SingletonGoFDCL();
            }
        }
        return _instance;
    }

}
