public class MultiThreadTest {
    public static void main(String[] args) {
        // Tasking that each thread will run using runnable
        Runnable task = () -> {
            ThreadSafeDoubleLockingLogger logger = ThreadSafeDoubleLockingLogger.getInstance();
            System.out.println(Thread.currentThread() + ":" + logger);
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        Thread t4 = new Thread(task, "Thread-4");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
