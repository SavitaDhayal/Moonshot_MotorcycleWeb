package com.page_object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utility.base_class;

public class home_page extends base_class {

//public WebDriver driver;

////====================================Header Section======================
	public home_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	private List<WebElement> Click_MotorCycles;

	public void ClickMotorcycles() {
		for (int i = 0; i < Click_MotorCycles.size(); i++) {

			System.out.println(Click_MotorCycles.get(i).getText());
			Click_MotorCycles.get(i).click();
		}
	}

	@FindBy(xpath = "//a[normalize-space()='MOTORCYCLES']")
	private WebElement motorcycles;

	public WebElement click_Motorcycles() {
		return motorcycles;
	}

	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle'])[2]")
	private WebElement scooters;

	public WebElement click_Scooters() {
		return scooters;
	}

	@FindBy(xpath = "//a[normalize-space()='EXCHANGE']")
	private WebElement exchange;

	public WebElement click_Exchange() {
		return exchange;
	}

	@FindBy(xpath = "(//a[normalize-space()='GOODLIFE'])[1]")
	private WebElement goodlife;

	public WebElement click_goodLife() {
		return goodlife;
	}

	@FindBy(xpath = "//a[normalize-space()='SERVICES']")
	private WebElement services;

	public WebElement click_SERVICES() {
		return services;
	}

	@FindBy(xpath = "//a[normalize-space()='RIDES & EVENTS']")
	private WebElement rideEvents;

	public WebElement click_RideEvents() {
		return rideEvents;
	}

	@FindBy(xpath = "//a[normalize-space()='DEALER LOCATOR']")
	private WebElement dealerLocator;

	public WebElement click_DealerLocator() {
		return dealerLocator;
	}

	@FindBy(xpath = "//a[normalize-space()='COMPANY']")
	private WebElement company;

	public WebElement click_Company() {
		return company;
	}

	@FindBy(xpath = "//img[@alt='Home']")
	private WebElement home;

	public WebElement click_Hero() {
		return home;
	}

	// when on sliders page--- use this xpath to navigate back to home page
	// click on it when new bike launches and page design changes
	@FindBy(xpath = "//img[@alt='homepage']")
	private WebElement homeHero;

	public WebElement click_HeroLogo() {
		return homeHero;
	}
	
	@FindBy(xpath = "//span[@id='cookies__container__close']")
	private WebElement cookies;

	public WebElement click_CancelCookies() {
		return cookies;
	}

	
	@FindBy(xpath = "//div[@class='top-bar-option ']//p")
	private WebElement country;

	public WebElement click_countryTab() {
		return country;
	}

	@FindBy(xpath = "(//div[@id='countryModal']//button)[1]")
	private WebElement crossbttn;

	public WebElement cancel_button() {
		return crossbttn;
	}

	@FindBy(xpath = "//p[normalize-space()='Login']")
	private WebElement logintab;

	public WebElement click_LoginTab() {
		return logintab;
	}

	// (//div[@id='logIn']//button)[1]
	@FindBy(xpath = "//div[@id='logIn']//button[@type='button'][normalize-space()='×']")
	private WebElement logincrossbttn;

	public WebElement cancel_Loginbutton() {
		return logincrossbttn;
	}

	@FindBy(xpath = "//p[@class='quick-nav-label']")
	private WebElement eshop;

	public WebElement click_Eshop() {
		return eshop;
	}

	@FindBy(xpath = "//h5[normalize-space()='ACCESSORIES']")
	private WebElement accessories;

	public WebElement click_Accessories() {
		return accessories;
	}

//======================E-shop=======================	//child window

	@FindBy(xpath = "//a[@title='Home']")
	private WebElement hometab;

	public WebElement click_Home() {
		return hometab;
	}

	@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Motorcycles']")
	private WebElement motortab;

	public WebElement click_MotorTab() {
		return motortab;
	}

	@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Scooters']")
	private WebElement scootertab;

	public WebElement click_ScooterTab() {
		return scootertab;
	}

	@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Spares']")
	private WebElement sparestab;

	public WebElement click_SpareTab() {
		return sparestab;
	}

	@FindBy(xpath = "//a[@title='Engine Oil']")
	private WebElement enginetab;

	public WebElement click_EngineTab() {
		return enginetab;
	}

