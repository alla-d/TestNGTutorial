package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Priority {

    @BeforeClass
    public void setUp(){
        System.out.println("This runs once before class");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("This runs once after class");
    }

    @Test(priority = 3)
    public void testMethod1(){
        System.out.println("TestNG_Priority -> testMethod1");
    }

    @Test(priority = 2)
    public void testMethod2(){
        System.out.println("TestNG_Priority -> testMethod2");
    }

    @Test(priority = 1)
    public void testMethod3(){
        System.out.println("TestNG_Priority -> testMethod3");
    }
}
