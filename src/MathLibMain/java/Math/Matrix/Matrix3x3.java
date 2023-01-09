package Math.Matrix;

import Math.Vector.Vector3;

public class Matrix3x3 extends Matrix{
    private static final int N = 9;
    private static final int n = 3;

    public Matrix3x3(float[] matrix) {
        super(matrix);
    }

    public static float[] sum(Matrix3x3 first, Matrix3x3 second) {
        return sum(first, second, N);
    }

    public static float[] subtract(Matrix3x3 first, Matrix3x3 second) {
        return subtract(first, second, N);
    }

    public static float[] multiplication(Matrix3x3 first, Matrix3x3 second) {
        return multiplication(first, second, N, n);
    }

    public static float[] multiplicationMatrix3x3ByVector3(Matrix3x3 matrix, Vector3 vector) {
        float[] result = new float[n];

        result[0] = matrix.info[0] * vector.info[0] + matrix.info[1] * vector.info[1] + matrix.info[2] * vector.info[2];
        result[1] = matrix.info[3] * vector.info[0] + matrix.info[4] * vector.info[1] + matrix.info[5] * vector.info[2];
        result[2] = matrix.info[6] * vector.info[0] + matrix.info[7] * vector.info[1] + matrix.info[8] * vector.info[2];

        return result;
    }

    public static float[] transpose(Matrix3x3 matrix) {
        return transpose(matrix, N, n);
    }

    public static float[] createUnitMatrix3x3() {
        return createUnitMatrix(N, n);
    }

    public static float[] createNullMatrix3x3() {
        return createNullMatrix(N, n);
    }

    public static Matrix3x3 readMatrix3x3() {
        return new Matrix3x3(readMatrix(N));
    }
}
