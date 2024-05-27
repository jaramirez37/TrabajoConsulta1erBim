import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable worker = () -> {
            System.out.println("Task is running");
        };

        executor.execute(worker);
        executor.shutdown();
    }
}
