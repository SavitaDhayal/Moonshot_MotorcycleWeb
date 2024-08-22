package serviceLogin_Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.GoodLifeModule;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;
@Listeners(com.utility.listner.class)
public class GoodLife extends base_class {

	public static GoodLifeModule goodlife;
	public static login_page login;
	
	@Test(priority=0)
	public void login() throws Exception {  
		 
		login = PageFactory.initElements(driver, login_page.class);
		Thread.sleep(3000);
		Wait(login.clickLoginTab());
		Custom_click(login.clickLoginTab(), "loginTab");
		custom_sendkeys(login.getusername(), config_getdata("MobileNo"), "MobileNo");
		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		Wait(login.getClick_submit_Button());
		Custom_click(login.getClick_submit_Button(), "Button");
	}

	@Test(dependsOnMethods ="login" ,priority=1)
	public void GoodLifePage() throws Exception {

		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
		Thread.sleep(3000);
	//	Wait(goodlife.JoinNow_GoodLife());

		((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(250,350)");
		Custom_click(goodlife.JoinNow_GoodLife(), "Join Now");
		Custom_click(goodlife.Click_ViewPlan1(), "View Plan");
		PageLoaded();
		Thread.sleep(2000);
		Wait(goodlife.Click_GoodLife());
		Custom_click(goodlife.Click_GoodLife(), "GoodLifeTab");
		Thread.sleep(2000);
		Check_IfSelected(goodlife.GoodLife_ServicePerks(), "Service Perks: ", "Clickable");
		Wait(goodlife.GoodLife_Benefits());
		Check_IfSelected(goodlife.GoodLife_Benefits(), "Benefits: ", "Clickable");
		Wait(goodlife.GoodLife_Rewards());
		Check_IfSelected(goodlife.GoodLife_Rewards(), "Rewards: ", "Clickable");


		Wait(goodlife.Click_ViewPlan2());
		Custom_click(goodlife.Click_ViewPlan2(), "VIEW PLAN");
		PageLoaded();
		Thread.sleep(2000);
		Wait(goodlife.Click_GoodLife());
		Custom_click(goodlife.Click_GoodLife(), "GoodLifeTab");

	}

	@Test(dependsOnMethods="login", priority=2)
	public void GoodLife_banner() throws Exception {
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
//		Wait(goodlife.JoinNow_GoodLife());
//		((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(250,350)");
//		Thread.sleep(5000);
//		Custom_click(goodlife.JoinNow_GoodLife(), "Join Now");
		Thread.sleep(2000);
		Wait(goodlife.GoodLife_BannerText());
		VerifyElementPresent(goodlife.GoodLife_BannerText(), "Banner text ");
		List<WebElement> BannerImage = driver.findElements(By.xpath("//img[@class='img-fluid d-none d-md-block']"));

		for (int i = 0; i < BannerImage.size(); i++) {
			VerifyImagePresent(BannerImage.get(i), "Banner Image : " + (i + 1));
		}

		List<WebElement> carouselClick = driver
				.findElements(By.xpath("//div[@class='carousel slide cust-demo']/ul/li"));
		for (int i = 0; i < carouselClick.size(); i++) {
			Custom_click(carouselClick.get(i), "Carousel " + (i + 1));
		}
	}

	@Test(dependsOnMethods="login", priority=3)
	public void YourGoodLife_Benefits() throws Exception {
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
		// div[@class='good-life-tab-header']/h3 // your goodlife benefits

		// --------------------------Service Perks---------------------------------
		Thread.sleep(2000);
		Check_IfSelected(goodlife.GoodLife_ServicePerks(), "ServicePerks: ", "Clickable");
		List<WebElement> ServiceTabDes = driver.findElements(By.xpath("//div[@class='service-tab-description']/p"));

		for (int i = 0; i < ServiceTabDes.size(); i++) {
			System.out.println(ServiceTabDes.get(i).getText());
			TextOfElement(ServiceTabDes.get(i).getText(), "Service tab description  ");
		}

		List<WebElement> ServiceTabicon = driver.findElements(By.xpath("//div[@class='service-tab-icon']/img"));

		for (int i = 0; i < ServiceTabicon.size(); i++) {
			VerifyIconPresent(ServiceTabicon.get(i), "Service Tab icon " + (i + 1));
		}

		// -------------------------Benefits------------------------------------------------------------
		Check_IfSelected(goodlife.GoodLife_Benefits(), "Benefits: ", "Clickable");
		Thread.sleep(3000);
		List<WebElement> BenefitTabDes = driver.findElements(By.xpath("//p[@class='benifits-tab-description']"));

		for (int i = 0; i < BenefitTabDes.size(); i++) {
			System.out.println(BenefitTabDes.get(i).getText());
			TextOfElement(BenefitTabDes.get(i).getText(), "benefits tab description  ");
		}

		List<WebElement> BenefitTabicon = driver.findElements(By.xpath("//img[@class='benifits-tab-icon']"));

		for (int i = 0; i < BenefitTabicon.size(); i++) {
			VerifyIconPresent(BenefitTabicon.get(i), "Benefit Tab icon " + (i + 1));
		}

		// -------------------------Rewards------------------------------------------------------------

		Check_IfSelected(goodlife.GoodLife_Rewards(), "Rewards: ", "Clickable");
		Thread.sleep(3000);
		List<WebElement> RewardsTabDes = driver.findElements(By.xpath("//p[@class='rewards-tab-description']"));

		for (int i = 0; i < RewardsTabDes.size(); i++) {
			System.out.println(RewardsTabDes.get(i).getText());
			TextOfElement(RewardsTabDes.get(i).getText(), "Rewards tab description  ");
		}

		List<WebElement> RewardsTabicon = driver.findElements(By.xpath("//img[@class='rewards-tab-icon']"));

		for (int i = 0; i < RewardsTabicon.size(); i++) {
			VerifyIconPresent(RewardsTabicon.get(i), "Benefit Tab icon " + (i + 1));
		}

	}

	@Test(dependsOnMethods="login", priority=4)
	public void GoodLife_WinnerOfMonth() throws Exception {
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);

		Wait(goodlife.Text_WinnerOfMonth());
		VerifyElementPresent(goodlife.Text_WinnerOfMonth(), "Month");
		VerifyImagePresent(goodlife.WinnerBannerImage_left(), "winner award image");
	
		// Banner Image");
		Wait(goodlife.Click_ViewDetails2());
		 Thread.sleep(2000);
		Custom_click(goodlife.Click_ViewDetails2(), "Winner view details tab");
		PageLoaded();
		
		Thread.sleep(2000);
		Wait(goodlife.Click_GoodLife());
		Custom_click(goodlife.Click_GoodLife(), "GoodLifeTab");
		
	}

	@Test(dependsOnMethods="login", priority=5)
	public void PlatinumMembership() throws Exception {
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
		Thread.sleep(2000);
//		Wait(goodlife.JoinNow_GoodLife());
//		Thread.sleep(3000);
//		Custom_click(goodlife.JoinNow_GoodLife(), "Join Now");
		Custom_click(goodlife.Click_ViewPlan1(), "View Plan");
		PageLoaded();
		Thread.sleep(5000);
		VerifyElementPresent(goodlife.PlatinumMemb(), "Membership");
		VerifyElementPresent(goodlife.PlatinumCost(), "Cost");
		Custom_click(goodlife.Choose_platinumMemb(), "select platinum plan");
		PageLoaded();
		VerifyImagePresent(goodlife.PlatinumImage(), "Platinum Image");
		Wait(goodlife.PlatinumInsurance());
		VerifyElementPresent(goodlife.PlatinumInsurance(), "Insurance ");
		
		VerifyElementPresent(goodlife.Bike_title(), " Bike ");
		VerifyElementPresent(goodlife.Bike_number(), "Bike Number");
		Thread.sleep(3000);
		Wait(goodlife.Change_vehicle());
		Custom_click(goodlife.Change_vehicle(), " change vehicle link ");
		Wait(goodlife.close_vehiclePopup());
		Custom_click(goodlife.close_vehiclePopup(), "change vehicle popup");
		Check_IfSelected(goodlife.Select_Owner(), "by default selected","text");
		// VerifyElementPresent(goodlife.get_OwnerName(), "Owner name ");
//		String name=goodlife.get_OwnerName().getAttribute("value");
//		System.out.println(name);
		VerifyTextByAttribute(goodlife.get_OwnerName(), "Name ","text");

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

	}

	@Test(dependsOnMethods = "PlatinumMembership", priority=6)
	public void NomineeForm() throws Exception {
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);

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

	}

