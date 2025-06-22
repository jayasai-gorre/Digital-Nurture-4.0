public class ThreadSafeDoubleLockingLogger {
    private static ThreadSafeDoubleLockingLogger loggerInstance = null;

    private ThreadSafeDoubleLockingLogger() {
        System.out.println("ThreadSafeDoubleLockingLogger(Singleton) Constructor called");
    }

    // Double lock-checking
    public static ThreadSafeDoubleLockingLogger getInstance() {
        if (loggerInstance == null) {
            /*
             * If two threads execute this same time, one will take the lock and another will wait but there there is a problem.
             * After one thread releases the lock, if we won't check whether loggerInstance is null or not, this will contradict Singleton
             * So that's why we again check whether loggerInstance created or not by another if condition
             * This is DoubleLocking
             */
            synchronized (ThreadSafeDoubleLockingLogger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new ThreadSafeDoubleLockingLogger();
                }
            }
        }
        
        return loggerInstance;
    }
}
