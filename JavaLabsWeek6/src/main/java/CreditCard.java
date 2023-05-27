import java.util.Calendar;

public class CreditCard {
    private int expiryMonth, expiryYear;
    private String firstName, lastName, ccNumber;

    private Calendar now = Calendar.getInstance();

    public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ccNumber = ccNumber;
    }

    public String formatExpiryDate() {
        int newExp;
        if (expiryYear-2000 >= 0) { newExp = expiryYear-2000;
        } else { newExp = expiryYear-1900; }
        return String.format("%d/%2d", expiryMonth, newExp);
    }

    public String formatFullName() { return firstName + " " + lastName; }

    public String formatCCNumber() {
        String finalNum = "";
        for (int count = 0; count < 4; count++) {
            String relevantSub = ccNumber.substring(4 * count, ((count + 1) * 4));
            if (count < 3) {
                finalNum += relevantSub + " ";
            } else {
                finalNum += relevantSub;
            }
        }
        return finalNum;
    }

    public boolean isValid() {
        int currentYear = now.get(Calendar.YEAR);
        int currentMonth = now.get(Calendar.MONTH) + 1;
        boolean isValid = false;

        return (expiryYear > currentYear || (currentYear == expiryYear && expiryMonth > currentMonth));
    }

    @Override
    public String toString() {
        return String.format("Number: %s%nExpiration date: %s%nAccount holder: %s%nIs valid: %s", formatCCNumber(),
                formatExpiryDate(), formatFullName(), isValid());
    }
}
