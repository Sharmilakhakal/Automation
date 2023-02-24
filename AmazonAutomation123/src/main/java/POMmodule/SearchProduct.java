package POMmodule;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SearchProduct {
		
		  
		@FindBy (xpath = "//input[@type=\"text\"]")
		private WebElement Searchclear;
		
		  
		@FindBy (xpath = "//input[@type=\"text\"]")
		private WebElement SearchBox;
				  
		
		
		
		@FindBy (xpath = "//input[@id=\"nav-search-submit-button\"]")
		private WebElement SearchButton;
		  
		//*[@id="search"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[1]/div/span/a/div/img

		//@FindBy (xpath = "//div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[1]/div/span/a/div/img]")
		//private WebElement ringName;
		@FindBy (xpath = "//span//div//div[5]")
		private WebElement ringName;
		  
		
//		//input[@id='add-to-cart-button']
//		@FindBy (xpath = "//input[@id='add-to-cart-button']")
//		private WebElement Addtocard;
//		
//		@FindBy (xpath = "(//a[@class=\"a-button-text\"])[3]")
//		private WebElement GotoCard;
//		
//		
		
		
		  

//	     @FindBy (xpath = "//input[@id=\"buy-now-button\"]")
//	     private WebElement BuyNowBotton;
//	     
//		@FindBy (xpath = "//a[@name=\"submit.add-to-registry.wishlist.unrecognized\"]")
//		private WebElement AddtoWishList;
////		 
		//@FindBy (xpath = "//a[@name=\"submit.add-to-registry.wishlist.unrecognized\"]")
		//private WebElement AddtoWishList;
		 
		
		

	    //Construction

	     public SearchProduct (WebDriver driver)

	    {
	         PageFactory.initElements(driver, this);
	     }
		
		    
	     
	     //metod
	     
	     public void Searchclear ()
	     { 
	    	 Searchclear.clear();
	     }
	     
	     
	     
	     
	     
	     
	     public void SearchBox ()
	     { 
	    	 SearchBox.sendKeys("Ring");
	     }
	     
	     
	     public void SearchButton ()
	     { 
	    	 SearchButton.click();
	     }
	     
	     public void ringName ()
	     { 
	    	 ringName.click();
	     }
	     
//	     public void Addtocard ()
//	     { 
//	    	 Addtocard.click();
//	     }
//	     public void GotoCard ()
//	     { 
//	    	 GotoCard.click();
//	     }
//     
//	     
//	     public void BuyNowBotton ()
//	     { 
//	    	 BuyNowBotton.click();
//	     }
//	     
//	     
//	     
//	     public void AddtoWishList ()
//	     { 	    	 AddtoWishList.click();
//	     }
//	     
 
	     
	     
	     
	     
	     
	     
	    
	}















	//input[@id="buy-now-button"]


