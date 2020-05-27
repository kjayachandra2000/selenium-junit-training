package sample;

import org.junit.Ignore;
import org.junit.Test;

public class JunitTest extends BaseTest {

    @Test
    public void testCase1() {
        System.out.println("first test cases");
    }

    @Test
    @Ignore
    public void testCase2() {
        System.out.println("second test cases");
    }
}
