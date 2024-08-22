package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import com.utility.base_class;

@Listeners(com.utility.listner.class)
public class Motorcycles_practical extends base_class {

	String excelpath = "C:\\Users\\Welcome\\Documents\\GitHub\\MoonShot_Web\\data\\data1.xlsx";

	public Motorcycles_practical() {
		PageFactory.initElements(driver, this);

	}

//****************************practical page banner   *************************************************//
	@FindBy(xpath = "//a[normalize-space()='MOTORCYCLES']")
	private WebElement motorcycles;
	@FindBy(xpath = "//a[normalize-space() ='PRACTICAL'][@target=\"_self\"]")
	private WebElement practical;
 	@FindBy(xpath = "//li[@data-target=\"#carousel69059581\"]")
	private List<WebElement> practical_slide;
	@FindBy(xpath = "//h1[@class=\"banner-heading\"]")
	private WebElement heading_1;

	public WebElement motorcycles() {
		return motorcycles;
	}

	public WebElement practical() {
		return practical;
	}

	public void slider() {
		try {

			for (int i = 0; i < practical_slide.size(); i++) {
				Custom_click(practical_slide.get(i), "Slide " + (i + 1));
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public WebElement heading_1() {
		return heading_1;
	}

	// **************************** Practical page HF 100
	// *************************************************//
	@FindBy(xpath = "(//div[@class='bike-img'])[1]")
	public WebElement hf_100_bike_image;
	@FindBy(xpath = "//h2[@class='newhead']/following::li[@data-target='#HF100']")
	private WebElement HF_100_quick_view;
	@FindBy(xpath = "//div[@class=\"bike-info\"]/div/h2[text() ='HF 100']")
	private WebElement heading_hf_100;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-100/color-switch/black-red/1.png\"])[2]")
	private WebElement hf_100_black_red_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-100/color-switch/blue-nexus/1.png\"])[2]")
	private WebElement hf_100_Nexus_Blue_image;
	@FindBy(xpath = "(//a[@data-color=\"Black REd\"])[2]")
	private WebElement black_red_image_button;
	@FindBy(xpath = "(//a[@data-color=\"Nexus Blue\"])[2]")
	private WebElement Nexus_Blue_image_button;
	@FindBy(xpath = "(//a[contains(text() ,'View Details ')])[1]")
	private WebElement view_detail_button;
	@FindBy(xpath = "(//a[contains(text() ,'Book Now')])[3]")
	private WebElement book_now_button;
	@FindBy(xpath = "//a[@class=\"nav-link cmp-list__item-link active\"]")
	private WebElement bike_view_details;
	@FindBy(xpath = "//div[@id='HF100']//button[normalize-space()='×']")
	private WebElement HF_100_close_button;

	public WebElement hf_100_bike_image() {
		return hf_100_bike_image;
	}

	public WebElement HF_100_quick_view() {
		return HF_100_quick_view;
	}

	public WebElement heading_hf_100() {
		return heading_hf_100;
	}

	public WebElement hf_100_black_red_image() {
		return hf_100_black_red_image;
	}

	public WebElement hf_100_Nexus_Blue_image() {
		return hf_100_Nexus_Blue_image;
	}

	public WebElement black_red_image_button() {
		return black_red_image_button;
	}

	public WebElement Nexus_Blue_image_button() {
		return Nexus_Blue_image_button;
	}

	public WebElement view_detail_button() {
		return view_detail_button;
	}

	public WebElement book_now_button() {
		return book_now_button;
	}

	public WebElement bike_view_details() {
		return bike_view_details;
	}

	public WebElement HF_100_close_button() {
		return HF_100_close_button;
	}

	// **************************** Practical page HF Deluxe
	// *************************************************//
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/HF-DELUXE-removebg-preview.png']")
	public WebElement hf_Deluxe_bike_image;
	@FindBy(xpath = "//h2[@class=\"newhead\"]/following::li[@data-target=\"#HFDeluxe\"]")
	private WebElement HF_Deluxe_quick_view;

	@FindBy(xpath = "//div[@class=\"bike-info\"]/div/h2[text() ='HF DELUXE']")
	private WebElement heading_HF_DELUXE;

	@FindBy(xpath = "((//ul[@class=\"nav nav-tabs explore-360-tab-blk bike-variants \"])[2]/li/a/img)[1]")
	private WebElement hf_DELUXE_blue_black_button;

	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-deluxe/360/black-blue/1.png\"])[2]")
	private WebElement hf_DELUXE_blue_black_image;

	@FindBy(xpath = "(//a[@data-color='brown'])[3]")
	private WebElement hf_DELUXE_black_purple_button;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/360/black-purple/1.png'])[2]")
	private WebElement hf_DELUXE_black_purple_image;

	@FindBy(xpath = "(//a[@data-color='Red'])[2]")
	private WebElement hf_DELUXE_black_red_button;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-deluxe/360/black-red/1.png\"])[2]")
	private WebElement hf_DELUXE_black_red_image;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/technoblue.svg'])[2]")
	private WebElement hf_DELUXE_Blue_button;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-deluxe/360/blue/1.png\"])[2]")
	private WebElement hf_DELUXE_Blue_image;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/candyred.svg'])[2]")
	private WebElement hf_DELUXE_candy_red_button;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-deluxe/360/candy-red/1.png\"])[2]")
	private WebElement hf_DELUXE_candy_red_image;

	@FindBy(xpath = "(//a[@data-color='Green'])[2]")
	private WebElement hf_DELUXE_grey_green_button;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-deluxe/360/grey-green/1.png\"])[2]")
	private WebElement hf_DELUXE_grey_green_image;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/firefly-golden.svg'])[2]")
	private WebElement hf_DELUXE_gold_button;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-deluxe/360/gold/1.png\"])[2]")
	private WebElement hf_DELUXE_gold_image;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/nexusblue.svg'])[2]")
	private WebElement hf_DELUXE_black_blue_button;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/hf-deluxe/360/black-blue/1.png\"])[2]")
	private WebElement hf_DELUXE_black_blue_image;

