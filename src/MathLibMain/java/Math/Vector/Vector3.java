package Math.Vector;

public class Vector3 extends Vector{
    public Vector3(float[] vector) {
        super(vector);
    }

    private static final int n = 3;

    public static Vector3 read() {
        return new Vector3(read(n));
    }

    public static float[] sum(Vector3 firstVector, Vector3 secondVector) {
        return Vector.sum(firstVector, secondVector, n);
    }

    public static float[] subtraction(Vector3 firstVector, Vector3 secondVector) {
        return Vector.subtraction(firstVector, secondVector, n);
    }

    public static float[] multiplyingByScalar(Vector3 vector, float scalar) {
        return Vector.multiplyingByScalar(vector, n, scalar);
    }

    public static float[] dividingByScalar(Vector3 vector, float scalar) {
        return Vector.dividingByScalar(vector, n, scalar);
    }

    public static float countLength(Vector3 vector) {
        return Vector.countLength(vector);
    }

    public static float[] normalize(Vector3 vector) {
        return Vector.normalize(vector);
    }

    public static float scalarMultiplication(Vector3 firstVector, Vector3 secondVector) {
        return Vector.scalarMultiplication(firstVector, secondVector);
    }

    public static float[] vectorMultiplication(Vector3 firstVector, Vector3 secondVector) {
        float[] result = new float[n];

        result[0] = firstVector.info[1] * secondVector.info[2] - firstVector.info[2] * secondVector.info[1];
        result[1] = firstVector.info[2] * secondVector.info[0] - firstVector.info[0] * secondVector.info[2];
        result[2] = firstVector.info[0] * secondVector.info[1] - firstVector.info[1] * secondVector.info[0];

        return result;
    }
}
