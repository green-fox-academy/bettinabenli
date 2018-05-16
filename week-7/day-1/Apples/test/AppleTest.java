import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    private Apple apple;

    @Before
    public void before() {
        apple = new Apple("apple");
    }

    @Test
    public void getApple() {
        String expectedName = "apple";
        String resultName = apple.getName();
        assertEquals(expectedName, resultName);
    }
}