//	@FindBy(xpath ="(//ul[@class=\"nav nav-tabs explore-360-tab-blk bike-variants \"])[2]/li/a/img")
//	private List<WebElement> all_bike_image_button;
	@FindBy(xpath = "(//a[contains(text() ,'View Details ')])[3]")
	private WebElement view_detail_button_hf_Deluxe;
	@FindBy(xpath = "(//a[contains(text() ,'Book Now')])[5]")
	private WebElement book_now_button_hf_Deluxe;
	@FindBy(xpath = "//div[@id='HFDeluxe']//button[normalize-space()='×']")
	private WebElement HF_Deluxe_close_button;

	public WebElement hf_Deluxe_bike_image() {
		return hf_Deluxe_bike_image;
	}

	public WebElement HF_Deluxe_quick_view() {
		return HF_Deluxe_quick_view;
	}

	public WebElement heading_HF_DELUXE() {
		return heading_HF_DELUXE;
	}

	public void all_bike_image_button_for_HF_DELUXE() throws Exception {
//		    Wait(hf_DELUXE_blue_black_button);
//			Custom_click(hf_DELUXE_blue_black_button, " hf DELUXE black blue image button");
//			VerifyImagePresent(hf_DELUXE_blue_black_image, "hf DELUXE black blue image");

		Wait(hf_DELUXE_black_purple_button);
		Custom_click(hf_DELUXE_black_purple_button, " hf DELUXE black purple image button");
		Wait(hf_DELUXE_black_purple_image);
		Thread.sleep(1000);
		VerifyImagePresent(hf_DELUXE_black_purple_image, "hf DELUXE black purple image");

		Wait(hf_DELUXE_black_red_button);
		Custom_click(hf_DELUXE_black_red_button, " hf DELUXE black red image button");
		Thread.sleep(1000);
		Wait(hf_DELUXE_black_red_image);
		VerifyImagePresent(hf_DELUXE_black_red_image, "hf DELUXE black red image");

		Wait(hf_DELUXE_Blue_button);
		Custom_click(hf_DELUXE_Blue_button, " hf DELUXE Blue image button");
		Thread.sleep(1000);
		Wait(hf_DELUXE_Blue_image);
		VerifyImagePresent(hf_DELUXE_Blue_image, "hf DELUXE Blue image");

		Wait(hf_DELUXE_candy_red_button);
		Custom_click(hf_DELUXE_candy_red_button, " hf DELUXE candy red image button");
		Thread.sleep(1000);
		Wait(hf_DELUXE_candy_red_image);
		VerifyImagePresent(hf_DELUXE_candy_red_image, "hf DELUXE candy red image");

		Wait(hf_DELUXE_grey_green_button);
		Custom_click(hf_DELUXE_grey_green_button, " hf DELUXE grey green image button");
		Wait(hf_DELUXE_grey_green_image);
		Thread.sleep(1000);
		VerifyImagePresent(hf_DELUXE_grey_green_image, "hf DELUXE grey green image");

		Wait(hf_DELUXE_gold_button);
		Custom_click(hf_DELUXE_gold_button, " hf DELUXE gold image button");
		Wait(hf_DELUXE_gold_image);
		Thread.sleep(1000);
		VerifyImagePresent(hf_DELUXE_gold_image, "hf DELUXE gold image");

		Wait(hf_DELUXE_black_blue_button);
		Custom_click(hf_DELUXE_black_blue_button, " hf DELUXE black blue image button");
		Wait(hf_DELUXE_black_blue_image);
		Thread.sleep(1000);
		VerifyImagePresent(hf_DELUXE_black_blue_image, "hf DELUXE black blue image");
	}

	public WebElement view_detail_button_hf_Deluxe() {
		return view_detail_button_hf_Deluxe;
	}

	public WebElement book_now_button_hf_Deluxe() {
		return book_now_button_hf_Deluxe;
	}

	public WebElement HF_Deluxe_close_button() {
		return HF_Deluxe_close_button;
	}

	// **************************** Practical page -Splendor +
	// *************************************************//
	@FindBy(xpath = "(//div[@class=\"bike-img\"])[3]")
	public WebElement splendor_plus_bike_image;

	@FindBy(xpath = "//h2[@class=\"newhead\"]/following::li[@data-target=\"#SplendorPlus\"]")
	private WebElement splendor_plus_quick_view;

	@FindBy(xpath = "//div[@class=\"bike-info\"]/div/h2[text() ='SPLENDOR+']")
	private WebElement heading_splendor_plus;

	@FindBy(xpath = "(//a[@data-color=\"Silver Nexus Blue\"])[2]")
	private WebElement splendor_plus_Silver_Nexus_Blue_button;

	@FindBy(xpath = "(//a[@data-color=\"Black with Silver\"])[2]")
	private WebElement splendor_plus_Black_with_Silver_button;

	@FindBy(xpath = "(//a[@data-color=\"Black with Red\"])[2]")
	private WebElement splendor_plus_Black_with_Red_button;

	@FindBy(xpath = "(//a[@data-color=\" Matte Shield Gold\"])[2]")
	private WebElement splendor_plus_Matte_Shield_Gold_button;

	@FindBy(xpath = "(//a[@data-color=\"Black with Purple\"])[2]")
	private WebElement splendor_plus_Black_with_Purple_button;

	@FindBy(xpath = "(//a[@data-color=\"Heavy Grey Green\"])[2]")
	private WebElement splendor_plus_Heavy_Grey_Green_button;

	@FindBy(xpath = "(//a[@data-color=\"Firefly Golden\"])[2]")
	private WebElement splendor_plus_Firefly_Golden_button;

	@FindBy(xpath = "(//a[@data-color=\"Beetle Red\"])[2]")
	private WebElement splendor_plus_Beetle_Red_button;

	@FindBy(xpath = "(//a[@data-color=\"Bumble Bee Yellow\"])[2]")
	private WebElement splendor_plus_Bumble_Bee_Yellow_button;

	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/silver/1.png\"])[2]")
	private WebElement splendor_plus_Silver_Nexus_Blue_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/black-silver/1.png\"])[2]")
	private WebElement splendor_plus_Black_with_Silver_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/black-red/1.png\"])[2]")
	private WebElement splendor_plus_Black_with_Red_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/matte-shield-gold/1.png\"])[2]")
	private WebElement splendor_plus_Matte_Shield_Gold_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/black-purple/1.png\"])[2]")
	private WebElement splendor_plus_Black_with_Purple_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/heavy-grey-green/1.png\"])[2]")
	private WebElement splendor_plus_Heavy_Grey_Green_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/firefly-golden/1.png\"])[2]")
	private WebElement splendor_plus_Firefly_Golden_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/bettle-red/1.png\"])[2]")
	private WebElement splendor_plus_Beetle_Red_image;
	@FindBy(xpath = "(//img[@src=\"/content/dam/hero-aem-website/in/products/city/splendor-plus/360/bumble-bee-yellow/1.png\"])[2]")
	private WebElement splendor_plus_Bumble_Bee_Yellow_image;
	@FindBy(xpath = "(//a[contains(text() ,'View Details ')])[5]")
	private WebElement view_detail_button_splendor_plus;
	@FindBy(xpath = "(//a[contains(text() ,'Book Now')])[7]")
	private WebElement book_now_button_splendor_plus;
	@FindBy(xpath = "//div[@id='SplendorPlus']//button[normalize-space()='×']")
	private WebElement splendor_plus_close_button;

	public WebElement splendor_plus_bike_image() {
		return splendor_plus_bike_image;
	}

	public WebElement splendor_plus_quick_view() {
		return splendor_plus_quick_view;
	}

	public WebElement heading_splendor_plus() {
		return heading_splendor_plus;
	}

	public void all_bike_image_button_for_splendor_plus() throws InterruptedException {
		
	
		Wait(splendor_plus_Silver_Nexus_Blue_button);
		Custom_click(splendor_plus_Silver_Nexus_Blue_button, " splendor plus Silver Nexus Blue image button");
		Thread.sleep(1000);
		VerifyImagePresent(splendor_plus_Silver_Nexus_Blue_image, "splendor plus Silver Nexus Blue image");

		Custom_click(splendor_plus_Black_with_Silver_button, " splendor plus Black with Silver image button");
		Thread.sleep(1000);
		Wait(splendor_plus_Black_with_Silver_button);
		VerifyImagePresent(splendor_plus_Black_with_Silver_image, "splendor plus Black with Silver image");

		Custom_click(splendor_plus_Black_with_Red_button, " splendor plus Black with Red image button");
		Thread.sleep(1000);
		VerifyImagePresent(splendor_plus_Black_with_Red_image, " splendor plus Black with Red image");

		Custom_click(splendor_plus_Matte_Shield_Gold_button, " splendor plus Matte Shield Gold image button");
		Thread.sleep(1000);
		VerifyImagePresent(splendor_plus_Matte_Shield_Gold_image, "splendor plus Matte Shield Gold image");

		Custom_click(splendor_plus_Black_with_Purple_button, " splendor plus Black with Purple image button");
		Thread.sleep(1000);
		VerifyImagePresent(splendor_plus_Black_with_Purple_image, " splendor plus Black with Purple image");

		Custom_click(splendor_plus_Heavy_Grey_Green_button, " splendor plus Heavy Grey Green image button");
		Thread.sleep(1000);
		VerifyImagePresent(splendor_plus_Heavy_Grey_Green_image, "splendor plus Heavy Grey Green image");

		Custom_click(splendor_plus_Firefly_Golden_button, " splendor plus Firefly Golden image button");
		Thread.sleep(1000);
		VerifyImagePresent(splendor_plus_Firefly_Golden_image, "splendor plus Firefly Golden image");

		Custom_click(splendor_plus_Beetle_Red_button, " splendor plus Beetle Red image button");
		Thread.sleep(1000);
		VerifyImagePresent(splendor_plus_Beetle_Red_image, " splendor plus Beetle Red image");

		Custom_click(splendor_plus_Bumble_Bee_Yellow_button, " splendor plus Bumble Bee Yellow image button");
		Thread.sleep(1000);
		VerifyImagePresent(splendor_plus_Bumble_Bee_Yellow_image, " splendor plus Bumble Bee Yellow image");
	}

	public WebElement view_detail_button_splendor_plus() {
		return view_detail_button_splendor_plus;
	}

	public WebElement book_now_button_splendor_plus() {
		return book_now_button_splendor_plus;
	}

	public WebElement splendor_plus_close_button() {
		return splendor_plus_close_button;
	}

