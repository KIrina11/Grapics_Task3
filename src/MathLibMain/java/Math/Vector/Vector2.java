package Math.Vector;

public class Vector2 extends Vector {
    public Vector2(float[] vector) {
        super(vector);
    }

    private static final int n = 2;

    public static Vector2 read() {
        return new Vector2(read(n));
    }

    public static float[] sum(Vector2 firstVector, Vector2 secondVector) {
        return Vector.sum(firstVector, secondVector, n);
    }

    public static float[] subtraction(Vector2 firstVector, Vector2 secondVector) {
        return Vector.subtraction(firstVector, secondVector, n);
    }

    public static float[] multiplyingByScalar(Vector2 vector, float scalar) {
        return Vector.multiplyingByScalar(vector, n, scalar);
    }

    public static float[] dividingByScalar(Vector2 vector, float scalar) {
        return Vector.dividingByScalar(vector, n, scalar);
    }

    public static float countLength(Vector2 vector) {
        return Vector.countLength(vector);
    }

    public static float[] normalize(Vector2 vector) {
        return Vector.normalize(vector);
    }

    public static float scalarMultiplication(Vector2 firstVector, Vector2 secondVector) {
        return Vector.scalarMultiplication(firstVector, secondVector);
    }
}
