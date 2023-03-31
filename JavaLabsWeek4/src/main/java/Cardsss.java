public class Cardsss {
    public static int[] main(String card) {
        int[] values = new int[1];
        switch (card) {
            case "ace":
                values = new int[] {1, 11};
                break;
            case "queen":
            case "jack":
            case "king":
                values[0] = 10;
                break;
            default:
                values[0] = Integer.parseInt(card);
        }
        return values;
    }
}
