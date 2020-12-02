package lesson06.homework;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.slf4j.LoggerFactory;

public class Test01 extends BaseTest {

    private static Page01 gCalc;
    private final String q = "калькулятор";

    @BeforeAll
    public static void beforeAll() {
        gCalc = new Page01(driver);
        log = LoggerFactory.getLogger(Page01.class);
    }

    @BeforeEach
    public void beforeTest() {
        gCalc.gLink();
    }

    @Test
    public void onePlusThree() {
        gCalc.gReq(q);
        gCalc.onePlusThree();
        makeScreenshot(driver);
        assertEquals("4", gCalc.getRes());
        log.info("1+3=4");
    }

    @Test
    public void sixMultipleNine() {
        gCalc.gReq(q);
        gCalc.sixMultipleNine();
        makeScreenshot(driver);
        assertEquals("54", gCalc.getRes());
        log.info("6*9=54");
    }

    @Test
    public void eightDivFour() {
        gCalc.gReq(q);
        gCalc.eightDivFour();
        makeScreenshot(driver);
        assertEquals("2", gCalc.getRes());
        log.info("8/4=2");
    }

    @Test
    public void eightMinusTwo() {
        gCalc.gReq(q);
        gCalc.eightMinusTwo();
        makeScreenshot(driver);
        assertEquals("6", gCalc.getRes());
        log.info("8-4=6");
    }

}