package singleton;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {

    public static void main(String[] args) throws InterruptedException {
        HashMap<String, Integer> poolHash = new HashMap<>();

        ExecutorService executor = Executors.newFixedThreadPool(10000000);

        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                SingletonGoFThreadSafe instance = SingletonGoFThreadSafe.getInstance();
                // SingletonEnum instance = SingletonEnum.INSTANCE;
                poolHash.put(Thread.currentThread().getName(), instance.hashCode());
                // System.out.println(Thread.currentThread().getName() + ": " +
                // instance.hashCode());
            });
        }

        executor.shutdown();

        System.out.println(new HashSet<Integer>(poolHash.values()).size());
    }
}

