package serviceLogin_Modules;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.MyVehiclePage;
import com.page_object.home_page;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;

@Listeners(com.utility.listner.class)
public class Login_MyVehiclePage extends base_class {
	public static login_page login;
	public static home_page home;
	public static MyVehiclePage MyVehicle;

//	
	@Test(priority = 0) 
	public void Login_Account() throws Exception { 
	//	driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		login = PageFactory.initElements(driver, login_page.class);
		driver.navigate().refresh();
		Wait(login.clickLoginTab());
		Custom_click(login.clickLoginTab(), "loginTab");
		custom_sendkeys(login.getusername(), config_getdata("MobileNo"), "MobileNo");
		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		Wait(login.getClick_submit_Button());
		Custom_click(login.getClick_submit_Button(), "Button");
	}

	// -------------My Vehicle Page------------------------------------------------------

	@Test(dependsOnMethods="Login_Account" ,priority = 4)
	public void MyVehicles() throws Exception {
		MyVehicle = PageFactory.initElements(driver, MyVehiclePage.class);

 //		Custom_click(MyVehicle.RightCarousel(), "rightArrow");
		        Thread.sleep(2000);
//		
//		Custom_click(MyVehicle.LeftCarousel(), "LeftArrow");
//		Thread.sleep(2000);
		
		VerifyImagePresent(MyVehicle.Bike_Image(), " Bike Image");
		 Wait(MyVehicle.VehcileDetails());
		 Custom_click(MyVehicle.VehcileDetails(), "VehicleDetails");
		 Wait(MyVehicle.Engine_Number());
		VerifyElementPresent(MyVehicle.Engine_Number(), "Engine No");
		Wait(MyVehicle.VIN_Number());
		VerifyElementPresent(MyVehicle.VIN_Number(), " VIN No");
		Wait(MyVehicle.Purchase_Date());
		VerifyElementPresent(MyVehicle.Purchase_Date(), "purchase Date");
		Thread.sleep(2000);
	//	 Wait(MyVehicle.VehcileDetails());
//		Custom_click(MyVehicle.VehcileDetails(), "Vehicles Details");
		
//	 WebElement arrow = driver.findElement(By.xpath("//img[@alt='right-arrow']"));
//		 arrow.click();
	//Thread.sleep(2000);
//	Wait(MyVehicle.RightCarousel());
//   	Custom_click(MyVehicle.RightCarousel(), "rightArrow");
	//	Thread.sleep(2000);
		
	//	Custom_click(MyVehicle.LeftCarousel(), "LeftArrow");
		
		 
//		 VerifyImagePresent(driver, MyVehicle.Bike_Image(), " Bike Image");
//		 Wait(MyVehicle.VehcileDetails());
//		 Custom_click(MyVehicle.VehcileDetails(), "VehicleDetails");
//		 Wait(MyVehicle.Engine_Number());
//		VerifyElementPresent(MyVehicle.Engine_Number(), "Engine No", "Text");
//		Wait(MyVehicle.VIN_Number());
//		VerifyElementPresent(MyVehicle.VIN_Number(), " VIN No", "Text");
//		Wait(MyVehicle.Purchase_Date());
//		VerifyElementPresent(MyVehicle.Purchase_Date(), "purchase Date", "Text");
//		Thread.sleep(3000);
//		Custom_click(MyVehicle.VehcileDetails(), "Vehicles Details");
//		 
		 
		 
//		List<WebElement> carousels = driver.findElements(By.xpath("//div[@class='myVeharrow-wrap']//a"));
//		for (int i = 0; i < carousels.size(); i++) {
//		//	System.out.println(carousels.size());
//			WebElement caraousel = driver.findElement(By.xpath("//a[@class='myVehcarousel-arrow next-vehicle']"));
//			if (caraousel.isDisplayed()) {
//				Custom_click(caraousel, " carousel clickable");
//				VerifyImagePresent(driver, MyVehicle.Bike_Image(), " Bike Image");	}
//
//		}
//		 WebElement currentVehicle = driver.findElement(By.xpath("//span[@class='current-vehicle-index']"));
//		   String currentV = currentVehicle.getText();
//		   int currcentV1= Integer.parseInt(currentV);
//		
//		 WebElement totalVeh = driver.findElement(By.xpath("//span[@class='total-vehicle']"));
//	   String vehicle_size = totalVeh.getText();
//	   int vehicle_size1= Integer.parseInt(vehicle_size);
//	   System.out.println(currcentV1);
//	   System.out.println(vehicle_size1);
//	   while(currcentV1>1)
//	   {
//		   Custom_click(MyVehicle.LeftCarousel(), "LeftArrow");
//		   currcentV1--;
//	   }
//	   for(int i=currcentV1; i<=vehicle_size1; i++) {
//		//   if(currentV1>)
//		  Custom_click(MyVehicle.VehcileDetails(), "VehicleDetails");
//		Thread.sleep(3000);
//		VerifyElementPresent(MyVehicle.Engine_Number(), "Engine No", "Text");
//		VerifyElementPresent(MyVehicle.VIN_Number(), " VIN No", "Text");
//		VerifyElementPresent(MyVehicle.Purchase_Date(), "purchase Date", "Text");
//		Thread.sleep(3000);
//		Custom_click(MyVehicle.VehcileDetails(), "Vehicles Details");
//		 WebElement arrow = driver.findElement(By.xpath("//a[@class='myVehcarousel-arrow next-vehicle']"));
//		 arrow.click();
//
//	}
	   }

	


	// ------------- Service details------------------------------------------------------

