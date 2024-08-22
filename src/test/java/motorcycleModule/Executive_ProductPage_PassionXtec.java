package motorcycleModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycle_ExecutiveModule;
import com.page_object.Motorcycles_practical;
import com.page_object.home_page;
import com.utility.base_class;

@Listeners(com.utility.listner.class)
public class Executive_ProductPage_PassionXtec extends base_class {

	public Motorcycles_practical ob;
	public Motorcycle_ExecutiveModule exe;
	public static home_page home;
	SoftAssert asert = new SoftAssert();
	
	@Test(priority=0)
	public void Executive_productPage_PassionXtec() throws Exception {
		
		exe=new Motorcycle_ExecutiveModule(); 
		ob = new Motorcycles_practical();
		home=new home_page();
		
		
	//	Wait(home.click_HeroLogo());
	//	Custom_click(home.click_HeroLogo(), "");
		
	//	PageLoaded();
	//	Custom_click(home.click_HeroLogo(), "hero logo");
	//	Thread.sleep(2000);
		PageLoaded();
		Wait(exe.motorcycles());
		Custom_click(exe.motorcycles(), "Motorcycles");
		PageLoaded();
		
		Custom_click(exe.PassionXtecText() , " on Passion xtec Text ");
		Thread.sleep(2000);
		PageLoaded();
	//	home.ReqCallBack();
		
	}
	
	
	@Test(priority=9)
	public void TC_113_PassionXtec_Features() throws Exception {
		
		Thread.sleep(2000);
		
		Wait(ob.Feature_Tab());
		VerifyElementPresent(ob.Feature_Tab(), "Tab: ");
		VerifyImagePresent(ob.Feature_Icon(), " feature icon  ");
		
		home.ReqCallBack();
		Custom_click(ob.Feature_Tab(), " Feature Tab clickable ");
		
		VerifyElementPresent(ob.Feature_headingText(), " Heading >> ");
		Thread.sleep(2000);

	}

	@Test(priority=1)
	public void TC_114_PassionXtec_Specification() throws Exception {  
			
		Thread.sleep(2000);
		
		
		home.ReqCallBack();
		Wait(ob.specification_headerTab());
		VerifyElementPresent(ob.specification_headerTab(), " tab: ");
	//	home.ReqCallBack();
		Custom_click(ob.specification_headerTab(), " Heading");
		
		VerifyElementPresent(exe.Exe_Specification_Heading(), " Heading>>> ");
		
		Wait(exe.Exe_Engine());
		VerifyElementPresent(exe.Exe_Engine(), " ");
	//	Custom_click(exe.Exe_Engine(), " On Engine text");
		
		Thread.sleep(2000);
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");
		Wait(exe.Exe_PassionXtec_Engine_Image());
		VerifyImagePresent(exe.Exe_PassionXtec_Engine_Image(), " Engine Image of Passion-Xtec");
		
		
		Wait(exe.Exe_Passionxtec_WheelTab());
		VerifyElementPresent(exe.Exe_Passionxtec_WheelTab(), "tab:  ");
		Custom_click(exe.Exe_Passionxtec_WheelTab(), " On Wheel text");
		Thread.sleep(1000);
		Wait(exe.Exe_PassionXtec_Wheels_Image());
		VerifyImagePresent(exe.Exe_PassionXtec_Wheels_Image(), " Tyres Image- PassionXtec");
		
    	home.ReqCallBack();
		Wait(exe.Exe_Suspension());
		VerifyElementPresent(exe.Exe_Suspension(), " ");
		Custom_click(exe.Exe_Suspension(), " On Susupension text");
		Thread.sleep(1000);
		Wait(exe.Exe_PassionXtec_Suspension_Image());
		VerifyImagePresent(exe.Exe_PassionXtec_Suspension_Image(), " Susupension Image- Passion Xtec");
		
		Thread.sleep(1000);
		Wait(exe.Exe_Dimensions());
		VerifyElementPresent(exe.Exe_Dimensions(), " ");
		Custom_click(exe.Exe_Dimensions(), " On Dimensions text");
		Wait(exe.Exe_PassionXtec_Dimensions_Image());
		VerifyImagePresent(exe.Exe_PassionXtec_Dimensions_Image(), " Dimensions Image- Passion Pro");
		
		//home.ReqCallBack();

		Thread.sleep(1000);
		Wait(exe.Exe_Gearbox());
		VerifyElementPresent(exe.Exe_Gearbox(), " ");
		Custom_click(exe.Exe_Gearbox(), " On Gearbox text");
		Wait(exe.Exe_PassionXtec_Gear_Image());
		VerifyImagePresent(exe.Exe_PassionXtec_Gear_Image(), " Gearbox Image- Passion Xtec");		
		
		Wait(exe.Exe_Specs_DownloadBroucher());
		Custom_click(exe.Exe_Specs_DownloadBroucher(), " On Downlaod Broucher");
		Thread.sleep(2000);
		GetCurrentUrl();
		driver.navigate().back();
		Thread.sleep(2000);
		PageLoaded();
		
		Wait(exe.Exe_Specs_ShareIcon());
		VerifyImagePresent(exe.Exe_Specs_ShareIcon(), "Image of Share icon ");
		Custom_click(exe.Exe_Specs_ShareIcon(), "On Share icon");
		Wait(exe.Exe_Specs_ShareIconEmail());
		VerifyImagePresent(exe.Exe_Specs_ShareIconEmail(), "Check image of Email Icon");
		Wait(exe.Exe_Specs_ShareIconWhatsapp());
		VerifyImagePresent(exe.Exe_Specs_ShareIconWhatsapp(), "Check Image of Whatsapp Icon");

		
	}
	

