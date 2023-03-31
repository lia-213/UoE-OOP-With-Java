public class OneTimePadDecipher {
    public static String decipher(String encipheredText, String onetimepad) {
        if (encipheredText.length() > onetimepad.length()) {
            System.out.println("The length of the OTP is too short");
            return "";
        }

        String oldStr = "";
        for (int i = 0; i < encipheredText.length(); i++) {
            char otpChar = (onetimepad.toLowerCase().charAt(i));
            char encipheredChar =
                    (encipheredText.toLowerCase().charAt(i));

            if (OneTimePadEncipher.isAlpha(encipheredChar)) {
                oldStr += OneTimePadEncipher.intToChar(OneTimePadEncipher.charToInt(encipheredChar) - OneTimePadEncipher.charToInt(otpChar));
            } else {
                oldStr += encipheredChar; // checking if there is a space,
                // and if so,
                // add that space in the same place in the encrypted code
            }
        }
        return oldStr.toUpperCase();
    }

    public static void main(String[] args) {
        String ciphertext = OneTimePadDecipher.decipher("sw itmn jcxyic", "KEEPMEVERYVERYSAFE");
        System.out.print(ciphertext);
    }
}
