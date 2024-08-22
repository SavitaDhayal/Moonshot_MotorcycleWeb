package motorcycleModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycles_practical;
import com.page_object.home_page;
import com.utility.base_class;
@Listeners(com.utility.listner.class)
public class Practical_ProductPage_SplendorPlusXTec extends base_class {
	
	public Motorcycles_practical ob;
	public static home_page home;
	SoftAssert asert = new SoftAssert();
 
 	
	@Test(priority = 0)
	public void Motorcycles_practicalPage_SplendorPlusXtec() throws Exception {
		ob = new Motorcycles_practical();
		home=new home_page();
		PageLoaded();
		Wait(home.click_HeroLogo());
		Custom_click(home.click_HeroLogo(), "");
		
		Wait(ob.motorcycles());
		Custom_click(ob.motorcycles(), "Motorcycles");
		PageLoaded();
		Wait(ob.click_splendorplusText());
		Custom_click(ob.click_splendorplusXTecText(), "splendor plusXtec text");
		PageLoaded();
		
		

	}

		
//	@Test(priority = 1)
	public void TC039_SplendorplusXTec_Overview() throws Exception {  
		Thread.sleep(2000);
		home.ReqCallBack();
		PageLoaded();
	//	Thread.sleep(1000);
		
		Wait(ob.RequestCB_bttn_bannerMotorcycle());
		VerifyElementPresent(ob.RequestCB_bttn_bannerMotorcycle(), "RCB button ");
		Custom_click(ob.RequestCB_bttn_bannerMotorcycle(), " ");
		Wait(ob.RequestCB_bttn_PopUpMotorcycle());
		VerifyElementPresent(ob.RequestCB_bttn_PopUpMotorcycle(), " Request call Back Popup ");
		
		custom_sendkeys(ob.RequestCB_name_Motorcycle() , config_getdata("Name"), "Name");
		custom_sendkeys(ob.RequestCB_Mobile_Motorcycle(), config_getdata("MobileNo"), "Mobile No.");
		custom_sendkeys(ob.RequestCB_otp_Motorcycle(), config_getdata("OTP"), "Enter OTP");
		
		Custom_click(ob.RequestCB_stateDD_Motorcycle(), " click on select state");
		Custom_click(ob.RequestCB_selectState_Motorcycle(), "select state");
		Custom_click(ob.RequestCB_cityDD_Motorcycle(), " click on select city");
		Custom_click(ob.RequestCB_selectCity_Motorcycle(), "select city");	
		Custom_click(ob.RequestCB_ClickSubmit_Motorcycle(), " Submit bttn clickable");
		
		Wait(home.get_ThankyouMsg());
		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		Custom_click(home.click_Request_CB_closeBttn(), " click on cross button");
		Wait(ob.overview_ClickBookNow_Motorcycle());
		VerifyElementPresent(ob.overview_ClickBookNow_Motorcycle(), "");
		Custom_click(ob.overview_ClickBookNow_Motorcycle(), " click on BookNow");
		change_window(1, " Next window");
		Thread.sleep(2000);
		PageLoaded();
		VerifyElementPresent(ob.getBikeName_Header(), "Header bike name ");  
		VerifyElementPresent(ob.getBikeName_Title(), " Bike title name");
		String nameHeader=ob.getBikeName_Header().getText();
		String nameTitle=ob.getBikeName_Title().getText();
		Assert.assertEquals(nameHeader, nameTitle);
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();

	}

//	
//	@Test(priority = 2,dependsOnMethods = "Motorcycles_practicalPage_SplendorPlusXtec")
//	public void TC040_SplendorplusXTec_FeatureCarousels() {
//		ob = new Motorcycles_practical();
//		
//		//div[@class='splender-feature-slider slick-initialized slick-slider']//button[@class='slick-prev slick-arrow']
//		//div[@class='splender-feature-slider slick-initialized slick-slider']//button[@class='slick-next slick-arrow']
//	
//	}
	
