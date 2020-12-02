package lesson06.homework;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.slf4j.LoggerFactory;

public class Test04 extends BaseTest {

    private static Page04 gCalc;
    private final String q = "калькулятор";

    @BeforeAll
    public static void beforeAll() {
        gCalc = new Page04(driver);
        log = LoggerFactory.getLogger(Page04.class);
    }

    @BeforeEach
    public void beforeTest() {
        gCalc.gLink();
    }

    @Test
    public void test() {
        gCalc.gReq(q);
        gCalc.factorial();
        assertEquals("120", gCalc.getRes());
        log.info("factorial 5 = 120");

        gCalc.gReq(q);
        gCalc.log();
        assertEquals("0.95424250943", gCalc.getRes());
        log.info("log 9 = 0.95424250943");

        gCalc.gReq(q);
        gCalc.squareroot();
        assertEquals("3", gCalc.getRes());
        log.info("squareroot 9 = 3");
    }
}