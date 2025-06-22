public class Logger {
    private static Logger loggerInstance = null;

    private Logger() {
        System.out.println("Logger(Singleton) Constructor called");
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }
}