package Matrixes;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}, {7,8}};
        int[][] matrix2 = {{9,8,7,6}, {5,4,3,2}};

        int[][] matrix3 = vermenigvuldigMatrixes(matrix1, matrix2);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix3[i][j] + "   ");
            }
            System.out.println("");

        }

    }

    public static int[][] vermenigvuldigMatrixes(int[][] matrixA, int[][] matrixB) {
        int[][] newMatrix = new int[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                int x = 0;
                while (x != matrixB.length) {
                    newMatrix[i][j] = newMatrix[i][j] + (matrixA[i][x] * matrixB[x][j]);
                    x++;
                }

            }
        }
        return newMatrix;
    }


}

