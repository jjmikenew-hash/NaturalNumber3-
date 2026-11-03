import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;

/**
 * JUnit test fixture for {@code NaturalNumber}'s constructors and kernel
 * methods.
 *
 * @author Liam McHale
 * @author Jacob Newman
 *
 */
public abstract class NaturalNumberTest {

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @return the new number
     * @ensures constructorTest = 0
     */
    protected abstract NaturalNumber constructorTest();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorTest = i
     */
    protected abstract NaturalNumber constructorTest(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorTest)
     */
    protected abstract NaturalNumber constructorTest(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorTest = n
     */
    protected abstract NaturalNumber constructorTest(NaturalNumber n);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @return the new number
     * @ensures constructorRef = 0
     */
    protected abstract NaturalNumber constructorRef();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorRef = i
     */
    protected abstract NaturalNumber constructorRef(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorRef)
     */
    protected abstract NaturalNumber constructorRef(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorRef = n
     */
    protected abstract NaturalNumber constructorRef(NaturalNumber n);

    // TODO - add test cases for four constructors, multiplyBy10, divideBy10, isZero

    @Test
    public final void testConstructor() {
        NaturalNumber nTest = this.constructorTest();
        NaturalNumber nRef = this.constructorRef();
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testConstructorInt0() {
        int i = 0;
        NaturalNumber nTest = this.constructorTest(i);
        NaturalNumber nRef = this.constructorRef(i);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testConstructorIntMax() {
        int i = Integer.MAX_VALUE;
        NaturalNumber nTest = this.constructorTest(i);
        NaturalNumber nRef = this.constructorRef(i);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testConstructorInt12345() {
        int i = 12345;
        NaturalNumber nTest = this.constructorTest(i);
        NaturalNumber nRef = this.constructorRef(i);
        assertEquals(nRef, nTest);
    }
    @Test
    public final void testConstructorString0() {
        String s = "0";
        NaturalNumber nTest = this.constructorTest(s);
        NaturalNumber nRef = this.constructorRef(s);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testConstructorStringLarge() {
        String s = "123456789012345678901234567890";
        NaturalNumber nTest = this.constructorTest(s);
        NaturalNumber nRef = this.constructorRef(s);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testConstructorString12345() {
        String s = "12345";
        NaturalNumber nTest = this.constructorTest(s);
        NaturalNumber nRef = this.constructorRef(s);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testConstructorNN() {
        NaturalNumber n = this.constructorRef();
        NaturalNumber nTest = this.constructorTest(n);
        NaturalNumber nRef = this.constructorRef(n);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testConstructorNN12345() {
        NaturalNumber n = this.constructorRef(12345);
        NaturalNumber nTest = this.constructorTest(n);
        NaturalNumber nRef = this.constructorRef(n);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testMultiplyBy10Zero() {
        NaturalNumber nTest = this.constructorTest(0);
        NaturalNumber nRef = this.constructorRef(0);
        nTest.multiplyBy10(0);
        nRef.multiplyBy10(0);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testMultiplyBy10Three() {
        NaturalNumber nTest = this.constructorTest(0);
        NaturalNumber nRef = this.constructorRef(0);
        nTest.multiplyBy10(3);
        nRef.multiplyBy10(3);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testMultiplyBy10PlusZero() {
        NaturalNumber nTest = this.constructorTest(5);
        NaturalNumber nRef = this.constructorRef(5);
        nTest.multiplyBy10(0);
        nRef.multiplyBy10(0);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testMultiplyBy10Large() {
        NaturalNumber nTest = this.constructorTest(12345);
        NaturalNumber nRef = this.constructorRef(12345);
        nTest.multiplyBy10(3);
        nRef.multiplyBy10(3);
        assertEquals(nRef, nTest);
    }

    @Test
    public final void testDivideBy10FiftyThree() {
        NaturalNumber nTest = this.constructorTest(53);
        NaturalNumber nRef = this.constructorRef(53);
        int remainderTest = nTest.divideBy10();
        int remainderRef = nRef.divideBy10();
        assertEquals(nRef, nTest);
        assertEquals(remainderRef, remainderTest);
    }

    @Test
    public final void testDivideBy10Zero() {
        NaturalNumber nTest = this.constructorTest(0);
        NaturalNumber nRef = this.constructorRef(0);
        int remainderTest = nTest.divideBy10();
        int remainderRef = nRef.divideBy10();
        assertEquals(nRef, nTest);
        assertEquals(remainderRef, remainderTest);
    }

    @Test
    public final void testDivideBy10Large() {
        NaturalNumber nTest = this.constructorTest(123456789);
        NaturalNumber nRef = this.constructorRef(123456789);
        int remainderTest = nTest.divideBy10();
        int remainderRef = nRef.divideBy10();
        assertEquals(nRef, nTest);
        assertEquals(remainderRef, remainderTest);
    }

    @Test
    public final void testIsZeroEmpty() {
        NaturalNumber nTest = this.constructorTest();
        assertTrue(nTest.isZero());
    }

    @Test
    public final void testIsZeroInt() {
        int i = 0;
        NaturalNumber nTest = this.constructorTest(i);
        assertTrue(nTest.isZero());
    }

    @Test
    public final void testIsZeroString() {
        String i = "0";
        NaturalNumber nTest = this.constructorTest(i);
        assertTrue(nTest.isZero());
    }

    @Test
    public final void testIsZeroNN() {
        NaturalNumber i = this.constructorRef();
        NaturalNumber nTest = this.constructorTest(i);
        assertTrue(nTest.isZero());
    }

    @Test
    public final void testIsZeroFalse() {
        NaturalNumber nTest = this.constructorTest(12345);
        assertFalse(nTest.isZero());
    }
}
