
public class ConsoleWriter implements LoggingHelper {

    private String memo;
    private String prev;

    public ConsoleWriter() {
        memo = "";
        prev = "";
    }

    public void writeLine(String line) {
        memo += line;
    }

    public void flush() {
        System.out.println(memo);
        prev = memo;
        memo = "";
    }

    @Override
    public String toString() {
        return prev;
    }
}
