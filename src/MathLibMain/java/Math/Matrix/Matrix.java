package Math.Matrix;

import java.util.Scanner;

public class Matrix {
    protected float[] info;
    private static final Scanner scanner = new Scanner(System.in);

    protected Matrix(float[] matrix) {
        this.info = matrix;
    }

    protected static float[] sum(Matrix first, Matrix second, int N) {
        float[] result = new float[N];

        for (int i = 0; i < N; i++) {
            result[i] = first.info[i] + second.info[i];
        }

        return result;
    }

    protected static float[] subtract(Matrix first, Matrix second, int N) {
        float[] result = new float[N];

        for (int i = 0; i < N; i++) {
            result[i] = first.info[i] - second.info[i];
        }

        return result;
    }

    protected static float[] multiplication(Matrix first, Matrix second, int N, int n) {
        float[] result = new float[N];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    result[i * n + j] += first.info[i * n + k] * second.info[k * n + j];
                }
            }
        }

        return result;
    }

    protected static float[] transpose(Matrix matrix, int N, int n) {
        float[] result = new float[N];
        float[][] matrixT = new float[n][n];
        float[][] matrixA = new float[n][n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix.info.length > count) {
                    matrixA[i][j] = matrix.info[count++];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixT[j][i] = matrixA[i][j];
            }
        }

        return transformMatrixToArray(n, result, matrixT);
    }

    protected static float[] createUnitMatrix(int N, int n) {
        float[] result = new float[N];
        float[][] unitMatrix = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    unitMatrix[i][j] = 1;
                } else {
                    unitMatrix[i][j] = 0;
                }
            }
        }

        return transformMatrixToArray(n, result, unitMatrix);
    }

    protected static float[] createNullMatrix(int N, int n) {
        float[] result = new float[N];
        float[][] nullMatrix = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nullMatrix[i][j] = 0;
            }
        }

        return transformMatrixToArray(n, result, nullMatrix);
    }

    public static float[] readMatrix(int N) {
        float[] result = new float[N];

        while (true) {
            try {
                for (int i = 0; i < N; i++) {
                    result[i] = scanner.nextFloat();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Error! Please try again");
                scanner.next();
            }
        }
    }

    public static void printMatrix(float[] matrix, int N, int n) {
        for (int i = 0, j = 0; i < N; i++, j++) {
            if (j == n) {
                System.out.println();
                j = 0;
            }
            System.out.print(matrix[i] + " ");
        }
    }

    private static float[] transformMatrixToArray(int n, float[] array, float[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i * matrix[0].length + j;
                array[k] = matrix[i][j];
            }
        }

        return array;
    }

    //вычисление определителя матрицы
    public static int countMatrixDet(int[][] A, int n) {
        int detA = 0;

        if (n == 1) {
            return A[0][0];
        } else if (n == 2) {
            return A[0][0] * A[1][1] - A[0][1] * A[1][0];
        } else {
            for (int i = 0; i < n; i++) {
                int k = 1;
                for (int j = 0; j < n; j++) {
                    detA += (int) (Math.pow(-1, k + 1) * A[i][j] * countMatrixDet(getMinor(A, i, j),n - 1));
                    k += 1;
                }
            }
        }
        return detA;
    }

    //нахождение минора - удаление i-ой строки и j-ого столбца
    public static int[][] getMinor(int[][] array, int row, int col) {
        int n = array.length;
        int offsetRow = n - 1;
        int offsetCol = array[0].length - 1;
        int[][] result = new int[offsetRow][offsetCol];

        for (int i = 0; i < n; i++) {
            boolean isRowDeleted = row < i;
            int resultRowIndex = isRowDeleted ? i - 1 : i;

            for (int j = 0; j < array[i].length; j++) {
                boolean isColDeleted = col < j;
                int resultColIndex = isColDeleted ? j - 1 : 1;

                if (row != i && col != j) {
                    result[resultRowIndex][resultColIndex] = array[i][j];
                }
            }
        }
        return result;
    }
}
