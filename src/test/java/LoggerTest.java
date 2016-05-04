import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class LoggerTest {

    @Test
    public void testLog() {
        LoggingHelper helper = new ConsoleWriter();
        Logger target = new Logger(helper);
        target.log("Hello, Travis-CI !!!");

        assertThat(helper.toString(), is(equalTo("LogInfo: Hello, Travis-CI !!!\n")));
    }

    @Test
    public void testLog_withMockedHelper() {
        LoggingHelper helper = mock(LoggingHelper.class);
        Logger target = new Logger(helper);
        target.log("A");
        target.log("B");

        verify(helper, times(2)).flush();
        verify(helper).writeLine("LogInfo: A\n");
        verify(helper).writeLine("LogInfo: B\n");
        verify(helper, times(2)).writeLine(anyString());
    }
}