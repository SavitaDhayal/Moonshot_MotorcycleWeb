package homePage;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.GoodLifeModule;
import com.page_object.home_page;
import com.page_object.login_page;
import com.utility.base_class;
@Listeners(com.utility.listner.class)
public class Goodlife_before_Login extends base_class {
	
	public static home_page home;
	public static GoodLifeModule goodlife;
	public static login_page login;
	
	//login functionality issue
	
	@Test
	public void homePage_goodLife_selectPlatinum() throws Exception {
		home = PageFactory.initElements(driver, home_page.class);
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
		login = PageFactory.initElements(driver, login_page.class);
		
		PageLoaded();
		Wait(home.click_goodLife());
		Custom_click(home.click_goodLife(), "GOOD LIFE");
		PageLoaded();
		Wait(goodlife.Click_ViewPlan2());
		Custom_click(goodlife.Click_ViewPlan2(), "VIEW PLAN");
		PageLoaded();
		
		//Thread.sleep(5000);
		Wait(goodlife.PlatinumMemb());
		VerifyElementPresent(goodlife.PlatinumMemb(), "Membership");
		VerifyElementPresent(goodlife.PlatinumCost(), "Cost");
		Custom_click(goodlife.Choose_platinumMemb(), "select platinum plan");
		PageLoaded();
		Thread.sleep(5000);
		Wait(login.getusername());
		custom_sendkeys(login.getusername(), config_getdata("MobileNo"), "MobileNo");
		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		Wait(login.getClick_submit_Button());
		Custom_click(login.getClick_submit_Button(), "Button");
		Thread.sleep(3000);
		VerifyImagePresent(goodlife.PlatinumImage(), "Platinum Image");
		Wait(goodlife.PlatinumInsurance());
		VerifyElementPresent(goodlife.PlatinumInsurance(), "Insurance ");
		
		VerifyElementPresent(goodlife.Bike_title(), " Bike ");
		VerifyElementPresent(goodlife.Bike_number(), "Bike Number");
		Thread.sleep(5000);
		Wait(goodlife.Change_vehicle());
		Custom_click(goodlife.Change_vehicle(), " change vehicle link ");
		Wait(goodlife.close_vehiclePopup());
		Custom_click(goodlife.close_vehiclePopup(), "change vehicle popup");
		Check_IfSelected(goodlife.Select_Owner(), "by default selected", " ");
		// library.VerifyElementPresent(goodlife.get_OwnerName(), "Owner name ", " ");
//		String name=goodlife.get_OwnerName().getAttribute("value");
//		System.out.println(name);
		VerifyTextByAttribute(goodlife.get_OwnerName(), "Name ", " ");

		custom_sendkeys(goodlife.get_OwnerDob(), config_getdata("ownerdob"), "owner date of birth");
		goodlife.get_OwnerEmail().clear();
		custom_sendkeys(goodlife.get_OwnerEmail(), config_getdata("owneremail"), "owner Email ");
		goodlife.get_OwnerAdd().clear();
		Check_IfSelected(goodlife.select_OwnerGender(), "select gender", "selected");
		custom_sendkeys(goodlife.get_OwnerAdd(), config_getdata("ownerAdd"), "owner address");
		goodlife.get_OwnerPincode();
		custom_sendkeys(goodlife.get_OwnerPincode(), config_getdata("ownerPin"), "pin code");

		Select state = new Select(goodlife.select_OwnerState());
		state.selectByVisibleText("DELHI");

		Select city = new Select(goodlife.select_OwnerCity());
		city.selectByVisibleText("NEW DELHI");
		Wait(goodlife.Click_ProceedBttn());
		Custom_click(goodlife.Click_ProceedBttn(), "Proceed");
		PageLoaded();
		
		
		
		PageLoaded();
		VerifyElementPresent(goodlife.NomineeDetailsText(), "Text ");
		Wait(goodlife.get_NomineeName());
		custom_sendkeys(goodlife.get_NomineeName(), config_getdata("nomineeName"), "Nominee Name is ");

		Select relation = new Select(goodlife.select_NomineeRelation());
		relation.selectByVisibleText("Brother");

		custom_sendkeys(goodlife.get_NomineeMobile(), config_getdata("nomineeNum"), "Nominee Contact number is  ");
		Custom_click(goodlife.choose_sameAdd(), "select addres as same as user");
		Custom_click(goodlife.select_NomAcknowledgement(), "Aknowledgement chcekbox");

		Select DeclaraRelation = new Select(goodlife.select_DeclrRelation());
		DeclaraRelation.selectByVisibleText("Son Of");

		custom_sendkeys(goodlife.get_decRelativeName(), config_getdata("relativeName"), "Relative Name");
		Custom_click(goodlife.Click_ProceedPayment(), "Proceed for payment");
		Thread.sleep(3000);
	
		PageLoaded();
		VerifyElementPresent(goodlife.validate_totalAmount(), "Total amount");

		driver.navigate().back();
		
		Wait(goodlife.Click_GoodLife());
		Custom_click(goodlife.Click_GoodLife(), "GoodLifeTab");

	}
	
	@Test
	public void homePage_Services_bookNow() throws Exception{
		home = PageFactory.initElements(driver, home_page.class);
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
		login = PageFactory.initElements(driver, login_page.class);
		Wait(home.click_SERVICES());
		Custom_click(home.click_SERVICES(), "HOMEPAGE->SERVICES");
		Wait(home.click_Book_a_Service());
		PageLoaded();
		Custom_click(home.click_Book_a_Service(), "SERVICES->Book a Service");
	
		PageLoaded();
	//	Thread.sleep(5000);
		Wait(login.getusername());  	//now login tab appears
		custom_sendkeys(login.getusername(), config_getdata("MobileNo"), "MobileNo");
		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		Wait(login.getClick_submit_Button());
		Custom_click(login.getClick_submit_Button(), "Button");
		
		PageLoaded();

	}

}
