package serviceLogin_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.GoodLifeModule;
import com.page_object.XclanModule;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;

@Listeners(com.utility.listner.class)
public class XclanService extends base_class {

	public static XclanModule xclan;
	public static login_page login;
	public static GoodLifeModule goodlife;

	@Test(priority = 0)
	public void xcaln_login() {   
		login = PageFactory.initElements(driver, login_page.class);
		xclan = PageFactory.initElements(driver, XclanModule.class);
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);
		driver.navigate().refresh();
		Wait(login.clickLoginTab());

		Custom_click(login.clickLoginTab(), "loginTab");
		custom_sendkeys(login.getusername(), config_getdata("xclanuser"), "xclanuser");
		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		Wait(login.getClick_submit_Button());
		Custom_click(login.getClick_submit_Button(), "Button");

	}

	@Test(dependsOnMethods = "xcaln_login", priority = 1)
	public void Flip_Tiles() throws Exception {
		PageLoaded();
		Thread.sleep(3000);
		Wait(xclan.click_rideAndEvents());
		Custom_click(xclan.click_rideAndEvents(), " RIDE & EVENTS");
		PageLoaded();
		Thread.sleep(3000);
		Wait(xclan.click_xclan());
		Custom_click(xclan.click_xclan(), "XCLAN");
		PageLoaded();
		Thread.sleep(3000);

		Actions a = new Actions(driver);
		WebElement flipTile1 = driver.findElement(
				By.xpath("//img[contains(@src,'/content/dam/hero-aem-website/in/xclan/xclan-welcome-kit.jpg')]"));
		a.moveToElement(flipTile1).build().perform();
		VerifyElementPresent(xclan.flip_welcomeKit(), "Flip WELCOME KIT");

		WebElement flipTile2 = driver.findElement(By.xpath(
				"//img[contains(@src,'/content/dam/hero-aem-website/in/xclan/xclan-hero-platinum-membership.jpg')]"));
		a.moveToElement(flipTile2).build().perform();
		VerifyElementPresent(xclan.flip_GoodlifePlatinum(), "Flip GOODLIFE PLATINUM MEMBERSHIP");

		WebElement flipTile3 = driver.findElement(
				By.xpath("//img[contains(@src,'/content/dam/hero-aem-website/in/xclan/xclan-xlusive-rides.jpg')]"));
		a.moveToElement(flipTile3).build().perform();
		VerifyElementPresent(xclan.flip_xclusiveRides(), "Flip XCLUSIVE RIDES");

		WebElement flipTile4 = driver.findElement(
				By.xpath("//img[contains(@src,'/content/dam/hero-aem-website/in/xclan/wall-of-fame.jpg')]"));
		a.moveToElement(flipTile4).build().perform();
		VerifyElementPresent(xclan.flip_WallofFame(), "Flip WALL OF FAME");

		WebElement flipTile5 = driver.findElement(
				By.xpath("//img[contains(@src,'/content/dam/hero-aem-website/in/xclan/xclan-rally-and-events.jpg')]"));
		a.moveToElement(flipTile5).build().perform();
		VerifyElementPresent(xclan.flip_RallyAndEvents(), "Flip RALLY AND EVENTS");

		WebElement flipTile6 = driver.findElement(By.xpath(
				"//img[contains(@src,'/content/dam/hero-aem-website/in/xclan/xclan-dedicated-social-tribe.jpg')]"));
		a.moveToElement(flipTile6).build().perform();
		VerifyElementPresent(xclan.flip_DedicatedSocialTribe(), "Flip DEDICATED SOCIAL TRIBE");

	}

	@Test(dependsOnMethods = "xcaln_login", priority = 2)
	public void xclan_joinNow() throws Exception {
//		PageLoaded(driver, "Title is: ");
//		Thread.sleep(3000);
//		Custom_click(xclan.click_rideAndEvents(), " RIDE & EVENTS");
//		PageLoaded(driver, "Title is: ");
//		Wait(xclan.click_xclan());
//		Custom_click(xclan.click_xclan(), "XCLAN");
		PageLoaded();
		Custom_click(xclan.click_joinNowXcaln(), "JOIN THE CLAN");
		VerifyImagePresent(xclan.verify_xclanBannerImage(), "Xclan logo image");
		VerifyElementPresent(xclan.verify_xclanMembershipTitle(), "Title ");
		VerifyElementPresent(xclan.verify_xclanPrice(), "xClan banner price ");

		Select selectModel = new Select(xclan.select_xclanModel());
		selectModel.selectByVisibleText("XPULSE 200");

		Select selectChapterCity = new Select(xclan.select_xclanChapter());
		selectChapterCity.selectByVisibleText("Dehradun");

		Custom_click(xclan.click_proceedBttn1(), "PROCEED");
		PageLoaded();
		Thread.sleep(2000);
		if (xclan.verify_alreadyEnrolled().isDisplayed()) {
			VerifyElementPresent(xclan.verify_alreadyEnrolled(), "Already taken the paln");
		}

		VerifyTextByAttribute(xclan.verify_VinNum(), "Vin Number ","text");
		VerifyTextByAttribute(xclan.verify_CardNum(), "Card Number ","text");
		VerifyTextByAttribute(xclan.verify_ChapterCity(), "Chapter City","text");
		VerifyTextByAttribute(xclan.verify_Model(), "Model ","text");

		if (xclan.verify_MembershipFor().isSelected()) {
			VerifyElementPresent(xclan.verify_MembershipFor(), "Membership taken in the name of user");
		}

		VerifyTextByAttribute(goodlife.get_OwnerName(), "Owner Name","text");
		VerifyTextByAttribute(goodlife.get_OwnerNumber(), "Owner Mobile ","text");

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

		Custom_click(xclan.click_proceedBttn2(), "PROCEED");

	}

	@Test(dependsOnMethods = "xclan_joinNow", priority = 3)
	public void NomineeForm() throws Exception {
		goodlife = PageFactory.initElements(driver, GoodLifeModule.class);

		PageLoaded();
		VerifyElementPresent(goodlife.NomineeDetailsText(), "Text ");
		Wait(goodlife.get_NomineeName());
		goodlife.get_NomineeName().clear();
		custom_sendkeys(goodlife.get_NomineeName(), config_getdata("nomineeName"), "Nominee Name is ");

		Select relation = new Select(goodlife.select_NomineeRelation());
		relation.selectByVisibleText("Brother");

		goodlife.get_NomineeMobile().clear();
		custom_sendkeys(goodlife.get_NomineeMobile(), config_getdata("nomineeNum"), "Nominee Contact number is  ");
		Custom_click(goodlife.choose_sameAdd(), "select addres as same as user");
		Custom_click(goodlife.select_NomAcknowledgement(), "Aknowledgement chcekbox");

		Select DeclaraRelation = new Select(goodlife.select_DeclrRelation());
		DeclaraRelation.selectByVisibleText("Son Of");

		goodlife.get_decRelativeName().clear();
		custom_sendkeys(goodlife.get_decRelativeName(), config_getdata("relativeName"), "Relative Name");
		Custom_click(goodlife.Click_ProceedPayment(), "Proceed for payment");
		Thread.sleep(3000);
		PageLoaded();
		VerifyElementPresent(goodlife.validate_totalAmount(), "Total amount");

		driver.navigate().back();
		driver.navigate().refresh();

	}

}
