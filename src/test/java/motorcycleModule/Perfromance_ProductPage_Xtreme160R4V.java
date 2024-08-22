package motorcycleModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycle_ExecutiveModule;
import com.page_object.Motorcycle_PerfromanceModule;
import com.page_object.Motorcycles_practical;
import com.page_object.home_page;
import com.utility.base_class;

@Listeners(com.utility.listner.class)
public class Perfromance_ProductPage_Xtreme160R4V extends base_class {

	public Motorcycle_PerfromanceModule pfm;
	public Motorcycles_practical ob;
	public Motorcycle_ExecutiveModule exe;
	public static home_page home;
	SoftAssert asert = new SoftAssert();

	@Test(priority=0)
	public void Performance_productPage_XTreme160R4V() throws Exception {
		
		pfm=new Motorcycle_PerfromanceModule();
		exe=new Motorcycle_ExecutiveModule();		
		home=new home_page();
		ob = new Motorcycles_practical();
		
//		Custom_click(home.click_HeroLogo(), " click on hero logo");
		
		Wait(home.click_HeroLogo());
		Custom_click(home.click_HeroLogo(), "");
		PageLoaded();
		Wait(exe.motorcycles());
		Custom_click(exe.motorcycles(), "Motorcycles");
		PageLoaded();
		
		Custom_click(pfm.Xtreme160R4V_BikeName() , " on XTreme160R4V Text ");
		Thread.sleep(2000);
		PageLoaded();

	}
	
	
//	@Test(priority=1)
	public void XTreme160R4V_Overview() {
		pfm.click_Buttons_video();
	}

