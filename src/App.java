import singleton.EagerSingletonGoF;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        EagerSingletonGoF esgof1 = EagerSingletonGoF.getInstance();
        EagerSingletonGoF esgof2 = EagerSingletonGoF.getInstance();

        System.out.println("EagerSingletonGoF hash 1: " + esgof1.hashCode());
        System.out.println("EagerSingletonGoF hash 2: " + esgof2.hashCode());

    }
}
