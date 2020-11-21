package lesson04;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NestedTest {

    private final ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Nested
    class MoreOrLess {

        @Test
        void canAdd() {
            assertTrue(arithmeticOperation.add(1, 2) == 2);
            assertEquals(3, arithmeticOperation.add(1, 2));
            assertEquals(3, arithmeticOperation.add(1, 4));
            assertEquals(3, arithmeticOperation.add(1, 5));
            assertEquals(3, arithmeticOperation.substract(1, 7));
            assertEquals(3, arithmeticOperation.add(1, 2));
        }

        @Test
        void canSubstract() {
            assertEquals(1, arithmeticOperation.substract(2, 1));
        }
    }

    @Nested
    class MultiplyOrDivide {

        @Test
        void canMultiply() {
            assertEquals(6, arithmeticOperation.multiply(2, 3));
        }

        @Test
        void canDivide() {
            assertEquals(3, arithmeticOperation.divide(6, 2));
        }
    }
}
