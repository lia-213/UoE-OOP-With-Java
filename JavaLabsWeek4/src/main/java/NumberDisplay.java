public class NumberDisplay {
    private int limit; // encapsulation - hide the limit, prevents setting it
    // to certain other limits; only allows other people to use certain parts
    // of the class, protecting remixes of the code
    private int value;

    public NumberDisplay(int limit) {
        this.limit = limit; // sets limit
    }

    public int getLimit() { //getter also called accessors; setters also set
        // values - can slakdf;jklsd
        return limit;
    }

    public int getValue() {
        return value;
    }
}
