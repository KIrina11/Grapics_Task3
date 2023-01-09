import Math.Vector.Vector2;
import Math.Vector.Vector3;
import Math.Vector.Vector4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTests {
    Vector2 a = new Vector2(new float[] {2, 3});
    Vector2 b = new Vector2(new float[] {6, 7});

    Vector3 c = new Vector3(new float[] {3, 3, 4});
    Vector3 d = new Vector3(new float[] {7, 8, 7});

    Vector4 e = new Vector4(new float[] {0, 0, 9, 9});
    Vector4 f = new Vector4(new float[] {2, 7, 4, 9});

    @Test
    public void testForSumVectors2() {
        float[] actual = Vector2.sum(a, b);
        float[] expected = new float[] {8, 10};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForSumVectors3() {
        float[] actual = Vector3.sum(c, d);
        float[] expected = new float[] {10, 11, 11};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForSumVectors4() {
        float[] actual = Vector4.sum(e, f);
        float[] expected = new float[] {2, 7, 13, 18};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForSubtractionVectors2() {
        float[] actual = Vector2.subtraction(a, b);
        float[] expected = new float[] {-4, -4};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForSubtractionVectors3() {
        float[] actual = Vector3.subtraction(c, d);
        float[] expected = new float[] {-4, -5, -3};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForSubtractionVectors4() {
        float[] actual = Vector4.subtraction(e, f);
        float[] expected = new float[] {-2, -7, 5, 0};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForMultiplyingVector2ByScalar() {
        float[] actual = Vector2.multiplyingByScalar(a, 2);
        float[] expected = new float[] {4, 6};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForMultiplyingVector3ByScalar() {
        float[] actual = Vector3.multiplyingByScalar(c, 2);
        float[] expected = new float[] {6, 6, 8};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForMultiplyingVector4ByScalar() {
        float[] actual = Vector4.multiplyingByScalar(e, 2);
        float[] expected = new float[] {0, 0, 18, 18};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForDividingVector2ByScalar() {
        float[] actual = Vector2.dividingByScalar(a, 2);
        float[] expected = new float[] {1, 1.5F};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForDividingVector3ByScalar() {
        float[] actual = Vector3.dividingByScalar(c, 2);
        float[] expected = new float[] {1.5F, 1.5F, 2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForDividingVector4ByScalar() {
        float[] actual = Vector4.dividingByScalar(e, 2);
        float[] expected = new float[] {0, 0, 4.5F, 4.5F};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForCountVector2Length() {
        float actual = Vector2.countLength(a);
        float expected = 3.6055512F;

        assertEquals(actual, expected);
    }
    @Test
    public void testForCountVector3Length() {
        float actual = Vector3.countLength(c);
        float expected = 5.8309519F;

        assertEquals(actual, expected);
    }
    @Test
    public void testForCountVector4Length() {
        float actual = Vector4.countLength(e);
        float expected = 12.72792206F;

        assertEquals(actual, expected);
    }

    @Test
    public void testForNormalizeVector2() {
        float[] actual = Vector2.normalize(a);
        float[] expected = new float[] {0.4F, 0.6F};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForNormalizeVector3() {
        float[] actual = Vector3.normalize(c);
        float[] expected = new float[] {0.3F, 0.3F, 0.4F};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForNormalizeVector4() {
        float[] actual = Vector4.normalize(e);
        float[] expected = new float[] {0, 0, 0.5F, 0.5F};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForScalarMultiplyVectors2() {
        float actual = Vector2.scalarMultiplication(a, b);
        float expected = 33;

        assertEquals(actual, expected);
    }

    @Test
    public void testForScalarMultiplyVectors3() {
        float actual = Vector3.scalarMultiplication(c, d);
        float expected = 73;

        assertEquals(actual, expected);
    }

    @Test
    public void testForScalarMultiplyVectors4() {
        float actual = Vector4.scalarMultiplication(e, f);
        float expected = 116.99999F;

        assertEquals(actual, expected);
    }

    @Test
    public void testForVectorMultiplyVectors3() {
        float[] actual = Vector3.vectorMultiplication(c, d);
        float[] expected = new float[] {-11, 7, 3};

        assertArrayEquals(actual, expected);
    }
}
