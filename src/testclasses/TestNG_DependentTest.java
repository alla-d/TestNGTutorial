package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_DependentTest {

    SomeClassToTest obj;

    @BeforeClass
    public void setUp(){
        obj = new SomeClassToTest();
        System.out.println("This runs once before class");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("This runs once after class");
    }

    @Test(dependsOnMethods = {"testMethod2"}, alwaysRun = true)
    public void testMethod1(){
        System.out.println("testMethod1");

    }

    @Test
    public void testMethod2(){
        System.out.println("testMethod3");
        int result = obj.sumNumber(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3(){
        System.out.println("testMethod3");
    }

    @Test
    public void testMethod4(){
        System.out.println("testMethod4");
    }
}
