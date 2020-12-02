package lesson06.homework;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.slf4j.LoggerFactory;

public class Test02 extends BaseTest {

    private static Page02 gConv;
    private final String q = "150 долларов в рублях";

    @BeforeAll
    public static void beforeAll() {
        gConv = new Page02(driver);
        log = LoggerFactory.getLogger(Page02.class);
    }

    @BeforeEach
    public void beforeTest() {
        gConv.gLink();
    }

    @Test
    public void test() throws NumberFormatException {
        gConv.gReq(q);
        gConv.currency();
        assertTrue(gConv.getRes() > 15200.00);
        log.info("200$ > 15200 rub");
    }
}