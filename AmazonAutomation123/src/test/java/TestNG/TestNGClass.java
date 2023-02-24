package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMmodule.Loginpage;
import POMmodule.SearchProduct;

public class TestNGClass { 
//public static void main(String[] args) throws InterruptedException {
	

	
	

	private WebDriver driver;

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\Driver\\chromedriver.exe");
	       driver  = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	     	 
	}

	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		       System.out.println("Before Method");
		
	       driver.get("https://www.amazon.in/");

		       Thread.sleep(5000);
		      Loginpage logingpage = new Loginpage(driver);   //object creatr//
		    
		    
	       logingpage.signinbutton();              // methodcall
		       logingpage.Emailormobilephonenumber("9403613370");  //methodcall
		       logingpage.Continue();//methodcall
		    //  logingpage.password();
		      //logingpage.signin();
		       logingpage.keepmesininbox();

		       logingpage.keepmesininbox();

		      //NavigateMethot
		       driver.navigate().back();
		      
	    //  logingpage.createAccountSubmit();        //methodcall
	}
	
	@Test
	public void test123()
	{
		System.out.println("Test");
		String actualTitle=driver.getTitle();
        String actualUrl=driver.getCurrentUrl();
		String expectedTital="Amazonhomepage";
		
		String expectedURL="https://www.amazon.in/home"	;
				
		if(actualTitle.equals(expectedTital) && actualUrl.equals(expectedURL))
		
		if(actualTitle.equals(expectedTital) )
		{
			System.out.println("TestPass");
		}
		else
		{
			System.out.println("TestFail");
			
		}
			
		
	}
	
//	@Test
//	public void test1234()
//	{
//
//	    SearchProduct SearchProduct = new SearchProduct (driver); 
//
//         SearchProduct. Searchclear();
//	    
//	         SearchProduct. SearchBox();  //methodcall
//	         
//			 //Step 3 ;SearchBurron
//	         SearchProduct.SearchButton();
//	         
//			 //Step 4 ;  Ring Image
//	         SearchProduct.ringName();
//	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
		System.out.println("LogOut");

	
	}
	
	@AfterClass
	 public void afterClass( ) {
		System.out.println("After class");
		driver.close();

}
}

//	============================================================
//
//package TestNG;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import POMmodule.Loginpage;
//
//public class TestNGClass { 
//
//		 WebDriver driver;
//	
//	@BeforeClass
//	public void beforeClass()
//	{
//		System.out.println("Before Class");
//		System.setProperty("webdrier.chrome.driver", "C:\\Users\\Shubham\\Downloads\\chromedriver.exe");
//	      driver = new ChromeDriver();
//	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//     driver.manage().window().maximize();
//	}
     
//     
//     @BeforeMethod
// 	public void beforeMethod() throws InterruptedException
// 	{
// 		System.out.println("Before Method");
// 		
// 		  driver.get("https://www.amazon.in/");
// 
// 		   Thread.sleep(5000);
// 		    Loginpage logingpage = new Loginpage(driver);
// 		    
// 		  // Loginpage loingPage = new Loginpage(driver);   //object creatr
//		    
//		      logingpage.signinbutton();              // methodcall
//		      logingpage.Emailormobilephonenumber();  //methodcall
//		      logingpage.Continue();//methodcall
//	          logingpage.password();
//		      logingpage.signin();
//		      logingpage.keepmesininbutton();
//
//		      logingpage.keepmesininbox();
//
//		      //NavigateMethot
//		      driver.navigate().back();
//		      
//	      logingpage.createAccountSubmit();        //methodcall
////		    		
// 		    
// 		    
// 	}//object creatr
// 
// 		  // LoingPage loingPage = new LoingPage(driver);   //object creatr
// 		    
// 		    
// 		    
// 		    
// 		    
// 		   @Test
// 			public void test123()
// 			{
// 				System.out.println("Test");
// 				driver.get("https://www.amazon.in/home");
// 				
// 				String expectedTital="Amazonhomepage";
// 				
// 				String actualTitle=driver.getTitle();
//
// 				Assert.assertEquals(expectedTital,actualTitle);
// 			}
// 			
// 				
// 				
// 				
//// 				String actualTitle=driver.getTitle();
//// 				String expectedTital="Amazonhomepage";
//// 				
//// 				String expectedUrl="https://www.amazon.in/home"	;
//// 				
//// 				if(actualTitle.equals(expectedTital) && actualTitle.equals(expectedUrl))
//// 				{
//// 					System.out.println("TestPass");
//// 				}
//// 	               else
//// 				{
//// 					System.out.println("TestFail");
//// 					
//// 				}
// 		   
// 		   
// 		  @AfterMethod
//			public void afterMethod()
// 			{
// 				System.out.println("After Method");
// 				System.out.println("LogOut");
// 		
// 			
//	}
// 			
//		@AfterClass
// 			 public void afterClass( ) {
// 				System.out.println("After class");
// 				driver.close();
//				
//	}}
//     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
//	
//	
//	
//	
//	
//	
//}
//
//
//
//
