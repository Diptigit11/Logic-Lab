package Day4;

public class SingletonLogger {

    // single instance (lazy-initialized)
    private static SingletonLogger instance;

    // constant prefix
    private static final String PREFIX = "[APP] ";

    // private constructor prevents external instantiation
    private SingletonLogger() {
        // optional: initialization code
    }

    // public method to access the instance
    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    // logging method
    public void log(String msg) {
        System.out.println(PREFIX + msg);
    }

    // testing
    public static void main(String[] args) {
        SingletonLogger l1 = SingletonLogger.getInstance();
        SingletonLogger l2 = SingletonLogger.getInstance();

        // verify same instance
        System.out.println(l1 == l2); // true

        // test logging
        l1.log("Started");
        l2.log("Running");
    }
}
