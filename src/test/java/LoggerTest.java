import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class LoggerTest {

    @Test
    public void testLog() {
        LoggingHelper helper = new ConsoleWriter();
        Logger target = new Logger(helper);
        target.log("Hello, Travis-CI !!!");

        assertThat(helper.toString(), is(equalTo("LogInfo: Hello, Travis-CI !!!\n")));
    }
}