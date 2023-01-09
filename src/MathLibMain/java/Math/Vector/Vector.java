package Math.Vector;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Vector {
    public float[] info;
    protected Vector(float[] vector) {
        this.info = vector;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static float[] read(int n) {
        float[] result = new float[n];

        while (true) {
            try {
                for (int i = 0; i < n; i++) {
                    result[i] = scanner.nextFloat();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Error! Please try again");
                scanner.next();
            }
        }
    }

    public static String print(float[] vector, int n) {
        StringBuilder str = new StringBuilder("(");
        String sep = ",\n ";

        for (int i = 0; i < n; i++) {
            str.append(vector[i]);

            if (i < (n - 1)) {
                str.append(sep);
            }
        }

        return str + ")";
    }

    public static boolean checkVectors(Vector firstVector, Vector secondVector) {
        if (firstVector.info.length == secondVector.info.length) {
            return true;
        } else {
            return false;
        }
    }

    public static float[] sum(Vector firstVector, Vector secondVector, int n) {
        float[] result = new float[n];

        if (checkVectors(firstVector, secondVector)) {
            for (int i = 0; i < n; i++) {
                result[i] = firstVector.info[i] + secondVector.info[i];
            }
        } else {
            System.out.println("Error! Vectors of different lengths");
        }
        return result;
    }

    public static float[] subtraction(Vector firstVector, Vector secondVector, int n) {
        float[] result = new float[n];

        if (checkVectors(firstVector, secondVector)) {
            for (int i = 0; i < n; i++) {
                result[i] = firstVector.info[i] - secondVector.info[i];
            }
        } else {
            System.out.println("Error! Vectors of different lengths");
        }
        return result;
    }

    public static float[] multiplyingByScalar(Vector vector, int n, float scalar) {
        float[] result = new float[n];

        for (int i = 0; i < n; i++) {
            result[i] = vector.info[i] * scalar;
        }

        return result;
    }

    public static float[] dividingByScalar(Vector vector, int n, float scalar) {
        float[] result = new float[n];

        if (scalar != 0) {
            for (int i = 0; i < n; i++) {
                result[i] = vector.info[i] / scalar;
            }
        } else {
            System.out.println("Error! It is impossible to divide by 0");
        }

        return result;
    }

    public static float countLength(Vector vector) {
        float value = 0;

        for (int i = 0; i < vector.info.length; i++) {
            value += vector.info[i] * vector.info[i];
        }

        return (float) sqrt(value);
    }

    public static float[] normalize(Vector vector) {
        float[] result = vector.info;
        float value = 0;

        for (int i = 0; i < vector.info.length; i++) {
            value += result[i];
        }

        for (int i = 0; i < vector.info.length; i++) {
            result[i] = result[i] / value;
        }

        return result;
    }

    public static float scalarMultiplication(Vector firstVector, Vector secondVector) {
        float firstLength = countLength(firstVector);
        float secondLength = countLength(secondVector);
        float scalar = 0;

        if (checkVectors(firstVector, secondVector)) {
            for (int i = 0; i < firstVector.info.length; i++) {
                scalar += firstVector.info[i] * secondVector.info[i];
            }

            float cos = scalar / (firstLength * secondLength);

            return firstLength * secondLength * cos;
        } else {
            System.out.println("Error!");
            return 0;
        }
    }
}