	@Test(dependsOnMethods = "NomineeForm", priority=7)
	public void ViewNominee_goodLifePage() throws Exception {

		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);

		PageLoaded();
		Wait(goodlife.Click_GoodLife());
		Custom_click(goodlife.Click_GoodLife(), "GoodLifeTab");
		PageLoaded();
		VerifyElementPresent(goodlife.verify_viewNomineeLink(), "View nominee Text");
		Custom_click(goodlife.click_viewNomineeLink(), " View Nominee link");
		VerifyElementPresent(goodlife.NomineeInfo_popup_open(), " popup open");
		VerifyTextByAttribute(goodlife.verify_NomineeName(), "Nominee Name ","text");
		VerifyTextByAttribute(goodlife.verify_NomineeRelation(), "Nominee Relationship","text");
		VerifyTextByAttribute(goodlife.verify_NomineeNum(), "Nominee Mobile","text");
		VerifyTextByAttribute(goodlife.verify_NomineeAdd(), "Nominee Address","text");
		Thread.sleep(2000);
		Custom_click(goodlife.popup_close(), "close popup");

	}
	
	@Test(priority=8)
	public void Earning_and_RedemptionHistory() throws Exception {
		
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
		PageLoaded();
		Wait(goodlife.Click_GoodLife());
		Custom_click(goodlife.Click_GoodLife(), "GoodLifeTab");
		Thread.sleep(3000);
		Wait(goodlife.Click_Earning_and_redemptionHistory());
		Custom_click(goodlife.Click_Earning_and_redemptionHistory(), "Earning and Redemption history");
		((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(250,350)");
		VerifyElementPresent(goodlife.EarningHistory(), "Text ");
		VerifyElementPresent(goodlife.get_EarningDate(), "Earning Date");
		VerifyElementPresent(goodlife.get_EarningAmount(), "Earning Amount");
		VerifyElementPresent(goodlife.get_EarningType(), "Earning Type");
		VerifyElementPresent(goodlife.get_EarningPoints(), "Earning Points");
		VerifyElementPresent(goodlife.RedemptionHistory(),"text");
		VerifyElementPresent(goodlife.get_RedemptionHistory(),"text");
		Thread.sleep(2000);
		Custom_click(goodlife.Click_GoodLife(), "GoodLifeTab");
	
	}
	
//======On Hold======================================================================================
//	@Test(dependsOnGroups = { "Login_MyVehiclePage.Login_Account" })
//	public void Refer_Friend() {
//		
//		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
//		Wait(goodlife.JoinNow_GoodLife());
//		
//		((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(250,350)");
//		Custom_click(goodlife.JoinNow_GoodLife(), "Join Now");
//		
//	}
//=================================================================================================	
	
	@Test(priority=9)
	public void GoldMembership() throws Exception {
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
		Thread.sleep(3000);

		PageLoaded();
		Custom_click(goodlife.Click_ViewPlan1(), "View Plan");
		PageLoaded();
		Thread.sleep(5000);
		VerifyElementPresent(goodlife.verify_GoldMemb(), "Membership");
		
		VerifyElementPresent(goodlife.get_GoldCost(), " Gold plan Cost");
//		String text1=goodlife.get_GoldCost().getText();
		
		Custom_click(goodlife.Choose_GoldMemb(), "select Gold plan");
		PageLoaded();
		VerifyImagePresent(goodlife.verify_goldlogoImage(), "Gold Image");
		
		VerifyElementPresent(goodlife.get_GoldBannerPrice(), "Gold Banner Price");
		
//		String text2=goodlife.get_GoldBannerPrice().getText();	
//		if(text1.equals(text2)) {
//			True();
//		}
//		else {False();}

		VerifyElementPresent(goodlife.GoldInsurance(), "Insurance ");
		VerifyElementPresent(goodlife.Bike_title(), " Bike ");
		VerifyElementPresent(goodlife.Bike_number(), "Bike Number");
		Thread.sleep(3000);
		Wait(goodlife.Change_vehicle());
		Custom_click(goodlife.Change_vehicle(), " change vehicle link ");
		Wait(goodlife.close_vehiclePopup());
		Custom_click(goodlife.close_vehiclePopup(), "change vehicle popup");
		Check_IfSelected(goodlife.Select_Owner(), "by default selected","text");
		VerifyTextByAttribute(goodlife.get_OwnerName(), "Name ","text");

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
		Thread.sleep(2000);
		Wait(goodlife.Click_ProceedBttn());
		Custom_click(goodlife.Click_ProceedBttn(), "Proceed");
		PageLoaded();
		
	}

		@Test(dependsOnMethods = "GoldMembership",priority=10)
		public void GoldEnrollmentForm() throws Exception {
			
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
		Thread.sleep(2000);
		VerifyElementPresent(goodlife.validate_totalAmount(), "Total amount");

		driver.navigate().back();
		Wait(goodlife.click_GOODLIFE_PLAN());
		Custom_click(goodlife.click_GOODLIFE_PLAN(), "Good life plan ");

	}
		
		
		@Test(priority=11)
		public void SilverMembership() throws Exception {
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
			Thread.sleep(3000);
//			Wait(goodlife.JoinNow_GoodLife());
//			Thread.sleep(3000);
//			Custom_click(goodlife.JoinNow_GoodLife(), "Join Now");
//			Custom_click(goodlife.Click_ViewPlan1(), "View Plan");
			PageLoaded();

			
			VerifyElementPresent(goodlife.verify_SilverMemb(), "Membership");
			
			VerifyElementPresent(goodlife.get_SilverCost(), " Silver plan Cost");

			Custom_click(goodlife.Choose_SilverMemb(), "select silver plan");
			PageLoaded();
			
			VerifyImagePresent(goodlife.verify_silverlogoImage(), "Silver Image");	
			
			VerifyElementPresent(goodlife.get_SilverBannerPrice(), "Silver Banner Price");
			
			VerifyElementPresent(goodlife.SilverInsurance(), "Insurance ");
			VerifyElementPresent(goodlife.Bike_title(), " Bike ");
			VerifyElementPresent(goodlife.Bike_number(), "Bike Number");
			Thread.sleep(3000);
			Wait(goodlife.Change_vehicle());
			Custom_click(goodlife.Change_vehicle(), " change vehicle link ");
			Wait(goodlife.close_vehiclePopup());
			Custom_click(goodlife.close_vehiclePopup(), "change vehicle popup");
			Check_IfSelected(goodlife.Select_Owner(), "by default selected","text");
			VerifyTextByAttribute(goodlife.get_OwnerName(), "Name ","text");

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
			
		}

			@Test(dependsOnMethods = "SilverMembership",priority=12)
			public void SilverEnrollmentForm() throws Exception {
				
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
			Thread.sleep(2000);
			VerifyElementPresent(goodlife.validate_totalAmount(), "Total amount");

			driver.navigate().back();
			Wait(goodlife.click_GOODLIFE_PLAN());
			Custom_click(goodlife.click_GOODLIFE_PLAN(), "Good life plan ");

		}

			@Test(priority=13)
			public void ProMembership() throws Exception {
			goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
				Thread.sleep(2000);
//				Wait(goodlife.JoinNow_GoodLife());
//				Thread.sleep(3000);
//				Custom_click(goodlife.JoinNow_GoodLife(), "Join Now");
//				Custom_click(goodlife.Click_ViewPlan1(), "View Plan");
				PageLoaded();
				
				VerifyElementPresent(goodlife.verify_ProMemb(), "Membership");
				
				VerifyElementPresent(goodlife.get_ProCost(), " Pro plan Cost");

				Custom_click(goodlife.Choose_ProMemb(), "select Pro plan");
				PageLoaded();
				
				VerifyImagePresent(goodlife.verify_prologoImage(), "Pro logo Image");	
				
				VerifyElementPresent(goodlife.get_ProBannerPrice(), "Pro Banner Price");
				
				VerifyElementPresent(goodlife.Bike_title(), " Bike ");
				VerifyElementPresent(goodlife.Bike_number(), "Bike Number");
				Thread.sleep(3000);
				Wait(goodlife.Change_vehicle());
				Custom_click(goodlife.Change_vehicle(), " change vehicle link ");
				Wait(goodlife.close_vehiclePopup());
				Custom_click(goodlife.close_vehiclePopup(), "change vehicle popup");
		//		Check_IfSelected(goodlife.Select_Owner(), "by default selected");
				VerifyTextByAttribute(goodlife.get_OwnerName(), "Name ","text");

				custom_sendkeys(goodlife.get_OwnerDob(), config_getdata("ownerdob"), "owner date of birth");
				goodlife.get_OwnerEmail().clear();
				custom_sendkeys(goodlife.get_OwnerEmail(), config_getdata("owneremail"), "owner Email ");
			
				Check_IfSelected(goodlife.select_OwnerGender(), "select gender", "selected");

				Wait(goodlife.Click_ProceedBttn());
				Custom_click(goodlife.Click_ProceedBttn(), "Proceed");
				PageLoaded();
				
			}


		

	
	

}