	@FindBy(xpath = "//h5[normalize-space()='Evaluate your bike now']")
	private WebElement evaluate;

	public WebElement click_EvaluateYour_BikeNow() {
		return evaluate;
	}

	@FindBy(xpath = "//h5[normalize-space()='HERO CONNECT']")
	private WebElement heroConnect;

	public WebElement click_HeroConnect() {
		return heroConnect;
	}

	@FindBy(xpath = "//h5[normalize-space()='MERCHANDISE']")
	private WebElement merchandise;

	public WebElement click_Merchandise() {
		return merchandise;
	}

	// ========== ============= ============ =====================
	@FindBy(xpath = "//h5[normalize-space()='Book a Service']")
	private WebElement bookaService;

	public WebElement click_Book_a_Service() {
		return bookaService;
	}

	/// ====================================Slider
	/// -Section===========================================

	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[1]")
	private WebElement firstslide;

	public WebElement click_FirstSlide() {
		return firstslide;
	}

	@FindBy(xpath = "//a[@class='btn booknow-btn'][normalize-space()='KNOW MORE']")
	private WebElement knowMore;

	public WebElement click_knowMore() {
		return knowMore;
	}

	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[2]")
	private WebElement secondSlide;

	public WebElement click_SecondSlide() {
		return secondSlide;
	}

	@FindBy(xpath = "//a[@class='btn callback-btn btn-white'][normalize-space()='Know More']")
	private WebElement knowMore_2ndSlide;

	public WebElement click_SecondSlide_KnowMore() {
		return knowMore_2ndSlide;
	}

	@FindBy(xpath = "//a[@class='btn booknow-btn'][normalize-space()='Book Now']")
	private WebElement bookNow_2ndSlide;

	public WebElement click_SecondSlide_BookNow() {
		return bookNow_2ndSlide;
	}

	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[3]")
	private WebElement thirdSlide;

	public WebElement click_ThirdSlide() {
		return thirdSlide;
	}

	@FindBy(xpath = "//a[contains(text(),'REQUEST CALLBACK')]")
	private WebElement requestcallback;

