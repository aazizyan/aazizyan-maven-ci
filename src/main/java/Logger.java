
public class Logger {

    private final LoggingHelper helper;

    public Logger(LoggingHelper helper) {
        this.helper = helper;
    }

    public void log(String msg) {
        helper.writeLine("LogInfo: " + msg + "\n");
        helper.flush();
    }
}
