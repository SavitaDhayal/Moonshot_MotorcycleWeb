package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.base_class;

public class Motorcycle_PerfromanceModule extends base_class {

	Motorcycle_ExecutiveModule exe = new Motorcycle_ExecutiveModule();
	public static home_page home =new home_page();
	

	public Motorcycle_PerfromanceModule() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/en-in/motorcycles/performance.html']")
	private WebElement performance;

	public WebElement Perfromance() {
		return performance;
	}

//	(//div[@class='megamenu-option-box'])[3]//p

	// perfromance category section - all links
	@FindBy(xpath = "(//div[@class='megamenu-option-box'])[3]//p")
	private List<WebElement> performanceLinks;

	public void Performance_Bikes_AllLinks() {

		System.out.println(performanceLinks.size());

		try {
			Thread.sleep(2000);
			home.ReqCallBack();
			for (int i = 0; i < performanceLinks.size(); i++) {

				if (Perfromance().isDisplayed()) {
					Wait(performanceLinks.get(i));
					VerifyElementPresent(performanceLinks.get(i), " bike name clickable");
					Custom_click(performanceLinks.get(i), "Bike -" + (i + 1));
					Thread.sleep(2000);
					PageLoaded();
					home.ReqCallBack();
					
					driver.navigate().back();
				}

				else {

					Wait(exe.motorcycles());
					exe.motorcycles().click();
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// checking images links , bike name link and cc text links
	// Xpulse 200T 4V
	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'XPULSE 200T 4V')]")
	private WebElement xpulse200T4V_bikeName;

	public WebElement Xpulse200T4V_BikeName() {
		return xpulse200T4V_bikeName;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'XPULSE 200T 4V')]//span")
	private WebElement xpulse200T4V_ccText;

	public WebElement xpulse200T4V_bike200ccText() {
		return xpulse200T4V_ccText;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse-200-t/1606_Xpulse_200T_4V_Website_Adapts_136px_x_129px-01-removebg-preview.png']")
	private WebElement xpulse200T4V_bikeImage;

	public WebElement Xpulse200T4V_BikeImage() {
		return xpulse200T4V_bikeImage;
	}

	// Xtreme 160R

	@FindBy(xpath = "(//div[@class='megamenu-option-box']//p[contains(text(), 'XTREME 160R ')])[2]")
	private WebElement xtreme160R_bikeName;

	public WebElement Xtreme160R_BikeName() {
		return xtreme160R_bikeName;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'XTREME 160R ')]//span")
	private WebElement xtreme160R_ccText;

	public WebElement Xtreme160R_bike160ccText() {
		return xtreme160R_ccText;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/bike%20icon.png']")
	private WebElement xtreme160R_bikeImage;

	public WebElement Xtreme160R_BikeImage() {
		return xtreme160R_bikeImage;
	}

	// Xtreme 160R4V
	@FindBy(xpath = "(//div[@class='megamenu-option-box']//p[contains(text(), 'XTREME 160R ')])[1]")
	private WebElement xtreme160R4V_bikeName;

	public WebElement Xtreme160R4V_BikeName() {
		return xtreme160R4V_bikeName;
	}

	// Xtreme200S 4V
	@FindBy(xpath = "//p[normalize-space()='XTREME 200S 4V']")
	private WebElement xtreme200S4V_bikeName;

	public WebElement Xtreme200S4V_BikeName() {
		return xtreme200S4V_bikeName;
	}

//	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'XTREME 200S 4V')]//span")
//	private WebElement xtreme200S4V_ccText;
//
//	public WebElement Xtreme200S_bike200ccText() {
//		return xtreme200S4V_ccText;
//	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/navigation-images/extreme-200s-4v-new.png']")
	private WebElement xtreme200S4V_bikeImage;

	public WebElement Xtreme200S4V_BikeImage() {
		return xtreme200S4V_bikeImage;
	}

	// Xpulse 2004V
	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'XPULSE 200 4V')]")
	private WebElement xpulse2004V_bikeName;

