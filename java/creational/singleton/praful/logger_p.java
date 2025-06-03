
class Logger {
    private static Logger instance;
    private Logger() {
        System.out.println("Logger Created");
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        } 
        else {
            System.out.println("Using existing Logger");
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("App started");

        Logger logger2 = Logger.getInstance();
        logger2.log("Another event logged");

        System.out.println(logger1 == logger2);
    }
}
