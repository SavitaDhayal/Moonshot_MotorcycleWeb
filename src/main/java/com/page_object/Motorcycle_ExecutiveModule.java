package com.page_object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.base_class;


public class Motorcycle_ExecutiveModule extends base_class {

	
	
	public Motorcycle_ExecutiveModule() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[normalize-space()='MOTORCYCLES']")
	private WebElement motorcycles;

	public WebElement motorcycles() {
		return motorcycles;
	}

	@FindBy(xpath = "//a[normalize-space()='EXECUTIVE']")
	private WebElement executive;

	public WebElement Executive() {
		return executive;
	}

	// executive click all links

	@FindBy(xpath = "(//div[@class='megamenu-option-box'])[2]//p")
	private List<WebElement> executiveLinks;

	public void Executive_Bikes_AllLinks() {

		System.out.println(executiveLinks.size());

		try {
			Thread.sleep(500);
			for (int i = 0; i < executiveLinks.size(); i++) {

				if (Executive().isDisplayed()) {
					Wait(executiveLinks.get(i));
					VerifyElementPresent(executiveLinks.get(i), " bike name clickable");
					Custom_click(executiveLinks.get(i), "Bike -" + (i + 1));
					Thread.sleep(2000);
					PageLoaded();
					driver.navigate().back();
				}

				else {

					Wait(motorcycles());
					motorcycles().click();
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	// +"-: "+ executiveLinks.get(i).getText()
// 	(//div[@class='megamenu-option-box'])[2]//p//span

	@FindBy(xpath = "//img[@alt='Super Splendor XTEC']")
	private WebElement superSplendorXtectext;

	public WebElement SuperSplendorXtectext() {
		return superSplendorXtectext;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'Super Splendor XTEC')]//span")
	private WebElement superSplendorXtectext125cc;

	public WebElement SuperSplendorXtectext125cc() {
		return superSplendorXtectext125cc;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/super-slpendor-xtec.png']")
	private WebElement superSplendorXtecImg;

	public WebElement SuperSplendorXtecImage() {
		return superSplendorXtecImg;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'GLAMOUR XTEC')]")
	private WebElement glamourXtectext;

	public WebElement GlamourXtecText() {
		return glamourXtectext;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'GLAMOUR XTEC')]//span")
	private WebElement glamourXtectext125cc;

	public WebElement GlamourXtecText125cc() {
		return glamourXtectext125cc;
	}

	// a[@class='dropdown-item']//img[@alt='GLAMOUR XTEC']
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/GLAMOUR-XTEC.png']")
	private WebElement glamourXtecimg;

	public WebElement GlamourXtecImage() {
		return glamourXtecimg;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'PASSION XTEC')]")
	private WebElement passionXtectext;

	public WebElement PassionXtecText() {
		return passionXtectext;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'PASSION XTEC')]//span")
	private WebElement passionXtectext110cc;

	public WebElement PassionXtectext110cc() {
		return passionXtectext110cc;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/category-passion-banner.png']")
	private WebElement passionXtecImg;

	public WebElement PassionXtecImg() {
		return passionXtecImg;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'SUPER SPLENDOR ')]")
	private WebElement superSplendorText;

	public WebElement SuperSplendorText() {
		return superSplendorText;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'SUPER SPLENDOR ')]//span")
	private WebElement superSplendor125cc;

	public WebElement SuperSplendor125cc() {
		return superSplendor125cc;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/SUPER-SPLENDER.png']")
	private WebElement superSplendorImg;

	public WebElement SuperSplendorImage() {
		return superSplendorImg;
	}

	@FindBy(xpath = "(//div[@class='megamenu-option-box']//p[contains(text(),'GLAMOUR')])[2]")
	private WebElement glamourtext;

	public WebElement GlamourText() {
		return glamourtext;
	}

	@FindBy(xpath = "(//div[@class='megamenu-option-box']//p[contains(text(),'GLAMOUR')]//span)[2]")
	private WebElement glamourText125cc;

	public WebElement GlamourText125cc() {
		return glamourText125cc;
	}

	
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/new-glamour/category-page/glamour-thumbnail.png']")
	private WebElement glamourImg;

	public WebElement GlamourImage() {
		return glamourImg;
	}

	@FindBy(xpath = "(//div[@class='megamenu-option-box']//p[contains(text(),'GLAMOUR')])[3]")
	private WebElement glamourCanvas;

	public WebElement GlamourCanvasText() {
		return glamourCanvas;
	}

	@FindBy(xpath = "(//div[@class='megamenu-option-box']//p[contains(text(),'GLAMOUR')]//span)[3]")
	private WebElement glamourCanvasText125cc;

	public WebElement GlamourCanvasText125cc() {
		return glamourCanvasText125cc;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city-plus/Updated-Glamour%20canvas.png']")
	private WebElement glamourCanvasImg;

	public WebElement GlamourCanvasImage() {
		return glamourCanvasImg;
	}

	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(),'PASSION+')]")
	private WebElement passionPlusText;

	public WebElement PassionPlusText() {
		return passionPlusText;
	}

	