//=============== Practical page SplendorPlus XTec========================================///////// 

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/SPLENDOR-XTEC.png']")
	public WebElement splendorXTec_bike_image;
	@FindBy(xpath = "//h2[@class=\"newhead\"]/following::li[@data-target=\"#SplendorXtec\"]")
	private WebElement splendorXTec_quickview;
	@FindBy(xpath = "//h2[normalize-space()='SPLENDOR+ XTEC']")
	private WebElement heading_splendorXTec;
	@FindBy(xpath = "(//a[@data-color='Sparkling Blue'])[2]")
	private WebElement splendorXTec_SparklingBlue_button;
	@FindBy(xpath = "(//a[@data-color='Tornado Grey'])[2]")
	private WebElement splendorXTec_TornadoGrey_button;
	@FindBy(xpath = "(//a[@data-color='Pearl White'])[2]")
	private WebElement splendorXTec_PearlWhite_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/360-images/sparkling-blue-renamed/1.png'])[2]")
	private WebElement splendorXTec_SparklingBlue_image;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/color-switch/TORNADOGREY.png'])[2]")
	private WebElement splendorXtec_TornadoGrey_image;
	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/360-images/pearl-white-renamed/1.png'])[2]")
	private WebElement splendorXTec_pearlWhite_image;

	@FindBy(xpath = "(//div[@id='container-809719bdc1']//a[normalize-space()='View Details'])[1]")
	private WebElement viewdetail_bttn_splendorXTec;
	@FindBy(xpath = "(//div[@id='container-809719bdc1']//a[normalize-space()='Book Now'])[1]")
	private WebElement booknow_bttn_splendorXTec;
	@FindBy(xpath = "//div[@id='SplendorXtec']//button")
	private WebElement splendorXTec_close_bttn;

	public WebElement splendorPlusXTec_bike_image() {
		return splendorXTec_bike_image;
	}

	public WebElement splendorPlusXTec_quickView() {
		return splendorXTec_quickview;
	}

	public WebElement heading_splendorPlusXTec() {
		return heading_splendorXTec;
	}

	public void all_bike_image_button_for_splendorPlusXtec() throws Exception {
		Custom_click(splendorXTec_SparklingBlue_button, " splendorPlusXtec sparkling Blue image button");
		VerifyImagePresent(splendorXTec_SparklingBlue_image, "splendorPlusXtec Sparkling Blue image");

		Wait(splendorXTec_TornadoGrey_button);
		Custom_click(splendorXTec_TornadoGrey_button, " splendorPlusXTec Tornado Grey image button");
		Wait(splendorXtec_TornadoGrey_image);
		VerifyImagePresent(splendorXtec_TornadoGrey_image, "splendorPlusXtec Tornado Grey image");

		Wait(splendorXTec_PearlWhite_button);
		Custom_click(splendorXTec_PearlWhite_button, " splendorPlusXTec image button");
		Wait(splendorXTec_pearlWhite_image);
		Thread.sleep(1000);
		VerifyImagePresent(splendorXTec_pearlWhite_image, "splendorPlusXTec Pear White Image");

	}

	public WebElement viewDetail_button_splendorPlusXtec() {
		return viewdetail_bttn_splendorXTec;
	}

	public WebElement bookNow_bttn_splendorPlusXtec() {
		return booknow_bttn_splendorXTec;
	}

	public WebElement splendorPlusXtec_close_bttn() {
		return splendorXTec_close_bttn;
	}

//********************************* all bikes images in Practical section**********************

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus.png']")
	private WebElement splendorPlusImage;
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec.png']")
	private WebElement splendorPlusXTecImage;
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/deluxe-1.png']")
	private WebElement HFDeluxeImage;
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-100.png']")
	private WebElement HF100Image;

	public WebElement SplendorPlus_Image() {
		return splendorPlusImage;
	}

	public WebElement SplendorPlusXtec_Image() {
		return splendorPlusXTecImage;
	}

	public WebElement HFDeluxe_Image() {
		return HFDeluxeImage;
	}

	public WebElement HF100_Image() {
		return HF100Image;
	}

//======****** ALL LINKS *******============//

	@FindBy(xpath = "(//div[@class='megamenu-option-box']//p[contains(text(), 'SPLENDOR+ ')])[1]")
	private WebElement splendorPlus_name;
	@FindBy(xpath = "(//div[@class='megamenu-option-box']//p[contains(text(), 'SPLENDOR+ ')]//span)[1]")
	private WebElement splendorPlus_100ccText;
	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'SPLENDOR+ XTEC ')]")
	private WebElement splendorXTec_name;
	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'SPLENDOR+ XTEC ')]//span")
	private WebElement splendorXTec_100ccText;
	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'HF DELUXE ')]")
	private WebElement HFDeluxe_name;
	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'HF DELUXE ')]//span")
	private WebElement HFDeluxe_100ccText;
	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'HF 100')]")
	private WebElement HF100_name;
	@FindBy(xpath = "//div[@class='megamenu-option-box']//p[contains(text(), 'HF 100')]//span")
	private WebElement HF100_100ccText;

	public WebElement click_splendorplusText() {
		return splendorPlus_name;
	}

	public WebElement click_splendorplus_100ccText() {
		return splendorPlus_100ccText;
	}

	public WebElement click_splendorplusXTecText() {
		return splendorXTec_name;
	}

	public WebElement click_splendorplusXTec_100ccText() {
		return splendorXTec_100ccText;
	}

	public WebElement click_HFDeluxe_Text() {
		return HFDeluxe_name;
	}

	public WebElement click_HFDeluxe_100ccText() {
		return HFDeluxe_100ccText;
	}

	public WebElement click_HF100_Text() {
		return HF100_name;
	}

	public WebElement click_HF100_100ccText() {
		return HF100_100ccText;
	}

