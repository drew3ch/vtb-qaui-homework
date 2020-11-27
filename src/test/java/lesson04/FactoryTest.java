package lesson04;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


public class FactoryTest {

    @TestFactory
    public List<DynamicTest> exampleTestFactory() {
        return Arrays.asList(
                dynamicTest("Dynamic square " + 2, () -> assertEquals(4, 2 * 2)),//
                dynamicTest("Dynamic true " + true, () -> assertTrue(true)));
    }

}
