import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DNAStrand {

    private String dna;

    public DNAStrand(String dna) {
        this.dna = dna;
    }

    public boolean isValidDNA() {
        String letters = "ATCG";
        // char[] newDna = (char[]) dna;
        boolean isDNA = true;
        if (dna.length() > 0) {
            for (int i = 0; i < dna.length(); i++) {
                String letterI = String.valueOf(dna.charAt(i));
                if (!letters.contains(letterI)) {
                    isDNA = false;
                    break;
                }
            }
        }
        else {
            isDNA = false;
        }
        return isDNA;
    }

    public String complementWC() {
        return dna.replace("A", "t").replace("T", "a").replace("C", "g").replace("G", "c").toUpperCase();
    }

    public String palindromeWC() {
        String reversed = "";
        String comp = complementWC();
        char ch;

        for (int i = 0; i < comp.length(); i++) {
            ch = comp.charAt(i);
            reversed = ch + reversed;
        }

        return reversed;
    }

    public boolean containsSequence(String seq) {
        return dna.contains(seq);
    }

    public String toString() {
        return dna;
    }








    public static void main(String[] args) {

    }
}
