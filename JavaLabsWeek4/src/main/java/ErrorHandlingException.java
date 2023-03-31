public class ErrorHandlingException {
    public static String lowerAndTrim(String string) {
        if (string == null) {
            throw new NullPointerException("The given line must not be null.");
        }

        return string.toLowerCase().trim();
    }

    public static void formatText(String[] args) {
        int counter = 0;
        for (String argument : args) {
            try {
                System.out.println(lowerAndTrim(argument));
            } catch (NullPointerException e) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        String[] data = { "Hello, World!  ", null, "", "  No Pain, No Gain  ", null };
        formatText(data);
    }
}