//	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(),'PASSION+')]//span")
//	private WebElement passionProText125cc;
//
//	public WebElement PassionProText125cc() {
//		return passionProText125cc;
//	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-plus/category-page/NEW_23_HERO_SSS_CATE_PAGE_THUMBNAIL_248_X_157_PX-01.png']")
	private WebElement PassionPlusImg;

	public WebElement PassionPlusImage() {
		return PassionPlusImg;
	}

	@FindBy(xpath = "//li[@data-target=\"#carousel1725915271\"]")
	private List<WebElement> executive_slide;

	public void Executive_slider() {
		try {

			for (int i = 0; i < executive_slide.size(); i++) {
				Custom_click(executive_slide.get(i), "Slide " + (i + 1));
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// ================= Executive-product Page
	// ======================================

	// ======= product banner Super Splendor Xtec== *****Pending
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/GLAMOUR.png'])[1]")
	private WebElement supersplxtecBike_img;

	public WebElement SuperSpl_XtecBike_img() {
		return supersplxtecBike_img;
	}

	@FindBy(xpath = "//h2[@class='newhead']/following::li[@data-target='#SuperSplendorXtec']")
	private WebElement SuperSplendorXtec_qickView;

	public WebElement SuperSplendorXtec_QickView() {
		return SuperSplendorXtec_qickView;
	}

	// ======= product banner>> Glamour

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/GLAMOUR.png'])[2]")
	private WebElement glamourBike_img;

	public WebElement Glamour_Bike_img() {
		return glamourBike_img;
	}

	@FindBy(xpath = "//h2[@class='newhead']/following::li[@data-target='#Glamour']")
	private WebElement glamour_qickView;

	public WebElement Glamour_QuickView() {
		return glamour_qickView;
	}

	@FindBy(xpath = "(//div[@id='container-a0444ae7d8']//a[normalize-space()='View Details'])[1]")
	private WebElement glamour_viewDetails;

	public WebElement Glamour_ViewDetails() {
		return glamour_viewDetails;
	}

	@FindBy(xpath = "(//div[@id='container-a0444ae7d8']//a[normalize-space()='Book Now'])[1]")
	private WebElement glamour_BookNow;

	public WebElement Glamour_BookNow() {
		return glamour_BookNow;
	}

	@FindBy(xpath = "//div[@id='container-820ae5725e']//button[@type='button']")
	private WebElement glamour_crossBttn;

	public WebElement Glamour_CrossButton() {
		return glamour_crossBttn;
	}

	// Sports-red
	@FindBy(xpath = "(//div[@id='container-a0444ae7d8']//a[@data-color='Red'])[2]")
	private WebElement glamour_SportsRed_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/360/sports-red/1.png'])[2]")
	private WebElement glamour_SportsRed_img;

	// midnight black
	@FindBy(xpath = "(//div[@id='container-a0444ae7d8']//a[@data-color='midnight-black'])[2]")
	private WebElement glamour_midnightBlack_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/360/midnight-black/1.png'])[2]")
	private WebElement glamour_midnightBlack_img;

	// radiant-red
	@FindBy(xpath = "(//div[@id='container-a0444ae7d8']//a[@data-color='radiant-red'])[2]")
	private WebElement glamour_radiantRed_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/360/radiant-red/1.png'])[2]")
	private WebElement glamour_radiantRed_img;

	// techno-blue
	@FindBy(xpath = "(//div[@id='container-a0444ae7d8']//a[@data-color='techno-blue'])[2]")
	private WebElement glamour_technoBlue_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/360/techno-blue/1.png'])[2]")
	private WebElement glamour_TechnoBlue_img;

	public void all_bike_image_button_for_Glamour() throws Exception {
		Thread.sleep(2000);
		Wait(glamour_SportsRed_button);
		Custom_click(glamour_SportsRed_button, " Glamour sports-red image button");
		Thread.sleep(2000);
		Wait(glamour_SportsRed_img);
		VerifyImagePresent(glamour_SportsRed_img, "Glamour sports-red image");

		Custom_click(glamour_midnightBlack_button, " Glamour midnight-Black image button");
		Thread.sleep(2000);
		Wait(glamour_midnightBlack_img);
		VerifyImagePresent(glamour_midnightBlack_img, "Glamour midnight-Black image");

		Custom_click(glamour_radiantRed_button, " Glamour radiant-red image button");
		Thread.sleep(2000);
		Wait(glamour_radiantRed_img);
		VerifyImagePresent(glamour_radiantRed_img, "Glamour radiant-red image");

		Custom_click(glamour_technoBlue_button, " Glamour Techno-Blue image button");
		Thread.sleep(2000);
		Wait(glamour_TechnoBlue_img);
		VerifyImagePresent(glamour_TechnoBlue_img, "Glamour Techno-Blue image");

	}
	// crossBttn>>> \

	// ======= product banner>> Super Splendor

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/SUPER-SPLENDER.png']")
	private WebElement superSplndrBike_img;

	public WebElement SuperSplendor_Bike_img() {
		return superSplndrBike_img;
	}

	@FindBy(xpath = "//h2[@class='newhead']/following::li[@data-target='#SuperSplendor']")
	private WebElement supersplendor_qickView;

	public WebElement Supersplendor_QuickView() {
		return supersplendor_qickView;
	}

	@FindBy(xpath = "(//div[@id='container-eec24b36f0']//a[normalize-space()='View Details'])[1]")
	private WebElement supersplendor_viewDetails;

	public WebElement Supersplendor_ViewDetails() {
		return supersplendor_viewDetails;
	}

	@FindBy(xpath = "(//div[@id='container-eec24b36f0']//a[normalize-space()='Book Now'])[1]")
	private WebElement supersplendor_BookNow;

	public WebElement Supersplendor_BookNow() {
		return supersplendor_BookNow;
	}

	@FindBy(xpath = "//div[@id='SuperSplendor']//button[@type='button']")
	private WebElement supersplendor_closeBttn;

	public WebElement Supersplendor_CloseButton() {
		return supersplendor_closeBttn;
	}

	// cb-red
	@FindBy(xpath = "(//div[@id='container-eec24b36f0']//a[@data-color='cb-red'])[2]")
	private WebElement supersplendor_cbRed_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/360/cb-red/1.png'])[2]")
	private WebElement supersplendor_cbRed_img;

	// dusky-black
	@FindBy(xpath = "(//div[@id='container-eec24b36f0']//a[@data-color='dusky-black'])[2]")
	private WebElement supersplendor_duskyBlack_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/360/dusky-black/1.png'])[2]")
	private WebElement supersplendor_duskyBlack_img;

	// nexus-blue
	@FindBy(xpath = "(//div[@id='container-eec24b36f0']//a[@data-color='nexus-blue'])[2]")
	private WebElement supersplendor_nexus_Blue_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/360/nexus-blue/1.png'])[2]")
	private WebElement supersplendor_nexus_Blue_img;

	// glaze-black
	@FindBy(xpath = "(//div[@id='container-eec24b36f0']//a[@data-color='glaze-black'])[2]")
	private WebElement supersplendor_glazeBlack_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/360/glaze-black/1.png'])[2]")
	private WebElement supersplendor_glazeBlack_img;

	// black-red
	@FindBy(xpath = "(//div[@id='container-eec24b36f0']//a[@data-color='black-red'])[2]")
	private WebElement supersplendor_blackRed_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/360/heavy-grey/1.png'])[2]")
	private WebElement supersplendor_blackRed_img;

	// black
	@FindBy(xpath = "(//div[@id='container-eec24b36f0']//a[@data-color='Black'])[2]")
	private WebElement supersplendor_black_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/360/canvasblack/1.png'])[2]")
	private WebElement supersplendor_black_img;

	public void all_bike_image_button_for_SuperSplendor() throws Exception {
		Thread.sleep(2000);
		Wait(supersplendor_cbRed_button);
		Custom_click(supersplendor_cbRed_button, " SuperSplendor cb-Red image button");
		Thread.sleep(2000);
		Wait(supersplendor_cbRed_img);
		VerifyImagePresent(supersplendor_cbRed_img, "SuperSplendor cb-Red Bike image");

		Custom_click(supersplendor_duskyBlack_button, " SuperSplendor dusky-Black image button");
		Thread.sleep(2000);
		Wait(supersplendor_duskyBlack_img);
		VerifyImagePresent(supersplendor_duskyBlack_img, "SuperSplendor dusky-Black Bike image");

		Custom_click(supersplendor_nexus_Blue_button, " SuperSplendor nexus-blue image button");
		Thread.sleep(2000);
		Wait(supersplendor_nexus_Blue_img);
		VerifyImagePresent(supersplendor_nexus_Blue_img, "SuperSplendor nexus-blue Bike image");

		Custom_click(supersplendor_glazeBlack_button, " SuperSplendor glaze-Black image button");
		Thread.sleep(2000);
		Wait(supersplendor_glazeBlack_img);
		VerifyImagePresent(supersplendor_glazeBlack_img, "SuperSplendor glaze-Black Bike image");

		Custom_click(supersplendor_blackRed_button, " SuperSplendor black-Red image button");
		Thread.sleep(2000);
		Wait(supersplendor_blackRed_img);
		VerifyImagePresent(supersplendor_blackRed_img, "SuperSplendor black-Red Bike image");

		Custom_click(supersplendor_black_button, " SuperSplendor black image button");
		Thread.sleep(2000);
		Wait(supersplendor_black_img);
		VerifyImagePresent(supersplendor_black_img, "SuperSplendor black Bike image");

	}

	// crossbttn>>>> //div[@id='SuperSplendor']//button[@type='button']

	// ======= product banner>> Glamour Canvas

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/NEW-GLAMOUR.png']")
	private WebElement glamourCanvas_Bike_img;

	public WebElement GlamourCanvas_Bike_img() {
		return glamourCanvas_Bike_img;
	}

	@FindBy(xpath = "//h2[@class='newhead']/following::li[@data-target='#GlamourCanvas']")
	private WebElement glamourCanvas_qickView;

	public WebElement GlamourCanvas_QuickView() {
		return glamourCanvas_qickView;
	}

	@FindBy(xpath = "(//div[@id='container-bfdd496872']//a[normalize-space()='View Details'])[1]")
	private WebElement glamourcanvas_viewDetails;

	public WebElement GlamourCanvas_ViewDetails() {
		return glamourcanvas_viewDetails;
	}

	@FindBy(xpath = "(//div[@id='container-bfdd496872']//a[normalize-space()='Book Now'])[1]")
	private WebElement glamourcanvas_BookNow;

	public WebElement GlamourCanvas_BookNow() {
		return glamourcanvas_BookNow;
	}

	@FindBy(xpath = "//div[@id='GlamourCanvas']//button[@type='button']")
	private WebElement glamourcanvas_closeBttn;

	public WebElement GlamourCanvas_CloseButton() {
		return glamourcanvas_closeBttn;
	}

	// black
	@FindBy(xpath = "(//div[@id='container-bfdd496872']//a[@data-color='Black'])[2]")
	private WebElement glamourCan_Black_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/canvas-black/1.png'])[2]")
	private WebElement glamourCan_Black_img;

	// red
	@FindBy(xpath = "(//div[@id='container-bfdd496872']//a[@data-color='Red'])[2]")
	private WebElement glamourCan_Red_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/radiant-red/1.png'])[2]")
	private WebElement glamourCan_Red_img;

	// techno-blue
	@FindBy(xpath = "(//div[@id='container-bfdd496872']//a[@data-color='Blue'])[2]")
	private WebElement glamourCan_TechnoBlue_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/techno-blue/1.png'])[2]")
	private WebElement glamourCan_TechnoBlue_img;

	// sunset gold
	@FindBy(xpath = "(//div[@id='container-bfdd496872']//a[@data-color='Gold'])[2]")
	private WebElement glamourCan_SunsetGold_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/sunset-gold/1.png'])[2]")
	private WebElement glamourCan_SunsetGold_img;

	// fiery red
	@FindBy(xpath = "(//div[@id='container-bfdd496872']//a[@data-color='fiery-red'])[2]")
	private WebElement glamourCan_FieryRed_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/fiery-red/1.png'])[2]")
	private WebElement glamourCan_FieryRed_img;

	// daring-yellow
	@FindBy(xpath = "(//div[@id='container-bfdd496872']//a[@data-color='daring-yellow'])[2]")
	private WebElement glamourCan_DaringYellow_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/daring-yellow/1.png'])[2]")
	private WebElement glamourCan_DaringYellow_img;

	public void all_bike_image_button_for_Glamour_Canvas() throws Exception {

		Custom_click(glamourCan_Black_button, " Glamour Canvas black image button");
		Wait(glamourCan_Black_img);
		VerifyImagePresent(glamourCan_Black_img, "Glamour Canvas black image");

		Custom_click(glamourCan_Red_button, " Glamour Xtec Red image button");
		Thread.sleep(2000);
		Wait(glamourCan_Red_img);
		VerifyImagePresent(glamourCan_Red_img, "Glamour Red Grey image");

		Custom_click(glamourCan_TechnoBlue_button, " Glamour Canvas Techno-Blue image button");
		Thread.sleep(2000);
		Wait(glamourCan_TechnoBlue_img);
		VerifyImagePresent(glamourCan_TechnoBlue_img, "Glamour Canvas Techno-Blue image");

		Custom_click(glamourCan_SunsetGold_button, " Glamour Canvas Sunset-Gold Blue button");
		Thread.sleep(2000);
		Wait(glamourCan_SunsetGold_img); // blue color img not present
		VerifyImagePresent(glamourCan_SunsetGold_img, "Glamour Canvas Sunset-Gold image");

		Custom_click(glamourCan_FieryRed_button, " Glamour Canvas Fiery-Red Blue button");
		Thread.sleep(2000);
		Wait(glamourCan_FieryRed_img); // blue color img not present
		VerifyImagePresent(glamourCan_FieryRed_img, "Glamour Canvas Fiery-Red image");

		Custom_click(glamourCan_DaringYellow_button, " Glamour Canvas Daring-Yellow Blue button");
		Thread.sleep(2000);
		Wait(glamourCan_DaringYellow_img); // blue color img not present
		VerifyImagePresent(glamourCan_DaringYellow_img, "Glamour Canvas Daring-Yellow image");

	}

	// ======= product banner>> Glamour Xtec

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/GLAMOUR-XTEC.png']")
	private WebElement glamourXtec_Bike_img;

	public WebElement GlamourXtec_Bike_img() {
		return glamourXtec_Bike_img;
	}

	@FindBy(xpath = "//h2[@class='newhead']/following::li[@data-target='#GlamourXTec']")
	private WebElement glamourXtec_qickView;

	public WebElement GlamourXtec_QuickView() {
		return glamourXtec_qickView;
	}

	@FindBy(xpath = "(//div[@id='container-f79798ae38']//a[normalize-space()='View Details'])[1]")
	private WebElement glamourXtec_viewDetails;

	public WebElement GlamourXtec_ViewDetails() {
		return glamourXtec_viewDetails;
	}

	@FindBy(xpath = "(//a[@href='https://www.heromotocorp.com/en-in/buy-now/executive/glamour-xtec.html'])[2]")
	private WebElement glamourXtec_BookNow;

	public WebElement GlamourXtec_BookNow() {
		return glamourXtec_BookNow;
	}

	@FindBy(xpath = "//div[@id='GlamourXTec']//button[@type='button']")
	private WebElement glamourXtec_closeBttn;

	public WebElement GlamourXtec_CloseButton() {
		return glamourXtec_closeBttn;
	}

	@FindBy(xpath = "(//div[@id='container-f79798ae38']//a[@data-color='Black'])[2]")
	private WebElement glamourXtec_Black_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/color-360/glossy-black/9.png'])[2]")
	private WebElement glamourXtec_Black_img;

	@FindBy(xpath = "(//div[@id='container-f79798ae38']//a[@data-color='Grey'])[2]")
	private WebElement glamourXtec_Grey_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/color-360/matte-axis-grey/9.png'])[2]")
	private WebElement glamourXtec_Grey_img;

	@FindBy(xpath = "(//div[@id='container-f79798ae38']//a[@data-color='Red'])[2]")
	private WebElement glamourXtec_Red_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/color-360/candy-blazing-red/9.png'])[2]")
	private WebElement glamourXtec_Red_img;

	@FindBy(xpath = "(//div[@id='container-f79798ae38']//a[@data-color='Blue'])[2]")
	private WebElement glamourXtec_Blue_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/color-360/nexus-blue/9.png'])[2]")
	private WebElement glamourXtec_Blue_img;

	public void all_bike_image_button_for_Glamour_Xtec() throws Exception {
		Custom_click(glamourXtec_Black_button, " Glamour Xtec black image button");
		Wait(glamourXtec_Black_img);
		VerifyImagePresent(glamourXtec_Black_img, "Glamour Xtec black image");

		Custom_click(glamourXtec_Grey_button, " Glamour Xtec Grey image button");
		Thread.sleep(2000);
		Wait(glamourXtec_Grey_img);
		VerifyImagePresent(glamourXtec_Grey_img, "Glamour Xtec Grey image");

		Custom_click(glamourXtec_Red_button, " Glamour Xtec Red image button");
		Thread.sleep(2000);
		Wait(glamourXtec_Red_img);
		VerifyImagePresent(glamourXtec_Red_img, "Glamour Xtec Red image");

		Custom_click(glamourXtec_Blue_button, " Glamour Xtec Blue button");
//			Wait(glamourXtec_Blue_img);    // blue color img not present
			VerifyImagePresent(glamourXtec_Blue_img, "Glamour Xtec Blue image");

	}

	// ======= product banner>> PassionPro

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-plus/category-page/NEW_23_HERO_SSS_CATE_PAGE_THUMBNAIL_248_X_157_PX-01.png']")
	private WebElement passionPlus_Bike_img;

	public WebElement PassionPlus_Bike_img() {
		return passionPlus_Bike_img;
	}

	@FindBy(xpath = "//h2[@class='newhead']/following::li[@data-target='#Passionplus']")
	private WebElement passionPlus_qickView;

	public WebElement PassionPlus_QuickView() {
		return passionPlus_qickView;
	}

	@FindBy(xpath = "(//div[@id='container-0816b89e05']//a[normalize-space()='View Details'])[1]")
	private WebElement passionPlus_viewDetails;

	public WebElement PassionPlus_ViewDetails() {
		return passionPlus_viewDetails;
	}

	@FindBy(xpath = "(//div[@id='container-0816b89e05']//a[normalize-space()='Book Now'])[1]")
	private WebElement passionPlus_BookNow;

	public WebElement PassionPlus_BookNow() {
		return passionPlus_BookNow;
	}

	@FindBy(xpath = "//div[@id='Passionplus']//button[@type='button']")
	private WebElement PassionPlus_closeBttn;

	public WebElement PassionPlus_CloseButton() {
		return PassionPlus_closeBttn;
	}

	// Red
	@FindBy(xpath = "(//div[@id='container-0816b89e05']//a[@data-color='Red'])[2]")
	private WebElement passionPlus_Red_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-plus/colors-360/new-red/1.png'])[2]")
	private WebElement passionPlus_Red_img;

	// Blue
	@FindBy(xpath = "(//div[@id='container-0816b89e05']//a[@data-color='Blue'])[2]")
	private WebElement passionPlus_Blue_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-plus/colors-360/new-blue/1.png'])[2]")
	private WebElement passionPlus_Blue_img;

	// Black
	@FindBy(xpath = "(//div[@id='container-0816b89e05']//a[@data-color='Black'])[2]")
	private WebElement passionPlus_Black_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-plus/colors-360/new-black/1.png'])[2]")
	private WebElement passionPlus_Black_img;


	public void all_bike_image_button_for_PassionPlus() throws Exception {

		Custom_click(passionPlus_Red_button, " Passion plus Red image button");
		Wait(passionPlus_Red_img);
		VerifyImagePresent(passionPlus_Red_img, "Passion Plus Red Bike image");

		Custom_click(passionPlus_Blue_button, " Passion Plus Blue image button");
		Thread.sleep(2000);
		Wait(passionPlus_Blue_img);
		VerifyImagePresent(passionPlus_Blue_img, "Passion Plus Blue Bike image");

		Custom_click(passionPlus_Black_button, " Passion Pro Black image button");
		Thread.sleep(2000);
		Wait(passionPlus_Black_img);
		VerifyImagePresent(passionPlus_Black_img, "Passion Plus Black Bike image");

	}

	// ======= product banner>> Passion Xtec

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/passion-xtec.png']")
	private WebElement passionXtec_Bike_img;

	public WebElement PassionXtec_Bike_img() {
		return passionXtec_Bike_img;
	}

	@FindBy(xpath = "//h2[@class='newhead']/following::li[@data-target='#PassionXTec']")
	private WebElement passionXtec_qickView;

	public WebElement PassionXtec_QuickView() {
		return passionXtec_qickView;
	}

	@FindBy(xpath = "(//div[@id='container-a416ef8c86']//a[normalize-space()='View Details'])[1]")
	private WebElement passionXtec_viewDetails;

	public WebElement PassionXtec_ViewDetails() {
		return passionXtec_viewDetails;
	}

	@FindBy(xpath = "(//div[@id='container-a416ef8c86']//a[normalize-space()='Book Now'])[1]")
	private WebElement passionXtec_BookNow;

	public WebElement PassionXtec_BookNow() {
		return passionXtec_BookNow;
	}

	@FindBy(xpath = "//div[@id='container-e89fd7f4bd']//button[@type='button']")
	private WebElement PassionXtec_closeBttn;

	public WebElement PassionXtec_CloseButton() {
		return PassionXtec_closeBttn;
	}

	// Red
	@FindBy(xpath = "(//div[@id='container-a416ef8c86']//a[@data-color='Red'])[2]")
	private WebElement passionXtec_Red_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/color-360/cb-red/9.png'])[2]")
	private WebElement passionXtec_Red_img;

	// black-silver
	@FindBy(xpath = "(//div[@id='container-a416ef8c86']//a[@data-color='Black'])[2]")
	private WebElement passionXtec_BlackSilver_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/color-360/black-silver/9.png'])[2]")
	private WebElement passionXtec_BlackSilver_img;

	// grey
	@FindBy(xpath = "(//div[@id='container-a416ef8c86']//a[@data-color='Grey'])[2]")
	private WebElement passionXtec_Grey_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/color-360/polestar/9.png'])[2]")
	private WebElement passionXtec_Grey_img;

	public void all_bike_image_button_for_PassionXtec() throws Exception {
		Custom_click(passionXtec_Red_button, " Passion Xtec Red image button");
		Wait(passionXtec_Red_img);
		VerifyImagePresent(passionXtec_Red_img, "Passion Xtec Red Bike image");

		Custom_click(passionXtec_BlackSilver_button, " passion Xtec Black-Silver image button");
		Thread.sleep(2000);
		Wait(passionXtec_BlackSilver_img);
		VerifyImagePresent(passionXtec_BlackSilver_img, "passion Xtec Black-Silver Bike image");

		Custom_click(passionXtec_Grey_button, " passion Xtec Grey image button");
		Thread.sleep(2000);
		Wait(passionXtec_Grey_img);
		VerifyImagePresent(passionXtec_Grey_img, "passion Xtec Grey Bike  image");

	}

//**************** Product Page ********************************************

	@FindBy(xpath = "//a[@class='btn btn-red-gradient ml-3 ml-lg-4']")
	private WebElement exe_BookNow;

	public WebElement Exe_BookNow() {
		return exe_BookNow;
	}

	
	
       	//****************FEATURE**********************
	
	// HotsSpotIcons
	//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagehotspot/features-view-icon2.svg']
	@FindBy(xpath = "//div[@class='hotspot']//a[@data-target='feature-1']")
	private WebElement exe_icon1;

	public WebElement Exe_HotSpot_Icon1() {
		return exe_icon1;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/hotspot/LED-Headlamp.png']")
	private WebElement exe_icon1_Headlight;

	public WebElement Exe_HotSpot_Icon1_Headlight() {
		return exe_icon1_Headlight;
	}
	
	
	
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagehotspot/features-view-icon2.svg'])[2]")
	private WebElement exe_icon2;

	public WebElement Exe_HotSpot_Icon2() {
		return exe_icon2;
	}
	
	@FindBy(xpath = "//img[@alt='hotspoticon3']")
	private WebElement exe_icon3;

	public WebElement Exe_HotSpot_Icon3() {
		return exe_icon3;
	}
	
	@FindBy(xpath = "//img[@alt='hotspoticon4']")
	private WebElement exe_icon4;

	public WebElement Exe_HotSpot_Icon4() {
		return exe_icon4;
	}
	
	
	@FindBy(xpath = "//img[@alt='hotspoticon1']")
	private WebElement exe_icon5;

	public WebElement Exe_HotSpot_Icon5() {
		return exe_icon5;
	}
	
	
	
	@FindBy(xpath = "//img[@alt='hotspoticon1']")
	private WebElement exe_icon6;

	public WebElement Exe_HotSpot_Icon6() {
		return exe_icon6;
	}
	
	      //************* SPECIFICATION***************************

	@FindBy(xpath = "//div[@id='Specification']//h2")
	private WebElement exe_specsHeading;

	public WebElement Exe_Specification_Heading() {
		return exe_specsHeading;
	}

	//===== engine
	@FindBy(xpath = "(//div[normalize-space()='Engine'])[3]")
	private WebElement exe_Engine;

	public WebElement Exe_Engine() {
		return exe_Engine;
	}
	
	   //==============engineImage====================//
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-0/imagespecification.coreimg.png/1662969932752/engine.png']")
	private WebElement exe_EngineImg;

	
	public WebElement Exe_Engine_Image() {
		return exe_EngineImg;
	}
	

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-0/imagespecification.coreimg.png/1677844987631/engine.png']")
	private WebElement exe_SspXtec_EngineImg;

	public WebElement Exe_SspXtec_Engine_Image() {
		return exe_SspXtec_EngineImg;
	}
	
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-canvas/_jcr_content/root/container/container_1179138905/generictab/tab-0/imagespecification.coreimg.png/1662558641109/engine.png']")
	private WebElement exe_glamourCan_EngineImg;

	public WebElement Exe_glamourCan_Engine_Image() {
		return exe_glamourCan_EngineImg;
	}
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-plus/_jcr_content/root/container/container_1179138905/generictab/tab-0/imagespecification.coreimg.png/1685343046012/engine.png']")
	private WebElement exe_passionPlus_EngineImg;

	public WebElement Exe_PassionPlus_Engine_Image() {
		return exe_passionPlus_EngineImg;
	}
	
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour/_jcr_content/root/container/container_1179138905/generictab/tab-0/imagespecification.coreimg.png/1662975174984/engine.png']")
	private WebElement exe_glamour_EngineImg;

	public WebElement Exe_Glamour_Engine_Image() {
		return exe_glamour_EngineImg;
	}
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor/_jcr_content/root/container/container_1179138905/generictab/tab-0/imagespecification.coreimg.png/1663061369931/engine.png']")
	private WebElement exe_superSpl_EngineImg;

	public WebElement Exe_SuperSplendor_Engine_Image() {
		return exe_superSpl_EngineImg;
	}
	
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-0/imagespecification.coreimg.png/1662144225647/386x288-passion-xtec-red-engine.png']")
	private WebElement exe_passionXtec_EngineImg;

	public WebElement Exe_PassionXtec_Engine_Image() {
		return exe_passionXtec_EngineImg;
	}
	        //===========Wheels & Tyres==============//  
	@FindBy(xpath = "(//div[normalize-space()='Wheels'])[3]")
	private WebElement exe_Wheels;

	public WebElement Exe_WheelsTyres() {
		return exe_Wheels;
	}
		
	//glamourXtec-wheels
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-1/imagespecification.coreimg.png/1662974096518/glamour-xtec-specification-386-x-288pxl-0004-front-tyre.png']")
	private WebElement exe_WheelsImg;

	public WebElement Exe_WheelsTyres_Image() {
		return exe_WheelsImg;
	}
	
	
	@FindBy(xpath = "//div[normalize-space()='Wheels']")
	private WebElement exe_passionXtec_Wheel;

	public WebElement Exe_Passionxtec_WheelTab() {
		return exe_passionXtec_Wheel;
	}


	
	@FindBy(xpath = "//div[normalize-space()='Tyres']")
	private WebElement exe_Tyres;

	public WebElement Exe_Tyres() {
		return exe_Tyres;
	}
	
	//passion Plus
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-plus/_jcr_content/root/container/container_1179138905/generictab/tab-1/imagespecification.coreimg.png/1685343110961/wheels-tyres-suspensions.png']")
	private WebElement exe_passionPlus_TyresImg;

	public WebElement Exe_passionPlus_TyresImage() {
		return exe_passionPlus_TyresImg;
	}
	
	//supersplendor Xtec
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-1/imagespecification.coreimg.png/1677839356702/wheels-and-tyres-updated.png']")
	private WebElement exe_SspXtec_WheelsImg;

	public WebElement Exe_SspXtec_WheelsTyres_Image() {
		return exe_SspXtec_WheelsImg;
	}
	
	//glamourCanvas
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-canvas/_jcr_content/root/container/container_1179138905/generictab/tab-1/imagespecification.coreimg.png/1662976255450/wheels-tyres.png']")
	private WebElement exe_glamourCan_WheelsImg;

	public WebElement Exe_glamourCan_WheelsTyres_Image() {
		return exe_glamourCan_WheelsImg;
	}
	
	//glamour
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour/_jcr_content/root/container/container_1179138905/generictab/tab-1/imagespecification.coreimg.png/1662995189633/glamour-bs6-wheels.png']")
	private WebElement exe_glamour_WheelsImg;

	public WebElement Exe_glamour_WheelsTyres_Image() {
		return exe_glamour_WheelsImg;
	}
	
	//superSplendor
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor/_jcr_content/root/container/container_1179138905/generictab/tab-1/imagespecification.coreimg.png/1663060986713/wheels-tyres.png']")
	private WebElement exe_superSpl_WheelsImg;

	public WebElement Exe_SuperSplendor_WheelsTyres_Image() {
		return exe_superSpl_WheelsImg;
	}
	
	//Passion Xtec
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-1/imagespecification.coreimg.png/1662144333960/386x288-passion-xtec-red-split-alloy-wheels.png']")
	private WebElement exe_passionXtec_WheelsImg;

	public WebElement Exe_PassionXtec_Wheels_Image() {
		return exe_passionXtec_WheelsImg;
	}
	
	        //================= Suspension======================// 
	
	@FindBy(xpath = "//div[normalize-space()='Suspension']")
	private WebElement exe_suspension;

	public WebElement Exe_Suspension() {
		return exe_suspension;
	}
	
	
	@FindBy(xpath = "//div[normalize-space()='Suspensions']")
	private WebElement exe_suspensions;

	public WebElement Exe_Suspensions() {
		return exe_suspensions;
	}
	
	
	//suspn Image
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-2/imagespecification.coreimg.png/1662974139897/glamour-xtec-specification-386-x-288pxl-0001-wheel-tyre.png']")
	private WebElement exe_suspensionImg;

	public WebElement Exe_Suspension_Image() {
		return exe_suspensionImg;
	}
	
	//glamour-canvas
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-canvas/_jcr_content/root/container/container_1179138905/generictab/tab-2/imagespecification.coreimg.png/1662996135444/glamour-canvas-suspension.png']")
	private WebElement exe_glamourCan_suspensionImg;

	public WebElement Exe_glamourCan_Suspension_Image() {
		return exe_glamourCan_suspensionImg;
	}
	
	//supersplXtec
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-2/imagespecification.coreimg.png/1677839440672/suspensions.png']")
	private WebElement exe_SspXtec_suspensionImg;

	public WebElement Exe_SspXtec_Suspension_Image() {
		return exe_SspXtec_suspensionImg;
	}

	// passion Plus
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-plus/_jcr_content/root/container/container_1179138905/generictab/tab-2/imagespecification_886877011.coreimg.png/1685343338430/suspensions.png']")
	private WebElement exe_passionPlus_suspensionImg;

	public WebElement Exe_PassionPlus_Suspension_Image() {
		return exe_passionPlus_suspensionImg;
	}
	
	//glamour
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour/_jcr_content/root/container/container_1179138905/generictab/tab-2/imagespecification.coreimg.png/1662998100379/glamour-bs6-suspension.png']")
	private WebElement exe_glamour_suspensionImg;

	public WebElement Exe_Glamour_Suspension_Image() {
		return exe_glamour_suspensionImg;
	}
	
	//superSpln
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor/_jcr_content/root/container/container_1179138905/generictab/tab-2/imagespecification.coreimg.png/1663061107988/suspension.png']")
	private WebElement exe_superSpl_suspensionImg;

	public WebElement Exe_SuperSplendor_Suspension_Image() {
		return exe_superSpl_suspensionImg;
	}
	
	//passion pro
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-2/imagespecification.coreimg.png/1662144429259/386x288-passion-xtec-red--longer-front-suspension.png']")
	private WebElement exe_passionXtec_suspensionImg;

	public WebElement Exe_PassionXtec_Suspension_Image() {
		return exe_passionXtec_suspensionImg;
	}
	
	
                     //=========chassis================//
	
	@FindBy(xpath = "//div[normalize-space()='Chassis']")
	private WebElement exe_Chassis;

	public WebElement Exe_Chassis() {
		return exe_Chassis;
	}
	
	
	///for sspXtec and superSplendor
	@FindBy(xpath = "//div[normalize-space()='Transmission & Chassis']")
	private WebElement exe_transm_Chassis;

	public WebElement Exe_Transmission_Chassis() {
		return exe_transm_Chassis;
	}

	
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-3/imagespecification.coreimg.png/1663141371731/chasis.png']")
	private WebElement exe_ChassisImg;

	public WebElement Exe_Chassis_Image() {
		return exe_ChassisImg;
	}
	//sspxtec
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-3/imagespecification.coreimg.png/1677839533532/transmission-and-chasis-resized.png']")
	private WebElement exe_SspXtec_ChassisImg;

	public WebElement Exe_SspXtec_Chassis_Image() {
		return exe_SspXtec_ChassisImg;
	}
	
	//glamour-canvas
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-canvas/_jcr_content/root/container/container_1179138905/generictab/tab-3/imagespecification.coreimg.png/1662995962377/glamour-canvas-chasis.png']")
	private WebElement exe_glamourCan_ChassisImg;

	public WebElement Exe_glamourCan_Chassis_Image() {
		return exe_glamourCan_ChassisImg;
	}
	
	//passion plus
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-plus/_jcr_content/root/container/container_1179138905/generictab/tab-3/imagespecification.coreimg.png/1685343202712/transmission-chassis.png']")
	private WebElement exe_passionPlus_ChassisImg;

	public WebElement Exe_PassionPlus_Chassis_Image() {
		return exe_passionPlus_ChassisImg;
	}
	
	//glamour
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour/_jcr_content/root/container/container_1179138905/generictab/tab-3/imagespecification.coreimg.png/1662995389043/glamour-bs6-chasis.png']")
	private WebElement exe_glamour_ChassisImg;

	public WebElement Exe_Glamour_Chassis_Image() {
		return exe_glamour_ChassisImg;
	}
	
	//supersplendor

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor/_jcr_content/root/container/container_1179138905/generictab/tab-3/imagespecification.coreimg.png/1663061397717/chassis.png']")
	private WebElement exe_superSpl_ChassisImg;

	public WebElement Exe_SuperSplendor_Chassis_Image() {
		return exe_superSpl_ChassisImg;
	}
	
	
	
	
           //============ Brakes ==============//
	@FindBy(xpath = "//div[normalize-space()='Brakes']")
	private WebElement exe_Brakes;

	public WebElement Exe_Brakes() {
		return exe_Brakes;
	}
	
	//brakesImage
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-4/imagespecification.coreimg.png/1662974238895/glamour-xtec-specification-386-x-288pxl-0004-front-tyre.png']")
	private WebElement exe_BrakesImg;

	public WebElement Exe_Brakes_Image() {
		return exe_BrakesImg;
	}
	
	//sspXtec
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-4/imagespecification.coreimg.png/1677647504621/wheels-disc.png']")
	private WebElement exe_SspXtec_BrakesImg;

	public WebElement Exe_SspXtec_Brakes_Image() {
		return exe_SspXtec_BrakesImg;
	}
	
	
	//glamour-Canvas
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-canvas/_jcr_content/root/container/container_1179138905/generictab/tab-4/imagespecification.coreimg.png/1662649959416/wheels-tyres.png']")
	private WebElement exe_glamourCan_BrakesImg;

	public WebElement Exe_glamourCan_Brakes_Image() {
		return exe_glamourCan_BrakesImg;
	}

	//passion Plus
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-plus/_jcr_content/root/container/container_1179138905/generictab/tab-4/imagespecification.coreimg.png/1685343269147/brakes.png']")
	private WebElement exe_passionPlus_BrakesImg;

	public WebElement Exe_PassionPlus_Brakes_Image() {
		return exe_passionPlus_BrakesImg;
	}
	
	//glamour
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour/_jcr_content/root/container/container_1179138905/generictab/tab-4/imagespecification.coreimg.png/1662995430237/glamour-bs6-wheels.png']")
	private WebElement exe_glamour_BrakesImg;

	public WebElement Exe_Glamour_Brakes_Image() {
		return exe_glamour_BrakesImg;
	}
	
	//superSplendor
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor/_jcr_content/root/container/container_1179138905/generictab/tab-4/imagespecification.coreimg.png/1663061455392/brake.png']")
	private WebElement exe_superSpl_BrakesImg;

	public WebElement Exe_SuperSplendor_Brakes_Image() {
		return exe_superSpl_BrakesImg;
	}
	
         	//===========ELECTRICALS-----for SuperSplXtec========//
	@FindBy(xpath = "//div[normalize-space()='Electricals']")
	private WebElement exe_Electricals;

	public WebElement Exe_Electricals() {
		return exe_Electricals;
	}
	// 
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-5/imagespecification.coreimg.png/1677839628574/electricals-resized.png']")
	private WebElement exe_ElectricalsImg;

	public WebElement Exe_SSpXtec_Electricals_Image() {
		return exe_ElectricalsImg;
	}
	
	//superSplendor
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor/_jcr_content/root/container/container_1179138905/generictab/tab-5/imagespecification.coreimg.png/1663061573961/electricals.png']")
	private WebElement exe_superSpl_ElectricalsImg;

	public WebElement Exe_SuperSplendor_Electricals_Image() {
		return exe_superSpl_ElectricalsImg;
	}
	
	
	
	        //========== Dimension=========//
	@FindBy(xpath = "//div[normalize-space()='Dimensions']")
	private WebElement exe_Dimensions;

	public WebElement Exe_Dimensions() {
		return exe_Dimensions;
	}
	
	
	//dimensionImage
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-5/imagespecification.coreimg.png/1662997636741/dimensions.png']")
	private WebElement exe_DimensionsImg;

	public WebElement Exe_Dimensions_Image() {
		return exe_DimensionsImg;
	}


	//sspXtec
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-6/imagespecification.coreimg.png/1677839768567/dimensions.png']")
	private WebElement exe_SspXtec_DimensionsImg;

	public WebElement Exe_SspXtec_Dimensions_Image() {
		return exe_SspXtec_DimensionsImg;
	}

	//glamour-canvas
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour-canvas/_jcr_content/root/container/container_1179138905/generictab/tab-5/imagespecification.coreimg.png/1662996032971/glamour-canvas-dimensions.png']")
	private WebElement exe_glamourCan_DimensionsImg;

	public WebElement Exe_glamourCan_Dimensions_Image() {
		return exe_glamourCan_DimensionsImg;
	}
	
    //passion plus
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-plus/_jcr_content/root/container/container_1179138905/generictab/tab-6/imagespecification_c.coreimg.png/1685343299324/dimensions.png']")
	private WebElement exe_passionPlus_DimensionsImg;

	public WebElement Exe_PassionPlus_Dimensions_Image() {
		return exe_passionPlus_DimensionsImg;
	}
	
	
    //glamour
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/glamour/_jcr_content/root/container/container_1179138905/generictab/tab-5/imagespecification.coreimg.png/1662975381511/diamension.png']")
	private WebElement exe_glamour_DimensionsImg;

	public WebElement Exe_Glamour_Dimensions_Image() {
		return exe_glamour_DimensionsImg;
	}
	
	//superSplendor
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/super-splendor/_jcr_content/root/container/container_1179138905/generictab/tab-6/imagespecification.coreimg.png/1663063034884/super-splendor-specifications.png']")
	private WebElement exe_superSpl_DimensionsImg;

	public WebElement Exe_SuperSplendor_Dimensions_Image() {
		return exe_superSpl_DimensionsImg;
	}
	
	//Passion xtec
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-3/imagespecification.coreimg.png/1662980613939/386x288-passion-xtec-red-360d-s01.png']")
	private WebElement exe_passionXtec_DimensionsImg;

	public WebElement Exe_PassionXtec_Dimensions_Image() {
		return exe_passionXtec_DimensionsImg;
	}
	
	
	      //=========== Fuel Tank===========//
	@FindBy(xpath = "//div[normalize-space()='Fuel Tank']")
	private WebElement exe_passionPro_fuelTank;

	public WebElement Exe_PassionPro_FuelTank_Tab() {
		return exe_passionPro_fuelTank;
	}
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-pro/_jcr_content/root/container/container_1179138905/generictab/tab-5/imagespecification.coreimg.png/1663314531474/tank-shot.png']")
	private WebElement exe_passionPro_fuelTankImg;

	public WebElement Exe_PassionPro_FuelTank_Image() {
		return exe_passionPro_fuelTankImg;
	}
	
	//Gearbox
		
	@FindBy(xpath = "//div[normalize-space()='Gearbox']")
	private WebElement exe_Gearbox;

	public WebElement Exe_Gearbox() {
		return exe_Gearbox;
	}
	
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/executive/passion-xtec/_jcr_content/root/container/container_1179138905/generictab/tab-4/imagespecification.coreimg.png/1665469580860/386x288-passion-xtec-red--5-speed-gear-box.png']")
	private WebElement exe_passionXtec_GearImg;

	public WebElement Exe_PassionXtec_Gear_Image() {
		return exe_passionXtec_GearImg;
	}
	
	
	//download broucher
	
	@FindBy(xpath = "(//p[contains(text(),'Download Brochure')])[1]")
	private WebElement exe_Specs_broucher;

	public WebElement Exe_Specs_DownloadBroucher() {
		return exe_Specs_broucher;
	}
	
	//share icon
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/brand/design/icons/share-icon.svg']")
	private WebElement exe_Specs_shareIcon;

	public WebElement Exe_Specs_ShareIcon() {
		return exe_Specs_shareIcon;
	}
	
	
	
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/brand/design/icons/email-icon.svg']")
	private WebElement exe_Specs_shareIconEmail;

	public WebElement Exe_Specs_ShareIconEmail() {
		return exe_Specs_shareIconEmail;
	}
	
	

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/brand/design/icons/whatsapp-icon.svg']")
	private WebElement exe_Specs_shareIconWhatsapp;

	public WebElement Exe_Specs_ShareIconWhatsapp() {
		return exe_Specs_shareIconWhatsapp;
	}
  
	
	
	        //**************PRICE*****************
	
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/price-data/price-data.png']")
	private WebElement exe_price_glamourXtecImg;

	public WebElement Exe_Price_GlamourXtec_Image() {
		return exe_price_glamourXtecImg;
	}
	
	
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/super-splendor-xtec/price-data/Super-Spl-Price-Product-webview.png']")
	private WebElement exe_price_sspXtecImg;

	public WebElement Exe_Price_SSpXtec_Image() {
		return exe_price_sspXtecImg;
	}
	
	
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/price-data/Glamour-Canvas.png']")
	private WebElement exe_price_glamourCanvasImg;

	public WebElement Exe_Price_GlamourCanvas_Image() {
		return exe_price_glamourCanvasImg;
	}
	
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-plus/PRICE_bikeimg.png'])[1]")
	private WebElement exe_price_PassionPlusImg;

	public WebElement Exe_Price_PassionPlus_Image() {
		return exe_price_PassionPlusImg;
	}
	
	
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/comparison/454x340_Passion-Xtec-Red-360D_S01-01.png'])[1]")
	private WebElement exe_price_PassionXtecImg;

	public WebElement Exe_Price_PassionXtec_Image() {
		return exe_price_PassionXtecImg;
	}
	
	
                   //********COMPARE***Executive *******
	
	
	//GlamourXtec-compare
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/product-compare/comparion-dekstop-glamourxtech-lhs.png']")
	private WebElement EXcompare_glamourXtec_bike1;

	public WebElement Exe_Compare_glamourXtec_Bike1_Img() {
		return EXcompare_glamourXtec_bike1;}
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/product-compare/comparion-dekstop-glamourxtech-ss-rhs.png']")
	private WebElement EXcompare_glamourXtec_bike2;

	public WebElement Exe_Compare_glamourXtec_Bike2_Img() {
		return EXcompare_glamourXtec_bike2;}
	
	
	
	//SuperSplendor Xtec-compare	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city/super-splendor-xtec/product-comparison/splendor-big-left.png']")
	private WebElement EXcompare_superSplendorXtec_bike1;

	public WebElement Exe_Compare_SuperSplendorXtec_Bike1_Img() {
		return EXcompare_superSplendorXtec_bike1;}
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city/super-splendor-xtec/product-comparison/splendor-big-right.png']")
	private WebElement EXcompare_superSplendorXtec_bike2;

	public WebElement Exe_Compare_SuperSplendorXtec_Bike2_Img() {
		return EXcompare_superSplendorXtec_bike2;}
	

	//SuperSplendor-----compare	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/compare/comparion-dekstop-ss-lhs.png']")
	private WebElement EXcompare_superSplendor_bike1;

	public WebElement Exe_Compare_SuperSplendor_Bike1_Img() {
		return EXcompare_superSplendor_bike1;}
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/compare/comparion-dekstop-ss-glamour-rhs.png']")
	private WebElement EXcompare_superSplendor_bike2;

	public WebElement Exe_Compare_SuperSplendor_Bike2_Img() {
		return EXcompare_superSplendor_bike2;}
	
	
	//glamour-canvas--- compare
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/product-compare/comparion-dekstop-glamourcanvas-lhs.png']")
	private WebElement EXcompare_glamourCanvas_bike1;

	public WebElement Exe_Compare_glamourCanvas_Bike1_Img() {
		return EXcompare_glamourCanvas_bike1;}
	
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/product-compare/comparion-dekstop-glamourcanvas-glamourxtech-rhs.png']")
	private WebElement EXcompare_glamourCanvas_bike2;

	public WebElement Exe_Compare_glamourCanvas_Bike2_Img() {
		return EXcompare_glamourCanvas_bike2;}
	
	
	//passionPro
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-plus/compare-section/COMPARE_YOUR_PASSION.png']")
	private WebElement EXcompare_passionPlus_bike1;

	public WebElement Exe_Compare_PassionPlus_Bike1_Img() {
		return EXcompare_passionPlus_bike1;}
	
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-pro/compare/comparion-dekstop-passionpro-passionxtech-rhs.png']")
	private WebElement EXcompare_passionPlus_bike2;

	public WebElement Exe_Compare_PassionPlus_Bike2_Img() {
		return EXcompare_passionPlus_bike2;}
	
	//Passion Xtec
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/comparison/web/454x340_Passion-Xtec-Red-360D_S01-01.png']")
	private WebElement EXcompare_passionXtec_bike1;

	public WebElement Exe_Compare_PassionXtec_Bike1_Img() {
		return EXcompare_passionXtec_bike1;}
	
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/comparison/web/Passion%20Pro%20Techno%20Blue%20360%20Degree_402px%20x%20252px-07%201.png']")
	private WebElement EXcompare_passionXtec_bike2;

	public WebElement Exe_Compare_PassionXtec_Bike2_Img() {
		return EXcompare_passionXtec_bike2;}
	
	//Glamour
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/product-compare/comparion-dekstop-glamour-lhs.png']")
	private WebElement EXcompare_glamour_bike1;

	public WebElement Exe_Compare_Glamour_Bike1_Img() {
		return EXcompare_glamour_bike1;}
	
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/product-compare/comparion-dekstop-glamour-glamourxtech-rhs.png']")
	private WebElement EXcompare_glamour_bike2;

	public WebElement Exe_Compare_Glamour_Bike2_Img() {
		return EXcompare_glamour_bike2;}
	
	
	//////////****************Color-360 view** Executive bikes ***************////////////////////////////
	
	
	                 //  >>>>>>>>>>GlamourXtec<<<<<<<<<<<<<<<<<<<<
	
	//nexus blue
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/color-switch/SPARKLING%20%20BETA%20BLUE.png']")
	private WebElement GlamourXtec_colorNexusBlue;

	public WebElement  colorSwitch_GlamourXtec_NexusBlue() {
		return GlamourXtec_colorNexusBlue;}
	
	//GlossyBlack
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/color-switch/GlamourXTech_Glossy%20Black.png']")
	private WebElement GlamourXtec_colorGlossyBlack;

	public WebElement  colorSwitch_GlamourXtec_GlossyBlack() {
		return GlamourXtec_colorGlossyBlack;}
	
	//Matte Axis Grey
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/color-360/color-icons/Matte-Axis-Grey.png']")
	private WebElement GlamourXtec_colorMetteGrey;

	public WebElement  colorSwitch_GlamourXtec_MetteGrey() {
		return GlamourXtec_colorMetteGrey;}
	
	
	//Candy Blazing Red
	
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour-xtec/color-360/color-icons/Candy-Blazing-Red.png']")
	private WebElement GlamourXtec_colorBlazingRed;

	public WebElement  colorSwitch_GlamourXtec_BlazingRed() {
		return GlamourXtec_colorBlazingRed;}
	
	
	
	
	              //>>>>>>>>Super Splendor <<<<<<<<<<<<<<<<<<<<<<<
	
	
	//Canvas black
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/canvas-blank.png']")
	private WebElement supersplendor_colorCanvasBlack;

	public WebElement  colorSwitch_Supersplendor_CanvasBlack() {
		return supersplendor_colorCanvasBlack;}
	
	
	//Dusky black
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/duskyblack.png']")
	private WebElement supersplendor_colorDuskyBlack;

	public WebElement  colorSwitch_Supersplendor_DuskyBlack() {
		return supersplendor_colorDuskyBlack;}
	
	
	//Glaze black
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/glaze-black.png']")
	private WebElement supersplendor_colorGlazeBlack;

	public WebElement  colorSwitch_Supersplendor_GlazeBlack() {
		return supersplendor_colorGlazeBlack;}
	
	
	//Heavy Grey
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/candy-blazing-red.png']")
	private WebElement supersplendor_colorHeavyGrey;

	public WebElement  colorSwitch_Supersplendor_HeavyGrey() {
		return supersplendor_colorHeavyGrey;}
	
	
	
	//Nexus Blue
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/nexus-black.png']")
	private WebElement supersplendor_colorNexusBlue;

	public WebElement  colorSwitch_Supersplendor_NexusBlue() {
		return supersplendor_colorNexusBlue;}
	
	//Candy Blazing red
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/cb-red.png']")
	private WebElement supersplendor_colorCandyBlazingRed;

	public WebElement  colorSwitch_Supersplendor_CandyBlazingRed() {
		return supersplendor_colorCandyBlazingRed;}
	
	
//	//Fusion Blue
//	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/fusion-bl.png']")
//	private WebElement supersplendor_colorFusionBlue;
//
//	public WebElement  colorSwitch_Supersplendor_FusionBlue() {
//		return supersplendor_colorFusionBlue;}
//	
//	
//	//Magnetic Red
//	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/magnetic-red.png']")
//	private WebElement supersplendor_colorMagneticRed;
//
//	public WebElement  colorSwitch_Supersplendor_MagneticRed() {
//		return supersplendor_colorMagneticRed;}
//	
//	
//	//Electric Blue
//	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/electric-blue.png']")
//	private WebElement supersplendor_colorElectricBlue;
	
//	public WebElement  colorSwitch_Supersplendor_ElectricBlue() {
//		return supersplendor_colorElectricBlue;}
	
	
	
	
	             //>>>>>>>>Super Splendor Xtec <<<<<<<<<<<<<<<<<<<<<<<
	
	//Glossy-Black-------++++ Colour switch and Bike Image
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city/super-splendor-xtec/color-switch/Dusky-Black.jpg']")
	private WebElement ssplXtec_glossyBlack;

	public WebElement  colorSwitch_SuperSplXtec_GlossyBlack() {
		return ssplXtec_glossyBlack;}
	
	
	//Candy-Blazing-Red -------++++ Colour switch and Bike Image
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city/super-splendor-xtec/color-switch/Candy-blazing-red.jpg']")
	private WebElement ssplXtec_BlazingRed;

	public WebElement  colorSwitch_SuperSplXtec_BlazingRed() {
		return ssplXtec_BlazingRed;}

	
	//Matte-Axis-grey -------++++ Colour switch and Bike Image
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city/super-splendor-xtec/color-switch/Matte-grey.jpg']")
	private WebElement ssplXtec_matteAxisGrey;

	public WebElement  colorSwitch_SuperSplXtec_MatteAxisGrey() {
		return ssplXtec_matteAxisGrey;}
	
	
	             //>>>>>>>>>>Glamour-Canvas<<<<<<<<<<<<<<<<<<<<
	
	
	
	//Canvas Black
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-super-splendor/color-switch/canvas-blank.png']")
	private WebElement GlamourCan_canvasBlack;

	public WebElement  colorSwitch_GlamourCanvas_CanvasBlack() {
		return GlamourCan_canvasBlack;}
	
	
	//Radiant Red
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/new-glamour-icon/Radiant-Red.png']")
	private WebElement GlamourCan_radiantRed;

	public WebElement  colorSwitch_GlamourCanvas_RadiantRed() {
		return GlamourCan_radiantRed;}
	
	
	
	//Techno Blue
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/new-glamour-icon/Techno-Blue.png']")
	private WebElement GlamourCan_technoBlue;

	public WebElement  colorSwitch_GlamourCanvas_TechnoBlue() {
		return GlamourCan_technoBlue;}
	
	
	//Sunset gold
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/new-glamour-icon/Sunset-Gold.png']")
	private WebElement GlamourCan_sunsetGold;

	public WebElement  colorSwitch_GlamourCanvas_SunsetGold() {
		return GlamourCan_sunsetGold;}
	
	
	//Fiery Red
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/new-glamour-icon/Fiery-Red.png']")
	private WebElement GlamourCan_fieryRed;

	public WebElement  colorSwitch_GlamourCanvas_FieryRed() {
		return GlamourCan_fieryRed;}
	
	
	//Daring Yellow
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/new-glamour/color-360/new-glamour-icon/Daring-Yellow.png']")
	private WebElement GlamourCan_daringYellow;

	public WebElement  colorSwitch_GlamourCanvas_DaringYellow() {
		return GlamourCan_daringYellow;}
	
	

	
	      //>>>>>>>>>>Passion Pro<<<<<<<<<<<<<<<<<<<<
    
	//Techno-Blue
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-pro/color-switch/Techno%20Blue.png']")
	private WebElement passionPro_technoBlue;

	public WebElement  colorSwitch_PassionPro_TechnoBlue() {
		return passionPro_technoBlue;}
	
	//Glaze-Balck
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-pro/color-switch/Glaze%20Black.png']")
	private WebElement passionPro_GlazeBlack;

	public WebElement  colorSwitch_PassionPro_GlazeBlack() {
		return passionPro_GlazeBlack;}
	
	//Sports-Red
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-pro/color-switch/Sports%20Red.png']")
	private WebElement passionPro_sportsRed;

	public WebElement  colorSwitch_PassionPro_SportsRed() {
		return passionPro_sportsRed;}
	
	//Heavy-Grey-Metalic
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-pro/color-switch/Heavy%20Grey%20Metallic.png']")
	private WebElement passionPro_greyMetallic;

	public WebElement  colorSwitch_PassionPro_GreyMetallic() {
		return passionPro_greyMetallic;}
	
	//Moon-Yellow
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-pro/color-switch/Techno%20Blue.png']")
	private WebElement passionPro_moonYellow;

	public WebElement  colorSwitch_PassionPro_MoonYellow() {
		return passionPro_moonYellow;}

	      
	
	               //>>>>>>>>>>Glamour<<<<<<<<<<<<<<<<<<<<
	
	 //Sports Red
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/color-switch/sports-red.svg']")
	private WebElement glamour_sportsRed;

	public WebElement  colorSwitch_Glamour_SportsRed() {
		return glamour_sportsRed;}
	
	//Midnight Black
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/color-switch/midnight-black.svg']")
	private WebElement glamour_midnightBlack;

	public WebElement  colorSwitch_Glamour_MidnightBlack() {
		return glamour_midnightBlack;}
	
	//Radiant Red
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/color-switch/radiant-red.svg']")
	private WebElement glamour_RadiantRed;

	public WebElement  colorSwitch_Glamour_RadiantRed() {
		return glamour_RadiantRed;}
	
	//Techno Blue
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/glamour/color-switch/techno-blue.svg']")
	private WebElement glamour_technoBlue;

	public WebElement  colorSwitch_Glamour_TechnoBlue() {
		return glamour_technoBlue;}
	
	//bookNow bttn on color 360 component

	@FindBy(xpath = "//a[@class='btn btn-red-gradient']")
	private WebElement exe_Color360BookNow;

	public WebElement Exe_Color360_BookNow() {
		return exe_Color360BookNow;
		
	}
	                  //>>>>>>>>>>Passion Xtec<<<<<<<<<<<<<<<<<<<<
	
	//Candy Blazing Red
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/color-360/Candy%20Blazing%20Red.png']")
	private WebElement passionXtec_candyBlazingRed;

	public WebElement  colorSwitch_PassionXtec_CandyBlazingRed() {
		return passionXtec_candyBlazingRed;}
	
	//Black with force silver
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/color-360/Black%20with%20Force%20Silver.png']")
	private WebElement passionXtec_BlackForceSilver;

	public WebElement  colorSwitch_PassionXtec_BlackForceSilver() {
		return passionXtec_BlackForceSilver;}
	
	//Black with Polestar Blue
	@FindBy(xpath ="//img[@src='/content/dam/hero-aem-website/in/products/city-plus/passion-xtec/color-360/Black%20with%20Polestar%20Blue.png']")
	private WebElement passionPro_BlackBlue;

	public WebElement  colorSwitch_PassionXtec_BlackBlue() {
		return passionPro_BlackBlue;}
	              

	
	////////////////////////******** E-shop links *********//////////////////////////
	
	
	@FindBy(xpath = "//span[normalize-space()='GoodLife']")
	private WebElement exe_Eshop_goodLife;

	public WebElement exe_Eshop_GoodLife() {
		return exe_Eshop_goodLife;
	}
	
	@FindBy(xpath = "(//div[@class='customer-review-explore-div'])[1]")
	private WebElement exe_goodlife_explorNow;

	public WebElement exe_Eshop_GoodLife_ExploreNow() {
		return exe_goodlife_explorNow;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='HERO JOYRIDE']")
	private WebElement exe_Eshop_joyRide;

	public WebElement exe_Eshop_JoyRide() {
		return exe_Eshop_joyRide;
	}	
	
	@FindBy(xpath = "(//div[@class='customer-review-explore-div'])[2]")
	private WebElement exe_Eshop_JoyRide_exploreNow;

	public WebElement exe_Eshop_JoyRide_ExploreNow() {
		return exe_Eshop_JoyRide_exploreNow;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Accessories']")
	private WebElement exe_Eshop_accessories;

	public WebElement exe_Eshop_Accessories() {
		return exe_Eshop_accessories;
	}
	
	@FindBy(xpath = "(//div[@class='customer-review-explore-div'])[3]")
	private WebElement exe_Eshop_accessories_exploreNow;

	public WebElement exe_Eshop_Accessories_ExploreNow() {
		return exe_Eshop_accessories_exploreNow;
	}
	
	
	
	
	// for super splendor Xtec	
	
	@FindBy(xpath = "//a[@href='/en-in/goodlife/']")
	private WebElement exe_EshopLink_goodLife;

	public WebElement exe_EshopLink_GoodLife() {
		return exe_EshopLink_goodLife;
	}
	
	
	@FindBy(xpath = "(//a[@href='/en-in/hero-joyride/'])[1]")
	private WebElement exe_EshopLink_heroJoyRide;

	public WebElement exe_EshopLink_JoyRide() {
		return exe_EshopLink_heroJoyRide;
	}
	
	
	@FindBy(xpath = "//a[@href='https://www.heromotocorp.com/en-in/hero-accessories/']")
	private WebElement exe_EshopLink_access;

	public WebElement exe_Eshop_Access() {
		return exe_EshopLink_access;
		
	}
	
	
}
