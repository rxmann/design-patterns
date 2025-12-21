
import singleton.SingletonEnum;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SingletonEnum esgof1 = SingletonEnum.INSTANCE;
        SingletonEnum esgof2 = SingletonEnum.INSTANCE;

        System.out.println("SingletonEnum hash 1: " + esgof1.hashCode());
        System.out.println("SingletonEnum hash 2: " + esgof2.hashCode());

    }
}
