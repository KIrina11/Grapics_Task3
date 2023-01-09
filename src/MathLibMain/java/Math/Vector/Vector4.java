package Math.Vector;

public class Vector4 extends Vector{
    public Vector4(float[] vector) {
        super(vector);
    }

    private static final int n = 4;

    public static Vector4 read() {
        return new Vector4(read(n));
    }

    public static float[] sum(Vector4 firstVector, Vector4 secondVector) {
        return Vector.sum(firstVector, secondVector, n);
    }

    public static float[] subtraction(Vector4 firstVector, Vector4 secondVector) {
        return Vector.subtraction(firstVector, secondVector, n);
    }

    public static float[] multiplyingByScalar(Vector4 vector, float scalar) {
        return Vector.multiplyingByScalar(vector, n, scalar);
    }

    public static float[] dividingByScalar(Vector4 vector, float scalar) {
        return Vector.dividingByScalar(vector, n, scalar);
    }

    public static float countLength(Vector4 vector) {
        return Vector.countLength(vector);
    }

    public static float[] normalize(Vector4 vector) {
        return Vector.normalize(vector);
    }

    public static float scalarMultiplication(Vector4 firstVector, Vector4 secondVector) {
        return Vector.scalarMultiplication(firstVector, secondVector);
    }
}
