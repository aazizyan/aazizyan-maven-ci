
public class ConsoleWriter implements LoggingHelper {

    private String memo;

    public ConsoleWriter() {
        memo = "";
    }

    public void writeLine(String line) {
        memo += line;
    }

    public void flush() {
        System.out.println(memo);
    }

    @Override
    public String toString() {
        return memo;
    }
}
