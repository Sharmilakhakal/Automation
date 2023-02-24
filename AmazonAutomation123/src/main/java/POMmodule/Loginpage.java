package POMmodule;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Loginpage {
		
	//	@FindBy (xpath = "a[@data-csa-c-slot-id=\"nav-link-accountList\"]")
		//private WebElement signinAccountAndList ;
		//(//span[@class='nav-action-inner'])[1]//"//span[@class=\"nav-action-inner\"][1]")
		@FindBy (xpath = "//span[@id='nav-link-accountList-nav-line-1']")
		private WebElement signinbutton ;
		
		@FindBy (xpath = "//input[@type='email']")
		private WebElement Emailormobilephonenumber ;
		
		@FindBy (xpath = "//input[@id='continue']")
		private WebElement Continue ;
		
//		
//		@FindBy (xpath = "//input[@type='password']")
//		private WebElement password ;
//		
//		
//		@FindBy (xpath = "//input[@id='signInSubmit']")
//		private WebElement signin ;
//		//span[@class='a-label a-checkbox-label']
//		
//		@FindBy (xpath = "//span[@class='a-label a-checkbox-label']")
//		private WebElement keepmesininbutton ;
//		//input[@type='checkbox']
//		

		@FindBy (xpath = "	//input[@type='checkbox']")
		private WebElement keepmesininbox ;
		
		
		
		@FindBy (xpath = "//a[@id='createAccountSubmit']")
		private WebElement createAccountSubmit ;
		
		

	    //ConstructionLoginpage

	     public Loginpage (WebDriver driver)

	    {
	         PageFactory.initElements(driver, this);
	     }

	     //method

	    // public void signinAccountAndList ()
	      //{ 
	   	//signinAccountAndList.click();
	     //}
	   
	     public void signinbutton()
	    {
	   	   signinbutton.click();
	     }
	   
	     public void Emailormobilephonenumber(String username)//input parameter
	      {
	   	   Emailormobilephonenumber.sendKeys(username);
	   	   
	      }
	    
	      public void Continue()
	      {
	   	     Continue.click();
	      }
	      

//	      public void password()
//	      {
//	    	  password.sendKeys("Pass@123");
//	      }
//	     
//
//	      public void signin()
//	      {
//	    	  signin.click();
//	      }

//	      public void keepmesininbutton()
//	      {
//	    	  keepmesininbutton.click();
//	      }
	     
	      public void keepmesininbox()
	      {
	    	  keepmesininbox.click();
	      }
	     
	      
	      

	      public void createAccountSubmit ()
	      {
	    	  createAccountSubmit.click();
	      }

	   


	}

	
	
	
	


