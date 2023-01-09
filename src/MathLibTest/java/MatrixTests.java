import Math.Matrix.Matrix3x3;
import Math.Matrix.Matrix4x4;
import Math.Vector.Vector3;
import Math.Vector.Vector4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MatrixTests {
    Matrix3x3 A = new Matrix3x3(new float[] {1, 1, 1, 2, 2, 2, 3, 3, 3});
    Matrix3x3 B = new Matrix3x3(new float[] {7, 7, 7, 8, 8, 8, 9, 9, 9});

    Matrix4x4 C = new Matrix4x4(new float[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4});
    Matrix4x4 D = new Matrix4x4(new float[] {5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8});

    Vector3 u = new Vector3(new float[] {8, 8, 7});
    Vector4 v = new Vector4(new float[] {8, 8, 7, 7});

    @Test
    public void testForSumMatrix3x3() {
        float[] actual = Matrix3x3.sum(A, B);
        float[] expected = new float[] {8, 8, 8, 10, 10, 10, 12, 12, 12};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForSumMatrix4x4() {
        float[] actual = Matrix4x4.sum(C, D);
        float[] expected = new float[] {6, 6, 6, 6, 8, 8, 8, 8, 10, 10, 10, 10, 12, 12, 12, 12};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForSubtractMatrix3x3() {
        float[] actual = Matrix3x3.subtract(A, B);
        float[] expected = new float[] {-6, -6, -6, -6, -6, -6, -6, -6, -6};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForSubtractMatrix4x4() {
        float[] actual = Matrix4x4.subtract(C, D);
        float[] expected = new float[] {-4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForMultiplyMatrix3x3() {
        float[] actual = Matrix3x3.multiplication(A, B);
        float[] expected = new float[] {24, 24, 24, 48, 48, 48, 72, 72, 72};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForMultiplyMatrix4x4() {
        float[] actual = Matrix4x4.multiplication(C, D);
        float[] expected = new float[] {26, 26, 26, 26, 52, 52, 52, 52, 78, 78, 78, 78, 104, 104, 104, 104};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForMultiplyMatrix3x3ByVector3() {
        float[] actual = Matrix3x3.multiplicationMatrix3x3ByVector3(A, u);
        float[] expected = new float[] {23, 46, 69};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForMultiplyMatrix4x4ByVector4() {
        float[] actual = Matrix4x4.multiplicationMatrix4x4ByVector4(D, v);
        float[] expected = new float[] {150, 180, 210, 240};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForTransposeMatrix3x3() {
        float[] actual = Matrix3x3.transpose(B);
        float[] expected = new float[] {7, 8, 9, 7, 8, 9, 7, 8, 9};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForTransposeMatrix4x4() {
        float[] actual = Matrix4x4.transpose(C);
        float[] expected = new float[] {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForCreateUnitMatrix3x3() {
        float[] actual = Matrix3x3.createUnitMatrix3x3();
        float[] expected = new float[] {1, 0, 0, 0, 1, 0, 0, 0, 1};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForCreateUnitMatrix4x4() {
        float[] actual = Matrix4x4.createUnitMatrix4x4();
        float[] expected = new float[] {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForCreateNullMatrix3x3() {
        float[] actual = Matrix3x3.createNullMatrix3x3();
        float[] expected = new float[] {0, 0, 0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForCreateNullMatrix4x4() {
        float[] actual = Matrix4x4.createNullMatrix4x4();
        float[] expected = new float[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(actual, expected);
    }
}
