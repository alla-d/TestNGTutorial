package testclasses;

import appcode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assert {

    @Test
    public void testSum(){
        System.out.println("Running Test -> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumber(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testString(){
        System.out.println("\nRunning Test -> testString");
        String expectedString = "Hello World";
        SomeClassToTest obj = new SomeClassToTest();
        String result = obj.addStrings("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testArray(){
        System.out.println("\nRunning Test -> testArray");
        int[] expectedArray = {1, 2, 3, 4};
        SomeClassToTest obj = new SomeClassToTest();
        int [] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);
        System.out.println("\nEnd Test -> testArray");
    }
}
