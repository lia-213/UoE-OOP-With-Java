import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class ErrorHandlingExceptionTest {

    private boolean stdCapStarted;
    private OutputStream tmpStdOut;
    private PrintStream originalStdOut;

    private void stdCaptureStart() {
        if (stdCapStarted)
            throw new RuntimeException("Capture needs to be stopped before it can be started");

        stdCapStarted = true;
        tmpStdOut = new ByteArrayOutputStream();
        originalStdOut = System.out;
        System.setOut(new PrintStream(tmpStdOut));
    }

    private void stdCaptureStop() {
        if (!stdCapStarted)
            throw new RuntimeException("Capture needs to be started before it can be stopped");

        stdCapStarted = false;
        System.setOut(originalStdOut);
        originalStdOut = null;
        tmpStdOut = null;
    }

    private String getCapturedStdOut() {
        if (tmpStdOut == null)
            throw new RuntimeException("Nothing captured.");

        return tmpStdOut.toString();
    }

    @Test
    public void testLowerAndTrim() {
        String input = " AaaAaaBCDf  ";
        String expected = "aaaaaabcdf";
        String output = ErrorHandlingException.lowerAndTrim(input);
        assertEquals(expected, output);
    }

    @Test
    public void testLowerAndTrimNull() {
        assertThrows(NullPointerException.class, () ->  {
            ErrorHandlingException.lowerAndTrim(null);
        });
    }

    private void checkFormatText(String expectedStdOut, String[] data) {
        String stdOut = null;

        stdCaptureStart();

        ErrorHandlingException.formatText(data);

        stdOut = getCapturedStdOut().replaceAll("\r","").trim();

        stdCaptureStop();

        assertEquals(expectedStdOut, stdOut);
    }

    @Test
    public void testFormatText() {

        String expectedStdOut = "hello, world!\n\nno pain, no gain\n2";
        String[] data = { "Hello, World!  ", null, "", "  No Pain, No Gain  ", null };
        checkFormatText(expectedStdOut, data);

        expectedStdOut = "4";
        data = new String[]{ null,null,null,null };
        checkFormatText(expectedStdOut, data);

        expectedStdOut = "abcdef\naaaaaaa\n0";
        data = new String[]{ "AbCdEf    ", "AaaAaaA\n" };
        checkFormatText(expectedStdOut, data);
    }

}
