package POMmodule;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Createnewpage {
		@FindBy (xpath = "//input[@type='text']")
		private WebElement YourName ;
		
	 //Anotation
		@FindBy (xpath = "//input[@id=\"ap_phone_number\"]")
		private WebElement MobileNumber ;//Web Element Find=privatewebelement
//		
//		@FindBy (xpath = "//input[@type=\"email\"]")
//		private WebElement Email ;
		
		@FindBy (xpath = "//input[@id=\"ap_password\"]")
		private WebElement Password ;
		
		@FindBy (xpath = "//input[@class=\"a-button-input\"]")
		private WebElement ContinueButton ;
		  
//		//------------------------------------------------------------------
//		@FindBy (xpath = "//a[@class=\"a-link-normal\"][2]")
//		private WebElement PrivacyNoticeName;
//		  
//
//		@FindBy (xpath = "//a[@class=\"a-link-normal\"][1]")
//		private WebElement Continuseofuse;
//		  
//		@FindBy (xpath = "//a[@class=\"a-link-normal\"][3]")
//		private WebElement Help;
//		  

		
		
		
	    //Construction

	     public Createnewpage (WebDriver driver)

	    {
	         PageFactory.initElements(driver, this);
	     }
		

	     //method

	   public void YourName ()
	   { 
		   YourName.sendKeys("Sharmila Talekar");
	   }
	  
		
	   public void MobileNumber ()
	   { 
		   MobileNumber.sendKeys("9370519320");
	   }  
	   
		
//	   public void Email ()
//	   { 
//		   Email.sendKeys("sharmilatalekar99@mail.com");
//	   }    
//   
	   public void Password ()
	   { 
		   Password.sendKeys("Pass@123");
	   }    
	   
	   public void ContinueButton ()
	   { 
		   ContinueButton.click();
	   }    
	   
	}


