public class OneTimePadDecipherPerfect {

    public static String decipher(String ciphertext, String onetimepad) {

        if (ciphertext.length() > onetimepad.length()) {
            System.out.print("The length of the OTP is too short");
            return "";
        }

        String lcCiphertext = ciphertext.toLowerCase();
        String lcOnetimepad = onetimepad.toLowerCase();

        String newStr = "";
        for (int i = 0; i < lcCiphertext.length(); i++) {
            char o = lcCiphertext.charAt(i);
            char k = lcOnetimepad.charAt(i);

            if (OneTimePadEncipher.isAlpha(o)) {
                newStr += OneTimePadEncipher.intToChar(OneTimePadEncipher.charToInt(o) - OneTimePadEncipher.charToInt(k));
            }
            else {
                newStr += o;
            }
        }
        return newStr.toUpperCase();
    }

    public static void main(String[] args) {
        String ciphertext = OneTimePadDecipher.decipher("uvufsghktdal", "WHATSTHEPASSWORD");
        System.out.print(ciphertext);
    }

}
