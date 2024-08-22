package serviceLogin_Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.MyVehiclePage;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;

@Listeners(com.utility.listner.class)
public class Login_MyProfile extends base_class {
	public login_page login;
	public static MyVehiclePage MyVehicle;

	@Test() // groups= {"Login_MyProfile.Login"}
	public void Login() throws Exception { 
 
		login = PageFactory.initElements(driver, login_page.class);
		Thread.sleep(3000);
		Custom_click(login.clickLoginTab(), "loginTab");

		custom_sendkeys(login.getusername(), config_getdata("MobileNo"), "MobileNo");
		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		 Wait(login.getClick_submit_Button());
		Custom_click(login.getClick_submit_Button(), "Button");
		

	}

	@Test(dependsOnMethods = "Login" , priority = 0)
	public void My_Account() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		Thread.sleep(3000);
		Wait(login.click_ProfileTab());
		Custom_click(login.click_ProfileTab(), "login DropDown");
		Custom_click(login.click_MyAccount(), "My Account");
		Wait(login.verify_mobileNo());
		VerifyElementPresent(login.verify_mobileNo(), "Mobile Numbber: ");
		VerifyElementPresent(login.verify_Dob(), "Date of Birth: ");
		VerifyElementPresent(login.verify_Email(), "Email: ");
		VerifyElementPresent(login.verify_gender(), "Gender: ");
		VerifyElementPresent(login.verify_BloodGroup(), "Blood Group: ");
		VerifyElementPresent(login.verify_Address(), "Address: ");

	}

	@Test(dependsOnMethods = "Login", priority = 1)
	public void Emergency_contacts() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		// Wait(login.click_ProfileTab());
		Thread.sleep(3000);
		Custom_click(login.click_ProfileTab(), "login DropDown");
		Custom_click(login.click_MyAccount(), "My Account");
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(250,350)");

		Custom_click(login.ClickManageLicense(), "Manage License");
		Thread.sleep(2000);
		Custom_click(login.ClickManageLicense(), "Manage License");
		Thread.sleep(2000);
		Custom_click(login.click_EmergencyContact(), "Emergency contact");
		Thread.sleep(2000);

		if (login.click_addContact().isDisplayed()) {

			Custom_click(login.click_addContact(), "Add Contact");
			custom_sendkeys(login.contact_name(), config_getdata("contactName"), "contactName");
			custom_sendkeys(login.contact_email(), config_getdata("contactEmail"), "contactEmail");
			// Thread.sleep(2000);
			custom_sendkeys(login.contact_number(), config_getdata("contactNo"), "contactNo");

			Select relation = new Select(login.contact_relation());
			relation.selectByVisibleText("Sister");
			Custom_click(login.click_saveContact(), "save contact");
			Thread.sleep(2000);

			Custom_click(login.click_EmergencyContact(), "Emergency contact");
			Thread.sleep(2000);

			List<WebElement> addedCont1 = driver.findElements(By.xpath("//div[@class='contact-info']/p"));

			for (int i = 0; i < addedCont1.size(); i++) {
				System.out.println(addedCont1.get(i).getText());
				TextOfElement(addedCont1.get(i).getText(), "Added contacts info:  ");
			}
		}

		// add 2nd contact

		if (login.click_addContact().isDisplayed()) {

			Custom_click(login.click_addContact(), "Add Contact");
			custom_sendkeys(login.contact_name(), config_getdata("contactName2"), "contactName2");
			custom_sendkeys(login.contact_email(), config_getdata("contactEmail2"), "contactEmail2");
			Thread.sleep(2000);
			custom_sendkeys(login.contact_number(), config_getdata("contactNo2"), "contactNo2");

			Select relation = new Select(login.contact_relation());
			relation.selectByVisibleText("Brother");
			Custom_click(login.click_saveContact(), "save contact");
			Thread.sleep(2000);

			Custom_click(login.click_EmergencyContact(), "Emergency contact");
			Thread.sleep(2000);
			List<WebElement> addedCont2 = driver.findElements(By.xpath("//div[@class='contact-info']/p"));

			for (int i = 0; i < addedCont2.size(); i++) {
				System.out.println(addedCont2.get(i).getText());
				TextOfElement(addedCont2.get(i).getText(), "Added contacts info:  ");
			}
		}

	//	VerifyElementPresent(login.click_addContact(), "Max two emergency contacts can be added");

		// System.out.println("takes only 2 max contacts");
	}

	
	@Test(dependsOnMethods = "Login", priority = 2)
	public void remove_emergencyContact() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		Thread.sleep(3000);
		Custom_click(login.click_ProfileTab(), "login DropDown");
		Custom_click(login.click_MyAccount(), "My Account");
		Thread.sleep(2000);
		Custom_click(login.click_EmergencyContact(), "Emergency contact");

			List<WebElement> removeCont = driver.findElements(By.xpath("//div[@class='contact-info']/p"));

			for (int i = 0; i < removeCont.size(); i++) {
				System.out.println(removeCont.get(i).getText());
				Thread.sleep(3000);
				TextOfElement(removeCont.get(i).getText(), "added contacts:  ");
			}
				

			List<WebElement> remove=driver.findElements(By.xpath("//a[@class='close removecontact']"));
			for (int i = 0; i < remove.size(); i++) {
				Thread.sleep(3000);
				Wait(login.remove_contact());
				Custom_click(login.remove_contact(), "Remove Emergency contact");
				
			}

	}

	
	@Test(dependsOnMethods = "Login", priority = 3)
	public void editProfile_MyAccount() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		MyVehicle = PageFactory.initElements(driver, MyVehiclePage.class);
		Thread.sleep(3000);
		Custom_click(login.click_ProfileTab(), "login DropDown");
		Custom_click(login.click_MyAccount(), "My Account");
		Custom_click(login.click_EditProfile(), "Edit Profile");
		MyVehicle.dob().clear();
		custom_sendkeys(MyVehicle.dob(),config_getdata("dob"), "Date Of birth");
	
		Select bloodGrp = new Select(MyVehicle.Bloodgroup());
		bloodGrp.selectByVisibleText("O+");
		
		MyVehicle.AddressStreetName().clear();
		custom_sendkeys(MyVehicle.AddressStreetName(), config_getdata("streetName"), "streetName");
		MyVehicle.PinCode().clear();
		custom_sendkeys(MyVehicle.PinCode(), config_getdata("pincode"), "pincode");
		
		Select state = new Select(MyVehicle.SelectState());
		state.selectByVisibleText("HARYANA");
		
		Select city = new Select(MyVehicle.SelectCity());
		city.selectByVisibleText("FARIDABAD");
		
		Custom_click(MyVehicle.Save_profile(), "SaveProfile");
		
		VerifyElementPresent(login.Profile_Updated(), "profile updated ");
		
		Custom_click(login.click_GoToProfile(), "my profile page ");
		
		
		
		
	}
}
