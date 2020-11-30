package lesson06.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void test() {
        gConv.gReq(q);
        gConv.currency();
        assertEquals("15232.40", gConv.getRes());
        log.info("200$ = 15232.40 rub");
    }
}