	@Test( priority = 5)

	public void ServiceDetails() throws Exception {

		MyVehicle = PageFactory.initElements(driver, MyVehiclePage.class);
		Thread.sleep(5000);
		Custom_click(MyVehicle.ServiceDetails(), "ServiceDetails");
		Thread.sleep(5000);
		VerifyElementPresent(MyVehicle.Last_serviced(), "LastServiced");

		VerifyElementPresent(MyVehicle.Last_serviceType(), "LastServiceType");

		Custom_click(MyVehicle.Service_Record(), "ServiceRecord");
		Thread.sleep(5000);
		driver.navigate().back();

	}

	// ------------- Document pdf------------------------------------------------------

	@Test( priority = 6)

	public void Documents_MyVehicle() throws Exception {

		MyVehicle = PageFactory.initElements(driver, MyVehiclePage.class);
		Thread.sleep(5000);
		Custom_click(MyVehicle.Documents_MyVehiclePage(), "DocumentsDetails");
		Custom_click(MyVehicle.Document_View(), "ViewDocument");

		Thread.sleep(5000);
		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				Thread.sleep(5000);

				driver.close();
			}
		}
		// switch to the parent window
		driver.switchTo().window(parent);
		driver.navigate().refresh();

	}
	

	// -------------Edit Profile--Refer a friend---View account----------------------------------------------
//	dependsOnMethods = "Login_Account",
	@Test(dependsOnMethods = "Login_Account",priority = 1)
	public void editProfile_MyVehicle() throws Exception {

		MyVehicle = PageFactory.initElements(driver, MyVehiclePage.class);
	//	driver.navigate().refresh();
		
		//((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,-250)");
		Thread.sleep(3000);
		Wait(MyVehicle.EditProfile());
		Custom_click(MyVehicle.EditProfile(), "editProfile");
		Wait(MyVehicle.dob());
		custom_sendkeys(MyVehicle.dob(), config_getdata("dob"), "Date Of birth");
		Wait(MyVehicle.Email());
		MyVehicle.Email().clear();
		custom_sendkeys(MyVehicle.Email(), config_getdata("emailId"), "emailId");

		Select bloodGrp = new Select(MyVehicle.Bloodgroup());
		bloodGrp.selectByVisibleText("B+");

		// Custom_click(MyVehicle.Gender(), "Gender");
		Check_IfSelected(MyVehicle.Gender(), "Gender: ","text");

		MyVehicle.AddressStreetName().clear();
		custom_sendkeys(MyVehicle.AddressStreetName(), config_getdata("streetName"), "streetName");
		custom_sendkeys(MyVehicle.PinCode(), config_getdata("pincode"), "pincode");

		Select state = new Select(MyVehicle.SelectState());
		state.selectByVisibleText("HARYANA");

		Select city = new Select(MyVehicle.SelectCity());
		city.selectByVisibleText("GURUGRAM");

		Custom_click(MyVehicle.Save_profile(), "SaveProfile");
		VerifyElementPresent(login.Profile_Updated(), "profile updated ");

		Custom_click(login.click_GoToProfile(), "my profile page ");

		Wait(login.verify_mobileNo());
		VerifyElementPresent(login.verify_mobileNo(), "Mobile Numbber: ");
		VerifyElementPresent(login.verify_Dob(), "Date of Birth: ");
		VerifyElementPresent(login.verify_Email(), "Email: ");
		VerifyElementPresent(login.verify_gender(), "Gender: ");
		VerifyElementPresent(login.verify_BloodGroup(), "Blood Group: ");
		VerifyElementPresent(login.verify_Address(), "Address: ");
	     Alert alert=	driver.switchTo().alert();
	     alert.dismiss();

	}
//	
//
	@Test(dependsOnMethods = "editProfile_MyVehicle", priority = 2)
	public void Emergency_contacts() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		// Wait(login.click_ProfileTab());
		Thread.sleep(3000);
	//	Custom_click(login.click_ProfileTab(), "login DropDown");
	//	Custom_click(login.click_MyAccount(), "My Account");
		Thread.sleep(3000);
	//	((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(250,350)");

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

	
	@Test(dependsOnMethods="Emergency_contacts", priority = 3)
	public void remove_emergencyContact() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		Thread.sleep(2000);
	//	Custom_click(login.click_ProfileTab(), "login DropDown");
	//	Custom_click(login.click_MyAccount(), "My Account");
		//Thread.sleep(2000);
	//	Custom_click(login.click_EmergencyContact(), "Emergency contact");

			List<WebElement> removeCont = driver.findElements(By.xpath("//div[@class='contact-info']/p"));

			for (int i = 0; i < removeCont.size(); i++) {
				System.out.println(removeCont.get(i).getText());
				Thread.sleep(2000);
				TextOfElement(removeCont.get(i).getText(), "added contacts:  ");
			}
				

			List<WebElement> remove=driver.findElements(By.xpath("//a[@class='close removecontact']"));
			for (int i = 0; i < remove.size(); i++) {
				Thread.sleep(2000);
				Wait(login.remove_contact());
				Custom_click(login.remove_contact(), "Remove Emergency contact");
				
			}//img[@src='/content/dam/hero-aem-website/in/servicejourney/icons/arrow.jpg']
			
			((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,-250)");
			Thread.sleep(3000);
			Wait(driver.findElement(By.xpath("//a[@class='back-arrow']")));
			driver.findElement(By.xpath("//a[@class='back-arrow']")).click();
			Thread.sleep(2000);
	}

//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
////========================================================================================================

}
