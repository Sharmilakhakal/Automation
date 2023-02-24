package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMmodule.SearchProduct;

public class VarifySearchProduct  {
		public static void main(String[] args) throws InterruptedException {

			  //Step 1 ;  Open the url
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\Driver\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    driver.manage().window().maximize();
			      //get url
			    driver.get("https://www.amazon.in/s?k=amazon+com+login&adgrpid=58963055255&ext_vrnc=hi&gclid=CjwKCAiAuOieBhAIEiwAgjCvck8D7GO0xuNm27vI4iQTZScd0wPH07CHLAL_-h6-BqbZ_y7-45APHBoCenYQAvD_BwE&hvadid=590962137299&hvdev=c&hvlocphy=20462&hvnetw=g&hvqmt=b&hvrand=12739341454537779152&hvtargid=kwd-298366470465&hydadcr=16190_2269686&tag=googinhydr1-21&ref=pd_sl_1911k8annk_b");
			      
				 //Step 2 ;  Search Box

			    SearchProduct SearchProduct = new SearchProduct (driver); 

		         SearchProduct. Searchclear();
			    
			         SearchProduct. SearchBox();  //methodcall
			         
					 //Step 3 ;SearchBurron
			         SearchProduct.SearchButton();
			         
					 //Step 4 ;  Ring Image
			         SearchProduct.ringName();
			         Thread.sleep(3000);
//					 //Step 5 ;  AddToCard
//			         SearchProduct.Addtocard();
//			         
//			         //gotocard
//			         SearchProduct. GotoCard();
//			         
//					 //Step 6 ; BuyNowButto
//			        SearchProduct.BuyNowBotton();
//			         
//			        
//			        //Step 6 ; BuyNowButto
//			        SearchProduct.AddtoWishList();
//			         
	}
		
			      

		
		
		

	}



