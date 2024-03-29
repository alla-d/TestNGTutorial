package testclasses;

import appcode.SomeClassToTest;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TestNG_SoftAsserts {

    @Test
    public void testSum(){
        SoftAssert sa = new SoftAssert();
        System.out.println("Running Test -> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumber(1, 2);
        sa.assertEquals(result, 2);
        System.out.println("\nLine after assert 1");
        sa.assertEquals(result, 3);
        System.out.println("\nLine after assert 2");
        sa.assertAll();
    }
}
