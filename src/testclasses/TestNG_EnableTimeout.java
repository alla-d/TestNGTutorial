package testclasses;

import org.testng.annotations.*;

public class TestNG_EnableTimeout {


    @Test (enabled = false)
    public void testMethod1(){
        System.out.println("testMethod1");
    }

    // it can be used for performance tests, e.i. if test method doesn't finish for defined time it failed
    @Test(timeOut = 100)
    public void testMethod2() throws InterruptedException{
        System.out.println("testMethod2");
        Thread.sleep(200);
    }
}
