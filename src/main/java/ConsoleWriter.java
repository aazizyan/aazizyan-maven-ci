
public class ConsoleWriter implements LoggingHelper {

    private String memo;
    private String prev;

    public ConsoleWriter() {
        memo = "";
        prev = "";
    }

    public void writeLine(String line) {
        memo += line;
        prev = memo;
    }

    public void flush() {
        System.out.println(memo);
        memo = "";
    }

    @Override
    public String toString() {
        return prev;
    }
}
