public class ErrorHandlingExceptionPerfectVersion {

    public static String lowerAndTrim(String line) {
        if (line == null) {
            throw new NullPointerException("The given line must not be null.");
        }
        // alternatively to the three lines above, you can use
        // a java library method
        // Objects.requireNonNull(line, "The given line must not be null.");

        return line.trim().toLowerCase();
    }

    public static void formatText(String[] data) {
        int counter = 0;
        for (String line : data) {
            try {
                System.out.println(lowerAndTrim(line));
            } catch (NullPointerException e) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        String[] data = { "Hello, World!  ", null, "", "  No Pain, No Gain  ", null };
        formatText(data);
    }
}
