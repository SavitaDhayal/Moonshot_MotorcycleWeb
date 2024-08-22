package homePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.utility.base_class;
import com.utility.library;

@Listeners(com.utility.listner.class)
public class HomePage_Execution extends base_class {
	public home_page home;

	@Test(priority = 0)
	public void Header_section() throws Exception {
		//home = PageFactory.initElements(driver, home_page.class);--- not req now
		home= new home_page();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		PageLoaded();
		Wait(home.click_Motorcycles());
		Custom_click(home.click_Motorcycles(), "MOTORCYCLES");
		// Custom_click(home.click_Hero(), "Test Hero logo clickable");
		Wait(home.click_Scooters());
		Custom_click(home.click_Scooters(), "SCOOTERS");

		String parent = driver.getWindowHandle();
		Wait(home.click_Exchange());
		Custom_click(home.click_Exchange(), "EXCHANGE");

		// Get all window handles and hold them in a list.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<>(windowHandles); // Set to List Conversion
		// Switch to second window
		driver.switchTo().window(windowHandlesList.get(1));
		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
		driver.findElement(By.xpath("//input[@id='eng_lang_select']")).click();
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//a[@class='logo-show-modal']//img"));
		Assert.assertTrue(logo.isDisplayed());
		PageLoaded();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(windowHandlesList.get(0));
		PageLoaded();
		System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
		Custom_click(home.click_Hero(), "Test Hero logo clickable");
		Thread.sleep(2000);
		Wait(home.click_SERVICES());
		Custom_click(home.click_SERVICES(), "SERVICES");

		Wait(home.click_goodLife());
		Custom_click(home.click_goodLife(), "GOODLIFE");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		PageLoaded();

		Wait(home.click_RideEvents());
		Custom_click(home.click_RideEvents(), "RIDES & EVENTS");

		String parent1 = driver.getWindowHandle();
		Wait(home.click_DealerLocator());
		Custom_click(home.click_DealerLocator(), "DEALER LOCATOR");

		// Get all window handles and hold them in a list.
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windowHandlesList1 = new ArrayList<>(windowHandles1); // Set to List Conversion
		// Switch to second window
		driver.switchTo().window(windowHandlesList1.get(1));
		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());

		PageLoaded();
		driver.close();

		driver.switchTo().window(windowHandlesList1.get(0));
		PageLoaded();
		System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());

		Wait(home.click_Company());
		Custom_click(home.click_Company(), "COMPANY");
		Custom_click(home.click_Hero(), "Test Hero logo clickable");

		Thread.sleep(2000);
		Wait(home.click_countryTab());
		Custom_click(home.click_countryTab(), "Country:India");
		Thread.sleep(2000);
		Wait(home.cancel_button());
		Custom_click(home.cancel_button(), "Cross Button clickable");
		Wait(home.click_LoginTab());
		Custom_click(home.click_LoginTab(), "Login Tab clickable");
		Thread.sleep(2000);
		// Wait(home.cancel_Loginbutton());
		Custom_click(home.cancel_Loginbutton(), "login cancel button");
		driver.navigate().refresh();

	}

	@Test(priority = 1)
	public void Eshop() throws Exception {
		//home = PageFactory.initElements(driver, home_page.class);
		home= new home_page();
		Thread.sleep(3000);
		Wait(home.click_Eshop());
		Custom_click(home.click_Eshop(), "E-shop");

		String parent = driver.getWindowHandle();
		Wait(home.click_Accessories());
		Custom_click(home.click_Accessories(), "e-shop accessories");

		// Get all window handles and hold them in a list.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<>(windowHandles); // Set to List Conversion
		// Switch to second window
		driver.switchTo().window(windowHandlesList.get(1));
		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());

		PageLoaded();
		Custom_click(home.click_Home(), "E-shop Home Tab");
		PageLoaded();

		Wait(home.click_MotorTab());
		Custom_click(home.click_MotorTab(), "E-shop Motorcycles tab");
		PageLoaded();

		Wait(home.click_ScooterTab());
		Custom_click(home.click_ScooterTab(), "E-shop Scooters tab");
		PageLoaded();

		Wait(home.click_SpareTab());
		Custom_click(home.click_SpareTab(), "E-shop Spares tab");
		PageLoaded();

		Wait(home.click_EngineTab());
		Custom_click(home.click_EngineTab(), "E-shop Engine tab");
		PageLoaded();

		driver.close();

		driver.switchTo().window(windowHandlesList.get(0));
		PageLoaded();
		System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());

		Wait(home.click_EvaluateYour_BikeNow());
		Custom_click(home.click_EvaluateYour_BikeNow(), "Evaluate your bike now");

		// Get all window handles and hold them in a list.
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windowHandlesList1 = new ArrayList<>(windowHandles1); // Set to List Conversion
		// Switch to second window
		driver.switchTo().window(windowHandlesList1.get(1));
		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
		
		if(driver.findElement(By.xpath("//input[@id='eng_lang_select']")).isDisplayed()) {
		driver.findElement(By.xpath("//input[@id='eng_lang_select']")).click();}
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//a[@class='logo-show-modal']//img"));
		Assert.assertTrue(logo.isDisplayed());
		PageLoaded();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(windowHandlesList1.get(0));
		PageLoaded();
		System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());

		Wait(home.click_HeroConnect());
		Custom_click(home.click_HeroConnect(), "HERO CONNECT");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Wait(home.click_Merchandise());
		Custom_click(home.click_Merchandise(), "MERCHANDISE");
		Thread.sleep(2000);
		PageLoaded();
		Thread.sleep(2000);
		driver.navigate().back();
		Wait(home.click_Hero());
		Custom_click(home.click_Hero(), "Test Hero logo clickable");

	}

	//  slides section has been removed from homepage