	@Test(priority=2)
	public void TC_115_PassionXtec_Price() throws Exception {     //44 steps
		
		
		PageLoaded();
		VerifyImagePresent(ob.Price_Icon(), " price icon");
		VerifyElementPresent(ob.Price_Tab(), " Price tab");
		Custom_click(ob.Price_Tab(), " Price tab clickable");
		VerifyElementPresent(ob.Price_Heading(), " Heading");
		Wait(exe.Exe_Price_PassionXtec_Image());
        VerifyImagePresent(exe.Exe_Price_PassionXtec_Image(), " Bike Image of Passion Xtec");
		Thread.sleep(2000);
		Wait(ob.Price_StateDD());
		Custom_click(ob.Price_StateDD()," state DropDown");
		Wait(ob.Price_SelectState1());
		VerifyElementPresent(ob.Price_SelectState1(), " State to be selected ");		
		Custom_click(ob.Price_SelectState1(), " Selected state");
		//VerifyElementPresent(ob.Price_SelectState1(), " State to be selected ");
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
		Thread.sleep(2000);
		Custom_click(ob.Price_CityDD(), " City dropDown");
		VerifyElementPresent(ob.Price_SelectCity2(), "City to be selected");
	//	Thread.sleep(2000);
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

	}
	
	
	@Test(priority=3)
	public void TC_116_PassionXtec_Compare() throws Exception {   
		
		Thread.sleep(2000);
		Wait(ob.CompareIcon());
		VerifyImagePresent(ob.CompareIcon(), " compare icon");
		VerifyElementPresent(ob.CompareTab(), " tab text ");
		Custom_click(ob.CompareTab(), " check custom tab clickable");
		VerifyElementPresent(ob.Compare_Heading(), " Compare Heading"); 
		VerifyElementPresent(ob.Compare_BikeName1(), " Name of first Bike ");
		VerifyElementPresent(ob.Compare_BikeName2(), " Name of second Bike ");
		Wait(exe.Exe_Compare_PassionXtec_Bike1_Img());  
		VerifyImagePresent(exe.Exe_Compare_PassionXtec_Bike1_Img(), " image of first bike ");
		VerifyImagePresent(exe.Exe_Compare_PassionXtec_Bike2_Img(), " image of second bike ");
		ob.Compare2Bikes();
		
	}
	
	
	@Test(priority=4)
	public void TC_117_PassionXtec_Find_A_Dealer() throws Exception{  

		driver.navigate().refresh();
		Wait(ob.FindDealer_Icon());
		VerifyImagePresent(ob.FindDealer_Icon(), " Find Dealer Icon ");
		VerifyElementPresent(ob.FindDealer_Tab(), " Find Dealer Tab");
		Custom_click(ob.FindDealer_Tab(), " Tab clickable ");
		VerifyElementPresent(ob.FindDealer_HeadingLeft(), " Heading on left ");
		VerifyElementPresent(ob.FindDealer_HeadingRight(), "Heading on right ");
		Thread.sleep(2000);
		Wait(ob.FindDealer_stateDD());
		Custom_click(ob.FindDealer_stateDD(), " State DropDown");
		Thread.sleep(2000); 
		Wait(ob.FindDealer_selectState()); //this is disabled
		VerifyElementPresent(ob.FindDealer_selectState(), " state to be selected");
		Thread.sleep(3000);
		Wait(ob.FindDealer_selectState());
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
	

	@Test(priority=5)
	public void  TC_118_PassionXtec_RequestCallback() throws Exception {   

		PageLoaded();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",ob.RequestCB_bttn_bannerMotorcycle());
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)");
		VerifyElementPresent(ob.RequestCB_bttn_bannerMotorcycle(), "RCB button ");
		
		Wait(ob.RequestCB1_bttn_bannerMotorcycle());
		Custom_click(ob.RequestCB1_bttn_bannerMotorcycle(), " ");
		Wait(ob.RequestCB_bttn_PopUpMotorcycle());
		VerifyElementPresent(ob.RequestCB_bttn_PopUpMotorcycle(), " Request call Back Popup ");
//		Wait(ob.RequestCB_name_Motorcycle());
//		custom_sendkeys(ob.RequestCB_name_Motorcycle() , config_getdata("Name"), "Name");
//		Wait(ob.RequestCB_Mobile_Motorcycle());
//		custom_sendkeys(ob.RequestCB_Mobile_Motorcycle(), config_getdata("MobileNo"), "Mobile No.");
//		Wait(ob.RequestCB_otp_Motorcycle());
//		custom_sendkeys(ob.RequestCB_otp_Motorcycle(), config_getdata("OTP"), "Enter OTP");
//		
//		Wait(ob.RequestCB_stateDD_Motorcycle());
//		Custom_click(ob.RequestCB_stateDD_Motorcycle(), " click on select state");
//		VerifyElementPresent(ob.RequestCB_selectState_Motorcycle(), " state to be selected ");
//		Custom_click(ob.RequestCB_selectState_Motorcycle(), "select state");
//		
//		Thread.sleep(2000);
//		Wait(ob.RequestCB_cityDD_Motorcycle());
//		Custom_click(ob.RequestCB_cityDD_Motorcycle(), " click on select city");
//		Wait(ob.RequestCB_selectCity_Motorcycle());
//		VerifyElementPresent(ob.RequestCB_selectCity_Motorcycle(), " city to be selected ");
//		Custom_click(ob.RequestCB_selectCity_Motorcycle(), "select city");	
//		Custom_click(ob.RequestCB_ClickSubmit_Motorcycle(), " Submit bttn clickable");
//		
//		Wait(home.get_ThankyouMsg());
//		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
//		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		Custom_click(home.click_Request_CB_closeBttn(), " click on cross button");
		Thread.sleep(2000);
		Wait(exe.Exe_BookNow());
		VerifyElementPresent(exe.Exe_BookNow(), "Book Now button");
		Custom_click(exe.Exe_BookNow(), " click on BookNow");
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
	
	}
	

