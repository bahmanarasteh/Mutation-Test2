package remainder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    @Test
    void testPositive() {
        assertEquals(1, Remainder.compute(10, 3));
        assertEquals(0, Remainder.compute(9, 3));
    }

    @Test
    void testNegativeDividend() {
        assertEquals(-1, Remainder.compute(-10, 3));
    }

    @Test
    void testZeroDividend() {
        assertEquals(0, Remainder.compute(0, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> Remainder.compute(10, 0));
    }
}
