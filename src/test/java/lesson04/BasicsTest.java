package lesson04;

import lesson04.extension.YourExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.fail;

@ExtendWith({YourExtension.class})
public class BasicsTest {

    private static Logger logger = LoggerFactory.getLogger(BasicsTest.class);

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("@BeforeAll - Execute once before all test methods in this class.");
        logger.debug("@BeforeAll - Execute once before all test methods in this class.");
    }

    @BeforeEach
    void setUpBeforeEach() {
        System.out.println("@BeforeEach - Executed before each test method in this class.");
    }

    @Test
    @DisplayName("Test add user successfully.")
    void testAddUserSuccess() {
        System.out.println("Test add user successfully");
    }

    @Test
    @DisplayName("Test add user with passed argument is null.")
    void testAddUserNull() {
        System.out.println("Test add null user.");
        fail();
    }

    @Test
    @Disabled("Not implemented yet.")
    void testDeleteUser() {
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("@AfterEach - This method is called after each test method.");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll - This method is called after all test methods.");
    }

}
