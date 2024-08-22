package com.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.base_class;

public class ScootersModuleLocators extends base_class {

	public ScootersModuleLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[normalize-space()='SCOOTERS'])[1]")
	private WebElement scootersTab;

	public WebElement ScootersTab() {
		return scootersTab;
	}

	@FindBy(xpath = "(//a[normalize-space()='SCOOTERS'])[2]")
	private WebElement scootersText;

	public WebElement ScootersText() {
		return scootersText;
	}

	// ********** Category Page *****************

	// >>>>>>> Xoom <<<<<<<<//
	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/products/scooters/xoom-xtech/category-page/Category Page_Product Shot_202x203 px.png']")
	private WebElement Xoom_scooter_img;

	public WebElement Xoom_scooter_Img() {
		return Xoom_scooter_img;
	}

	@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#Xoom']")
	private WebElement xoom_qickView;

	public WebElement Xoom_QuickView() {
		return xoom_qickView;
	}

	@FindBy(xpath = "//div[@id='container-5dfaa63218']//div[@class='popup-inner']//a[normalize-space()='View Details']")
	private WebElement xoom_viewDetails;

	public WebElement Xoom_ViewDetails() {
		return xoom_viewDetails;
	}

	@FindBy(xpath = "//div[@id='container-5dfaa63218']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
	private WebElement xoom_BookNow;

	public WebElement Xoom_BookNow() {
		return xoom_BookNow;
	}

	@FindBy(xpath = "//div[@id='Xoom']//button[@type='button'][normalize-space()='×']")
	private WebElement xoom_closeBttn;

	public WebElement Xoom_CloseButton() {
		return xoom_closeBttn;
	}

	// Red
	@FindBy(xpath = "(//div[@id='container-5dfaa63218']//a[@data-color='red'])[2]")
	private WebElement xoom_Red_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/xoom-xtech/colors-360/red/1.png'])[2]")
	private WebElement xoom_Red_Img;

	// Blue
	@FindBy(xpath = "(//div[@id='container-5dfaa63218']//a[@data-color='blue'])[2]")
	private WebElement xoom_Blue_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/xoom-xtech/category-page/bike-images/XOOM XTec_AAWP_ZX_PS Blue_991 x 643.png'])[2]")
	private WebElement xoom_Blue_Img;

	// Black
	@FindBy(xpath = "(//div[@id='container-5dfaa63218']//a[@data-color='black'])[2]")
	private WebElement xoom_Black_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/xoom-xtech/category-page/bike-images/XOOM XTec_AAWP_ZX_Black _991 x 643.png'])[2]")
	private WebElement xoom_Black_Img;

	// Orange
	@FindBy(xpath = "(//div[@id='container-5dfaa63218']//a[@data-color='orange'])[2]")
	private WebElement xoom_Orange_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/xoom-xtech/category-page/color-icons/XOOM%20XTec_AAWP_ZX_MA%20Orange_35%20x%2010.png'])[2]")
	private WebElement xoom_Orange_Img;

	// White
	@FindBy(xpath = "(//div[@id='container-5dfaa63218']//a[@data-color='white'])[2]")
	private WebElement xoom_White_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/xoom-xtech/category-page/bike-images/XOOM_AAWP_VX_PS White_991 x 643.png'])[2]")
	private WebElement xoom_White_Img;

	public void click_all_colors_Xoom() throws Exception {

		Custom_click(xoom_Red_button, " on Red Button");
		Wait(xoom_Red_Img);
		VerifyImagePresent(xoom_Red_Img, "Image ");

		Custom_click(xoom_Blue_button, "on Blue Button");
		Wait(xoom_Blue_Img);
		Thread.sleep(1000);
		VerifyImagePresent(xoom_Blue_Img, " Blue Image");

		Custom_click(xoom_Black_button, "on Black Button");
		Wait(xoom_Black_Img);
		Thread.sleep(1000);
		VerifyImagePresent(xoom_Black_Img, "Black Image");

		Custom_click(xoom_Orange_button, "On Orange Button");
		Wait(xoom_Orange_Img);
		Thread.sleep(1000);
		VerifyImagePresent(xoom_Orange_Img, " Orange sccooter Image");

		Custom_click(xoom_White_button, "On White Button");
		Wait(xoom_White_Img);
		Thread.sleep(1000);
		VerifyImagePresent(xoom_White_Img, "White Image");

	}

	// >>>>>>> PleasuePlusXtec <<<<<<<<//

	@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/PLEASURE-XTEC.png']")
	private WebElement pleasuePlusXtec_scooter_img;

	public WebElement PleasuePlusXtec_scooter_Img() {
		return pleasuePlusXtec_scooter_img;
	}

	@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#PleasureXTEC']")
	private WebElement pleasuePlusXtec_qickView;

	public WebElement PleasuePlusXtec_QuickView() {
		return pleasuePlusXtec_qickView;
	}

	@FindBy(xpath = "//div[@id='container-39fa8c5249']//div[@class='popup-inner']//a[normalize-space()='View Details']")
	private WebElement pleasuePlusXtec_viewDetails;

	public WebElement PleasuePlusXtec_ViewDetails() {
		return pleasuePlusXtec_viewDetails;
	}

	@FindBy(xpath = "//div[@id='container-39fa8c5249']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
	private WebElement pleasuePlusXtec_BookNow;

	public WebElement PleasuePlusXtec_BookNow() {
		return pleasuePlusXtec_BookNow;
	}

	@FindBy(xpath = "//div[@id='PleasureXTEC']//button[@type='button'][normalize-space()='×']")
	private WebElement pleasuePlusXtec_closeBttn;

	public WebElement PleasuePlusXtec_CloseButton() {
		return pleasuePlusXtec_closeBttn;
	}

	// Yellow
	@FindBy(xpath = "(//div[@id='container-39fa8c5249']//a[@data-color='yellow'])[2]")
	private WebElement pleasuePlusXtec_Yellow_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/pleasure-plus-xtech/360/new-yellow/1.png'])[2]")
	private WebElement pleasuePlusXtec_Yellow_Img;
	
	
	//New-vernier-grey
	@FindBy(xpath = "(//div[@id='container-39fa8c5249']//a[@data-color='matte-black'])[3]")
	private WebElement pleasuePlusXtec_Grey_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/pleasure-plus-xtech/360/new-vernier-grey/1.png'])[2]")
	private WebElement pleasuePlusXtec_Grey_Img;
	

	// Matte Black
	@FindBy(xpath = "(//div[@id='container-39fa8c5249']//a[@data-color='matte-black'])[4]")
	private WebElement pleasuePlusXtec_MatteBlack_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/pleasure-plus-xtech/360/new-matte-black/1.png'])[2]")
	private WebElement pleasuePlusXtec_MatteBlack_Img;
	
	
	// Blue
	@FindBy(xpath = "(//div[@id='container-39fa8c5249']//a[@data-color='s'])[2]")
	private WebElement pleasuePlusXtec_Blue_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/pleasure-plus-xtech/360/new-blue/1.png'])[2]")
	private WebElement pleasuePlusXtec_Blue_Img;
	
	
	
	//Midnight-black
	@FindBy(xpath = "(//div[@id='container-39fa8c5249']//a[@data-color='midnight-black'])[2]")
	private WebElement pleasuePlusXtec_midnightblack_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/pleasure-plus-xtech/360/black/1.png'])[2]")
	private WebElement pleasuePlusXtec_midnightblack_Img;
	
	
	//sporty-red
	@FindBy(xpath = "(//div[@id='container-39fa8c5249']//a[@data-color='sporty-red'])[2]")
	private WebElement pleasuePlusXtec_sportyred_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/pleasure-plus-xtech/360/red/1.png'])[2]")
	private WebElement pleasuePlusXtec_sportyred_Img;
	
	
	
	//pearlwhite
	@FindBy(xpath = "(//div[@id='container-39fa8c5249']//a[@data-color='pearlwhite'])[2]")
	private WebElement pleasuePlusXtec_pearlwhite_button;

	@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/pleasure-plus-xtech/360/white/1.png'])[2]")
	private WebElement pleasuePlusXtec_pearlwhite_Img;
	
	public void click_all_colors_pleasuePlusXtec() throws Exception {
		
		Custom_click(pleasuePlusXtec_Yellow_button, " on Yellow Button");
		Wait(pleasuePlusXtec_Yellow_Img);
		VerifyImagePresent(pleasuePlusXtec_Yellow_Img, "Image of Yellow Scooters ");
		
		Custom_click(pleasuePlusXtec_Grey_button, " on Grey Button");
		Wait(pleasuePlusXtec_Grey_Img);
		Thread.sleep(1000);
		VerifyImagePresent(pleasuePlusXtec_Grey_Img, "Image of Grey Scooters ");
		
		Custom_click(pleasuePlusXtec_MatteBlack_button, " on MatteBlack Button");
		Wait(pleasuePlusXtec_MatteBlack_Img);
		Thread.sleep(1000);
		VerifyImagePresent(pleasuePlusXtec_MatteBlack_Img, "Image of MatteBlack Scooters ");
		
		Custom_click(pleasuePlusXtec_Blue_button, " on Blue Button");
		Wait(pleasuePlusXtec_Blue_Img);
		Thread.sleep(1000);
		VerifyImagePresent(pleasuePlusXtec_Blue_Img, "Image of Blue Scooters ");
		
		Custom_click(pleasuePlusXtec_midnightblack_button, " on mid-night black Button");
		Wait(pleasuePlusXtec_midnightblack_Img);
		Thread.sleep(1000);
		VerifyImagePresent(pleasuePlusXtec_midnightblack_Img, "Image of mid-night black Scooters ");
		
		
		Custom_click(pleasuePlusXtec_sportyred_button, " on sportyred Button");
		Wait(pleasuePlusXtec_sportyred_Img);
		Thread.sleep(1000);
		VerifyImagePresent(pleasuePlusXtec_sportyred_Img, "Image of sportyred Scooters ");
		
		
		Custom_click(pleasuePlusXtec_pearlwhite_button, " on pearl white Button");
		Wait(pleasuePlusXtec_pearlwhite_Img);
		Thread.sleep(1000);
		VerifyImagePresent(pleasuePlusXtec_pearlwhite_Img, "Image of pearl white Scooters ");

	}
	
	// >>>>>>> Destiny 125 Xtec <<<<<<<<//

		@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/DESTINI-125-XTEC.png']")
		private WebElement destini125Xtec_scooter_img;

		public WebElement Destini125Xtec_scooter_Img() {
			return destini125Xtec_scooter_img;
		}

		@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#Destini125Xtec']")
		private WebElement destini125Xtec_qickView;

		public WebElement Destini125Xtec_QuickView() {
			return destini125Xtec_qickView;
		}

		@FindBy(xpath = "//div[@id='container-ad881bf982']//div[@class='popup-inner']//a[normalize-space()='View Details']")
		private WebElement destini125Xtec_viewDetails;

		public WebElement Destini125Xtec_ViewDetails() {
			return destini125Xtec_viewDetails;
		}

		@FindBy(xpath = "//div[@id='container-ad881bf982']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
		private WebElement destini125Xtec_BookNow;

		public WebElement Destini125Xtec_BookNow() {
			return destini125Xtec_BookNow;
		}

		@FindBy(xpath = "//div[@id='Destini125Xtec']//button[@type='button'][normalize-space()='×']")
		private WebElement destini125Xtec_closeBttn;

		public WebElement Destini125Xtec_CloseButton() {
			return destini125Xtec_closeBttn;
		}

		//Blue
		@FindBy(xpath = "(//div[@id='container-ad881bf982']//a[@data-color='Gold'])[2]")
		private WebElement destini125Xtec_blue_button;

		@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/destini-125-xtech/blue/1.png'])[2]")
		private WebElement destini125Xtec_blue_Img;
		
		//Matte- Black
		
		@FindBy(xpath = "(//div[@id='container-ad881bf982']//a[@data-color='black'])[2]")
		private WebElement destini125Xtec_black_button;

		@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/destini-125-xtech/matte-black-scooter/1.png'])[2]")
		private WebElement destini125Xtec_black_Img;
		
		//brown
		@FindBy(xpath = "(//div[@id='container-ad881bf982']//a[@data-color='Red'])[2]")
		private WebElement destini125Xtec_Brown_button;

		@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/destini-125-xtech/brown/1.png'])[2]")
		private WebElement destini125Xtec_Brown_Img;
		

		// Red
		@FindBy(xpath = "(//div[@id='container-ad881bf982']//a[@data-color='chestnutbrown'])[2]")
		private WebElement Destini125Xtec_Red_button;

		@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/destini-125-xtech/red/1.png'])[2]")
		private WebElement destini125Xtec_Red_Img;
		
		
		// MattwSilver
		@FindBy(xpath = "(//div[@id='container-ad881bf982']//a[@data-color='mattwsilver'])[2]")
		private WebElement destini125Xtec_mattwsilver_button;

		@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/destini-125-xtech/silver/1.png'])[2]")
		private WebElement destini125Xtec_mattwsilver_Img;
		
		
		
		//Panther-black
		@FindBy(xpath = "(//div[@id='container-ad881bf982']//a[@data-color='panther-black'])[2]")
		private WebElement destini125Xtec_pantherblack_button;

		@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/destini-125-xtech/panther-black/1.png'])[2]")
		private WebElement destini125Xtec_pantherblack_Img;
		
		
		//pearlwhite
		@FindBy(xpath = "(//div[@id='container-ad881bf982']//a[@data-color='pearlwhite'])[2]")
		private WebElement destini125Xtec_pearlwhite_button;

		@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/destini-125-xtech/white/1.png'])[2]")
		private WebElement destini125Xtec_pearlwhite_Img;
		
		
		public void click_all_colors_Destini125Xtec() throws Exception {
			
			Custom_click(destini125Xtec_blue_button, " on Blue Button");
			Wait(destini125Xtec_blue_Img);
			VerifyImagePresent(destini125Xtec_blue_Img, "Image of Blue Scooters ");
			
			Custom_click(destini125Xtec_black_button, " on Black Button");
			Wait(destini125Xtec_black_Img);
			Thread.sleep(1000);
			VerifyImagePresent(destini125Xtec_black_Img, "Image of Black Scooters ");
			
			Custom_click(destini125Xtec_Brown_button, " on Brown Button");
			Wait(destini125Xtec_Brown_Img);
			Thread.sleep(1000);
			VerifyImagePresent(destini125Xtec_Brown_Img, "Image of Brown Scooters ");
			
			Custom_click(Destini125Xtec_Red_button, " on Red Button");
			Wait(destini125Xtec_Red_Img);
			Thread.sleep(1000);
			VerifyImagePresent(destini125Xtec_Red_Img, "Image of Red Scooters ");
			
			Custom_click(destini125Xtec_mattwsilver_button, " on MattewSilver black Button");
			Wait(destini125Xtec_mattwsilver_Img);
			Thread.sleep(1000);
			VerifyImagePresent(destini125Xtec_mattwsilver_Img, "Image of MattewSilver Scooters ");
			
			
			Custom_click(destini125Xtec_pantherblack_button, " on Panther Black Button");
			Wait(destini125Xtec_pantherblack_Img);
			Thread.sleep(1000);
			VerifyImagePresent(destini125Xtec_pantherblack_Img, "Image of Panther Black Scooters ");
			
			
			Custom_click(destini125Xtec_pearlwhite_button, " on pearl white Button");
			Wait(destini125Xtec_pearlwhite_Img);
			Thread.sleep(1000);
			VerifyImagePresent(destini125Xtec_pearlwhite_Img, "Image of pearl white Scooters ");

		}
		
		// >>>>>>> MAESTRO-EDGE-125 <<<<<<<<//

				@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/New-MAESTRO-EDGE-125.png']")
				private WebElement maestroEdge125_scooter_img;

				public WebElement MaestroEdge125_scooter_Img() {
					return maestroEdge125_scooter_img;
				}

				@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#MaestroEdge125']")
				private WebElement maestroEdge125_qickView;

				public WebElement MaestroEdge125_QuickView() {
					return maestroEdge125_qickView;
				}

				@FindBy(xpath = "//div[@id='container-6286f15bcd']//div[@class='popup-inner']//a[normalize-space()='View Details']")
				private WebElement maestroEdge125_viewDetails;

				public WebElement MaestroEdge125_ViewDetails() {
					return maestroEdge125_viewDetails;
				}

				@FindBy(xpath = "//div[@id='container-6286f15bcd']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
				private WebElement maestroEdge125_BookNow;

				public WebElement MaestroEdge125_BookNow() {
					return maestroEdge125_BookNow;
				}

				@FindBy(xpath = "//div[@id='MaestroEdge125']//button[@type='button'][normalize-space()='×']")
				private WebElement maestroEdge125_closeBttn;

				public WebElement MaestroEdge125_CloseButton() {
					return maestroEdge125_closeBttn;
				}

				//Prismatic Yellow
				@FindBy(xpath = "(//div[@id='container-6286f15bcd']//a[@data-color='PrismaticYellow'])[2]")
				private WebElement maestroEdge125_PrismaticYellow_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/maestro-edge-125/yellow/1.png'])[2]")
				private WebElement maestroEdge125_PrismaticYellow_Img;
				
				//Panther-Black
				@FindBy(xpath = "(//div[@id='container-6286f15bcd']//a[@data-color='PantherBlack'])[2]")
				private WebElement maestroEdge125_PantherBlack_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/maestro-edge-125/black/1.png'])[2]")
				private WebElement maestroEdge125_PantherBlack_Img;
				
				//Candy Blazing Red
				@FindBy(xpath = "(//div[@id='container-6286f15bcd']//a[@data-color='CandyBlazingRed'])[2]")
				private WebElement maestroEdge125_CandyBlazingRed_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/maestro-edge-125/red/1.png'])[2]")
				private WebElement maestroEdge125_CandyBlazingRed_Img;
				

				// MatteTechnoBlue
				@FindBy(xpath = "(//div[@id='container-6286f15bcd']//a[@data-color='MatteTechnoBlue'])[2]")
				private WebElement maestroEdge125_MatteTechnoBlue_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/maestro-edge-125/blue/1.png'])[2]")
				private WebElement maestroEdge125_MatteTechnoBlue_Img;
				
				
				// PrismaticPurple
				@FindBy(xpath = "(//div[@id='container-6286f15bcd']//a[@data-color='PrismaticPurple'])[2]")
				private WebElement maestroEdge125_prismaticPurple_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/maestro-edge-125/purple/1.png'])[2]")
				private WebElement maestroEdge125_prismaticPurple_Img;
							
				
				//PearlSilverWhite
				@FindBy(xpath = "(//div[@id='container-6286f15bcd']//a[@data-color='PearlSilverWhite'])[2]")
				private WebElement maestroEdge125_pearlSilverWhite_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/maestro-edge-125/white/1.png'])[2]")
				private WebElement maestroEdge125_pearlSilverWhite_Img;
				
			
				
				
				public void click_all_colors_MaestroEdge125() throws Exception {
					
					Custom_click(maestroEdge125_PrismaticYellow_button, " on Prismatic Yellow Button");
					Wait(maestroEdge125_PrismaticYellow_Img);
					VerifyImagePresent(maestroEdge125_PrismaticYellow_Img, "Image of Prismatic Yellow Scooters ");
					
					Custom_click(maestroEdge125_PantherBlack_button, " on Panther Black Button");
					Wait(maestroEdge125_PantherBlack_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge125_PantherBlack_Img, "Image of Panther Black Scooters ");
					
					Custom_click(maestroEdge125_CandyBlazingRed_button, " on Candy Blazing Red Button");
					Wait(maestroEdge125_CandyBlazingRed_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge125_CandyBlazingRed_Img, "Image of Candy Blazing Red Scooters ");
					
					Custom_click(maestroEdge125_MatteTechnoBlue_button, " on Red Button");
					Wait(maestroEdge125_MatteTechnoBlue_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge125_MatteTechnoBlue_Img, "Image of Matte Techno Blue Scooters ");
					
					Custom_click(maestroEdge125_prismaticPurple_button, " on Prismatic Purple Button");
					Wait(maestroEdge125_prismaticPurple_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge125_prismaticPurple_Img, "Image of Prismatic Purple Scooters ");
					
					
					Custom_click(maestroEdge125_pearlSilverWhite_button, " on Panther Black Button");
					Wait(maestroEdge125_pearlSilverWhite_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge125_pearlSilverWhite_Img, "Image of Panther Black Scooters ");


				}
				
				
				
				
				// >>>>>>> MAESTRO-EDGE-110 <<<<<<<<//

				@FindBy(xpath = "//img[@src='/content/dam/hero-aem-website/in/category-pages/product-banner/NEW-MAESTRO-EDGE-110.png']")
				private WebElement maestroEdge110_scooter_img;

				public WebElement MaestroEdge110_scooter_Img() {
					return maestroEdge110_scooter_img;
				}

				@FindBy(xpath = "//div[@class='hover-content ']//following::li[@data-target='#MaestroEdge110']")
				private WebElement maestroEdge110_qickView;

				public WebElement MaestroEdge110_QuickView() {
					return maestroEdge110_qickView;
				}

				@FindBy(xpath = "//div[@id='container-228a4a0b20']//div[@class='popup-inner']//a[normalize-space()='View Details']")
				private WebElement maestroEdge110_viewDetails;

				public WebElement MaestroEdge110_ViewDetails() {
					return maestroEdge110_viewDetails;
				}

				@FindBy(xpath = "//div[@id='container-228a4a0b20']//div[@class='popup-inner']//a[normalize-space()='Book Now']")
				private WebElement maestroEdge110_BookNow;

				public WebElement MaestroEdge110_BookNow() {
					return maestroEdge110_BookNow;
				}

				@FindBy(xpath = "//div[@id='MaestroEdge110']//button[@type='button'][normalize-space()='×']")
				private WebElement maestroEdge110_closeBttn;

				public WebElement MaestroEdge110_CloseButton() {
					return maestroEdge110_closeBttn;
				}

				//CandyBlazingRed
				@FindBy(xpath = "(//div[@id='container-228a4a0b20']//a[@data-color='CandyBlazingRed'])[2]")
				private WebElement maestroEdge110_candyBlazingRed_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/meastro-110/candy-red/1.png'])[2]")
				private WebElement maestroEdge110_candyBlazingRed_Img;
				
				
				//MIdNIghtBlue
				@FindBy(xpath = "(//div[@id='container-228a4a0b20']//a[@data-color='MIdNIghtBlue'])[2]")
				private WebElement maestroEdge110_mIdNIghtBlue_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/meastro-110/blue/1.png'])[2]")
				private WebElement maestroEdge110_mIdNIghtBlue_Img;
				
				//SealSilver
				@FindBy(xpath = "(//div[@id='container-228a4a0b20']//a[@data-color='SealSilver'])[2]")
				private WebElement maestroEdge110_SealSilver_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/meastro-110/silver/1.png'])[2]")
				private WebElement maestroEdge110_SealSilver_Img;
				

				// SpecialEdition-Red
				@FindBy(xpath = "(//div[@id='container-228a4a0b20']//a[@data-color='SpecialEdition'])[2]")
				private WebElement maestroEdge125_SpecialEditionRed_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/meastro-110/special-edition-red/1.png'])[2]")
				private WebElement maestroEdge125_SpecialEditionRed_Img;
				
				
				// TechnoBlue
				@FindBy(xpath = "(//div[@id='container-228a4a0b20']//a[@data-color='TechnoBlue'])[2]")
				private WebElement maestroEdge110_TechnoBlue_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/meastro-110/techno-blue/1.png'])[2]")
				private WebElement maestroEdge110_TechnoBlue_Img;
							
				
				//PearlWhite
				@FindBy(xpath = "(//div[@id='container-228a4a0b20']//a[@data-color='PearlWhite'])[2]")
				private WebElement maestroEdge110_PearlWhite_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/meastro-110/white/1.png'])[2]")
				private WebElement maestroEdge110_PearlWhite_Img;
				
				//PantherBlack
				@FindBy(xpath = "(//div[@id='container-228a4a0b20']//a[@data-color='PantherBlack'])[2]")
				private WebElement maestroEdge110_PantherBlack_button;

				@FindBy(xpath = "(//img[@src='/content/dam/hero-aem-website/in/products/scooters/meastro-110/black/1.png'])[2]")
				private WebElement maestroEdge110_PantherBlack_Img;
			
				
				
				public void click_all_colors_MaestroEdge110() throws Exception {
					
					Custom_click(maestroEdge110_candyBlazingRed_button, " on candy Blazing Red Button");
					Wait(maestroEdge110_candyBlazingRed_Img);
					VerifyImagePresent(maestroEdge110_candyBlazingRed_Img, "Image of candy Blazing Red Scooters ");
					
					Custom_click(maestroEdge110_mIdNIghtBlue_button, " on MIdNIght Blue Button");
					Wait(maestroEdge110_mIdNIghtBlue_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge110_mIdNIghtBlue_Img, "Image of MIdNIght Blue Scooters ");
					
					Custom_click(maestroEdge110_SealSilver_button, " on Seal Silver Button");
					Wait(maestroEdge110_SealSilver_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge110_SealSilver_Img, "Image of Seal Silver Scooters ");
					
					Custom_click(maestroEdge125_SpecialEditionRed_button, " on  Special Edition-Red Button");
					Wait(maestroEdge125_SpecialEditionRed_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge125_SpecialEditionRed_Img, "Image of Special Edition-Red Scooters ");
					
					Custom_click(maestroEdge110_TechnoBlue_button, " on Techno Blue Button");
					Wait(maestroEdge110_TechnoBlue_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge110_TechnoBlue_Img, "Image of Techno Blue Scooters ");
					
					
					Custom_click(maestroEdge110_PearlWhite_button, " on Pearl White Button");
					Wait(maestroEdge110_PearlWhite_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge110_PearlWhite_Img, "Image of Pearl White Scooters ");
					
					
					Custom_click(maestroEdge110_PantherBlack_button, " on Panther Black Button");
					Wait(maestroEdge110_PantherBlack_Img);
					Thread.sleep(1000);
					VerifyImagePresent(maestroEdge110_PantherBlack_Img, "Image of Panther Black Scooters ");

				}

				
//****************** Prodcut Page *********************
				
				
				
				
				@FindBy(xpath = "//span[@id='cookies__container__close']")
				private WebElement closeCookies;

				public WebElement CloseCookies() {
					return closeCookies;
				}
				
				
				@FindBy(xpath = "(//a[normalize-space()='Avail Finance'])[2]")
				private WebElement AvailFin;

				public WebElement AvailFinance() {
					return AvailFin;
				}		
				
				@FindBy(xpath = "//h4[normalize-space()='Unlock Best Loan Offer']")
				private WebElement availfin_Heading;

				public WebElement Availfin_Heading() {
					return availfin_Heading;
				}
				
				
				@FindBy(xpath = "(//button[normalize-space()='Get Verification Code'])[2]")
				private WebElement availfin_GetVerCodeTab;

				public WebElement Availfin_GetVerCodeTab() {
					return availfin_GetVerCodeTab;
				}
				
				
				@FindBy(xpath ="(//a[normalize-space()='Add to Cart'])[2]")
				private WebElement addToCart;

				public WebElement AddToCart(){
					return addToCart;
				}	
				
				@FindBy(xpath ="//h4[normalize-space()='Unlock Best Loan Offer']//span")
				private WebElement availFinanceCrossBttn;

				public WebElement AvailFinanace_closeBttn() {
					return availFinanceCrossBttn;
				}
				
				
				//******** Destiny Prime ********// 
				
				
				@FindBy(xpath ="//p[normalize-space()='DESTINI PRIME']")
				private WebElement destiniprimeName;

				public WebElement DestiniPrime_Name() {
					return destiniprimeName;
				}
				
				
	
				
				
				
				
				
				
				
				
				
}