	@Test(priority=6)
	public void TC_119_PassionXtec_Colours_360View() throws Exception {   
		
		home.ReqCallBack();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",exe.colorSwitch_PassionXtec_CandyBlazingRed());
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-200)");
		Wait(ob.color360_Heading());
		VerifyElementPresent(ob.color360_Heading(), " Heading>> ");
		ob.Colors_Text();    // check color text clickable

		Thread.sleep(2000 );
		Wait(exe.colorSwitch_PassionXtec_CandyBlazingRed());
		VerifyImagePresent(exe.colorSwitch_PassionXtec_CandyBlazingRed(), "Candy Blazing Red Switch");
		Custom_click(exe.colorSwitch_PassionXtec_CandyBlazingRed(),"Candy Blazing Red Switch clickable");
		
		
		Wait(exe.colorSwitch_PassionXtec_BlackForceSilver());
		VerifyImagePresent(exe.colorSwitch_PassionXtec_BlackForceSilver(), "Black with Force Silver Switch");
		Custom_click(exe.colorSwitch_PassionXtec_BlackForceSilver(),"Black with Force Silver Switch clickable");

		Wait(exe.colorSwitch_PassionXtec_BlackBlue());
		VerifyImagePresent(exe.colorSwitch_PassionXtec_BlackBlue(), "Black with Polestar Blue Switch");
		Custom_click(exe.colorSwitch_PassionXtec_BlackBlue(),"Black with Polestar Blue Switch clickable");
		
		
		VerifyElementPresent(ob.Explore360(), " ");
		Custom_click(ob.Explore360(), " clicked");
		change_window(1, " Next window");
		Thread.sleep(2000);
		GetCurrentUrl();		
		PageLoaded();
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		Thread.sleep(2000);
		
