package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMmodule.Createnewpage;
import POMmodule.Loginpage;
import POMmodule.SearchProduct;

public class TestNGClas2 {
	
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
		    
		     // Loginpage logingpage = new Loginpage(driver);//object creatr
			    
			    logingpage.signinbutton();

			    logingpage.Emailormobilephonenumber("9403613370");  //methodcall
			      logingpage.Continue();
			    
			    
			    
			      driver.navigate().back();
			      
			      logingpage.createAccountSubmit();        //methodcall
			    		
			    
			      Createnewpage createnewpage = new Createnewpage(driver);   //object creatr
				    createnewpage.YourName();
			      
			    
				    createnewpage. MobileNumber();

			    
				    createnewpage.Password();

				    createnewpage. ContinueButton();
				    driver.navigate().back();
				    
				    driver.navigate().back();
				    
				    
				    driver.navigate().back();
				    
				    Thread.sleep(3000);
				    SearchProduct SearchProduct = new SearchProduct (driver); 

			         SearchProduct. Searchclear();
				    
				         SearchProduct. SearchBox();  //methodcall
				     
				         SearchProduct.SearchButton();

				         SearchProduct.ringName();
				    
				    
			      
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