//	@Test(priority = 2)
//	public void slider_section() throws Exception {
//		
//		home= new home_page();
//		//home = PageFactory.initElements(driver, home_page.class);
//		Thread.sleep(3000);
////		Wait(home.click_Hero());
////		Custom_click(home.click_Hero(), "Test Hero logo clickable");
//		Wait(home.click_FirstSlide());
//		Custom_click(home.click_FirstSlide(), "First slide");
//		Custom_click(home.click_knowMore(), "Know More On first silde");
//		Thread.sleep(2000);
//		PageLoaded();
//
//		Wait(home.click_HeroLogo());
//		Custom_click(home.click_HeroLogo(), "click Hero logo to naviagte back");
//
//		Wait(home.click_SecondSlide());
//		Custom_click(home.click_SecondSlide(), "Second Slide");
//		Custom_click(home.click_SecondSlide_KnowMore(), "Know More On Second silde");
//
//		Wait(home.click_HeroLogo());
//		Custom_click(home.click_HeroLogo(), "click Hero logo to naviagte back");
//
//		Custom_click(home.click_SecondSlide(), "Second Slide");
//		Thread.sleep(2000);
//		Custom_click(home.click_SecondSlide_BookNow(), "Book Now on second slide");
//
//		// Get all window handles and hold them in a list.
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String> windowHandlesList = new ArrayList<>(windowHandles); // Set to List Conversion
//		// Switch to second window
//		driver.switchTo().window(windowHandlesList.get(1));
//		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
//
//		PageLoaded();
//		driver.close();
//
//		driver.switchTo().window(windowHandlesList.get(0));
//		PageLoaded();
//		System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
//
//		Thread.sleep(2000);
//		Custom_click(home.click_ThirdSlide(), "Third slide");
//		Custom_click(home.click_RequestCallback(), "REQUEST CALL BACK");
//		Wait(home.click_RequestCallback_CancelBttn());
//		Custom_click(home.click_RequestCallback_CancelBttn(), "cancel Request call back Popup");
//		Thread.sleep(2000);
//		Wait(home.click_FourthSlide());
//		Custom_click(home.click_FourthSlide(), "Fourth slide");
//		Custom_click(home.click_FourthSlide_DownloaddApp(), "DOWNLOAD THE APP");
//
//		// Get all window handles and hold them in a list.
//		Set<String> windowHandles1 = driver.getWindowHandles();
//		List<String> windowHandlesList1 = new ArrayList<>(windowHandles1); // Set to List Conversion
//		// Switch to second window
//		driver.switchTo().window(windowHandlesList1.get(1));
//		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
//
//		PageLoaded();
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//
//		driver.switchTo().window(windowHandlesList1.get(0));
//		PageLoaded();
//		System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
//
//		Wait(home.click_FifthSlide());
//		Custom_click(home.click_FifthSlide(), "Fifth Slide");
//		Custom_click(home.click_FifthSlide_KnowMore(), "Know More On Fifth silde");
//
//		// Get all window handles and hold them in a list.
//		Set<String> windowHandles2 = driver.getWindowHandles();
//		List<String> windowHandlesList2 = new ArrayList<>(windowHandles2); // Set to List Conversion
//		// Switch to second window
//		driver.switchTo().window(windowHandlesList2.get(1));
//		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
//		driver.findElement(By.xpath("//input[@id='eng_lang_select']")).click();
//		Thread.sleep(2000);
//		WebElement logo = driver.findElement(By.xpath("//a[@class='logo-show-modal']//img"));
//		Assert.assertTrue(logo.isDisplayed());
//		PageLoaded();
//		Thread.sleep(2000);
//		driver.close();
//		driver.switchTo().window(windowHandlesList2.get(0));
//		PageLoaded();
//		System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
//
//		Custom_click(home.click_SixthSlide(), " Sixth Slide");
//		Custom_click(home.click_SixthSlide_KnowMore(), "Know More On Sixth silde");
//		Wait(home.click_HeroLogo());
//		Custom_click(home.click_HeroLogo(), "click Hero logo to naviagte back");
//		Thread.sleep(2000);
//		Wait(home.click_SixthSlide());
//		Custom_click(home.click_SixthSlide(), " Sixth Slide");
//
//		Custom_click(home.click_RequestCallback2(), "REQUEST CALL BACK");
//		Wait(home.click_RequestCallback_CancelBttn());
//		Custom_click(home.click_RequestCallback_CancelBttn(), "cancel Request call back Popup");
//
//	}

	@Test(priority=2)
	public void Explore_our_products() throws Exception {

		// home= new home_page();
		//home = PageFactory.initElements(driver, home_page.class);
		Thread.sleep(3000);
		List<WebElement> practicalbike = driver.findElements(By.xpath("//div[@id='container-4817756cd6']//ul//li"));
	    int s = practicalbike.size();
	    
	    System.out.println("total tabs present: " + s);
	    
	    for(int i=0;i<s;i++) {
	    	
	    	VerifyElementPresent(driver.findElement(By.xpath("//div[@id='container-4817756cd6']//ul//li["+(i+1)+"]")), "" );
	    	String text=	driver.findElement(By.xpath("//div[@id='container-4817756cd6']//ul//li["+(i+1)+"]")).getText();
	    	Custom_click(driver.findElement(By.xpath("//div[@id='container-4817756cd6']//ul//li["+(i+1)+"]")), text);	    	
	    	Thread.sleep(2000);
	    }
	    
	    
//		Wait(home.click_NewRelease());
//		Custom_click(home.click_NewRelease(), "NEW RELEASE ");
//		Thread.sleep(3000);
//		Wait(home.click_Practical());
//		Custom_click(home.click_Practical(), "PRACTICAL");
//		Custom_click(home.click_Executive(), "EXECUTIVE");
//		Custom_click(home.click_Performance(), "PERFORMANCE");
//		Custom_click(home.click_ExploreScooters(), "SCOOTERS");

	}
	
	
	@Test(priority = 3)
	public void Be_A_Hero_Links() throws Exception {

		home= new home_page();
		//home = PageFactory.initElements(driver, home_page.class);
		Thread.sleep(3000);
		Wait(home.click_goodlifeLINK());
		Custom_click(home.click_goodlifeLINK(), "Goodlife Image cilckable");
		Thread.sleep(3000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
//		Wait(home.click_AccessoriesLINK());
//		Custom_click(home.click_AccessoriesLINK(), "Accessories link");
//		Thread.sleep(2000);
//		PageLoaded();
//		driver.navigate().back();
		Wait(home.click_JoyRideLINK());
		Custom_click(home.click_JoyRideLINK(), "JoyRide Link");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Wait(home.click_eshop_SparesLINK());
		Custom_click(home.click_eshop_SparesLINK(), "Eshop Spares link");

		// Get all window handles and hold them in a list.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<>(windowHandles); // Set to List Conversion
		// Switch to second window
		driver.switchTo().window(windowHandlesList.get(1));
		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
		PageLoaded();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(windowHandlesList.get(0));
		PageLoaded();
		System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());

	}

	@Test(priority = 4)
	public void Bottom_Nav_tabs_Media() throws Exception {
		
		home= new home_page();
//		home = PageFactory.initElements(driver, home_page.class);
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");

		VerifyElementPresent(home.ExploreProducts_Media_CompanyNews(), "Text");
		Custom_click(home.ExploreProducts_Media_CompanyNews(), " on Comapany news");
		home.MediaTabs();
		Thread.sleep(1000);
	//	driver.navigate().back();
		
		Custom_click(home.click_Hero(), "on hero logo");
		
		VerifyElementPresent(home.ExploreProducts_Media_Multimedia(), "Text ");
		Custom_click(home.ExploreProducts_Media_Multimedia(), "on Multimedia");
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		
		VerifyElementPresent(home.ExploreProducts_Media_LatestDevelopment(), "Text ");
		Custom_click(home.ExploreProducts_Media_LatestDevelopment(), "LATEST DEVELOPMENT");
		PageLoaded();
		driver.navigate().back();
		PageLoaded();

	}
	