		Wait(exe.Exe_Color360_BookNow());
		VerifyElementPresent(exe.Exe_Color360_BookNow(), "");
		Custom_click(exe.Exe_Color360_BookNow(), " click on BookNow");
		change_window(1, " Next window");
		Thread.sleep(2000);
		PageLoaded();
		Wait(ob.getBikeName_Header());
		VerifyElementPresent(ob.getBikeName_Header(), "Header bike name ");  
		Wait(ob.getBikeName_Title());
		
		VerifyElementPresent(ob.getBikeName_Header(), "Header bike name ");  
		VerifyElementPresent(ob.getBikeName_Title(), " Bike title name");
		String nameHeader=ob.getBikeName_Header().getText();
		String nameTitle=ob.getBikeName_Title().getText();
		Assert.assertEquals(nameHeader, nameTitle);
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		
	}
	
	
	@Test(priority=7)
	public void TC_120_EXE_PassionXtec_Book_A_Test_Ride() throws Exception {  
		
		
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
	Wait(ob.BTR_HeadingText());
	VerifyElementPresent(ob.BTR_HeadingText(), " Heading ");
	Wait(ob.BTR_name());
	//Thread.sleep(2000);
	custom_sendkeys(ob.BTR_name() , config_getdata("Name"), "Name");
	custom_sendkeys(ob.BTR_mobileNum(), config_getdata("MobileNo"), "Mobile No.");
	custom_sendkeys(ob.BTR_otp(), config_getdata("OTP"), "Enter OTP");
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
	Wait(ob.BTR_StateDD());
	Custom_click(ob.BTR_StateDD(), " click on select state");
	Custom_click(ob.BTR_selectState(), "select state");
	Wait(ob.BTR_CityDD());
	Custom_click(ob.BTR_CityDD(), " click on select city");
	Custom_click(ob.BTR_citySelect(), "select city");
	if(driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).isEnabled()) {
	Custom_click(ob.BTR_submitBttn(), " Submit bttn clickable");}
	
//	Thread.sleep(2000);
	Wait(home.get_ThankyouMsg());
	VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
	VerifyElementPresent(home.get_connectMsg(),"Text Present ");
	
	Custom_click(home.click_RequestCB_closeBttn1(),"close bttn clickable");
		
	}
	
	
	
	@Test(priority=8)  //>>>need to check Explore now button if or not present
	public void TC_121_EXE_PassionXtec_EshopLinks() throws Exception {  
		
		
		Wait(exe.exe_Eshop_GoodLife());
		VerifyElementPresent(exe.exe_Eshop_GoodLife(), "Eshop- ");
		
	//	Custom_click(exe.exe_EshopLink_GoodLife(), "good life link");
		
		VerifyElementPresent(exe.exe_Eshop_GoodLife_ExploreNow(), " Explore now for goodlife ");
		Custom_click(exe.exe_Eshop_GoodLife_ExploreNow(), "to check if text clickable ");
		
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		
		
		Wait(exe.exe_Eshop_JoyRide());
		VerifyElementPresent(exe.exe_Eshop_JoyRide(), "Eshop- ");
		VerifyElementPresent(exe.exe_Eshop_JoyRide_ExploreNow(), "Explore now for Hero-Joy Ride ");
		Custom_click(exe.exe_Eshop_JoyRide_ExploreNow(), "to check if text clickable ");
		
//		Custom_click(exe.exe_EshopLink_JoyRide(), " Hero Joy Ride Link");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();

		
		Wait(exe.exe_Eshop_Accessories());
		VerifyElementPresent(exe.exe_Eshop_Accessories(), "Eshop- ");
		VerifyElementPresent(exe.exe_Eshop_Accessories_ExploreNow(), "Explore now for Accessories ");
		Custom_click(exe.exe_Eshop_Accessories_ExploreNow(), "to check if text clickable ");
		
//		Custom_click(exe.exe_Eshop_Access(), " Accessorries");
		
		
		PageLoaded();		
		change_window(1, " Next window");
		Thread.sleep(2000);
		GetCurrentUrl();		
		PageLoaded();
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		Thread.sleep(2000);	
		
	}
	
	

	
	
}