	@Test(priority = 3)
	public void TC041_SplendorplusXTec_Features_BookATest_Ride() throws Exception {
		
	
//		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",ob.BTR_HeadingText());
		Wait(ob.BTR_HeadingText());
		VerifyElementPresent(ob.BTR_HeadingText(), " Heading ");
		Wait(ob.BTR_name());
		Thread.sleep(2000);
		custom_sendkeys(ob.BTR_name() , config_getdata("Name"), "Name");
		custom_sendkeys(ob.BTR_mobileNum(), config_getdata("MobileNo"), "Mobile No.");
		custom_sendkeys(ob.BTR_otp(), config_getdata("OTP"), "Enter OTP");
		
		Custom_click(ob.BTR_StateDD(), " click on select state");
		Custom_click(ob.BTR_selectState(), "select state");
		Custom_click(ob.BTR_CityDD(), " click on select city");
		Custom_click(ob.BTR_citySelect(), "select city");
		if(driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).isEnabled()) {
		Custom_click(ob.BTR_submitBttn(), " Submit bttn clickable");}
		
		Wait(home.get_ThankyouMsg());
		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",home.click_RequestCB_closeBttn1());
//		Wait(home.click_RequestCB_closeBttn1());
	//	Custom_click(home.click_RequestCB_closeBttn1(),"close bttn clickable");
			
	}
	
	
	@Test(priority =4)
	public void TC042__SplendorplusXTec_Specification() {
		
		
		Wait(ob.specification_headerTab());
		VerifyElementPresent(ob.specification_headerTab(), " tab: ");
		Custom_click(ob.specification_headerTab(), " Heading");
		
		VerifyElementPresent(ob.specification_headingText(), "");
		
		Wait(ob.HF_Deluxe_Engine_Icon());
		VerifyImagePresent(ob.HF_Deluxe_Engine_Icon(), " engine icon");
	//	VerifyElementPresent(ob.Engine_Tab(), " engine text ");
		Wait(ob.Engine_Tab());
		Custom_click(ob.Engine_Tab(), " engine tab clickable");		
		Wait(ob.SplendorPlusXtec_Engine_Image());
		VerifyImagePresent(ob.SplendorPlusXtec_Engine_Image(), "SplendorPlusXtec engine Image");
		
		Wait(ob.HF_Deluxe_wheels_and_tyres_Icon());
		VerifyImagePresent(ob.HF_Deluxe_wheels_and_tyres_Icon(), " wheels icon");
		VerifyElementPresent(ob.Wheels_and_tyres_Tab(), " wheels text ");
		Custom_click(ob.Wheels_and_tyres_Tab(), " wheels tab clickable");
		Wait(ob.SplendorPlusXtec_Wheels_and_tyres_Img());
		VerifyImagePresent(ob.SplendorPlusXtec_Wheels_and_tyres_Img() ,"SplendorPlusXtec wheels Image");
	
		VerifyImagePresent(ob.HFDeluxe_Suspension_Icon(), " suspension icon");
		VerifyElementPresent(ob.SpXtec_Suspension_Tab(), " Suspension text ");
		Custom_click(ob.SpXtec_Suspension_Tab(), " suspension tab clickable");
		Wait(ob.SplendorPlusXtec_Suspension_Image());
		VerifyImagePresent(ob.SplendorPlusXtec_Suspension_Image(),"SplendorPlusXtec suspension Image");

		
		
		VerifyImagePresent(ob.HF_Deluxe_Transmission_Icon(), " Transmission icon");
		VerifyElementPresent(ob.SpXtec_Transmission_Tab(), " Transmission  Text ");
		Custom_click(ob.SpXtec_Transmission_Tab(), " Transmission tab clickable");
		Wait(ob.SplendorPlusXtec_Transmission_Image());
		VerifyImagePresent(ob.SplendorPlusXtec_Transmission_Image(), "SplendorPlusXtec Transmission Image");

		
	
		
		VerifyImagePresent(ob.HF_Deluxe_Brakes_Icon(), " brakes icon");
		VerifyElementPresent(ob.Brakes_Tab(), " brakes text ");
		Custom_click(ob.Brakes_Tab(), " brakes tab clickable");
		Wait(ob.SplendorPlusXtec_Brakes_Img());
		VerifyImagePresent(ob.SplendorPlusXtec_Brakes_Img(),"SplendorPlusXtec brakes Image");
	
		
		
		VerifyImagePresent(ob.HF_Deluxe_Elecetrical_Icon(), " electrical icon");
		VerifyElementPresent(ob.Electrical_Tab(), " electrical text ");
		Custom_click(ob.Electrical_Tab(), " electrical tab clickable");
		Wait(ob.SplendorPlusXtec_Electrical_Img());
		VerifyImagePresent(ob.SplendorPlusXtec_Electrical_Img(),"SplendorPlusXtec electrical Image");
		
		VerifyImagePresent(ob.HF_Deluxe_Dimension_Icon(), " Dimension icon");
		VerifyElementPresent(ob.Dimension_Tab(), " Dimension text ");
		Custom_click(ob.Dimension_Tab(), " Dimension tab clickable");
		Wait(ob.SplendorPlusXtec_Dimension_Img());
		VerifyImagePresent(ob.SplendorPlusXtec_Dimension_Img(),"SplendorPlusXtec Dimension Image");
		
		
	}
	
	@Test(priority = 5)
	public void TC043_SplendorplusXTec_Price(){  //44 steps
		try {
		Thread.sleep(2000);
		PageLoaded();
		Wait(ob.Price_Icon());
		VerifyImagePresent(ob.Price_Icon(), " price icon");
		VerifyElementPresent(ob.Price_Tab(), " Price tab");
		Custom_click(ob.Price_Tab(), " Price tab clickbale");
		VerifyElementPresent(ob.Price_Heading(), " Heading");
		
		Wait(ob.Price_SplendorPlusXtec_BikeImg());
		VerifyImagePresent(ob.Price_SplendorPlusXtec_BikeImg(), " Bike Image ");
		
		Thread.sleep(2000);
		Wait(ob.Price_StateDD());
		Custom_click(ob.Price_StateDD()," state DropDown");
		Wait(ob.Price_SelectState1());
		VerifyElementPresent(ob.Price_SelectState1(), " State to be selected ");		
		Custom_click(ob.Price_SelectState1(), " Selected state");
		//VerifyElementPresent(ob.Price_SelectState1(), " State to be selected ");
		Wait(ob.Price_CityDD());
		Custom_click(ob.Price_CityDD(), " City dropDown");
		VerifyElementPresent(ob.Price_SelectCity1(), "City to be selected");
		Thread.sleep(2000);
		Custom_click(ob.Price_SelectCity1(), " selected City");
		Thread.sleep(2000);
		ob.check_Variant_and_priceText();
		ob.check_all_Variants_Price();
		//check price after changing state 
		Thread.sleep(2000);
		home.ReqCallBack();
		Wait(ob.Price_StateDD());
		Custom_click(ob.Price_StateDD()," state DropDown");		
		VerifyElementPresent(ob.Price_SelectState2(), " State to be selected ");
		Thread.sleep(2000);
		Custom_click(ob.Price_SelectState2(), " Selected state");
		Custom_click(ob.Price_CityDD(), " City dropDown");
		VerifyElementPresent(ob.Price_SelectCity2(), "City to be selected");
		Custom_click(ob.Price_SelectCity2(), " selected City");
//		ob.check_Variant_and_priceText();
		
		ob.check_all_Variants_Price();
		
		Custom_click(ob.Price_BookNow(), " click Button Book now ");
		change_window(1, " Next window");
		Thread.sleep(3000);
		PageLoaded();
		VerifyElementPresent(ob.getBikeName_Header(), "Header bike name ");  
		VerifyElementPresent(ob.getBikeName_Title(), " Bike title name");
		String nameHeader=ob.getBikeName_Header().getText();
		String nameTitle=ob.getBikeName_Title().getText();
		Assert.assertEquals(nameHeader, nameTitle);

		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		}catch(Exception e)
		{
			if(home.click_Request_CB_closeBttn().isDisplayed())
			{
				log.error("Test case fail due to Request call back Popup =" +e);
			}
		}
	}
	
	
	@Test( priority = 6)
	public void TC044_SplendorplusXTec_Compare() {   
		ob = new Motorcycles_practical();
		
		PageLoaded();
		Wait(ob.CompareIcon());
		VerifyImagePresent(ob.CompareIcon(), " compare icon");
		VerifyElementPresent(ob.CompareTab(), " tab text ");
		Custom_click(ob.CompareTab(), " check custom tab clickable");
		VerifyElementPresent(ob.Compare_Heading(), " Compare Heading"); 
		Wait(ob.Compare_BikeName1());
		VerifyElementPresent(ob.Compare_BikeName1(), " Name of first Bike");
		VerifyElementPresent(ob.Compare_BikeName2(), " Name of second Bike");
		Wait(ob.SplendorPlusXtec_Compare_BikeIMG1());
		VerifyImagePresent(ob.SplendorPlusXtec_Compare_BikeIMG1(), " image of first bike on left side- SplendorPlusXtec ");
		Wait(ob.SplendorPlusXtec_Compare_BikeIMG2());
		VerifyImagePresent(ob.SplendorPlusXtec_Compare_BikeIMG2(), " image of second bike on right side- SplendorPlus ");
		ob.Compare2Bikes();
		
	}	  
	
	
	@Test(priority = 7)
	public void TC045_SplendorplusXTec_Find_A_Dealer() throws InterruptedException {
		
		
		driver.navigate().refresh();
		PageLoaded();
		Wait(ob.FindDealer_Icon());
		VerifyImagePresent(ob.FindDealer_Icon(), " Find Dealer Icon ");
		Wait(ob.FindDealer_Tab());
		VerifyElementPresent(ob.FindDealer_Tab(), " Find Dealer Tab");
		Custom_click(ob.FindDealer_Tab(), " Tab clickable ");
		VerifyElementPresent(ob.FindDealer_HeadingLeft(), " Heading on left ");
		VerifyElementPresent(ob.FindDealer_HeadingRight(), "Heading on right ");
		Thread.sleep(2000);
		Wait(ob.FindDealer_stateDD());
		Custom_click(ob.FindDealer_stateDD(), " State DropDown");
		Wait(ob.FindDealer_selectState());
		VerifyElementPresent(ob.FindDealer_selectState(), " state to be selected");
		Custom_click(ob.FindDealer_selectState(), " select state");
		Thread.sleep(2000);
		Wait(ob.FindDealer_CityDD());
		Custom_click(ob.FindDealer_CityDD(), " City DropDown");
		
		Wait(ob.FindDealer_selectCity());
		VerifyElementPresent(ob.FindDealer_selectCity(), " city to be selected");
		Wait(ob.FindDealer_selectCity());
		Custom_click(ob.FindDealer_selectCity()," select City");
		Thread.sleep(2000);
		ob.DealersName();
		
	}
	
	
	
	@Test(priority = 8)
	public void TC046_SplendorplusXTec_Exchange() throws Exception {   
		ob = new Motorcycles_practical();
		
		Thread.sleep(2000);
		home.ReqCallBack();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1800)");
		
		VerifyElementPresent(ob.Exchange_heading1(), " Heading 1 - ");
		VerifyElementPresent(ob.Exchange_heading2(), " Heading 2 - ");
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1800)");
		
		Wait(ob.SplendorPlusXtec_Exchange_BikeImage());
		VerifyImagePresent(ob.SplendorPlusXtec_Exchange_BikeImage(), " Image of bike");
		
		VerifyElementPresent(ob.Exchange_Button(), " Button Text ");
		Custom_click(ob.Exchange_Button(), "Exchange Button Clickable");
		
		 
		change_window(1, " Next window");
		Thread.sleep(3000);
		PageLoaded();

		driver.close();
		change_window(0, " Previous window");
		PageLoaded();		
	}	
	
	@Test(priority = 9)
	public void TC047_SplendorplusXTec_Calculate_EMI() throws Exception {
		ob = new Motorcycles_practical();
		PageLoaded(); 
		
		Wait(ob.EMI_heading());
		VerifyElementPresent(ob.EMI_heading(), " Heading ");
		
		
		VerifyElementPresent(ob.Payment_Heading(), " payment Heading");		
		VerifyElementPresent(ob.EMI_Payment(), " payment Heading");

		
		VerifyElementPresent(ob.Amount_NeededText(), " ");		
		VerifyElementPresent(ob.Min_AmtNeeded(), "Minimum Amount ");
		VerifyElementPresent(ob.Max_AmtNeeded(), "Maximum Amount ");

		String v1=ob.Amt_needed_Value().getAttribute("value");
		System.out.println(v1);
		Wait(ob.Amt_needed_Value());
		VerifyTextByAttribute(ob.Amt_needed_Value(), "Initial value ", " is ");
		
		 Actions move = new Actions(driver);
		 move.moveToElement(ob.Slider1()).clickAndHold().moveByOffset(100, 0).release().perform();
		 Wait(ob.Amt_needed_Value());
			VerifyTextByAttribute(ob.Amt_needed_Value(), "value after sliding once ", " is ");
			VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
		 Thread.sleep(2000);
		 move.moveToElement(ob.Slider1()).clickAndHold().moveByOffset(150, 0).release().perform();
		 Wait(ob.Amt_needed_Value());
			VerifyTextByAttribute(ob.Amt_needed_Value(), "value after sliding again ", " is ");
			VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
			
			
			VerifyElementPresent(ob.InterestRate_Text(), " ");		
			VerifyElementPresent(ob.Min_Interest(), "Minimum Interest ");
			VerifyElementPresent(ob.Max_Interest(), "Maximum Interest ");

			String v2=ob.Interest_Value().getAttribute("value");
			System.out.println(v2);
			Wait(ob.Interest_Value());
			VerifyTextByAttribute(ob.Interest_Value(), "Initial value ", " is ");
					
			 move.moveToElement(ob.Slider2()).clickAndHold().moveByOffset(100, 0).release().perform();
			 Wait(ob.Interest_Value());
				VerifyTextByAttribute(ob.Interest_Value(), "Interest rate after sliding once ", " is ");
				VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
			 Thread.sleep(2000);
			 move.moveToElement(ob.Slider2()).clickAndHold().moveByOffset(150, 0).release().perform();
			 Wait(ob.Interest_Value());
				VerifyTextByAttribute(ob.Interest_Value(), "Interest rate after sliding again ", " is ");
				VerifyElementPresent(ob.EMI_Payment(), " payment Heading");

				
				VerifyElementPresent(ob.Duration_Text(), " ");		
				VerifyElementPresent(ob.Min_Duration(), "Minimum Duration ");
				VerifyElementPresent(ob.Max_Duartion(), "Maximum Duration ");

				String v3=ob.Duration_Value().getAttribute("value");
				System.out.println(v3);
				Wait(ob.Duration_Value());
				VerifyTextByAttribute(ob.Duration_Value(), "Initial value ", " is ");
						
				 move.moveToElement(ob.Slider3()).clickAndHold().moveByOffset(80, 0).release().perform();
				 Wait(ob.Duration_Value());
					VerifyTextByAttribute(ob.Duration_Value(), "Duration after sliding once ", " is ");
					VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
				 Thread.sleep(2000);
				 move.moveToElement(ob.Slider3()).clickAndHold().moveByOffset(180, 0).release().perform();
				 Wait(ob.Duration_Value());
					VerifyTextByAttribute(ob.Duration_Value(), "Duration after sliding again ", " is ");
					VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
		
	}
	
	@Test(priority = 10)
	public void TC_048_SplendorplusXTec_Colours_And_VirtualView() throws Exception {
		ob = new Motorcycles_practical();
		PageLoaded();
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -3000)");
		
		VerifyElementPresent(ob.color360_Heading(), " Heading ");
		ob.Colors_Text();    // check color text clickable
		
		Wait(ob.colorSwitch_SparklingBetaBlue());
		VerifyImagePresent(ob.colorSwitch_SparklingBetaBlue(), "SplendorPlus- Sparkling Beta Blue");
		Custom_click(ob.colorSwitch_SparklingBetaBlue(), "Sparkling Beta Blue switch Clickable");
		
		Wait(ob.colorSwitch_TornadoGrey());
		VerifyImagePresent(ob.colorSwitch_TornadoGrey(), "SplendorPlus- Tornado Grey");
		Custom_click(ob.colorSwitch_TornadoGrey(), "Tornado Grey switch Clickable");
		
		
		Wait(ob.colorSwitch_PearlWhite());
		VerifyImagePresent(ob.colorSwitch_PearlWhite(), "SplendorPlus- Pearl White");
		Custom_click(ob.colorSwitch_PearlWhite(), "Pearl White switch Clickable");
		
		
		VerifyElementPresent(ob.Explore360(), " ");
		Custom_click(ob.Explore360(), " clicked");
		change_window(1, " Next window");
		Thread.sleep(2000);
		GetCurrentUrl();		
		PageLoaded();
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		
	
		


		
	}


}