//	@Test
	public void Botton_Nav_Tabs_Investors() throws Exception {
		
		home= new home_page();
		Custom_click(home.ExploreProducts_Investors(), "on Investors");
		Thread.sleep(1000);
		VerifyElementPresent(home.Investors_InvRelations(), "");
		Custom_click(home.Investors_InvRelations(), "on Investors Relations");
		PageLoaded();
		Thread.sleep(1000);
		driver.navigate().back();
		//Thread.sleep(1000);
		
		VerifyElementPresent(home.Investors_Financial(), "");
		Custom_click(home.Investors_Financial(), "on Financial");
		PageLoaded();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
//		
		VerifyElementPresent(home.Investors_ShareHolders(), "");
		Custom_click(home.Investors_ShareHolders(), "on ShareHolders");
		PageLoaded();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	}
	
//	@Test()
	public void Bottom_Nav_Tabs_Careers() {
		home= new home_page();
		
		Custom_click(home.ExploreProducts_Careers(), "On Careers");
		
		
	}
	
//	@Test()
	public void Bottom_Nav_Tabs_Sustainibility() {
		home= new home_page();
		Custom_click(home.ExploreProducts_Sustainabilty(), "On Sustainability");
		
		Custom_click(home.Sustainabilty_WomenInLeadership(), null);
		Custom_click(home.Sustainabilty_campusToCorporate(), null);
		Custom_click(home.Sustainabilty_ExploreNewOpenings(), null);
		
		
	}
	
