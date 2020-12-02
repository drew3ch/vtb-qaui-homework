package lesson06.homework;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.slf4j.LoggerFactory;

public class Test03 extends BaseTest {

    private static Page03 gCalc;
    private final String q = "калькулятор";

    @BeforeAll
    public static void beforeAll() {
        gCalc = new Page03(driver);
        log = LoggerFactory.getLogger(Page03.class);
    }

    @BeforeEach
    public void beforeTest() {
        gCalc.gLink();
    }

    @Test
    public void sin() {
        gCalc.gReq(q);
        gCalc.sin();
        makeScreenshot(driver);
        assertEquals("0.8414709848", gCalc.getRes());
        log.info("sin 1 = 0.8414709848");
    }

    @Test
    public void cos() {
        gCalc.gReq(q);
        gCalc.cos();
        makeScreenshot(driver);
        assertEquals("0.54030230586", gCalc.getRes());
        log.info("cos 1 = 0.54030230586");
    }

    @Test
    public void tan() {
        gCalc.gReq(q);
        gCalc.tan();
        makeScreenshot(driver);
        assertEquals("1.55740772465", gCalc.getRes());
        log.info("tan 1 = 1.55740772465");
    }
}