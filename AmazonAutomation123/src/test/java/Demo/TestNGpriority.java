package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGpriority {
	
	@Test(priority = 1)
	public void one()
	{
		System.out.println("I am inside Test1");
	}
    @Test(priority = 1,invocationCount = 0)//multipl time repeated test case
	public void two() throws InterruptedException
	{
    	Thread.sleep(3000);
		System.out.println("I am inside Test2");

	}
	@Test(priority=2 )
	public void three() 
	{
		System.out.println("I am inside Test3");
        // Assert.fail();//tofail the test method
	}
	
	@Test (enabled = true)
	public void four()
	{
		System.out.println("I am inside Test4");
	}
}