	public WebElement Xpulse2004V_BikeName() {
		return xpulse2004V_bikeName;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'XPULSE 200 4V')]//span")
	private WebElement xpulse2004V_ccText;

	public WebElement Xpulse2004V_bike200ccText() {
		return xpulse2004V_ccText;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse200-4v/quick-view/navigation.jpg']")
	private WebElement xpulse2004V_bikeImage;

	public WebElement Xpulse2004V_BikeImage() {
		return xpulse2004V_bikeImage;
	}

	// **************** Category Page *********************************************
	// >>>>>>> XTREME 160R <<<<<<<<//
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/Xtreme-160R.png']")
	private WebElement xtreme160R_Bike_img;

	public WebElement Xtreme160R_Bike_img() {
		return xtreme160R_Bike_img;
	}

	@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#Xtreme160R']")
	private WebElement xtreme160R_qickView;

	public WebElement Xtreme160R_QuickView() {
		return xtreme160R_qickView;
	}

	@FindBy(xpath = "//div[@id='container-da8e41b7c0']//div[@class='popup-inner']//a[normalize-space()='View Details']")
	private WebElement xtreme160R_viewDetails;

	public WebElement Xtreme160R_ViewDetails() {
		return xtreme160R_viewDetails;
	}

	// need changes from here
	@FindBy(xpath = "//div[@id='container-da8e41b7c0']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
	private WebElement xtreme160R_BookNow;

	public WebElement Xtreme160R_BookNow() {
		return xtreme160R_BookNow;
	}

	@FindBy(xpath = "//div[@id='Xtreme160R']//button[@type='button'][normalize-space()='×']")
	private WebElement xtreme160R_closeBttn;

	public WebElement Xtreme160R_CloseButton() {
		return xtreme160R_closeBttn;
	}

	// StealthEdition
	@FindBy(xpath = "(//div[@id='container-da8e41b7c0']//a[@data-color='StealthEdition'])[2]")
	private WebElement xtreme160R_StealthEdition_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xtreme-160r/stealth-edition/360-degree/1.png'])[2]")
	private WebElement xtreme160R_StealthEdition_img;

	// matte-Black
	@FindBy(xpath = "(//div[@id='container-da8e41b7c0']//a[@data-color='matteblack'])[2]")
	private WebElement xtreme160R_matteblack_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xtreme-160r/quick-links/Matte-Black.png'])[2]")
	private WebElement xtreme160R_matteblack_img;

	// Pearl silver White
	@FindBy(xpath = "(//div[@id='container-da8e41b7c0']//a[@data-color='White'])[2]")
	private WebElement xtreme160R_White_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xtreme-160r/quick-links/Pearl-Silver-White.png'])[2]")
	private WebElement xtreme160R_White_img;

	// Blue
	@FindBy(xpath = "(//div[@id='container-da8e41b7c0']//a[@data-color='blue'])[2]")
	private WebElement xtreme160R_Blue_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xtreme-160r/quick-links/Vibrant-Blue.png'])[2]")
	private WebElement xtreme160R_Blue_img;

	// Red
	@FindBy(xpath = "(//div[@id='container-da8e41b7c0']//a[@data-color='Red'])[2]")
	private WebElement xtreme160R_Red_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xtreme-160r/quick-links/Sports-Red.png'])[2]")
	private WebElement xtreme160R_Red_img;

	public void all_bike_image_button_for_Xtreme160R() throws Exception {

		try {
			// Stealth-Edition
			Custom_click(xtreme160R_StealthEdition_button, " xtreme160R_StealthEdition image button");
			Wait(xtreme160R_StealthEdition_img);
			VerifyImagePresent(xtreme160R_StealthEdition_img, "xtreme160R_StealthEdition image");

			// matte-Black
			Thread.sleep(1000);
			Custom_click(xtreme160R_matteblack_button, " xtreme160R_matteblack image button");
			Thread.sleep(1000);
			Wait(xtreme160R_matteblack_img);
			VerifyImagePresent(xtreme160R_matteblack_img, "matte black  image");

			// white
			Custom_click(xtreme160R_White_button, " Glamour Xtec Red image button");
			Thread.sleep(1000);
			Wait(xtreme160R_White_img);
			VerifyImagePresent(xtreme160R_White_img, "xtreme160R_White image");

			// blue
			Custom_click(xtreme160R_Blue_button, " xtreme160R_Blue button");
			Thread.sleep(1000);
			Wait(xtreme160R_Blue_img);
			VerifyImagePresent(xtreme160R_Blue_img, "xtreme160R_Blue image");

			// Red
			Custom_click(xtreme160R_Red_button, " xtreme160R Red button");
			Wait(xtreme160R_Red_img);
			Thread.sleep(1000);
			VerifyImagePresent(xtreme160R_Red_img, "xtreme160R Red image");
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

	// >>>>>>> Xpulse 200 4V <<<<<<<<//

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse200-4v/quick-view/thumbnail-248x157-removebg-preview.png']")
	private WebElement xpulse2004V_Bike_img;

	public WebElement Xpulse2004V_Bike_img() {
		return xpulse2004V_Bike_img;
	}

	@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#XPulse2004V']")
	private WebElement xpulse2004V_qickView;

	public WebElement Xpulse2004V_QuickView() {
		return xpulse2004V_qickView;
	}

	@FindBy(xpath = "//div[@id='container-d75cda0ab5']//div[@class='popup-inner']//a[normalize-space()='View Details']")
	private WebElement xpulse2004V_viewDetails;

	public WebElement Xpulse2004V_ViewDetails() {
		return xpulse2004V_viewDetails;
	}

	@FindBy(xpath = "//div[@id='container-d75cda0ab5']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
	private WebElement xpulse2004V_BookNow;

	public WebElement Xpulse2004V_BookNow() {
		return xpulse2004V_BookNow;
	}

	@FindBy(xpath = "//div[@id='XPulse2004V']//button[@type='button'][normalize-space()='×']")
	private WebElement xpulse2004V_closeBttn;

	public WebElement Xpulse2004V_CloseButton() {
		return xpulse2004V_closeBttn;
	}

	// Light-Blue
	@FindBy(xpath = "(//div[@id='container-d75cda0ab5']//a[@data-color='Light Blue'])[2]")
	private WebElement xpulse2004V_LightBlue_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse200-4v/360/nexus-blue/1.png'])[2]")
	private WebElement xpulse2004V_LightBlue_img;

	// New-BlueBlack
	@FindBy(xpath = "(//div[@id='container-d75cda0ab5']//a[@data-color='darkblue'])[2]")
	private WebElement xpulse2004V_BlueBlack_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse200-4v/360/new-blue-black/1.png'])[2]")
	private WebElement xpulse2004V_BlueBlack_img;

	// New Red Black
	@FindBy(xpath = "(//div[@id='container-d75cda0ab5']//a[@data-color='Red'])[2]")
	private WebElement xpulse2004V_RedBlack_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse200-4v/360/new-red-black/1.png'])[2]")
	private WebElement xpulse2004V_RedBlack_img;

	// Pearl Fadeless White
	@FindBy(xpath = "(//div[@id='container-d75cda0ab5']//a[@data-color='Rally Edition White'])[2]")
	private WebElement xpulse2004V_PearlfadelessWhite_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse200-4v/360/pearl-fadeless-white/1.png'])[2]")
	private WebElement xpulse2004V_PearlfadelessWhite_img;

	public void all_bike_image_button_for_Xpulse2004V() throws Exception {
		Thread.sleep(2000);
		Wait(xpulse2004V_LightBlue_button);
		Custom_click(xpulse2004V_LightBlue_button, " xpulse2004V LightBlue image button");
		Thread.sleep(2000);
		Wait(xpulse2004V_LightBlue_img);
		VerifyImagePresent(xpulse2004V_LightBlue_img, "xpulse2004V LightBlue image");

		Custom_click(xpulse2004V_BlueBlack_button, " xpulse2004V BlueBlack image button");
		Thread.sleep(2000);
		Wait(xpulse2004V_BlueBlack_img);
		VerifyImagePresent(xpulse2004V_BlueBlack_img, "xpulse2004V BlueBlack image");

		Custom_click(xpulse2004V_RedBlack_button, " xpulse2004V RedBlack image button");
		Thread.sleep(2000);
		Wait(xpulse2004V_RedBlack_img);
		VerifyImagePresent(xpulse2004V_RedBlack_img, "xpulse2004V RedBlack image");

		Custom_click(xpulse2004V_PearlfadelessWhite_button, " xpulse2004V PearlfadelessWhite image button");
		Thread.sleep(2000);
		Wait(xpulse2004V_PearlfadelessWhite_img);
		VerifyImagePresent(xpulse2004V_PearlfadelessWhite_img, "xpulse2004V PearlfadelessWhite image");
	}

	// >>>>>>> XPulse 200T 4V <<<<<<<<//

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/Xpulse-200T-4v.png']")
	private WebElement xpulse200T4V_Bike_img;

	public WebElement Xpulse200T4V_Bike_img() {
		return xpulse200T4V_Bike_img;
	}

	@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#XPulse200T']")
	private WebElement xpulse200T4V_qickView;

	public WebElement Xpulse200T4V_QuickView() {
		return xpulse200T4V_qickView;
	}

	@FindBy(xpath = "//div[@id='container-82412c8606']//div[@class='popup-inner']//a[normalize-space()='View Details']")
	private WebElement xpulse200T4V_viewDetails;

	public WebElement Xpulse200T4V_ViewDetails() {
		return xpulse200T4V_viewDetails;
	}

	@FindBy(xpath = "//div[@id='container-82412c8606']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
	private WebElement xpulse200T4V_BookNow;

	public WebElement Xpulse200T4V_BookNow() {
		return xpulse200T4V_BookNow;
	}

	@FindBy(xpath = "//div[@id='XPulse200T']//button[@type='button'][normalize-space()='×']")
	private WebElement xpulse200T4V_closeBttn;

	public WebElement Xpulse200T4V_CloseButton() {
		return xpulse200T4V_closeBttn;
	}

	// Sports Red
	@FindBy(xpath = "(//div[@id='container-82412c8606']//a[@data-color='redblack'])[2]")
	private WebElement xpulse200T4V_redBlack_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse-200-t/360/updated-new-red/1.png'])[2]")
	private WebElement xpulse200T4V_redBlack_img;

	// Funk Lime Yellow
	@FindBy(xpath = "(//div[@id='container-82412c8606']//a[@data-color='funklime'])[2]")
	private WebElement xpulse200T4V_funklime_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse-200-t/360/new-funk-lime/1.png'])[2]")
	private WebElement xpulse200T4V_funklime_img;

	// Matte shield gold
	@FindBy(xpath = "(//div[@id='container-82412c8606']//a[@data-color='matteshieldgold'])[2]")
	private WebElement xpulse200T4V_matteshieldgold_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse-200-t/360/new-matte-shield-gold/1.png'])[2]")
	private WebElement xpulse200T4V_matteshieldgold_img;

	public void all_bike_image_button_for_Xpulse200T4V() throws Exception {
		Thread.sleep(2000);
		Wait(xpulse200T4V_redBlack_button);
		Custom_click(xpulse200T4V_redBlack_button, " xpulse200T4V_redBlack image button");
		Thread.sleep(2000);
		Wait(xpulse200T4V_redBlack_img);
		VerifyImagePresent(xpulse200T4V_redBlack_img, "xpulse200T4V_redBlack image");

		Custom_click(xpulse200T4V_funklime_button, " xpulse200T4V_funklime image button");
		Thread.sleep(2000);
		Wait(xpulse200T4V_funklime_img);
		VerifyImagePresent(xpulse200T4V_funklime_img, "xpulse200T4V_funklime image");

		Custom_click(xpulse200T4V_matteshieldgold_button, " xpulse200T4V_matteshieldgold image button");
		Thread.sleep(2000);
		Wait(xpulse200T4V_matteshieldgold_img);
		VerifyImagePresent(xpulse200T4V_matteshieldgold_img, "xpulse200T4V_matteshieldgold image");

	}

	// >>>>>>> Xtreme 200S 4V <<<<<<<<//

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xtream-200s-4v/category-page/Yellow 360 Degree -28 (Xtreme 200 S) - 294 x193 px_ (002).png']")
	private WebElement xtreme200S4V_Bike_img;

	public WebElement Xtreme200S4V_Bike_img() {
		return xtreme200S4V_Bike_img;
	}

	@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#Xtreme200S4V']")
	private WebElement xtreme200S4V_qickView;

	public WebElement Xtreme200S4V_QuickView() {
		return xtreme200S4V_qickView;
	}

	@FindBy(xpath = "//div[@id='container-6658e8d811']//div[@class='popup-inner']//a[normalize-space()='View Details']")
	private WebElement xtreme200S4V_viewDetails;

	public WebElement Xtreme200S4V_ViewDetails() {
		return xtreme200S4V_viewDetails;
	}

	@FindBy(xpath = "//div[@id='container-6658e8d811']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
	private WebElement xtreme200S4V_BookNow;

	public WebElement Xtreme200S4V_BookNow() {
		return xtreme200S4V_BookNow;
	}

	@FindBy(xpath = "//div[@id='Xtreme200S4V']//button[@type='button'][normalize-space()='×']")
	private WebElement xtreme200S4V_closeBttn;

	public WebElement Xtreme200S4V_CloseButton() {
		return xtreme200S4V_closeBttn;
	}

	// Yellow
	@FindBy(xpath = "(//div[@id='container-6658e8d811']//a[@data-color='Yellow'])[2]")
	private WebElement xtreme200S4V_yellow_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/category-pages/quick-view/bike-images/Xtreme200Syellow-4v.png'])[2]")
	private WebElement xtreme200S4V_yellow_img;

	// Red
	@FindBy(xpath = "(//div[@id='container-6658e8d811']//a[@data-color='Red'])[2]")
	private WebElement xtreme200S4V_Red_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/category-pages/quick-view/bike-images/Xtreme200Sred-4v.png'])[2]")
	private WebElement xtreme200S4V_Red_img;

	// Black
	@FindBy(xpath = "(//div[@id='container-6658e8d811']//a[@data-color='Black'])[2]")
	private WebElement xtreme200S4V_Black_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/category-pages/quick-view/bike-images/Xtreme200Sblack-4v.png'])[2]")
	private WebElement xtreme200S4V_Black_img;

	public void all_bike_image_button_for_Xtreme200S4V() throws Exception {
		Thread.sleep(2000);
		Wait(xtreme200S4V_yellow_button);
		Custom_click(xtreme200S4V_yellow_button, " xtreme200S4V yellow image button");
		Thread.sleep(2000);
		Wait(xtreme200S4V_yellow_img);
		VerifyImagePresent(xtreme200S4V_yellow_img, "xtreme200S4V yellow image");

		Custom_click(xtreme200S4V_Red_button, " xtreme200S4V_Red image button");
		Thread.sleep(2000);
		Wait(xtreme200S4V_Red_img);
		VerifyImagePresent(xtreme200S4V_Red_img, "xtreme200S4V_Red image");

		Custom_click(xtreme200S4V_Black_button, " xtreme200S4V_Black image button");
		Thread.sleep(2000);
		Wait(xtreme200S4V_Black_img);
		VerifyImagePresent(xtreme200S4V_Black_img, "xtreme200S4V_Black image");

	}

	// ************* PRODUCT PAGE ****************************
	// ********* OverView*******************//

	@FindBy(xpath = "//button[normalize-space()='TEST RIDE']")
	private WebElement testRide_button;

	public WebElement TestRide_Button() {
		return testRide_button;
	}

	@FindBy(xpath = "//button[normalize-space()='BOOK NOW']")
	private WebElement bookNow_button;

	public WebElement BookNow_Button() {
		return bookNow_button;
	}

	
	//OverView - Xtreme160R4V
	@FindBy(xpath = "//div[@class='buttons']//a")
	private List<WebElement> buttons;



	public void click_Buttons_video() {

		for (int i = 0; i < buttons.size(); i++) {

			Wait(buttons.get(i));
			Custom_click(buttons.get(i), "Icon: " + (i + 1));
		
		}
	}
	
	
	// ********* SPECIFICATIONS*******************/
	// +++++++++++++ XPulse 2004V ++++++++++++
	// Matte Nexus Blue
	@FindBy(xpath = "//img[@alt='Matte Nexus Blue']")
	private WebElement specs_matteNexusBlueIMG;

	public WebElement Specs_matteNexusBlue_Img() {
		return specs_matteNexusBlueIMG;
	}

	@FindBy(xpath = "//img[@alt='Matte Nexus Blue']//following-sibling::p")
	private WebElement specs_matteNexusBlueTEXT;

	public WebElement Specs_matteNexusBlue_Text() {
		return specs_matteNexusBlueTEXT;
	}

	// Techno Blue
	@FindBy(xpath = "//img[@alt='Techno Blue']")
	private WebElement specs_TechnoBlueIMG;

	public WebElement Specs_TechnoBlue_Img() {
		return specs_TechnoBlueIMG;
	}

	@FindBy(xpath = "//img[@alt='Techno Blue']//following-sibling::p")
	private WebElement specs_TechnoBlueTEXT;

	public WebElement Specs_TechnoBlue_Text() {
		return specs_TechnoBlueTEXT;
	}

	// Black Sports Red
	@FindBy(xpath = "//img[@alt='Black Sports Red']")
	private WebElement specs_BlackSportsRedIMG;

	public WebElement Specs_BlackSportsRed_Img() {
		return specs_BlackSportsRedIMG;
	}

	@FindBy(xpath = "//img[@alt='Black Sports Red']//following-sibling::p")
	private WebElement specs_BlackSportsRedTEXT;

	public WebElement Specs_BlackSportsRed_Text() {
		return specs_BlackSportsRedTEXT;
	}

	// Pro White
	@FindBy(xpath = "//img[@alt='PRO White']")
	private WebElement specs_PROWhiteIMG;

	public WebElement Specs_PROWhite_Img() {
		return specs_PROWhiteIMG;
	}

	@FindBy(xpath = "//img[@alt='PRO White']//following-sibling::p")
	private WebElement specs_PROWhiteTEXT;

	public WebElement Specs_PROWhite_Text() {
		return specs_PROWhiteTEXT;
	}

	// +++++++++++++ XPulse 200T4V ++++++++++++
	// Sports-Red
	@FindBy(xpath = "//img[@alt='Sports Red']")
	private WebElement specs_SportsRedIMG;

	public WebElement Specs_SportsRed_Img() {
		return specs_SportsRedIMG;
	}

	@FindBy(xpath = "//img[@alt='Sports Red']//following-sibling::p")
	private WebElement specs_SportsRedTEXT;

	public WebElement Specs_SportsRed_Text() {
		return specs_SportsRedTEXT;
	}

	// Funk Lime Yellow
	@FindBy(xpath = "//img[@alt='Funk Lime Yellow']")
	private WebElement specs_FunkLimeYellowIMG;

	public WebElement Specs_FunkLimeYellow_Img() {
		return specs_FunkLimeYellowIMG;
	}

	@FindBy(xpath = "//img[@alt='Funk Lime Yellow']//following-sibling::p")
	private WebElement specs_FunkLimeYellowTEXT;

	public WebElement Specs_FunkLimeYellow_Text() {
		return specs_FunkLimeYellowTEXT;
	}

	// Matte Shield Gold
	@FindBy(xpath = "//img[@alt='Matte Shield Gold']")
	private WebElement specs_MatteShieldGoldIMG;

	public WebElement Specs_MatteShieldGold_Img() {
		return specs_MatteShieldGoldIMG;
	}

	@FindBy(xpath = "//img[@alt='Matte Shield Gold']//following-sibling::p")
	private WebElement specs_MatteShieldGoldTEXT;

	public WebElement Specs_MatteShieldGold_Text() {
		return specs_MatteShieldGoldTEXT;
	}

	// +++++++++++++ Xtreme 160R ++++++++++++

	// Stealth
	@FindBy(xpath = "//img[@alt='Stealth 2.0']")
	private WebElement specs_StealthIMG;

	public WebElement Specs_Stealth_Img() {
		return specs_StealthIMG;
	}

	@FindBy(xpath = "//img[@alt='Stealth 2.0']//following-sibling::p")
	private WebElement specs_StealthTEXT;

	public WebElement Specs_Stealth_Text() {
		return specs_StealthTEXT;
	}

	// Matte Black
	@FindBy(xpath = "//img[@alt='Matte Black']")
	private WebElement specs_MatteBlackIMG;

	public WebElement Specs_MatteBlack_Img() {
		return specs_MatteBlackIMG;
	}

	@FindBy(xpath = "//img[@alt='Matte Black']//following-sibling::p")
	private WebElement specs_MatteBlackTEXT;

	public WebElement Specs_MatteBlack_Text() {
		return specs_MatteBlackTEXT;
	}

	// Pearl Silver White
	@FindBy(xpath = "//img[@alt='Pearl Silver White']")
	private WebElement specs_PearlSilverWhiteIMG;

	public WebElement Specs_PearlSilverWhite_Img() {
		return specs_PearlSilverWhiteIMG;
	}

	@FindBy(xpath = "//img[@alt='Pearl Silver White']//following-sibling::p")
	private WebElement specs_PearlSilverWhiteTEXT;

	public WebElement Specs_PearlSilverWhite_Text() {
		return specs_PearlSilverWhiteTEXT;
	}

	// Vibrant Blue
	@FindBy(xpath = "//img[@alt='Vibrant Blue']")
	private WebElement specs_VibrantBlueIMG;

	public WebElement Specs_VibrantBlue_Img() {
		return specs_VibrantBlueIMG;
	}

	@FindBy(xpath = "//img[@alt='Vibrant Blue']//following-sibling::p")
	private WebElement specs_VibrantBlueTEXT;

	public WebElement Specs_VibrantBlue_Text() {
		return specs_VibrantBlueTEXT;
	}

	// sports red >>>> already used in XPulse 200T4V

	// +++++++++++++ Xtreme200S 4V ++++++++++++

	// Moon Yellow
	@FindBy(xpath = "//img[@alt='Moon Yellow']")
	private WebElement specs_MoonYellowIMG;

	public WebElement Specs_MoonYellow_Img() {
		return specs_MoonYellowIMG;
	}

	@FindBy(xpath = "//img[@alt='Moon Yellow']//following-sibling::p")
	private WebElement specs_MoonYellowTEXT;

	public WebElement Specs_MoonYellow_Text() {
		return specs_MoonYellowTEXT;
	}

	// Panther Black Metallic
	@FindBy(xpath = "//img[@alt='Panther Black Metallic']")
	private WebElement specs_PantherBlackMetallicIMG;

	public WebElement Specs_PantherBlackMetallic_Img() {
		return specs_PantherBlackMetallicIMG;
	}

	@FindBy(xpath = "//img[@alt='Panther Black Metallic']//following-sibling::p")
	private WebElement specs_PantherBlackMetallicTEXT;

	public WebElement Specs_PantherBlackMetallic_Text() {
		return specs_PantherBlackMetallicTEXT;
	}

	// Matt Axis Gray Metallic
	@FindBy(xpath = "//img[@alt='Matt Axis Gray Metallic']")
	private WebElement specs_MattAxisGrayMetallicIMG;

	public WebElement Specs_MattAxisGrayMetallic_Img() {
		return specs_MattAxisGrayMetallicIMG;
	}

	@FindBy(xpath = "//img[@alt='Matt Axis Gray Metallic']//following-sibling::p")
	private WebElement specs_MattAxisGrayMetallicTEXT;

	public WebElement Specs_MattAxisGrayMetallic_Text() {
		return specs_MattAxisGrayMetallicTEXT;
	}

	
	// +++++++++++++ Xtreme 160R4V ++++++++++++
	
	//Matte Slate Black - pro variant
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xtreme-160r-4v/colors-360/icons/Black.png']")
	private WebElement specs_MattslateBlackIMG;

	public WebElement Specs_MattSlateBlack_PRO_Img() {
		return specs_MattslateBlackIMG;
	}
	
	
	@FindBy(xpath = "(//p[contains(text(),'Matt Slate Black')])[1]")
	private WebElement specs_MattslateBlackText;

	public WebElement Specs_MattSlateBlack_PRO_Text() {
		return specs_MattslateBlackText;
	}
	
	//Shooting Night Star
	
	@FindBy(xpath = "//img[@alt='Shooting Night Star']")
	private WebElement specs_ShootingNightStarIMG;

	public WebElement Specs_ShootingNightStar_Img() {
		return specs_ShootingNightStarIMG;
	}
	
	
	@FindBy(xpath = "//img[@alt='Shooting Night Star']//following-sibling::p")
	private WebElement specs_ShootingNightStarText;

	public WebElement Specs_ShootingNightStar_Text() {
		return specs_ShootingNightStarText;
	}
	
	
	//Matt Slate Black standard variant
	
	@FindBy(xpath = "//img[@alt='Matt Slate Black (Standard Variant)']")
	private WebElement specs_MattslateBlackSTDIMG;

	public WebElement Specs_MattSlateBlack_Standard_Img() {
		return specs_MattslateBlackSTDIMG;
	}
	
	
	@FindBy(xpath = "//img[@alt='Matt Slate Black (Standard Variant)']//following-sibling::p")
	private WebElement specs_MattslateBlackSTDText;

	public WebElement Specs_MattSlateBlack_Standard_Text() {
		return specs_MattslateBlackSTDText;
	}
	
	//Pearl Red
	@FindBy(xpath = "//img[@alt='Pearl Red']")
	private WebElement specs_PearlRedIMG;

	public WebElement Specs_PearlRed_Img() {
		return specs_PearlRedIMG;
	}
	
	
	@FindBy(xpath = "//img[@alt='Pearl Red']//following-sibling::p")
	private WebElement specs_PearlRedText;

	public WebElement Specs_PearlRed_Text() {
		return specs_PearlRedText;
	}
	
	//BookNow bttn in specs section 
	@FindBy(xpath = "//span[@class='btn btn-red-gradient']")
	private WebElement specs_BookNow;

	public WebElement Specs_BookNow() {
		return specs_BookNow;
	}
	
	// ********* E-Shop*******************/

	@FindBy(xpath = "//a[@href='https://www.heromotosports.com/']")
	private WebElement eshop_MotoSports;

	public WebElement Eshop_MotoSports_Link() {
		return eshop_MotoSports;
	}

	@FindBy(xpath = "(//a[@href='/en-in/xclan/'])[1]")
	private WebElement eshop_Xclan;

	public WebElement Eshop_Xclan_Link() {
		return eshop_Xclan;
	}

	@FindBy(xpath = "//a[@href='/en-in/hero-xpulse-experience-centre.html']")
	private WebElement eshop_XpulseExpCentre;

	public WebElement Eshop_xpulseExpCentre_Link() {
		return eshop_XpulseExpCentre;
	}

	@FindBy(xpath = "//a[@href='/en-in/xtracks/']")
	private WebElement eshop_Xtracks;

	public WebElement Eshop_Xtracks_Link() {
		return eshop_Xtracks;
	}

	@FindBy(xpath = "(//a[@href='/en-in/goodlife/'])[1]")
	private WebElement eshop_goodLife;

	public WebElement Eshop_GoodLife_Link() {
		return eshop_goodLife;
	}

	@FindBy(xpath = "(//a[@href='/en-in/hero-joyride/'])[1]")
	private WebElement eshop_joyRide;

	public WebElement Eshop_JoyRide_Link() {
		return eshop_joyRide;
	}

	@FindBy(xpath = "//a[@href='https://eshop.heromotocorp.com/accessories-miscellaneous.html']")
	private WebElement eshop_accessories;

	public WebElement Eshop_Accessories_Link() {
		return eshop_accessories;
	}

	@FindBy(xpath = "(//a[@href='https://eshop.heromotocorp.com/accessories-miscellaneous.html'])[2]")
	private WebElement eshop_accessories_CatPage;

	public WebElement Eshop_Accessories_LinkCatPage() {
		return eshop_accessories_CatPage;
	}

	@FindBy(xpath = "//a[@href='https://xdrags.in/']")
	private WebElement eshop_Xdrags;

	public WebElement Eshop_Xdrags_Link() {
		return eshop_Xdrags;
	}

	// ********* Feature *******************//

	@FindBy(xpath = "//img[@alt='hotspot icon8']")
	private WebElement hotspot8;

	public WebElement Feature_hotspot8() {
		return hotspot8;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/sports-adventure/xpulse200-4v/features/new/luggage-plate.jpg']")
	private WebElement hotspot8_IMG;

	public WebElement Feature_hotspot8_Image() {
		return hotspot8_IMG;
	}

	@FindBy(xpath = "//div[@class='features-bike-main']//a")
	private List<WebElement> hotspotIcons;

	@FindBy(xpath = "//div[@class='features-box-info']//h4")
	private List<WebElement> hotspotIconsText;

	public void click_HotspotsLinks() {

		for (int i = 0; i < hotspotIcons.size(); i++) {

			Wait(hotspotIcons.get(i));
			Custom_click(hotspotIcons.get(i), "Icon: " + (i + 1));
			for (int j = 0; j < hotspotIconsText.size(); j++) {

				VerifyElementPresent(hotspotIconsText.get(j), "Text " + (j + 1) + " : ");
			}
		}
	}
	
	
	
	//************ Features - For Xtreme 160R4V  ********************
	
	@FindBy(xpath = "//div[@class='overlay--wrap']")
	private List<WebElement> featureTiles;

	@FindBy(xpath = "//div[@class='overlay--wrap']//h3")
	private List<WebElement> featureTilesText;

	public void MouseHover_featureTiles() {

		for (int i = 0; i < featureTiles.size(); i++) {

			Wait(featureTiles.get(i));
			mouse_hover(featureTiles.get(i), " on feature Tiles"+ (i + 1));
		
				VerifyElementPresent(featureTilesText.get(i), "Text " + (i + 1) + " : ");
			
		}
		
	}
	
	//************ Hero Connect - For XTreme 160R4V  ********************
	
	@FindBy(xpath = "//h2[@class='main-heading']")
	private WebElement heroConnect_heading;

	public WebElement HeroConnect_Heading() {
		return heroConnect_heading;
	}
	

	@FindBy(xpath = "//div[@aria-disabled='true']")
	private WebElement heroConnect_ArrowDisabled;

	public WebElement HeroConnect_ArrowDisabled() {
		return heroConnect_ArrowDisabled;
	}
	@FindBy(xpath = "//div[@aria-disabled='false']")
	private WebElement heroConnect_ArrowEnabled;

	public WebElement HeroConnect_ArrowEnabled() {
		return heroConnect_ArrowEnabled;
	}
	
	
//	@FindBy(xpath = "//div[@class='slick-track']//button")
//	private List<WebElement> SlickSlide;
//
//	public void HeroConnect_SlickSlide() {
//		for (int i = 0; i < SlickSlide.size(); i++) {
//			Wait(SlickSlide.get(i));
//			VerifyElementPresent(SlickSlide.get(i), "Slide "+(i+1));
//			Custom_click(SlickSlide.get(i), "on slide");			
//		}		
//	}
	
		
	@FindBy(xpath = "//button[normalize-space()='Safety']")
	private WebElement heroConnect_Safety;

	public WebElement HeroConnect_safety() {
		return heroConnect_Safety;
	}
	
	//div[@class='indv-features--wrap']//h3
	@FindBy(xpath = "//div[@class='indv-features--wrap']//h3[contains(text(),'Ignition Alert')]")
	private WebElement heroConnect_SafetyIginition;

	public WebElement HeroConnect_safety_Ignition() {
		return heroConnect_SafetyIginition;
	}
	
	
	
	@FindBy(xpath = "//div[@class='feature-tile visible']//p")
	private WebElement heroConnect_SafetyIginition_FeatureTile;

	public WebElement HeroConnect_safety_Ignition_FeatureTile() {
		return heroConnect_SafetyIginition_FeatureTile;
	}
	
	
	
	@FindBy(xpath = "//div[@class='indv-features--wrap']//h3[normalize-space()='Panic Alert(SOS)']")
	private WebElement heroConnect_SafetyPanicAlert;

	public WebElement HeroConnect_safety_PanicAlert() {
		return heroConnect_SafetyPanicAlert;
	}
	
	
	
	@FindBy(xpath = "//div[@class='indv-features--wrap']//h3[normalize-space()='Accident/Crash Alert']")
	private WebElement heroConnect_SafetyAccidentCrashAlert;

	public WebElement HeroConnect_safety_AccidentCrashAlertt() {
		return heroConnect_SafetyAccidentCrashAlert;
	}
	

	
}
