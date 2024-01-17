public class transpose {
    public static int[][] devrik(int[][] matris) {
        int sıra = matris.length;
        int sütün = matris[0].length;
        int[][] devrikMatris = new int[sıra][sütün];
        for (int a = 0; a < sıra; a++) {
            for (int n = 0; n < sütün; n++) {
                devrikMatris[n][a] = matris[a][n];

            }
        }
        return devrikMatris;
    }

    public static void baskıMatrisi(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix[0].length; a++) {
                System.out.print(matrix[i][a] + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matris = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Orijinal Matris:");
        baskıMatrisi(matris);

        System.out.println("Transpoze Matris:");
        int[][] transpozeMatrix = devrik(matris);
        baskıMatrisi(transpozeMatrix);
    }
}
