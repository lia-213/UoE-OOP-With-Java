public class DNAStrand {

    private String dna;

    public DNAStrand(String dna) {
        this.dna = dna;
    }

    public Boolean isValidDNA() {
        if (dna == null || dna == "")
            return false;
        String dnaWithoutTCGA = dna.replace("T", "").replace("C", "").replace("A", "").replace("G", "");
        return dnaWithoutTCGA.length() == 0;
    }

    public String complementWC() {
        String swapAT = dna.replace("T", "t").replace("A", "T").replace("t", "A");
        String swapATCG = swapAT.replace("G", "g").replace("C", "G").replace("g", "C");
        return swapATCG;
    }

    public String palindromeWC() {
        String comp = complementWC();

        String res = "";
        for (int i = comp.length() - 1; i >= 0; i--) {
            res += comp.charAt(i);
        }
        return res;
    }

    public Boolean containsSequence(String seq) {
        return dna.contains(seq);
    }

    @Override
    public String toString() {
        return dna;
    }

}