//=====**********all header navigation tabs*******==========//

	@FindBy(xpath = "//div[@class='w-100']//ul//li")
	private List<WebElement> hedersBikes;

	public void click_headerBikes() {

		System.out.println(hedersBikes.size());
		try {

			for (int i = 0; i < hedersBikes.size(); i++) {
				Wait(hedersBikes.get(i));
				VerifyElementPresent(hedersBikes.get(i), " bike tab");
				//Custom_click(hedersBikes.get(i), "Bike " + (i + 1));
				Thread.sleep(2000);
				PageLoaded();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@FindBy(xpath = "//ul[@id='productpageheader-42a3832cbe']//a[normalize-space()='HF Deluxe']")
	private WebElement HFDeluxe;

	public WebElement HFDeluxe_headerTab() {
		return HFDeluxe;
	}

	@FindBy(xpath = "//ul[@class='header__brand--navbar d-flex align-items-center justify-content-sm-start justify-content-lg-center']//li")
	private List<WebElement> navbarTabs;

	public void click_navbarTabs() {

		System.out.println(navbarTabs.size());
		try {
			Thread.sleep(2000);

			for (int i = 0; i < navbarTabs.size(); i++) {
				Wait(navbarTabs.get(i));
				VerifyElementPresent(navbarTabs.get(i), "Nav header tabs");
				Custom_click(navbarTabs.get(i), "Nav-Bar Clickable " + (i + 1));
				Thread.sleep(2000);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//********* OverView*******************//

	@FindBy(xpath = "//a[contains(text(),'Request Call Back')]")
	private WebElement reqCallbk; // button on banner

	@FindBy(xpath = "(//a[contains(text(),'Request Call Back')])[2]")
	private WebElement reqCallbk1; // button on banner
	
	@FindBy(xpath = "(//a[contains(text(),'Request Call Back')])[1]")
	private WebElement reqCallbk2; // button on banner

	@FindBy(xpath = "//b[contains(text(),'Request a CallBack ')]")
	private WebElement reqCallbk_Popup;

	@FindBy(xpath = "(//input[@placeholder='Name'])[2]")
	private WebElement reqCallbk_name;

	@FindBy(xpath = "(//input[@name='mobileno'])[2]")
	private WebElement reqCallbk_mobile;

	@FindBy(xpath = "(//input[@name='otp'])[2]")
	private WebElement reqCallbk_otp;

	@FindBy(xpath = "(//form[@id='book-test-drive-form2']//button[@id='stateDropdown'])[2]")
	private WebElement reqCallbk_stateDD;

	@FindBy(xpath = "(//form[@id='book-test-drive-form2']//ul//li//a[contains(text(),'Rajasthan')])[2]")
	private WebElement reqCallbk_selectState;

	@FindBy(xpath = "(//form[@id='book-test-drive-form2']//button[@id='cityDropdown'])[2]")
	private WebElement reqCallbk_cityDD;

	@FindBy(xpath = "//form[@id='book-test-drive-form2']//ul//li//a[contains(text(),'Alwar')]")
	private WebElement reqCallbk_selectCity;

	@FindBy(xpath = "(//input[@value='Submit'])[2]")
	private WebElement reqCallbk_submit;

	@FindBy(xpath = "//a[@class='btn booknow-btn']")
	private WebElement overview_booknow;

	@FindBy(xpath = "//li[@class='item product']//strong")
	private WebElement BikeNameHeader;

	@FindBy(xpath = "//h1[@class='page-title']//span")
	private WebElement BikeNameTitle;

	public WebElement RequestCB_bttn_bannerMotorcycle() {
		return reqCallbk;
	}

	public WebElement RequestCB1_bttn_bannerMotorcycle() {
		return reqCallbk1;
	}

	public WebElement RequestCB2_bttn_bannerMotorcycle_passionPlus() {
		return reqCallbk2;
	}
	
	public WebElement RequestCB_bttn_PopUpMotorcycle() {
		return reqCallbk_Popup;
	}

	public WebElement RequestCB_name_Motorcycle() {
		return reqCallbk_name;
	}

	public WebElement RequestCB_Mobile_Motorcycle() {
		return reqCallbk_mobile;
	}

	public WebElement RequestCB_otp_Motorcycle() {
		return reqCallbk_otp;
	}

	public WebElement RequestCB_stateDD_Motorcycle() {
		return reqCallbk_stateDD;
	}

	public WebElement RequestCB_selectState_Motorcycle() {
		return reqCallbk_selectState;
	}

	public WebElement RequestCB_cityDD_Motorcycle() {
		return reqCallbk_cityDD;
	}

	public WebElement RequestCB_selectCity_Motorcycle() {
		return reqCallbk_selectCity;
	}

	public WebElement RequestCB_ClickSubmit_Motorcycle() {
		return reqCallbk_submit;
	}

	public WebElement overview_ClickBookNow_Motorcycle() {
		return overview_booknow;
	}

	public WebElement getBikeName_Header() {
		return BikeNameHeader;
	}

	public WebElement getBikeName_Title() {
		return BikeNameTitle;
	}

//********** Feature carousels********* /////////////

	@FindBy(xpath = "//a[normalize-space()='FEATURES']")
	private WebElement FeatureTab;

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/brand/design/icons/product-header/features-icon.svg']")
	private WebElement FeatureIcon;

	@FindBy(xpath = "//div[@id='FEATURES']//h2")
	private WebElement FeatureheadingText;

	public WebElement Feature_Tab() {
		return FeatureTab;
	}

	public WebElement Feature_Icon() {
		return FeatureIcon;
	}

	public WebElement Feature_headingText() {
		return FeatureheadingText;
	}

	@FindBy(xpath = "//div[@class='splender-feature-slider slick-initialized slick-slider']//button[@class='slick-prev slick-arrow']")
	private WebElement leftCarousel;

	@FindBy(xpath = "//div[@class='splender-feature-slider slick-initialized slick-slider']//button[@class='slick-next slick-arrow']")
	private WebElement rightCarousel;

//************** feature BookATestRide **********************

	@FindBy(xpath = "(//div[@class='book-test-drive-heading text-center mt-4']//h3)[1]")
	private WebElement bookTestRide_text;

	@FindBy(xpath = "(//input[@placeholder='Name'])[1]")
	private WebElement bookTestRide_name;

	@FindBy(xpath = "(//input[@name='mobileno'])[1]")
	private WebElement bookTestRide_mobilenum;

	@FindBy(xpath = "(//input[@name='otp'])[1]")
	private WebElement bookTestRide_otp;

	@FindBy(xpath = "(//form[@id='book-test-drive-form2']//button[@id='stateDropdown'])[1]")
	private WebElement bookTestRide_stateDD;

	@FindBy(xpath = "(//form[@id='book-test-drive-form2']//ul//li//a[contains(text(),'Tripura')])[1]")
	private WebElement bookTestRide_selectState;

	@FindBy(xpath = "(//form[@id='book-test-drive-form2']//button[@id='cityDropdown'])[1]")
	private WebElement bookTestRide_cityDD;

	@FindBy(xpath = "//form[@id='book-test-drive-form2']//ul//li//a[contains(text(),'agartala')]")
	private WebElement bookTestRide_selectCity;

	@FindBy(xpath = "(//input[@value='Submit'])[1]")
	private WebElement bookTestRide_submit;

	public WebElement BTR_HeadingText() {
		return bookTestRide_text;
	}

	public WebElement BTR_name() {
		return bookTestRide_name;
	}

	public WebElement BTR_mobileNum() {
		return bookTestRide_mobilenum;
	}

	public WebElement BTR_otp() {
		return bookTestRide_otp;
	}

	public WebElement BTR_StateDD() {
		return bookTestRide_stateDD;
	}

	public WebElement BTR_selectState() {
		return bookTestRide_selectState;
	}

	public WebElement BTR_CityDD() {
		return bookTestRide_cityDD;
	}

	public WebElement BTR_citySelect() {
		return bookTestRide_selectCity;
	}

	public WebElement BTR_submitBttn() {
		return bookTestRide_submit;
	}

//************** Specification  ****************

	@FindBy(xpath = "//a[normalize-space()='Specifications']")
	private WebElement specificationTab;

	public WebElement specification_headerTab() {
		return specificationTab;
	}

	@FindBy(xpath = "//div[@class='specification-wrapper']//h3")
	private WebElement specificationText;

	public WebElement specification_headingText() {
		return specificationText;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagespecifications/icons/engine-white-icon.svg']")
	private WebElement HFDengineIcon;

	public WebElement HF_Deluxe_Engine_Icon() {
		return HFDengineIcon;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-100/image-specification/icons/engine-white-icon.svg']")
	private WebElement HF100engineIcon;

	public WebElement HF_100_Engine_Icon() {
		return HF100engineIcon;
	}

	@FindBy(xpath = "//p[normalize-space()='Engine']")
	private WebElement engineTab;

	public WebElement Engine_Tab() {
		return engineTab;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-deluxe/_jcr_content/root/container/container_2137187117/generictab_copy/tab-0/imagespecification.coreimg.png/1663257003179/engine.png']")
	private WebElement HFDengineImage;

	public WebElement HFDeluxe_Engine_Image() {
		return HFDengineImage;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-100/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-0/imagespecification.coreimg.png/1663256843191/engine.png']")
	private WebElement HF100engineImage;

	public WebElement HF100_Engine_Image() {
		return HF100engineImage;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus/_jcr_content/root/container/container_2137187117/generictab_copy/tab-0/imagespecification.coreimg.png/1662705946494/1-engine-splendor-plus-speccification-221-x-213pxl-07.png']")
	private WebElement SplendorPlus_engineImage;

	public WebElement SplendorPlus_Engine_Image() {
		return SplendorPlus_engineImage;
	}

//splendorXtec=Engine
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus-xtec/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-0/imagespecification.coreimg.png/1662704791113/1-engine-221x213pix-0000-bikes-speccification-386-x-288pxl-01.png']")
	private WebElement SplendorPlusXtec_engineImage;

	public WebElement SplendorPlusXtec_Engine_Image() {
		return SplendorPlusXtec_engineImage;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagespecifications/icons/chassi-grey-icon.svg']")
	private WebElement HFDtransmissionIcon;

	public WebElement HF_Deluxe_Transmission_Icon() {
		return HFDtransmissionIcon;
	}

	@FindBy(xpath = "//p[normalize-space()='Transmission & Chassis']")
	private WebElement transmissionTab;

	public WebElement Transmission_Tab() {
		return transmissionTab;
	}

// === splendorplusXtec
	@FindBy(xpath = "//p[normalize-space()='Chassis']")
	private WebElement spXtec_transmissionTab;

	public WebElement SpXtec_Transmission_Tab() {
		return spXtec_transmissionTab;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-deluxe/_jcr_content/root/container/container_2137187117/generictab_copy/tab-1/imagespecification.coreimg.png/1663049382605/transmission-and-chassis.png']")
	private WebElement HFDtransmissionImage;

	public WebElement HFDeluxe_Transmission_Image() {
		return HFDtransmissionImage;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-100/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-1/imagespecification_1669840459.coreimg.png/1663049757679/transmission-and-chassis.png']")
	private WebElement HF100transmissionImage;

	public WebElement HF100_Transmission_Image() {
		return HF100transmissionImage;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus/_jcr_content/root/container/container_2137187117/generictab_copy/tab-1/imagespecification.coreimg.png/1662706014944/2-transmission-and-chassis-splendor-plus-speccification-221-x-213pxl-06.png']")
	private WebElement SplendorPlus_transmissionImage;

	public WebElement SplendorPlus_Transmission_Image() {
		return SplendorPlus_transmissionImage;
	}

//splendorXtec-transmissionImage

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus-xtec/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-3/imagespecification.coreimg.png/1662704791307/2-transmission-and-chassis165mm-ground-clearance-copy.png']")
	private WebElement SplendorPlusXtec_transmissionImage;

	public WebElement SplendorPlusXtec_Transmission_Image() {
		return SplendorPlusXtec_transmissionImage;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagespecifications/icons/suspension-grey-icon.svg']")
	private WebElement HFDsuspensionIcon;

	public WebElement HFDeluxe_Suspension_Icon() {
		return HFDsuspensionIcon;
	}

	@FindBy(xpath = "//p[normalize-space()='Suspension']")
	private WebElement suspensionTab;

	public WebElement Suspension_Tab() {
		return suspensionTab;
	}

//splendorXtec=== suspension tab
	@FindBy(xpath = "//p[normalize-space()='Suspensions']")
	private WebElement SpXtec_suspensionTab;

	public WebElement SpXtec_Suspension_Tab() {
		return SpXtec_suspensionTab;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-deluxe/_jcr_content/root/container/container_2137187117/generictab_copy/tab-2/imagespecification.coreimg.png/1663049417280/suspension.png']")
	private WebElement HFDsuspensionImage;

	public WebElement HFDeluxe_Suspension_Image() {
		return HFDsuspensionImage;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-100/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-2/imagespecification.coreimg.png/1663049799251/suspension.png']")
	private WebElement HF100suspensionImage;

	public WebElement HF100_Suspension_Image() {
		return HF100suspensionImage;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus/_jcr_content/root/container/container_2137187117/generictab_copy/tab-2/imagespecification.coreimg.png/1662706048091/3-suspension-splendor-plus-speccification-221-x-213pxl-03.png']")
	private WebElement SplendorPlus_suspensionImage;

	public WebElement SplendorPlus_Suspension_Image() {
		return SplendorPlus_suspensionImage;
	}

//SplnderXtec suspnsn Image
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus-xtec/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-2/imagespecification.coreimg.png/1662704791057/3-suspension-221x213pix-0003-bikes-speccification-386-x-288pxl-04.png']")
	private WebElement SplendorPlusXtec_suspensionImage;

	public WebElement SplendorPlusXtec_Suspension_Image() {
		return SplendorPlusXtec_suspensionImage;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagespecifications/icons/brakes-grey-icon.svg']")
	private WebElement HFDbrakesIcon;

	public WebElement HF_Deluxe_Brakes_Icon() {
		return HFDbrakesIcon;
	}

	@FindBy(xpath = "//p[normalize-space()='Brakes']")
	private WebElement brakesTab;

	public WebElement Brakes_Tab() {
		return brakesTab;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-deluxe/_jcr_content/root/container/container_2137187117/generictab_copy/tab-3/imagespecification.coreimg.png/1663049455047/brake.png']")
	private WebElement HFDbrakesImg;

	public WebElement HFDeluxe_Brakes_Img() {
		return HFDbrakesImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-100/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-3/imagespecification.coreimg.png/1663049851772/brake.png']")
	private WebElement HF100brakesImg;

	public WebElement HF100_Brakes_Img() {
		return HF100brakesImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus/_jcr_content/root/container/container_2137187117/generictab_copy/tab-3/imagespecification.coreimg.png/1662706084901/4-brakes-splendor-plus-speccification-221-x-213pxl-01.png']")
	private WebElement SplendorPlus_brakesImg;

	public WebElement SplendorPlus_Brakes_Img() {
		return SplendorPlus_brakesImg;
	}

//spndrXtec Brake img

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus-xtec/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-4/imagespecification.coreimg.png/1662704791222/4-brakes-221x213pix-0001-splendor--integrated-braking-system-copy.png']")
	private WebElement SplendorPlusXtec_brakesImg;

	public WebElement SplendorPlusXtec_Brakes_Img() {
		return SplendorPlusXtec_brakesImg;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagespecifications/icons/wheel-tyers-icon.svg']")
	private WebElement HFDwheelsTyresIcon;

	public WebElement HF_Deluxe_wheels_and_tyres_Icon() {
		return HFDwheelsTyresIcon;
	}

	@FindBy(xpath = "//p[normalize-space()='Wheels & Tyres']")
	private WebElement wheelsTyresTab;

	public WebElement Wheels_and_tyres_Tab() {
		return wheelsTyresTab;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-deluxe/_jcr_content/root/container/container_2137187117/generictab_copy/tab-4/imagespecification.coreimg.png/1663049495892/wheels-and-tyres.png']")
	private WebElement HFDwheelsTyresImg;

	public WebElement HFDeluxe_Wheels_and_tyres_Img() {
		return HFDwheelsTyresImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-100/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-4/imagespecification_322802938.coreimg.png/1663049886841/wheels-and-tyres.png']")
	private WebElement HF100_wheelsTyresImg;

	public WebElement HF100_Wheels_and_tyres_Img() {
		return HF100_wheelsTyresImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus/_jcr_content/root/container/container_2137187117/generictab_copy/tab-4/imagespecification.coreimg.png/1662706129531/5-wheels-and-tyres-splendor-plus-speccification-221-x-213pxl-05.png']")
	private WebElement SplendorPlus_wheelsTyresImg;

	public WebElement SplendorPlus_Wheels_and_tyres_Img() {
		return SplendorPlus_wheelsTyresImg;
	}

//spnldrXtec Wheels tyres img
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus-xtec/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-1/imagespecification.coreimg.png/1662704791178/5-wheels-and-tyres-221x213pix-0005-splendortubeless-tyres-copy.png']")
	private WebElement SplendorPlusXtec_wheelsTyresImg;

	public WebElement SplendorPlusXtec_Wheels_and_tyres_Img() {
		return SplendorPlusXtec_wheelsTyresImg;
	}

//    

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagespecifications/icons/electric-grey-icon.svg']")
	private WebElement HFDelectricalIcon;

	public WebElement HF_Deluxe_Elecetrical_Icon() {
		return HFDelectricalIcon;
	}

	@FindBy(xpath = "//p[normalize-space()='Electricals']")
	private WebElement electricalTab;

	public WebElement Electrical_Tab() {
		return electricalTab;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-deluxe/_jcr_content/root/container/container_2137187117/generictab_copy/tab-5/imagespecification_2022889767.coreimg.png/1663049528287/electricals.png']")
	private WebElement HFDelectricalImg;

	public WebElement HFDeluxe_Electrical_Img() {
		return HFDelectricalImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-100/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-5/imagespecification.coreimg.png/1663049911298/electricals.png']")
	private WebElement HF100electricalImg;

	public WebElement HF100_Electrical_Img() {
		return HF100electricalImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus/_jcr_content/root/container/container_2137187117/generictab_copy/tab-5/imagespecification.coreimg.png/1662706163682/6-electricals-splendor-plus-speccification-221-x-213pxl-02.png']")
	private WebElement SplendorPlus_electricalImg;

	public WebElement SplendorPlus_Electrical_Img() {
		return SplendorPlus_electricalImg;
	}

//spnldrXtec electrical Img
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus-xtec/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-5/imagespecification.coreimg.png/1662704790988/6-electricals-221x213pix-0002-bikes-speccification-386-x-288pxl-03.png']")
	private WebElement SplendorPlusXtec_electricalImg;

	public WebElement SplendorPlusXtec_Electrical_Img() {
		return SplendorPlusXtec_electricalImg;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/imagespecifications/icons/dimension-grey-icon.svg']")
	private WebElement HFDdimensionIcon;

	public WebElement HF_Deluxe_Dimension_Icon() {
		return HFDdimensionIcon;
	}

	@FindBy(xpath = "//p[normalize-space()='Dimensions']")
	private WebElement dimensionTab;

	public WebElement Dimension_Tab() {
		return dimensionTab;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-deluxe/_jcr_content/root/container/container_2137187117/generictab_copy/tab-6/imagespecification.coreimg.png/1663049561003/dimensions.png']")
	private WebElement HFDdimensionImg;

	public WebElement HFDeluxe_Dimension_Img() {
		return HFDdimensionImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-100/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-6/imagespecification.coreimg.png/1663049942814/dimensions.png']")
	private WebElement HF100dimensionImg;

	public WebElement HF100_Dimension_Img() {
		return HF100dimensionImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus/_jcr_content/root/container/container_2137187117/generictab_copy/tab-6/imagespecification.coreimg.png/1662706196056/7-dimensions-splendor-plus-speccification-221-x-213pxl-04.png']")
	private WebElement SplendorPlus_dimensionImg;

	public WebElement SplendorPlus_Dimension_Img() {
		return SplendorPlus_dimensionImg;
	}

//splndr Xtec Dimension Image

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus-xtec/_jcr_content/root/container/container_2137187117/generictab_copy_copy/tab-6/imagespecification.coreimg.png/1662704791346/7-dimensions-221x213pix-0004-bikes-speccification-386-x-288pxl-05.png']")
	private WebElement SplendorPlusXtec_dimensionImg;

	public WebElement SplendorPlusXtec_Dimension_Img() {
		return SplendorPlusXtec_dimensionImg;
	}

//******************* HF deluxe Price***********************************************************

	@FindBy(xpath = "//a[normalize-space()='PRICE']//span")
	private WebElement PriceTab;

	public WebElement Price_Tab() {
		return PriceTab;
	}

	@FindBy(xpath = "//i[@class='hero-icon me-4 heroicon-wallet-money']")
	private WebElement PriceIcon;

	public WebElement Price_Icon() {
		return PriceIcon;
	}

	@FindBy(xpath = "//div[@class='price-listing__row-col--heading text-sm-start text-center pb-5 pb-sm-16']//h2")
	private WebElement PriceHeading;

	public WebElement Price_Heading() {
		return PriceHeading;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/price-info/hf-deluxe-web.png']")
	private WebElement PriceBikeImg_HFD;

	public WebElement Price_HFDeluxe_BikeImg() {
		return PriceBikeImg_HFD;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-100/price-info/Price%20section-%20web%20504x504.png']")
	private WebElement PriceBikeImg_HF100;

	public WebElement Price_HF100_BikeImg() {
		return PriceBikeImg_HF100;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/price-info/price-web.png']")
	private WebElement PriceBikeImg_SplendorPlus;

	public WebElement Price_SplendorPlus_BikeImg() {
		return PriceBikeImg_SplendorPlus;
	}

//splndrPlusXtec
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/price-info/Price-section-web.png']")
	private WebElement PriceBikeImg_SplendorPlusXtec;

	public WebElement Price_SplendorPlusXtec_BikeImg() {
		return PriceBikeImg_SplendorPlusXtec;
	}

	@FindBy(xpath = "(//div[@class='react-select__input-container css-19bb58m'])[3]")
	private WebElement price_stateDD;

	public WebElement Price_StateDD() {
		return price_stateDD;
	}

	@FindBy(xpath = "//li[@value='cd']//a")
	private WebElement price_selectState1;

	public WebElement Price_SelectState1() {
		return price_selectState1;
	}

//select another state to check change in price
	@FindBy(xpath = "//li[@value='as']//a")
	private WebElement price_selectState2;

	public WebElement Price_SelectState2() {
		return price_selectState2;
	}

	@FindBy(xpath = "(//div[@class='react-select__input-container css-19bb58m'])[4]")
	private WebElement price_cityDD;

	public WebElement Price_CityDD() {
		return price_cityDD;
	}

	@FindBy(xpath = "//li[@value='chandigarh']//a")
	private WebElement price_selectCity1;

	public WebElement Price_SelectCity1() {
		return price_selectCity1;
	}

//another city according to another state

	@FindBy(xpath = "//li[@value='guwahati']//a")
	private WebElement price_selectCity;

	public WebElement Price_SelectCity2() {
		return price_selectCity;
	}

	@FindBy(xpath = "//div[@class='prise-form-content w-auto']//li//h4")
	private List<WebElement> Variant_and_Price;

	public void check_Variant_and_priceText() {

		System.out.println(Variant_and_Price.size());
		try {
//		Thread.sleep(2000);

			for (int i = 0; i < Variant_and_Price.size(); i++) {
				Thread.sleep(1000);
				Wait(Variant_and_Price.get(i));
				VerifyElementPresent(Variant_and_Price.get(i), "Variant and ExShm-Price Text>>> ");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@FindBy(xpath = "//div[@class='prise-form-content w-auto']//li//p")
	private List<WebElement> allVariantPrice;

	public void check_all_Variants_Price() {

		System.out.println(allVariantPrice.size());
		try {

			for (int i = 0; i < allVariantPrice.size(); i++) {
				Thread.sleep(1000);
				Wait(allVariantPrice.get(i));
				VerifyElementPresent(allVariantPrice.get(i), "Variant and ExShm-Price");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@FindBy(xpath = "//div[@class='common-cta d-none d-lg-inline-block']//a")
	private WebElement price_BookNow;

	public WebElement Price_BookNow() {
		return price_BookNow;
	}

	// ******************* COMPARE ********************

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/brand/design/icons/product-header/compare-icon.svg']")
	private WebElement compareIcon;

	public WebElement CompareIcon() {
		return compareIcon;
	}

	@FindBy(xpath = "//a[normalize-space()='COMPARE']")
	private WebElement compareTab;

	public WebElement CompareTab() {
		return compareTab;
	}

	@FindBy(xpath = "//div[@class='compare-bike-info']//h3")
	private WebElement compareHeading;

	public WebElement Compare_Heading() {
		return compareHeading;
	}

	@FindBy(xpath = "(//div[@class='compare-bike-common-div variant']//p)[1]")
	private WebElement compare_bikeName1;

	public WebElement Compare_BikeName1() {
		return compare_bikeName1;
	}

	@FindBy(xpath = "(//div[@class='compare-bike-common-div variant']//p)[2]")
	private WebElement compare_bikeName2;

	public WebElement Compare_BikeName2() {
		return compare_bikeName2;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/productcompare/leftside-web.png']")
	private WebElement HFD_compare_bikeImg1;

	public WebElement HFD_Compare_BikeIMG1() {
		return HFD_compare_bikeImg1;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/productcompare/rightside-web.png']")
	private WebElement HFD_compare_bikeImg2;

	public WebElement HFD_Compare_BikeIMG2() {
		return HFD_compare_bikeImg2;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-100/product-compare/web/Hf%20Deluxe%20100_269x402pxl_Left%20image.png']")
	private WebElement HF100_compare_bikeImg1;

	public WebElement HF100_Compare_BikeIMG1() {
		return HF100_compare_bikeImg1;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-100/product-compare/web/Hf%20Deluxe_269x402pxl%20Right%20image.png']")
	private WebElement HF100_compare_bikeImg2;

	public WebElement HF100_Compare_BikeIMG2() {
		return HF100_compare_bikeImg2;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/product-compare/leftweb.png']")
	private WebElement SplendorPlus_compare_bikeImg1;

	public WebElement SplendorPlus_Compare_BikeIMG1() {
		return SplendorPlus_compare_bikeImg1;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-100/product-compare/web/Hf%20Deluxe_269x402pxl%20Right%20image.png']")
	private WebElement SplendorPlus_compare_bikeImg2;

	public WebElement SplendorPlus_Compare_BikeIMG2() {
		return SplendorPlus_compare_bikeImg2;
	}

	// splndrXtec-compare

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/compare/Splendor-Plus-Xtec-left.png']")
	private WebElement SplendorPlusXtec_compare_bikeImg1;

	public WebElement SplendorPlusXtec_Compare_BikeIMG1() {
		return SplendorPlusXtec_compare_bikeImg1;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/productcompare/rightside-web.png']")
	private WebElement SplendorPlusXtec_compare_bikeImg2;

	public WebElement SplendorPlusXtec_Compare_BikeIMG2() {
		return SplendorPlusXtec_compare_bikeImg2;
	}

	@FindBy(xpath = "//div[@class='compare-bike-common-div']//p")
	private List<WebElement> compareBikes;

	public void Compare2Bikes() {

		System.out.println(compareBikes.size());
		try {

			for (int i = 0; i < compareBikes.size(); i++) {
				Wait(compareBikes.get(i));
				VerifyElementPresent(compareBikes.get(i), "Comparision");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// *********** FIND DEALER **************

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/brand/design/icons/product-header/find-dealer-icon.svg']")
	private WebElement findDealerIcon;

	public WebElement FindDealer_Icon() {
		return findDealerIcon;
	}

	@FindBy(xpath = "//a[normalize-space()='FIND DEALER']")
	private WebElement findDealerTab;

	public WebElement FindDealer_Tab() {
		return findDealerTab;
	}

	@FindBy(xpath = "//div[@class='near-you-left']//h3")
	private WebElement FindDealer_Heading1;

	public WebElement FindDealer_HeadingLeft() {
		return FindDealer_Heading1;
	}

	@FindBy(xpath = "(//div[@class='near-you-right']//h3)[1]")
	private WebElement FindDealer_Heading2;

	public WebElement FindDealer_HeadingRight() {
		return FindDealer_Heading2;
	}

	@FindBy(xpath = "//form[@class='near-you-form']//button[@id='stateDropdown']")
	private WebElement findDealer_stateDD;

	public WebElement FindDealer_stateDD() {
		return findDealer_stateDD;
	}

	@FindBy(xpath = "//li[@value='HR']")
	private WebElement findDealer_selectState;

	public WebElement FindDealer_selectState() {
		return findDealer_selectState;
	}

//	(//li[@value='AS'])[2]

	@FindBy(xpath = "//form[@class='near-you-form']//button[@id='cityDropdown']")
	private WebElement findDealer_cityDD;

	public WebElement FindDealer_CityDD() {
		return findDealer_cityDD;
	}

	@FindBy(xpath = "//form[@class='near-you-form']//a[normalize-space()='gurgaon']")
	private WebElement findDealer_selectCity;

	public WebElement FindDealer_selectCity() {
		return findDealer_selectCity;
	}

	@FindBy(xpath = "//div[@class='near-you-info']//h3")
	private List<WebElement> dealersName;

	@FindBy(xpath = "//div[@class='near-you-info']//p")
	private List<WebElement> dealersAddress;

	public void DealersName() {

		System.out.println(dealersName.size());
		try {

			for (int i = 0; i < dealersName.size(); i++) {
				Wait(dealersName.get(i));
				VerifyElementPresent(dealersName.get(i), "Name of Dealers");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// div[@class='near-you-info']//p

	// *******************exchange ********************************

	@FindBy(xpath = "//div[@class='hero-exchange-head-content']//h4")
	private WebElement exchangeH1;

	public WebElement Exchange_heading1() {
		return exchangeH1;
	}

	@FindBy(xpath = "//div[@class='hero-exchange-head-content']//p")
	private WebElement exchangeH2;

	public WebElement Exchange_heading2() {
		return exchangeH2;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-deluxe/_jcr_content/root/container/container_913571324/adbanner_copy_copy.coreimg.png/1664276155799/exchangesection.png']")
	private WebElement HFD_exchangeBikeImg;

	public WebElement HFD_Exchange_BikeImage() {
		return HFD_exchangeBikeImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/hf-100/_jcr_content/root/container/container_913571324/adbanner_copy_copy.coreimg.png/1663256870352/exchange-section--web-362x212.png']")
	private WebElement HF100_exchangeBikeImg;

	public WebElement HF100_Exchange_BikeImage() {
		return HF100_exchangeBikeImg;
	}

	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus/_jcr_content/root/container/container_913571324/adbanner_copy_copy.coreimg.png/1683942658863/exchange.png']")
	private WebElement SplendorPlus_exchangeBikeImg;

	public WebElement SplendorPlus_Exchange_BikeImage() {
		return SplendorPlus_exchangeBikeImg;
	}

	// spndrplusXtec
	@FindBy(xpath = "//img[@src='/en-in/motorcycles/practical/splendor-plus-xtec/_jcr_content/root/container/container_913571324/adbanner_copy_copy.coreimg.png/1663257060241/exchange-section--web.png']")
	private WebElement SplendorPlusXtec_exchangeBikeImg;

	public WebElement SplendorPlusXtec_Exchange_BikeImage() {
		return SplendorPlusXtec_exchangeBikeImg;
	}

	@FindBy(xpath = "//a[normalize-space()='EXCHANGE NOW']")
	private WebElement exchangeBttn;

	public WebElement Exchange_Button() {
		return exchangeBttn;
	}

//******************* EMI **************************//
	// AmountNeeded//
	@FindBy(xpath = "//h3[normalize-space()='Calculate EMI']")
	private WebElement emiHeading;

	public WebElement EMI_heading() {
		return emiHeading;
	}

	@FindBy(xpath = "//div[@class='payment-div']//h4")
	private WebElement paymentHeading;

	public WebElement Payment_Heading() {
		return paymentHeading;
	}

	@FindBy(xpath = "//div[@class='payment-div']//h3")
	private WebElement emipayment;

	public WebElement EMI_Payment() {
		return emipayment;
	}

	@FindBy(xpath = "(//div[@class='emi-range-input-div']//child::h4)[1]")
	private WebElement amtNeededText;

	public WebElement Amount_NeededText() {
		return amtNeededText;
	}

	@FindBy(xpath = "//input[@id='emiAmountTxt']")
	private WebElement amount_Val;

	public WebElement Amt_needed_Value() {
		return amount_Val;
	}

	@FindBy(xpath = "(//div[@class='emi-range-input-minmax']//p)[1]")
	private WebElement minAmount;

	public WebElement Min_AmtNeeded() {
		return minAmount;
	}

	@FindBy(xpath = "(//div[@class='emi-range-input-minmax']//p)[2]")
	private WebElement maxAmount;

	public WebElement Max_AmtNeeded() {
		return maxAmount;
	}

	@FindBy(xpath = "//div[@id='emiAmountSlider']//div[@class='noUi-touch-area']")
	private WebElement slider1;

	public WebElement Slider1() {
		return slider1;
	}

	// Interest//
	@FindBy(xpath = "(//div[@class='emi-range-input-div']//child::h4)[2]")
	private WebElement interestRateText;

	public WebElement InterestRate_Text() {
		return interestRateText;
	}

	@FindBy(xpath = "(//div[@class='emi-range-input-minmax']//p)[3]")
	private WebElement minInterest;

	public WebElement Min_Interest() {
		return minInterest;
	}

	@FindBy(xpath = "(//div[@class='emi-range-input-minmax']//p)[4]")
	private WebElement maxInterest;

	public WebElement Max_Interest() {
		return maxInterest;
	}

	@FindBy(xpath = "//input[@id='emiInterestRateTxt']")
	private WebElement interest_Val;

	public WebElement Interest_Value() {
		return interest_Val;
	}

	@FindBy(xpath = "//div[@id='emiInterestRateSlider']//div[@class='noUi-touch-area']")
	private WebElement slider2;

	public WebElement Slider2() {
		return slider2;
	}

	// Duration//
	@FindBy(xpath = "(//div[@class='emi-range-input-div']//child::h4)[3]")
	private WebElement durationText;

	public WebElement Duration_Text() {
		return durationText;
	}

	@FindBy(xpath = "(//div[@class='emi-range-input-minmax']//p)[5]")
	private WebElement minDuration;

	public WebElement Min_Duration() {
		return minDuration;
	}

	@FindBy(xpath = "(//div[@class='emi-range-input-minmax']//p)[6]")
	private WebElement maxDuration;

	public WebElement Max_Duartion() {
		return maxDuration;
	}

	@FindBy(xpath = "//input[@id='emiDurationTxt']")
	private WebElement Duration_Val;

	public WebElement Duration_Value() {
		return Duration_Val;
	}

	@FindBy(xpath = "//div[@id='emiDurationSlider']//div[@class='noUi-touch-area']")
	private WebElement slider3;

	public WebElement Slider3() {
		return slider3;
	}

//*************************************color and 360 View**********************************************//

	@FindBy(xpath = "//div[@class='explore-360-wrapper-main']//h3")
	private WebElement color360Heading;

	public WebElement color360_Heading() {
		return color360Heading;
	}

	@FindBy(xpath = "//a[@id='colorID']//p")
	private List<WebElement> colorText;

	public void Colors_Text() {

		System.out.println(colorText.size());
		try {

			for (int i = 0; i < colorText.size(); i++) {
				Wait(colorText.get(i));
				VerifyElementPresent(colorText.get(i), "Color : ");
				Wait(colorText.get(i));
				Custom_click(colorText.get(i), "text clickable  ");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/nexusblue.svg']")
	private WebElement colorNexusBlue;

	public WebElement colorSwitch_NexusBlue() {
		return colorNexusBlue;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/blackperple.svg']")
	private WebElement colorblackperple;

	public WebElement colorSwitch_BlackPurple() {
		return colorblackperple;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/blackred.svg']")
	private WebElement colorblackred;

	public WebElement colorSwitch_BlackRed() {
		return colorblackred;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-100/color-switch/black%20with%20red.png']")
	private WebElement hf100colorblackred;

	public WebElement HF100_colorSwitch_BlackRed() {
		return hf100colorblackred;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/technoblue.svg']")
	private WebElement colortechnoblue;

	public WebElement colorSwitch_TechnoBlue() {
		return colortechnoblue;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/candyred.svg']")
	private WebElement colorcandyred;

	public WebElement colorSwitch_CandyRed() {
		return colorcandyred;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/heavygrey.svg']")
	private WebElement colorheavygrey;

	public WebElement colorSwitch_HeavyGrey() {
		return colorheavygrey;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/hf-deluxe/colorswitch/heavygreen.svg']")
	private WebElement colorheavygreen;

	public WebElement colorSwitch_HeavyGreen() {
		return colorheavygreen;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/firefly-golden.svg']")
	private WebElement colorgold;

	public WebElement colorSwitch_Gold() {
		return colorgold;
	}

	// color Switch of splendor plus

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/360/Ruby%20Red.png']")
	private WebElement rubyRed;

	public WebElement colorSwitch_RubyRed() {
		return rubyRed;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/360/Sunshine%20Gold.png']")
	private WebElement sunshinegold;

	public WebElement colorSwitch_SunshineGold() {
		return sunshinegold;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/360/Butterfly%20Yellow.png']")
	private WebElement butterflyYellow;

	public WebElement colorSwitch_ButterflyYellow() {
		return butterflyYellow;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/icon%20resized.png']")
	private WebElement silverNexusBlue;

	public WebElement colorSwitch_SilverNexusBlue() {
		return silverNexusBlue;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/black-silver.png']")
	private WebElement blackSilver;

	public WebElement colorSwitch_BalckSilver() {
		return blackSilver;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/black-sportsred.png']")
	private WebElement blackRed;

	public WebElement colorSwitch_SplendorPlusBlackRed() {
		return blackRed;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/MATTE%20SHIELD%20GOLD.png']")
	private WebElement mattegold;

	public WebElement colorSwitch_MatteShieldGold() {
		return mattegold;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/black-purple.png']")
	private WebElement blackPurple;

	public WebElement colorSwitch_SplendorPlusBlackPurple() {
		return blackPurple;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/heavygrey-green.png']")
	private WebElement heavyGG;

	public WebElement colorSwitch_HeavyGreenGrey() {
		return heavyGG;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/beetle-red.svg']")
	private WebElement beetelRed;

	public WebElement colorSwitch_BeetelRed() {
		return beetelRed;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus/color-switch/bumble-bee-yellow.svg']")
	private WebElement bumbleBeeYellow;

	public WebElement colorSwitch_BumbleBeeYellow() {
		return bumbleBeeYellow;
	}

	@FindBy(xpath = "//ul[@class='nav nav-tabs explore-360-tab']")
	private WebElement verticalSlider;

	public WebElement VerticalSlider() {

		return verticalSlider;
	}

	// color SplderPlusXtec

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/color-switch/SPARKLING%20%20BETA%20BLUE.png']")
	private WebElement sparklingBetaBlue;

	public WebElement colorSwitch_SparklingBetaBlue() {
		return sparklingBetaBlue;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/color-switch/TORNADOGREY.png']")
	private WebElement tornadoGrey;

	public WebElement colorSwitch_TornadoGrey() {
		return tornadoGrey;
	}

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/city/splendor-plus-xtec/color-switch/PEARL%20WHITE.png']")
	private WebElement pearlWhite;

	public WebElement colorSwitch_PearlWhite() {
		return pearlWhite;
	}

	@FindBy(xpath = "//a[@href='https://virtualshowroom.heromotocorp.com/']")
	private WebElement explore360;

	public WebElement Explore360() {
		return explore360;
	}

	@FindBy(xpath = "(//div[@class='explore-360-btn-main']//a)[2]")
	private WebElement explore360_BooKNow;

	public WebElement Explore360_BookNow() {
		return explore360_BooKNow;
	}
	
	
	//avail finance and add to cart
	
	@FindBy(xpath = "//span[@id='cookies__container__close']")
	private WebElement cancel_cookies;

	public WebElement Cancel_Cookies() {
		return cancel_cookies;
	}
	
	
	/////////////// ##############****** HF100
	/////////////// *******#############///////////////////

//
//@FindBy(xpath ="//a[contains(text(),'Request Call Back')]")
//private WebElement reqCallbk; // button on banner 
//
//@FindBy(xpath ="//b[contains(text(),'Request a CallBack ')]")
//private WebElement reqCallbk_Popup;
//
//@FindBy(xpath ="(//input[@placeholder='Name'])[2]")
//private WebElement reqCallbk_name;
//
//@FindBy(xpath ="(//input[@name='mobileno'])[2]")
//private WebElement reqCallbk_mobile;
//
//@FindBy(xpath ="(//input[@name='otp'])[2]")
//private WebElement reqCallbk_otp;
//
//@FindBy(xpath ="(//form[@id='book-test-drive-form2']//button[@id='stateDropdown'])[2]")
//private WebElement reqCallbk_stateDD;
//
//@FindBy(xpath ="(//form[@id='book-test-drive-form2']//ul//li//a[contains(text(),'rajasthan')])[2]")
//private WebElement reqCallbk_selectState;
//
//@FindBy(xpath ="(//form[@id='book-test-drive-form2']//button[@id='cityDropdown'])[2]")
//private WebElement reqCallbk_cityDD;
//
//@FindBy(xpath ="//form[@id='book-test-drive-form2']//ul//li//a[contains(text(),'alwar')]")
//private WebElement reqCallbk_selectCity;
//
//		
//@FindBy(xpath ="(//input[@value='Submit'])[2]")
//private WebElement reqCallbk_submit;
//
//@FindBy(xpath ="//a[@class='btn booknow-btn']")
//private WebElement overview_booknow;
//
//
//
//@FindBy(xpath ="//li[@class='item product']//strong")
//private WebElement BikeNameHeader;
//
//@FindBy(xpath ="//h1[@class='page-title']//span")
//private WebElement BikeNameTitle;
//		
//public WebElement RequestCB_bttn_bannerMotorcycle() {
//	return reqCallbk;}
//
//public WebElement RequestCB_bttn_PopUpMotorcycle() {
//	return reqCallbk_Popup;}
//
//public WebElement RequestCB_name_Motorcycle() {
//	return reqCallbk_name;}
//
//
//public WebElement RequestCB_Mobile_Motorcycle() {
//	return reqCallbk_mobile;}
//
//public WebElement RequestCB_otp_Motorcycle() {
//	return reqCallbk_otp;}
//
//public WebElement RequestCB_stateDD_Motorcycle() {
//	return reqCallbk_stateDD;}
//
//public WebElement RequestCB_selectState_Motorcycle() {
//	return reqCallbk_selectState;}
//
//public WebElement RequestCB_cityDD_Motorcycle() {
//	return reqCallbk_cityDD;}
//
//public WebElement RequestCB_selectCity_Motorcycle() {
//	return reqCallbk_selectCity;}
//
//public WebElement RequestCB_ClickSubmit_Motorcycle() {
//	return reqCallbk_submit;}
//
//public WebElement overview_ClickBookNow_Motorcycle() {
//	return overview_booknow;}
//
//public WebElement getBikeName_Header() {
//	return BikeNameHeader;}
//
//public WebElement getBikeName_Title() {
//	return BikeNameTitle;}

//			@FindBy(xpath ="(//div[@class='explore-360-btn-main']//a)[2]")
//			private WebElement explore360_BooKNow;
//
//			public WebElement Explore360_BookNow() {
//				return explore360_BooKNow;}	

}
