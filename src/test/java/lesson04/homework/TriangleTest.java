package lesson04.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    private final squareTriangle squareTriangle = new squareTriangle();

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("@BeforeAll - Execute once before all test methods in this class.");
        logger.debug("@BeforeAll - Execute once before all test methods in this class.");
    }

    @ParameterizedTest(name = "Is triangle with sides {0}, {1}, {2}")
    @MethodSource("sidesTriangle")
    void isTriangleTest(double a, double b, double c) {
        assertTrue(squareTriangle.isTriangle(a, b, c));
    }

    @ParameterizedTest(name = "Is isosceles triangle with sides {0}, {1}, {2}")
    @MethodSource("sidesTriangle")
    void isIsoscelesTriangleTest(double a, double b, double c) {
        assertTrue(squareTriangle.isIsoscelesTriangle(a, b, c));
    }

    @ParameterizedTest(name = "Is equilateral triangle with sides {0}, {1}, {2}")
    @MethodSource("sidesTriangle")
    void isEquilateralTriangleTest(double a, double b, double c) {
        assertTrue(squareTriangle.isEquilateralTriangle(a, b, c));
    }

    @ParameterizedTest
    @MethodSource("sidesTriangle")
    void squareNotZero(double a, double b, double c) {
        assertTrue(squareTriangle.squareTriangle(a, b, c) > 0);
    }

    static Stream<Arguments> sidesTriangle() {
        return Stream.of(
                Arguments.of(14,10,10),
                Arguments.of(2,3,4),
                Arguments.of(9,9,9)
        );
    }

    @ParameterizedTest(name = "square a triangle with sides {0}, {1}, {2} is {3}")
    @MethodSource("squareTriangle")
    void setSquareTriangle(double a, double b, double c, double result) {
        assertEquals(result, squareTriangle.squareTriangle(a, b, c));
    }

    static Stream<Arguments> squareTriangle() {
        return Stream.of(
                Arguments.of(14,10,10,49.98999899979995),
                Arguments.of(2,3,4,2.9047375096555625),
                Arguments.of(7,8,9,26.832815729997478)
        );
    }

}
