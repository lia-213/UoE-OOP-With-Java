public class OneTimePadEncipher {
    public static int charToInt(char l) {
        // Should convert a character to an integer, e.g. "a" -> 0, "b" -> 1
        char upper = Character.toUpperCase(l);
        return (int) (upper - 65);
    }

    public static char intToChar(int i) {
        // Should convert an int to a char, other way around
        return (char) (((i + 26) % 26) + 'a');
    }

    public static boolean isAlpha(char c) {
        int t = charToInt(c);
        if (t >= 0 && t < 26) {
            return true; //breaks at return statement, so no need for else
        }
        return false;
    }
    public static String encipher(String original, String onetimepad) {
        if (original.length() > onetimepad.length()) {
            System.out.println("The length of the OTP is too short");
            return "";
        }

        String lowerOriginal = original.toLowerCase();
        String lowerOTP = onetimepad.toLowerCase();

        String newStr = "";
        for (int i = 0; i < original.length(); i++) {
            char ogChar = lowerOriginal.charAt(i);
            char otpChar = lowerOTP.charAt(i);

            if (isAlpha(ogChar)) {
                newStr += intToChar(charToInt(ogChar) + charToInt(otpChar));
            } else {
                newStr += ogChar; // checking if there is a space, and if so,
                // add that space in the same place in the encrypted code
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String ciphertext = encipher("HELLO EVERYBODY",
                "MYSECRETKETMYSECRETKEY");
        System.out.println(ciphertext);
    }
}
