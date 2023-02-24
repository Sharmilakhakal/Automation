package TestClass;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import POMmodule.Createnewpage;
import POMmodule.Loginpage;

	
  
	public class varifycreatinpage {
			public static void main(String[] args) {
		  //Step 1 ;  Open the Browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\Driver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		      //step2:enter url
		    driver.get("https://www.amazon.in/");
		      
	         //Step 3 ; clickonsigninbutton

	           // Thread.speep(3000);

		    Loginpage logingpage = new Loginpage(driver);//object creatr
		    
		    logingpage.signinbutton();
		  //  Step 4;entermbnumberand click on continue button// methodcall
		      logingpage.Emailormobilephonenumber("9403613370");  //methodcall
		      logingpage.Continue();//methodcall
//		      logingpage.password();
//		      logingpage.signin();
//		      
		      //NavigateMethot
		      driver.navigate().back();
		      
		          //methodcall
		    		
		      logingpage.  createAccountSubmit();

		    //  logingpage.createAccountSubmit();        //methodcall

		      //Step 3 ; SendYoueName On Create New Page
          //   Thread.speep(3000);
			    Createnewpage createnewpage = new Createnewpage(driver);   //object creatr
			    createnewpage.YourName();
		      
			    //Step 4 ; Send MobileNumber On Create New Page

			  //  Createnewpage createnewpage = new Createnewpage(driver);   //object creatr

			    createnewpage. MobileNumber();
		      
			    //Step 5 ; Send Email  On Create New Page
			   // createnewpage.Email();
			    
			    //Step 6; Send Password On Create New Page

			    createnewpage.Password();
			    
			    //Step 7; Send ContinueButton On Create New Page

			    
			    createnewpage. ContinueButton();
			    
			    

		      
		      
		      
		      
		      
		
	}}


