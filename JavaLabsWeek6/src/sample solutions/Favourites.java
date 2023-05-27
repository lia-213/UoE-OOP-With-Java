public class Favourites {

    private static final int N = 5;
    
    private int count = 0;
    private MusicTrack[] tracks = new MusicTrack[N];

    public void addTrack(String artist, String title) {
        MusicTrack mt = new MusicTrack(artist, title);
        if (count < N) {
            tracks[count] = mt;
            count++;
        }
        else {
            System.out.println("Sorry, can't add: " + mt);
        }
    }

    public void showFavourites() {
        System.out.println();
        for (int i = 0; i < N; i++) {
            MusicTrack mt = tracks[i];
            if (mt != null) {
                System.out.println(mt);
            }
        }
    }

    public static void main(String[] args) {
        Favourites fvs = new Favourites();

        fvs.addTrack("Fun", "Some Nights");
        fvs.addTrack("Oliver Tank", "Help You Breathe");
        fvs.addTrack("Horse Feathers", "Fit Against the Country");
        fvs.addTrack("Emile Sande", "Country House");
        fvs.addTrack("Fun", "Walking the Dog");
        fvs.addTrack("Porcelain Raft", "Put Me To Sleep");

        fvs.showFavourites();
    }

}
