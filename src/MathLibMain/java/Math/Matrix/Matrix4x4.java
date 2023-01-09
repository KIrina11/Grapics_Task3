package Math.Matrix;

import Math.Vector.Vector4;

public class Matrix4x4 extends Matrix{
    private static final int N = 16;
    private static final int n = 4;

    public Matrix4x4(float[] matrix) {
        super(matrix);
    }

    public static float[] sum(Matrix4x4 first, Matrix4x4 second) {
        return sum(first, second, N);
    }

    public static float[] subtract(Matrix4x4 first, Matrix4x4 second) {
        return subtract(first, second, N);
    }

    public static float[] multiplication(Matrix4x4 first, Matrix4x4 second) {
        return multiplication(first, second, N, n);
    }

    public static float[] multiplicationMatrix4x4ByVector4(Matrix4x4 matrix, Vector4 vector) {
        float[] result = new float[n];

        result[0] = matrix.info[0] * vector.info[0] + matrix.info[1] * vector.info[1] + matrix.info[2] * vector.info[2] + matrix.info[3] * vector.info[3];
        result[1] = matrix.info[4] * vector.info[0] + matrix.info[5] * vector.info[1] + matrix.info[6] * vector.info[2] + matrix.info[7] * vector.info[3];
        result[2] = matrix.info[8] * vector.info[0] + matrix.info[9] * vector.info[1] + matrix.info[10] * vector.info[2] + matrix.info[11] * vector.info[3];
        result[3] = matrix.info[12] * vector.info[0] + matrix.info[13] * vector.info[1] + matrix.info[14] * vector.info[2] + matrix.info[15] * vector.info[3];

        return result;
    }

    public static float[] transpose(Matrix4x4 matrix) {
        return transpose(matrix, N, n);
    }

    public static float[] createUnitMatrix4x4() {
        return createUnitMatrix(N, n);
    }

    public static float[] createNullMatrix4x4() {
        return createNullMatrix(N, n);
    }

    public static Matrix4x4 readMatrix4x4() {
        return new Matrix4x4(readMatrix(N));
    }
}
