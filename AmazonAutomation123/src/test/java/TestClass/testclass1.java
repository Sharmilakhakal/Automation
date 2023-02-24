package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMmodule.Loginpage;

public class testclass1 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\Driver\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjY0e_9_638AhXLHCsKHVICBZsYABAAGgJzZg&ohost=www.google.com&cid=CAESbeD2Q8i9Hd1YpYS_7njbv_KY8k5Llrpr-uYD2Wfdl4940UrR-wAn9iCawYCLtURdmnBBvjB3IEptHVFkjQVWShWmfbxFfgZIfU6jvjpqNr_TEmksBWsTbFN5gNTM3Oz1j86_L7H0rBiCGcslmDI&sig=AOD64_3coIGmvc6du7uwkQGbOKqmaMbv4w&q&adurl&ved=2ahUKEwiIoun9_638AhUf7TgGHQk1DhYQ0Qx6BAgIEAE");
		   
		    driver.manage().window().maximize();
		    
		    
		      //get url
		    driver.get("https://www.amazon.in/s?k=amazon+com+login&adgrpid=58963055255&ext_vrnc=hi&gclid=CjwKCAiAuOieBhAIEiwAgjCvck8D7GO0xuNm27vI4iQTZScd0wPH07CHLAL_-h6-BqbZ_y7-45APHBoCenYQAvD_BwE&hvadid=590962137299&hvdev=c&hvlocphy=20462&hvnetw=g&hvqmt=b&hvrand=12739341454537779152&hvtargid=kwd-298366470465&hydadcr=16190_2269686&tag=googinhydr1-21&ref=pd_sl_1911k8annk_b");
	
		   Thread.sleep(5000);
		    Loginpage logingpage = new Loginpage(driver);   //object creatr
		    
		      logingpage.signinbutton();              // methodcall
		      logingpage.Emailormobilephonenumber("9403613370");  //methodcall
		      logingpage.Continue();//methodcall
//		      logingpage.password();
//		      logingpage.signin();
//		      logingpage.keepmesininbutton();

		      logingpage.keepmesininbox();

		      //NavigateMethot
		      driver.navigate().back();
		      
		      logingpage.createAccountSubmit();        //methodcall
		    		
		 		
			 }
}	
				
		    		
//		    		Request
	//Request
	///api/users?page=2




		    		
		    		
		    		
		    		
		    		
		    		
		    		
		 