	public WebElement click_RequestCallback() {
		return requestcallback;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='×'])[3]")
	private WebElement requestcallCancellBtn;

	public WebElement click_RequestCallback_CancelBttn() {
		return requestcallCancellBtn;
	}

	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[4]")
	private WebElement fourthSlide;

	public WebElement click_FourthSlide() {
		return fourthSlide;
	}

	@FindBy(xpath = "//a[normalize-space()='Download the App']")
	private WebElement thirdSlide_downloadApp;

	public WebElement click_FourthSlide_DownloaddApp() {
		return thirdSlide_downloadApp;
	}

	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[5]")
	private WebElement fifthSlide;

	public WebElement click_FifthSlide() {
		return fifthSlide;
	}

	@FindBy(xpath = "//a[@class='btn callback-btn btn-white'][normalize-space()='KNOW MORE']")
	private WebElement knowMore_5thSlide;

	public WebElement click_FifthSlide_KnowMore() {
		return knowMore_5thSlide;
	}

	@FindBy(xpath = "//section[@class='responsive-container home-main-section aem-GridColumn aem-GridColumn--default--12']//li[6]")
	private WebElement sixthSlide;

	public WebElement click_SixthSlide() {
		return sixthSlide;
	}

	@FindBy(xpath = "//a[@class='btn booknow-btn'][normalize-space()='Know More']")
	private WebElement knowMore_6thSlide;

	public WebElement click_SixthSlide_KnowMore() {
		return knowMore_6thSlide;
	}

	@FindBy(xpath = "//a[normalize-space()='Request Callback']")
	private WebElement requestcallback2;

	public WebElement click_RequestCallback2() {
		return requestcallback2;
	}

	// =============== Explore Our
	// products===============================================

	// div[@id='container-4817756cd6']//ul//li
	@FindBy(xpath = "//div[@id='container-4817756cd6']//ul//li")
	private WebElement exploreProducts;

	public WebElement click_exploreOurProductsTbas() {
		return exploreProducts;
	}

	@FindBy(xpath = "(//div[@id='menu-1287252789']//div[@class='bike-product-prant']//img)")
	private List<WebElement> exploreBike;

	@FindBy(xpath = "(//div[@id='menu-1287252789']//div[@class='bike-product-prant']//p)")
	private List<WebElement> exploreBikeText;

	public void products_NewLaunches() {
		try {
		
			ScrollIntoView(click_NewLaunches());
			

			for (int i = 0; i < exploreBike.size(); i++) {
				// Custom_click(exploreBike.get(i), "Bikes ");
				mouse_hover(exploreBike.get(i), " on Bike ");
				
				i++;
				Thread.sleep(100);
				for (int j = i; j < exploreBikeText.size(); j++) {
					VerifyElementPresent(exploreBikeText.get(j), "bike is ");
					Thread.sleep(100);
					ScrollIntoView(exploreBikeText.get(j));
					Custom_click(exploreBikeText.get(j), "on " + exploreBikeText.get(j).getText());

					Thread.sleep(100);
					PageLoaded();			
				}
				
//				if(click_Request_CB_closeBttn().isDisplayed()) {
				Custom_click(click_Request_CB_closeBttn(), " on Cross button of Request call backpopup");
//				driver.navigate().back();
//				}
//				else {
//
//				driver.navigate().back();}
				driver.navigate().back();
				Thread.sleep(100);
				PageLoaded();

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@FindBy(xpath = "//a[normalize-space()='New Launches']")
	private WebElement newRelease;

	public WebElement click_NewLaunches() {
		return newRelease;
	}

	@FindBy(xpath = "//a[contains(@class,'h4-medium-heading-std')][normalize-space()='PRACTICAL']")
	private WebElement practical;

	public WebElement click_Practical() {
		return practical;
	}

	List<WebElement> exp_practical_bikes = driver
			.findElements(By.xpath("(//div[@id='menu-1287252788']//div[@class='bike-product-prant']//img)"));
	int s2 = exp_practical_bikes.size();
	List<WebElement> exp_practical_biketext = driver
			.findElements(By.xpath("(//div[@id='menu-1287252788']//div[@class='bike-product-prant']//p)"));

	public void Explore_PracticalBikes() throws InterruptedException {

		for (int i = 0; i < s2; i++) {

	//		System.out.println(i);
			Thread.sleep(500);
			// Wait(exp_practical_bikes.get(i));
			mouse_hover(exp_practical_bikes.get(i), " Bike ");

			i++;
			Thread.sleep(500);
	//		System.out.println(i);
			for (int j = i; j < exp_practical_biketext.size(); j++) {

				// VerifyElementPresent(exp_practical_biketext.get(j), "bike ");
				Thread.sleep(500);
				if (exp_practical_biketext.get(j).isDisplayed()) {
					VerifyElementPresent(exp_practical_biketext.get(j), "bike ");
					Custom_click(exp_practical_biketext.get(j),
							"bike text  " + exp_practical_biketext.get(j).getText() + " is clickable ");
					Thread.sleep(500);
					PageLoaded();
					Thread.sleep(500);
					driver.navigate().back();
					Thread.sleep(500);
					PageLoaded();
				}
				Thread.sleep(500);
			}
		}

	}

	@FindBy(xpath = "//a[contains(@class,'h4-medium-heading-std')][normalize-space()='EXECUTIVE']")
	private WebElement executive;

	public WebElement click_Executive() {
		return executive;
	}

	List<WebElement> exp_ExecutiveBikes = driver
			.findElements(By.xpath("(//div[@id='menu-1287252787']//div[@class='bike-product-prant']//img)"));
	int s3 = exp_ExecutiveBikes.size();
	List<WebElement> exp_Executive_biketext = driver
			.findElements(By.xpath("(//div[@id='menu-1287252787']//div[@class='bike-product-prant']//p)"));
	// int s1 = explorebiketext.size();

	public void Explore_ExecutiveBikes() throws InterruptedException {
		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");
		for (int i = 0; i < s3; i++) {
			Thread.sleep(500);
			mouse_hover(exp_ExecutiveBikes.get(i), "Bike");

		//	System.out.println(i);
			i++;
			Thread.sleep(500);
			for (int j = 1; j < exp_Executive_biketext.size(); j++) {
			//	System.out.println(j);
				Thread.sleep(500);
				if (exp_Executive_biketext.get(j).isDisplayed()) {
					VerifyElementPresent(exp_Executive_biketext.get(j), "bike ");
					Custom_click(exp_Executive_biketext.get(j), " " + exp_Executive_biketext.get(j).getText());
					Thread.sleep(500);
					PageLoaded();
					driver.navigate().back();
					Thread.sleep(500);
					PageLoaded();
					// System.out.println(j);
				}
			}
			Thread.sleep(500);

		}
	}

	@FindBy(xpath = "//a[contains(@class,'h4-medium-heading-std')][normalize-space()='PERFORMANCE']")
	private WebElement performance;

	public WebElement click_Performance() {
		return performance;
	}

	List<WebElement> exp_PerformanceBikes = driver
			.findElements(By.xpath("(//div[@id='menu-1287252786']//div[@class='bike-product-prant']//img)"));
	int s4 = exp_PerformanceBikes.size();
	List<WebElement> exp_PerformanceBikesText = driver
			.findElements(By.xpath("(//div[@id='menu-1287252786']//div[@class='bike-product-prant']//p)"));

	public void Explore_PerformanceBikes() throws InterruptedException {
		
		for (int i = 0; i < s4; i++) {
			Thread.sleep(500);
			mouse_hover(exp_PerformanceBikes.get(i), "Bike");

			
		//	System.out.println(i);
			i++;
			Thread.sleep(500);
			for (int j = 1; j < exp_PerformanceBikesText.size(); j++) {
			//	System.out.println(j);
				Thread.sleep(500);
				if (exp_PerformanceBikesText.get(j).isDisplayed()) {
					VerifyElementPresent(exp_PerformanceBikesText.get(j), "bike ");
					Custom_click(exp_PerformanceBikesText.get(j), " " + exp_PerformanceBikesText.get(j).getText());
					Thread.sleep(500);
					PageLoaded();
					driver.navigate().back();
					Thread.sleep(500);
					PageLoaded();
					// System.out.println(j);
				}
			}
			Thread.sleep(500);
		}
	}

	@FindBy(xpath = "//a[normalize-space()='Scooters']")
	private WebElement explorescooters;

	public WebElement click_ExploreScooters() {
		return explorescooters;
	}

//===================Be a HERO with a HERO=========

	@FindBy(xpath = "//a[normalize-space()='Scooters']")
	private WebElement Be_aHEROTEXT;

	public WebElement Text_Be_a_HERO() {
		return Be_aHEROTEXT;
	}

	@FindBy(xpath = "(//h4[normalize-space()='GOODLIFE'])[1]")
	private WebElement goodlifeLINK;

	public WebElement click_goodlifeLINK() {
		return goodlifeLINK;
	}

	@FindBy(xpath = "//a[@href='/en-in/hero-accessories.html']")
	private WebElement accessoriesLINK;

	public WebElement click_AccessoriesLINK() {
		return accessoriesLINK;
	}

	@FindBy(xpath = "//h4[normalize-space()='GENUINE PARTS']")
	private WebElement eshopSparesLINK;

	public WebElement click_eshop_SparesLINK() {
		return eshopSparesLINK;
	}

	@FindBy(xpath = "//h4[normalize-space()='JOYRIDE PROGRAM']")
	private WebElement joyrideLINK;

	public WebElement click_JoyRideLINK() {
		return joyrideLINK;
	}

//===========================bottom navigation tabs===============

	// div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']
//	(//ul[@class='nav nav-tabs common-tabs-main'])[2]
	// div[@id='container-72fa56b932']//ul[@class='nav nav-tabs
	// common-tabs-main']//li

	@FindBy(xpath = "//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']//li")
	private WebElement bottomNav_bar;

	public WebElement click_Bottom_Nav_Bar() {
		return bottomNav_bar;
	}

	// ====================== explore products heading ====================
	//// ========MEDIA======/////
	@FindBy(xpath = "(//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']//li)[1]")
	private WebElement exploreProducts_Media;

	public WebElement ExploreProducts_Media() {
		return exploreProducts_Media;
	}

	@FindBy(xpath = "//h4[normalize-space()='COMPANY NEWS']")
	private WebElement Media_companyNews;

	public WebElement ExploreProducts_Media_CompanyNews() {
		return Media_companyNews;
	}

//	
	@FindBy(xpath = "(//ul[@class='breadcrumb align-items-center'])[1]//li")
	private List<WebElement> Media;

	public void MediaTabs() throws Exception {
		int tabs = Media.size();
		for (int i = 0; i < tabs; i++) {

			System.out.println("total tabs present: " + tabs);

			Wait(Media.get(i));
			VerifyElementPresent(Media.get(i), "tabs  clickable");
			Custom_click(Media.get(i), "tab " + (i + 1));
			Thread.sleep(2000);
			PageLoaded();
//    	String text=	driver.findElement(By.xpath("(//ul[@class='breadcrumb align-items-center'])[1]//li["+(i+1)+"]")).getText();
//    	Custom_click(driver.findElement(By.xpath("(//ul[@class='breadcrumb align-items-center'])[1]//li["+(i+1)+"]")), text);
//    	Thread.sleep(1000);
//    	PageLoaded();    	
//        System.out.println(text);
//        PageLoaded();

		}
	}

	@FindBy(xpath = "//h4[normalize-space()='MULTIMEDIA']")
	private WebElement Media_multimedia;

	public WebElement ExploreProducts_Media_Multimedia() {
		return Media_multimedia;
	}

	@FindBy(xpath = "//h4[normalize-space()='LATEST DEVELOPMENT']")
	private WebElement Media_LatestDevelopment;

	public WebElement ExploreProducts_Media_LatestDevelopment() {
		return Media_LatestDevelopment;
	}

	//// ========INVESTORS======/////

	@FindBy(xpath = "(//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']//li)[2]")
	private WebElement exploreProducts_Investors;

	public WebElement ExploreProducts_Investors() {
		return exploreProducts_Investors;
	}

	@FindBy(xpath = "//h4[normalize-space()='INVESTOR RELATIONS']")
	private WebElement Investors_InvRelations;

	public WebElement Investors_InvRelations() {
		return Investors_InvRelations;
	}

	@FindBy(xpath = "//h4[normalize-space()='Financial Results & Presentations']")
	private WebElement Investors_Financial;

	public WebElement Investors_Financial() {
		return Investors_Financial;
	}

	@FindBy(xpath = "//h4[normalize-space()='Info to Shareholders']")
	private WebElement Investors_Shareholders;

	public WebElement Investors_ShareHolders() {
		return Investors_Shareholders;
	}

	//// ========CAREERS======/////

	@FindBy(xpath = "(//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']//li)[3]")
	private WebElement exploreProducts_Careers;

	public WebElement ExploreProducts_Careers() {
		return exploreProducts_Careers;
	}

	//// ========SUSTAINABILITY======/////

	@FindBy(xpath = "(//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']//li)[4]")
	private WebElement exploreProducts_Sustainabilty;

	public WebElement ExploreProducts_Sustainabilty() {
		return exploreProducts_Sustainabilty;
	}

	@FindBy(xpath = "//div[@id='tileteaser-0c954ae1de']//div[@class='event-info-main']")
	private WebElement sustainabilty_WomenInLeadership;

	public WebElement Sustainabilty_WomenInLeadership() {
		return exploreProducts_Sustainabilty;
	}

	@FindBy(xpath = "//div[@id='tileteaser-1d6974e48b']//div[@class='event-info-main']")
	private WebElement sustainabilty_campusToCorporate;

	public WebElement Sustainabilty_campusToCorporate() {
		return sustainabilty_campusToCorporate;
	}

	@FindBy(xpath = "//a[@href='https://jobs.heromotocorp.com/viewalljobs']//div[@class='event-info-main']")
	private WebElement sustainabilty_ExploreNewOpenings;

	public WebElement Sustainabilty_ExploreNewOpenings() {
		return sustainabilty_ExploreNewOpenings;
	}

	//// ========CSR======/////

	@FindBy(xpath = "(//div[@id='container-72fa56b932']//ul[@class='nav nav-tabs common-tabs-main']//li)[5]")
	private WebElement exploreProducts_CSR;

	public WebElement ExploreProducts_CSR() {
		return exploreProducts_CSR;
	}

	// ==================footer links=====================================

	@FindBy(xpath = "//h3[contains(@class,'pb-4')]//a[normalize-space()='About Us']")
	private WebElement aboutUs;

	public WebElement click_FooterLink_AboutUs() {
		return aboutUs;
	}
	// (//ul[@class='footer-link d-md-block d-none'])[1]//li
	// h3[@class='footer-heading pb-4']

	@FindBy(xpath = "//h3[contains(@class,'pb-4')]//a[normalize-space()='My Hero']")
	private WebElement myHero;

	public WebElement click_FooterLink_MyHero() {
		return myHero;
	}

	@FindBy(xpath = "//h3[contains(@class,'pb-4')]//a[normalize-space()='Reach Us']")
	private WebElement reachUs;

	public WebElement click_FooterLink_ReachUs() {
		return reachUs;
	}

	@FindBy(xpath = "//a[normalize-space()='Media Center']")
	private WebElement mediaCenter;

	public WebElement click_FooterLink_MediaCenter() {
		return mediaCenter;
	}
//===================country tab===============================

	@FindBy(xpath = "//div[@id='container-3aa1aa44cf']//li")
	private WebElement selectCountry;

	public WebElement select_country() {
		return selectCountry;
	}

	@FindBy(xpath = "//div[@class='userInfo']//a")
	private WebElement countryName;

	public WebElement get_CountryName() {
		return countryName;
	}

////==############============ How Can we Help You? ==========##############==================
	// ================ Book now ======================

	@FindBy(xpath = "//div[@id='container-1a3175475f']//section//h3")
	private WebElement text;

	public WebElement get_text_HomePage() {
		return text;

	}

	@FindBy(xpath = "//a[1]//div[1]//img[2]")
	private WebElement booknowImage;

	public WebElement click_BookNow_Image_HomePage() {
		return booknowImage;
	}

	@FindBy(xpath = "//p[normalize-space()='BOOK NOW']")
	private WebElement booknowText;

	public WebElement click_BookNow_Text_HomePage() {
		return booknowText;
	}

	// ================ Book A service ===================

	@FindBy(xpath = "(//img[@alt='book-service'])[2]")
	private WebElement bookAServiceImage;

	public WebElement click_BookAService_Image_HomePage() {
		return bookAServiceImage;
	}

	@FindBy(xpath = "//div[@id='container-485c0906aa']//parent::div//parent::div//button[@type='button']")
	private WebElement crossBttn;

	public WebElement click_crossBttn_BookAService() {
		return crossBttn;
	}

	@FindBy(xpath = "//p[normalize-space()='BOOK A SERVICE']")
	private WebElement bookAServiceText;

	public WebElement click_BookAService_Text_HomePage() {
		return bookAServiceText;
	}

	// ================ Request CallBack ===================

	@FindBy(xpath = "(//img[@alt='request callback'])[2]")
	private WebElement requestCallBackImage;

	public WebElement click_Request_CallBack_Image_HomePage() {
		return requestCallBackImage;
	}

	// div[@id='container-f3d454428d']//div[@class='book-test-drive-heading
	// text-center mt-4']//b
	@FindBy(xpath = "//div[@class='book-test-drive-heading text-center mt-4']//b")
	private WebElement RequestCallBacktext;

	public WebElement get_Request_CallBack_Text() {
		return RequestCallBacktext;
	}

	@FindBy(xpath = "//span[@class='hero-icon heroicon-close icon-size-4 position-absolute z-1 text-white']")
	private WebElement requestCallBackClose;

	public WebElement click_Request_CB_closeBttn() {
		return requestCallBackClose;
	}
	// Request call back popup >> changes added on motorcycle module

		public void ReqCallBack() {
			if (click_Request_CB_closeBttn().isDisplayed()) {

				Custom_click(click_Request_CB_closeBttn(), " on Cross button of Request call backpopup");
			}
		}

	@FindBy(xpath = "//p[normalize-space()='REQUEST CALLBACK']")
	private WebElement requestCallBackText; // on home page

	public WebElement click_Request_CallBack_Text_HomePage() {
		return requestCallBackText;
	}

	@FindBy(xpath = "//div[@id='container-f3d454428d']//input[@placeholder='Name']")
	private WebElement requestCallBackName;

	public WebElement get_Request_CallBack_Name_HomePage() {
		return requestCallBackName;
	}

	@FindBy(xpath = "//div[@id='container-f3d454428d']//input[@name='mobileno']")
	private WebElement requestCallBackNum;

	public WebElement get_Request_CallBack_MobileNo_HomePage() {
		return requestCallBackNum;
	}

	@FindBy(xpath = "//div[@id='container-f3d454428d']//input[@name='otp']")
	private WebElement requestCallBackOTP;

	public WebElement get_Request_CallBack_OTP_HomePage() {
		return requestCallBackOTP;
	}

	@FindBy(xpath = "//div[@id='container-f3d454428d']//button[@id='stateDropdown']")
	private WebElement requestCB_stateDD;

	public WebElement click_RequestCallBack_StateDropdown() {
		return requestCB_stateDD;
	}

	@FindBy(xpath = "//div[@id='container-f3d454428d']//ul//li//a[contains(text(),'punjab')]")
	private WebElement requestCB_selectstate;

	public WebElement click_RequestCallBack_SelectState() {
		return requestCB_selectstate;
	}

	@FindBy(xpath = "//div[@id='container-f3d454428d']//button[@id='cityDropdown']")
	private WebElement requestCB_CityDD;

	public WebElement click_RequestCallBack_CityDropdown() {
		return requestCB_CityDD;
	}

	@FindBy(xpath = "//div[@id='container-f3d454428d']//ul//li//a[contains(text(),'patiala')]")
	private WebElement requestCB_selectCity;

	public WebElement click_RequestCallBack_SelectCity() {
		return requestCB_selectCity;
	}

	@FindBy(xpath = "//div[@id='container-f3d454428d']//input[@value='Submit']")
	private WebElement requestCB_Submit;

	public WebElement click_RequestCB_SubmitBttn() {
		return requestCB_Submit;
	}

	@FindBy(xpath = "//div[@class='book-test-thankyou success active']//h5")
	private WebElement confirmMsg1;

	public WebElement get_ThankyouMsg() {
		return confirmMsg1;
	}

	@FindBy(xpath = "(//div[@class='book-test-thankyou success active']//p)[1]")
	private WebElement confirmMsg2;

	public WebElement get_connectMsg() {
		return confirmMsg2;
	}

	@FindBy(xpath = "(//div[@class='book-test-thankyou success active']//p)[2]")
	private WebElement confirmMsg3_TryExchange;

	public WebElement get_connectMsg_TryExchangeNow() {
		return confirmMsg3_TryExchange;
	}

	@FindBy(xpath = "//div[@class='book-test-thankyou success active']//button")
	private WebElement requestCB_Closebttn1;

	public WebElement click_RequestCB_closeBttn1() {
		return requestCB_Closebttn1;
	}

	// ================ TEST RIDE ===================
	@FindBy(xpath = "//p[normalize-space()='TEST RIDE']")
	private WebElement testride;

	public WebElement click_TestRide_Text() {
		return testride;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//input[@placeholder='Name']")
	private WebElement testRideName;

	public WebElement get__TestRide_Name() {
		return testRideName;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//input[@name='mobileno']")
	private WebElement testRideMobile;

	public WebElement get_TestRide_Mobile() {
		return testRideMobile;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//input[@name='otp']")
	private WebElement testRideOTP;

	public WebElement get_TestRide_OTP() {
		return testRideOTP;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//button[@name='vehiclename']")
	private WebElement testRideVehicle;

	public WebElement click_TestRide_Vehicle() {
		return testRideVehicle;
	}

	//// div[@id='book-test-drive-nav']//ul//li//a[contains(text(),'Glamour XTEC')]
	@FindBy(xpath = "//a[normalize-space()='Glamour']")
	private WebElement TRSelectVehicle;

	public WebElement select_TestRide_Vehicle() {
		return TRSelectVehicle;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//button[@name='statename']")
	private WebElement testRideState;

	public WebElement click_TestRide_State() {
		return testRideState;
	}

	@FindBy(xpath = "//ul[@class='dropdown-menu cust-dropdown-menu show']//a[contains(text(),'chandigarh')]")
	private WebElement TRSelectState;

	public WebElement select_TestRide_State() {
		return TRSelectState;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//button[@name='cityname']")
	private WebElement testRideCity;

	public WebElement click_TestRide_City() {
		return testRideCity;
	}

	@FindBy(xpath = "//li[@value='chandigarh']//a[contains(text(),'chandigarh')]")
	private WebElement TRSelectCity;

	public WebElement select_TestRide_City() {
		return TRSelectCity;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//input[@name='submit']")
	private WebElement TRSubmit;

	public WebElement click_TestRide_Submit() {
		return TRSubmit;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//div[@class='book-test-drive-heading text-center mt-4']//h3")
	private WebElement testrideText;

	public WebElement get_TestRide_Text() {
		return testrideText;
	}

	@FindBy(xpath = "//img[@alt='collapse']")
	private WebElement TRArrowIcon;

	public WebElement click_TestRide_ArrowIcon() {
		return TRArrowIcon;
	}

	@FindBy(xpath = "//div[@id='book-test-drive-nav']//div[@class='book-test-thankyou success active']//button")
	private WebElement TRcrossBttn;

	public WebElement click_TestRide_CrossBttn() {
		return TRcrossBttn;
	}

	// ===========GOODLIFE=================================
	// ================= ======================= ===========================

	@FindBy(xpath = "//p[normalize-space()='GOODLIFE']")
	private WebElement goodlife2;

	public WebElement click_GoodLife_Text() {
		return goodlife2;
	}

	@FindBy(xpath = "(//img[@alt='good life'])[2]")
	private WebElement goodlifeIMG;

	public WebElement click_GoodLife_Image() {
		return goodlifeIMG;
	}

	// ===========FIND A DEALER=================================

	@FindBy(xpath = "//p[normalize-space()='FIND A DEALER']")
	private WebElement findDealer;

	public WebElement click_FindADealer_Text() {
		return findDealer;
	}

	@FindBy(xpath = "//button[@class='close-cookies']")
	private WebElement cancelCookie;

	public WebElement click_cancelbttn_Cookie() {
		return cancelCookie;
	}

	@FindBy(xpath = "//select[@name='state']")
	private WebElement dealerState;

	public WebElement click_on_State() {
		return dealerState;
	}

	@FindBy(xpath = "//select[@id='OutletCity']")
	private WebElement dealerCity;

	public WebElement click_on_City() {
		return dealerCity;
	}

	@FindBy(xpath = "//select[@id='OutletLocality']")
	private WebElement dealerLocality;

	public WebElement click_on_Locality() {
		return dealerLocality;
	}

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchBttn;

	public WebElement click_on_SearchBttn() {
		return searchBttn;
	}

	@FindBy(xpath = "//li[@class='outlet-name']//a")
	private WebElement dealername;

	public WebElement get_DealerName() {
		return dealername;
	}

	@FindBy(xpath = "//span[normalize-space()='Direction']")
	private WebElement directionText;

	public WebElement click_DirectionText() {
		return directionText;
	}

	@FindBy(xpath = "//span[@class='sprite-icon outlet-cta icn-website']//following-sibling::span")
	private WebElement ViewMoreText;

	public WebElement click_ViewMoreText() {
		return ViewMoreText;
	}

	@FindBy(xpath = "//span[@class='sprite-icon outlet-cta icn-touch']//following-sibling::span")
	private WebElement requestCBText;

	public WebElement click_requestCallBackText() {
		return requestCBText;
	}

	@FindBy(xpath = "//div[@class='modal-content']//button")
	private WebElement requestCBCancel;

	public WebElement click_requestCallBackCancel() {
		return requestCBCancel;
	}

	// ############===========NEWLY LAUNCHED=====================############

	@FindBy(xpath = "//div[@class='offer-main-wrapper']//h3")
	private WebElement newlylaunch;

	public WebElement get_NewlyLaunched_Text() {
		return newlylaunch;
	}

	@FindBy(xpath = "//img[@alt='left-arrow']")
	private WebElement leftCarousel;

	public WebElement click_LeftCarousel() {
		return leftCarousel;
	}

	@FindBy(xpath = "//img[@alt='right-arrow']")
	private WebElement rightCarousel;

	public WebElement click_RightCarousel() {
		return rightCarousel;
	}

	@FindBy(xpath = "//div[@id='adcarousel37860603']//div//div[@class='carousel-item active']//img")
	private WebElement offerImage;

	public WebElement check_OfferImage() {
		return offerImage;
	}

	@FindBy(xpath = "//div[@id='adcarousel37860603']//div//div[@class='carousel-item active']//a")
	private WebElement offerImage_KnowMore;

	public WebElement click_OfferImage_KnowMore() {
		return offerImage_KnowMore;
	}

	
//	requestCallBackClose

	// ================= ======================= ===========================
//	public home_page(WebDriver driver) {
//		this.driver = driver;
//	}

//	public WebDriver getDriver() {
//		return driver;
//	}

////====================================        ===========================================================
//	

}
