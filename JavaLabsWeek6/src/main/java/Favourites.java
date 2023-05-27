public class Favourites {
    private static final int N = 5;
    private MusicTrack[] favourites = new MusicTrack[N];

    private int count = 0;

    public void addTrack(String artist, String title) {
        MusicTrack musicTrack = new MusicTrack(artist, title);
        if (count == 5) {
            System.out.println("Sorry, can't add: " + musicTrack + "\n");
        } else {
            favourites[count] = musicTrack;
            count++;
        }

    }

    public void showFavourites() {
        for (int i = 0; i < favourites.length; i++) {
            if (favourites[i] != null) {
                System.out.println(favourites[i]);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Favourites favourites = new Favourites();
        favourites.addTrack("Fun", "Some Night");
        favourites.addTrack("Oliver Tank", "He");
        favourites.addTrack("Horse Feathers", "ho");
        favourites.addTrack("Emile Sande", "Co");
        favourites.addTrack("Fun", "Walking th");
        favourites.addTrack("Porcelain Raft", "no");
        favourites.showFavourites();
    }
}
