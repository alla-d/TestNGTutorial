package regressionsuite;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_TestClass2 extends BaseTestSuite {


    @BeforeClass
    public void setUp(){
        System.out.println("TestNG_TestClass2 -> This runs once before class");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("TestNG_TestClass2 -> This runs once after class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("TestNG_TestClass2 -> This runs before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("TestNG_TestClass2 -> This runs after every method");
    }

    @Test
    public void testMethod1(){
        System.out.println("TestNG_TestClass2 -> Running test -> testMethod1");
    }

    @Test
    public void testMethod2(){
        System.out.println("TestNG_TestClass2 -> Running test -> testMethod2");
    }
}