	@Test(priority=2)
	public void XTreme160R4V_Specifications() throws Exception {
		
		home.ReqCallBack();
		Wait(ob.specification_headerTab());
		VerifyElementPresent(ob.specification_headerTab(), " tab: ");
		Custom_click(ob.specification_headerTab(), " Heading");
		
		VerifyImagePresent(pfm.Specs_MattSlateBlack_PRO_Img(), "Matt Slate Black-PRO Image");
		Custom_click(pfm.Specs_MattSlateBlack_PRO_Img(), "Matt Slate Black PRO Image clickable");
		VerifyElementPresent(pfm.Specs_MattSlateBlack_PRO_Text()," Text present  : ");
		String color1=pfm.Specs_MattSlateBlack_PRO_Text().getText();
//		Assert.assertEquals(color1, "Matt Slate Black");
		
		Wait(pfm.Specs_ShootingNightStar_Img());
		VerifyImagePresent(pfm.Specs_ShootingNightStar_Img(), "Shooting Night Star Image");
		Custom_click(pfm.Specs_ShootingNightStar_Img(), "Shooting Night Star Image clickable");
		VerifyElementPresent(pfm.Specs_ShootingNightStar_Text()," Text present  : ");
		String color2=pfm.Specs_ShootingNightStar_Text().getText();
		Assert.assertEquals(color2, "Shooting Night Star");
		
		Wait(pfm.Specs_MattSlateBlack_Standard_Img());
		VerifyImagePresent(pfm.Specs_MattSlateBlack_Standard_Img(), "Matt Slate Black-Standard Image");
		Custom_click(pfm.Specs_MattSlateBlack_Standard_Img(), "Matt Slate Black Standard Image clickable");
		VerifyElementPresent(pfm.Specs_MattSlateBlack_Standard_Text()," Text present  : ");
		String color3=pfm.Specs_MattSlateBlack_Standard_Text().getText();
		Assert.assertEquals(color3, "Matt Slate Black (Standard Variant)");
		
		VerifyImagePresent(pfm.Specs_PearlRed_Img(), "PearlRed Image");
		Custom_click(pfm.Specs_PearlRed_Img(), "PearlRed Image clickable");
		VerifyElementPresent(pfm.Specs_PearlRed_Text()," Text present  : ");
		String color4=pfm.Specs_PearlRed_Text().getText();
		Assert.assertEquals(color4, "Pearl Red");

		Wait(pfm.Specs_BookNow());
		VerifyElementPresent(pfm.Specs_BookNow(), "");
		Custom_click(pfm.Specs_BookNow(), " click on Book Now");
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
	@Test(priority=3)
	public void XTreme160R4V_Features() throws Exception {
		Thread.sleep(2000);
		Wait(ob.Feature_Tab());
		VerifyElementPresent(ob.Feature_Tab(), "Tab: ");
		VerifyImagePresent(ob.Feature_Icon(), " feature icon  ");
		Custom_click(ob.Feature_Tab(), " Feature Tab clickable ");
		Thread.sleep(1000);		
		pfm.MouseHover_featureTiles();
	}

	@Test(priority=4)
	public void XTreme160R4V_HeroConnect() {
		//pfm.HeroConnect_SlickSlide();
		
		VerifyElementPresent(pfm.HeroConnect_safety(), " Element ");
		Custom_click(pfm.HeroConnect_safety(), "on Safety Tab");
		Custom_click(pfm.HeroConnect_safety_Ignition(), " on Sub elements");
		String T1=pfm.HeroConnect_safety_Ignition().getText();
		System.out.println(T1);
		String T2= pfm.HeroConnect_safety_Ignition_FeatureTile().getText();
		System.out.println(T2);
		Assert.assertEquals(T1, T2);
		
		Custom_click(pfm.HeroConnect_safety_PanicAlert(), " on Sub elements");
		String T3=pfm.HeroConnect_safety_PanicAlert().getText();
		System.out.println(T3);
		String T4= pfm.HeroConnect_safety_Ignition_FeatureTile().getText();
		System.out.println(T3);
		Assert.assertEquals(T3, T4);
		
		Custom_click(pfm.HeroConnect_safety_AccidentCrashAlertt(), " on Sub elements");
		String T5=pfm.HeroConnect_safety_AccidentCrashAlertt().getText();
		System.out.println(T5);
		String T6= pfm.HeroConnect_safety_Ignition_FeatureTile().getText();
		System.out.println(T6);
		Assert.assertEquals(T5, T6);
		
	}
	
	@Test(priority=5)
	public void XTreme160R4V_Price() throws Exception {
		Thread.sleep(1000);
		PageLoaded();
		VerifyImagePresent(ob.Price_Icon(), " price icon");
		VerifyElementPresent(ob.Price_Tab(), " Price tab");
		Custom_click(ob.Price_Tab(), " Price tab clickable");
		VerifyElementPresent(ob.Price_Heading(), " Heading");
		//Wait(exe.Exe_Price_PassionPro_Image());
       // VerifyImagePresent(exe.Exe_Price_PassionPro_Image(), " Bike Image of Passion Pro"); //glamour img not present on price section
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
	//	home.ReqCallBack();
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
		GetCurrentUrl();
//		VerifyElementPresent(ob.getBikeName_Header(), "Header bike name ");  
//		VerifyElementPresent(ob.getBikeName_Title(), " Bike title name");
//		String nameHeader=ob.getBikeName_Header().getText();
//		String nameTitle=ob.getBikeName_Title().getText();
//		Assert.assertEquals(nameHeader, nameTitle);

		driver.close();
		change_window(0, " Previous window");
		
	}
	
	@Test(priority=6)
	public void XTreme160R4V_FindADealer() throws Exception {
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		Wait(ob.FindDealer_Icon());
		VerifyImagePresent(ob.FindDealer_Icon(), " Find Dealer Icon ");
		Wait(ob.FindDealer_Tab());
		VerifyElementPresent(ob.FindDealer_Tab(), " Find Dealer Tab");
		Custom_click(ob.FindDealer_Tab(), " Tab clickable ");
		VerifyElementPresent(ob.FindDealer_HeadingLeft(), " Heading on left ");
		VerifyElementPresent(ob.FindDealer_HeadingRight(), "Heading on right ");
		Thread.sleep(1000);
		Wait(ob.FindDealer_stateDD());
		Custom_click(ob.FindDealer_stateDD(), " State DropDown");
		Wait(ob.FindDealer_selectState());
		VerifyElementPresent(ob.FindDealer_selectState(), " state to be selected");
		Custom_click(ob.FindDealer_selectState(), " select state");
		Thread.sleep(1000);
		Wait(ob.FindDealer_CityDD());
		Custom_click(ob.FindDealer_CityDD(), " City DropDown");
	//	home.ReqCallBack();
		Wait(ob.FindDealer_selectCity());
		VerifyElementPresent(ob.FindDealer_selectCity(), " city to be selected");
		Wait(ob.FindDealer_selectCity());
		Custom_click(ob.FindDealer_selectCity()," select City");
	//	home.ReqCallBack();
		Thread.sleep(1000);
		ob.DealersName();
		//home.ReqCallBack();

	}
	
	@Test(priority=7)
	public void XTreme160R4V_SignUp_forNew() throws Exception {
		
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
		
//		Thread.sleep(2000);
		Wait(home.get_ThankyouMsg());
		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		
//		Custom_click(home.click_RequestCB_closeBttn1(),"close bttn clickable");
		
	}
	
}