//	@Test()
	public void Bottom_Nav_Tabs_CSR() {
		
	}
	


	@Test(priority = 6)
	public void Footers_Links_AboutUs() throws Exception {

		home= new home_page();
		//home = PageFactory.initElements(driver, home_page.class);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Custom_click(home.click_FooterLink_AboutUs(), "About Us");
		Thread.sleep(2000);
		PageLoaded();
		List<WebElement> aboutUsLinks = driver.findElements(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[1]//li"));
	    int s = aboutUsLinks.size();
	    
	    System.out.println("total tabs present: " + aboutUsLinks.size());
	    
	    for(int i=0;i<s;i++) {
	    	String text=	driver.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[1]//li["+(i+1)+"]")).getText();
	    	Custom_click(driver.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[1]//li["+(i+1)+"]")), text);	    	
	    	Thread.sleep(2000);
	    	PageLoaded();	    		
	        System.out.println(text);

	    }
//	    
	}
		
		@Test(priority = 7)
		public void FooterLinks_MyHero() throws Exception{
			home= new home_page();
			//home = PageFactory.initElements(driver, home_page.class);
			Thread.sleep(3000);
			
			
	    Custom_click(home.click_Hero(), "Hero Home page");
	   // Thread.sleep(2000);
	    Wait(home.click_FooterLink_MyHero());
	    Custom_click(home.click_FooterLink_MyHero(), "My Hero");
		Thread.sleep(2000);
		PageLoaded();
		
		List<WebElement> MyHeroLinks = driver.findElements(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[2]//li"));
	    int s1 = MyHeroLinks.size();
	    
	    System.out.println("total tabs present: " + MyHeroLinks.size());
	    
	    for(int i=0;i<s1;i++) {
	    	//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,900)");
	    
	    	String text=	driver.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[2]//li["+(i+1)+"]")).getText();
	    //	js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[2]//li["+(i+1)+"]")));
	    	Custom_click(driver.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[2]//li["+(i+1)+"]")), text);
	    	Thread.sleep(2000);
	    	PageLoaded();    	
	        System.out.println(text);
	        driver.navigate().back();

	    }
	    }
//	    
//	    
		
		
		@Test(priority = 8)
		public void FooterLinks_ReachUs() throws Exception {
			home= new home_page();
			//home = PageFactory.initElements(driver, home_page.class);
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
		Wait(home.click_FooterLink_ReachUs());

		Custom_click(home.click_FooterLink_ReachUs(), "Reach Us");
		Thread.sleep(2000);
		PageLoaded();

		List<WebElement> ReachUsLinks = driver
				.findElements(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[3]//li"));
		int s2 = ReachUsLinks.size();

		System.out.println("total tabs present: " + ReachUsLinks.size());

//		Set<String> windows1 = null;

		for (int i = 0; i < s2; i++) {
			int size = driver.getWindowHandles().size();
			//String parentHandle = driver.getWindowHandle();
			if(size<=1)
			{
			String text = driver
					.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[3]//li[" + (i + 1) + "]"))
					.getText();
		WebElement t = driver.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[3]//li[" + (i + 1) + "]"));
			
			Custom_click(t, text);
			Thread.sleep(2000);
			int size1 = driver.getWindowHandles().size();
			if(size1<=1)
			{
			PageLoaded();
			}
			else
			{
				i--;
			}
			}
			else
			{
				Set<String> windowHandles = driver.getWindowHandles();
			List<String> windowHandlesList = new ArrayList<>(windowHandles); // Set to List Conversion
//				// Switch to second window				
				driver.switchTo().window(windowHandlesList.get(1));
				PageLoaded();
				Thread.sleep(2000);
				driver.close();
				driver.switchTo().window(windowHandlesList.get(0));
				
			}
			
//			windows1 = driver.getWindowHandles();
//			System.out.println(windows1.size());
//			if (windows1.size() > 1) {
//				Set<String> windowHandles = driver.getWindowHandles();
//				List<String> windowHandlesList = new ArrayList<>(windowHandles); // Set to List Conversion
//				// Switch to second window
//				driver.switchTo().window(windowHandlesList.get(1));
//
//				PageLoaded();
//				System.out.println(driver.getCurrentUrl());
//				
//
//				driver.switchTo().window(windowHandlesList.get(0));
//				PageLoaded();
//				
//			} else {
//				break;
//			}
			
			
	//		System.out.println(text);

		}  
			}
		
		
		
	@Test(priority = 9)
	public void FooterLinks_MediaCenter() throws Exception {
		home= new home_page();
		//home = PageFactory.initElements(driver, home_page.class);
		Thread.sleep(3000);
		

	    Wait(home.click_FooterLink_MediaCenter());
	    Custom_click(home.click_FooterLink_MediaCenter(), "Media Center");
		Thread.sleep(2000);
		PageLoaded();
		
		List<WebElement> MediaCenterLinks = driver.findElements(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[4]//li"));
	    int s3 = MediaCenterLinks.size();
	    
	    System.out.println("total tabs present: " + MediaCenterLinks.size());
	    
	    for(int i=0;i<s3;i++) {
	   
	    
	    	String text=	driver.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[4]//li["+(i+1)+"]")).getText();
	    	Custom_click(driver.findElement(By.xpath("(//ul[@class='footer-link d-md-block d-none'])[4]//li["+(i+1)+"]")), text);
	    	Thread.sleep(2000);
	    	PageLoaded();    	
	        System.out.println(text);
	        	    
	    }
	}

	
	
	@Test(priority = 5)
	public void countryNavigation() throws Exception {
		home= new home_page();
		//home = PageFactory.initElements(driver, home_page.class);
		Thread.sleep(3000);
		Wait(home.click_countryTab());
		Custom_click(home.click_countryTab(), "Country:India");
		Wait(home.cancel_button());
		Custom_click(home.cancel_button(), " on cross button");
		
	}

	// @Test(priority = 1)
//		public void ClickMotorcycles()
//		{
//	home = PageFactory.initElements(driver, home_page.class);
//			home.ClickMotorcycles();
//		}

}
