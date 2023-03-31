public class NbyN {
    public static int[][] nbyn(int N) {
        int[][] matrix = new int[N][N];
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N; column++) {
                if (column == row) { //... idk column == N-column &&
                    matrix[row][column] = row;
                } else {
                    matrix[row][column] = 0;
                }

            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        for (int row = 0; row < M; row++) {
            for (int column = 0; column < M; column++) {
                System.out.print(nbyn(M)[row][column]);
            }
            System.out.println();
        }
    }
}
