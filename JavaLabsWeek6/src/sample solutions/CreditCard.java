import java.util.Calendar;

public class CreditCard {
    private int expiryMonth;
    private int expiryYear;
    private String firstName;
    private String lastName;
    private String ccNumber;

    public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ccNumber = ccNumber;
    }

    public String formatExpiryDate() {
        String shortExpiryYear = Integer.toString(expiryYear).substring(2, 4);
        return String.format("%s/%s", expiryMonth, shortExpiryYear);
    }

    public String formatFullName() {
        return firstName + " " + lastName;
    }

    public String formatCCNumber() {
        String[] nums = new String[4];
        for (int i = 0; i < nums.length; i++) {
            int idx = i * 4;
            nums[i] = ccNumber.substring(idx, idx + 4);
        }
        String s = String.format("%s %s %s %s", (Object[]) nums);
        return s;
    }

    public boolean isValid() {
        Calendar now = Calendar.getInstance();
        int nowMonth = now.get(Calendar.MONTH) + 1; // don't use zero based
                                                    // counting for months
        int nowYear = now.get(Calendar.YEAR);
        return (expiryYear > nowYear || (expiryYear == nowYear && expiryMonth > nowMonth));
    }

    @Override
    public String toString() {
        String result = String.format("Number: %s\nExpiration date: %s\nAccount holder: %s\nIs valid: %s", formatCCNumber(), formatExpiryDate(),
                formatFullName(), isValid());
        return result;
    }

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println("Current Year is: " + now.get(Calendar.YEAR));
        System.out.println("Current Month is: " + (now.get(Calendar.MONTH) + 1));
        System.out.println();

        CreditCard cc1 = new CreditCard(2, 2013, "Bill", "Gates", "1234567891234567");
        System.out.println(cc1);
        System.out.println();
        CreditCard cc2 = new CreditCard(2, 2012, "Melinda", "Gates", "1111222233334444");
        System.out.println(cc2);
    }

}
