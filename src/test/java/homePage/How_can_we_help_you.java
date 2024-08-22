package homePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.utility.base_class;
import com.utility.library;

@Listeners(com.utility.listner.class)
public class How_can_we_help_you extends base_class{

	public home_page home;
	
	@Test
	public void BookNow_HomePage() throws Exception {
	
		home= new home_page();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Wait(home.get_text_HomePage());
		VerifyElementPresent(home.get_text_HomePage(), "Text Present ::  ");
//		 Wait(home.click_BookNow_Image_HomePage());
//		Custom_click(home.click_BookNow_Image_HomePage()," Image Clickable");
		Wait(home.click_BookNow_Text_HomePage());
		Custom_click(home.click_BookNow_Text_HomePage()," Text clickable");
		
		
		// Get all window handles and hold them in a list.
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> windowHandlesList = new ArrayList<>(windowHandles); // Set to List Conversion
				// Switch to second window
				driver.switchTo().window(windowHandlesList.get(1));
		//		System.out.println("Child Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
				PageLoaded();
				Thread.sleep(2000);
				List<WebElement> allTabs = driver.findElements(
						By.xpath("//ul[@id='ub-mega-menu-1']/li"));
				int s = allTabs.size();

				System.out.println("total tabs present: " + allTabs.size());
				for (int i = 0; i < s; i++) {
					Thread.sleep(2000);
					VerifyElementPresent(driver.findElement(By.xpath("(//ul[@id='ub-mega-menu-1']/li)["+(i+1)+"]")), "");
					driver.findElement(By.xpath("(//ul[@id='ub-mega-menu-1']/li)["+(i+1)+"]")).click();
					PageLoaded();
				}
				driver.close();
				driver.switchTo().window(windowHandlesList.get(0));
				PageLoaded();
			//	System.out.println("Parent Window Handle: " + driver.getWindowHandle() + "\n" + driver.getTitle());
//				Wait(home.click_BookNow_Text_HomePage());
//				Custom_click(home.click_BookNow_Text_HomePage()," Text clickable");
				
				// check mouse hover action on all 6 tabs
				
	}
	
	@Test
	public void Book_a_Service_homePage() throws Exception {
		home= new home_page();
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	//	Wait(home.click_BookAService_Image_HomePage());
	//	Custom_click(home.click_BookAService_Image_HomePage(), "Image clickable");
		PageLoaded();
		Wait(home.click_BookAService_Text_HomePage());
		Custom_click(home.click_BookAService_Text_HomePage(), "Text Clickable");
		Thread.sleep(2000);
		PageLoaded();
		Custom_click(home.click_crossBttn_BookAService(), "cross bttn clickable");
	}
	
	@Test
	public void Request_CallBack_HomePage() {
		home= new home_page();
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
//		Wait(home.click_Request_CallBack_Image_HomePage());
//		Custom_click(home.click_Request_CallBack_Image_HomePage(), "");
		Wait(home.click_Request_CallBack_Text_HomePage());
		Custom_click(home.click_Request_CallBack_Text_HomePage(),"");
		Wait(home.get_Request_CallBack_Text());
		VerifyElementPresent(home.get_Request_CallBack_Text()," Text Present ");
		
		custom_sendkeys(home.get_Request_CallBack_Name_HomePage() , config_getdata("Name"), "Name");
		custom_sendkeys(home.get_Request_CallBack_MobileNo_HomePage(), config_getdata("MobileNo"), "Mobile No.");
		custom_sendkeys(home.get_Request_CallBack_OTP_HomePage(), config_getdata("OTP"), "Enter OTP");
		
		Custom_click(home.click_RequestCallBack_StateDropdown(), " click on select state");
		Custom_click(home.click_RequestCallBack_SelectState(), "select state");
		
		Custom_click(home.click_RequestCallBack_CityDropdown(), " click on select city");
		Custom_click(home.click_RequestCallBack_SelectCity(), "select city");	
		
		Custom_click(home.click_RequestCB_SubmitBttn(), "Submit Button");
		Wait(home.get_ThankyouMsg());
		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		
		Custom_click(home.click_RequestCB_closeBttn1(),"close bttn1 clickable");
		Custom_click(home.click_Request_CB_closeBttn(),"close bttn2 clickable");
		
//		Wait(home.click_Request_CallBack_Image_HomePage());
//		Custom_click(home.click_Request_CallBack_Image_HomePage(), "");

	}
	
	@Test
	public void TestRide_HomePage() throws Exception {
		home= new home_page();
		Wait(home.click_TestRide_Text());
		Custom_click(home.click_TestRide_Text(),"Test Ride Clickable");
		Wait(home.get_TestRide_Text());
		VerifyElementPresent(home.get_TestRide_Text(),"Text present");
		Wait(home.click_TestRide_ArrowIcon());
		Custom_click(home.click_TestRide_ArrowIcon(),"Arrow Clickable");
		Thread.sleep(2000);
		Wait(home.click_TestRide_ArrowIcon());
		Thread.sleep(2000);
		Custom_click(home.click_TestRide_ArrowIcon(),"Arrow Clickable");
		
		Wait(home.get__TestRide_Name());
		custom_sendkeys(home.get__TestRide_Name() , config_getdata("Name"), "Name");
		custom_sendkeys(home.get_TestRide_Mobile(), config_getdata("MobileNo"), "Mobile No.");
		Wait(home.get_TestRide_OTP());
		custom_sendkeys(home.get_TestRide_OTP(), config_getdata("OTP"), "Enter OTP");
		Custom_click(home.click_TestRide_Vehicle(), "vehicle dropDown");
		Wait(home.select_TestRide_Vehicle());
		Custom_click(home.select_TestRide_Vehicle(), "Select vehicle");
		
		Custom_click(home.click_TestRide_State(), "State Dropdown");
		Wait(home.select_TestRide_State());
		Custom_click(home.select_TestRide_State(), "Select state");
		
		Custom_click(home.click_TestRide_City(), " City Dropdown");
		Wait(home.select_TestRide_City());
		Custom_click(home.select_TestRide_City(), "Select city");	
		
		Custom_click(home.click_TestRide_Submit(), "Submit Button");
		Wait(home.get_ThankyouMsg());
		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		Custom_click(home.click_TestRide_CrossBttn(), "CrossBttn Clickable");

	}
	
	@Test
	public void GOODLIFE_HomePage() throws Exception {
		home= new home_page();
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Wait(home.click_GoodLife_Text());
		VerifyElementPresent(home.click_GoodLife_Text(), " Text present");
		Custom_click(home.click_GoodLife_Text(), "text clickable");
		PageLoaded();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
//		Custom_click(home.click_GoodLife_Image(),"Image Clickable");
		
	}
	
	@Test
	public void FIND_A_DEALER_HomePage() throws Exception {
		home= new home_page();
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Wait(home.click_FindADealer_Text());
		VerifyElementPresent(home.click_FindADealer_Text(), "");
		Custom_click(home.click_FindADealer_Text(), "text clickable");
		//PageLoaded(driver, "Title is : ");
		// Get all window handles and hold them in a list.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<>(windowHandles); // Set to List Conversion
		// Switch to second window
		Thread.sleep(3000);
		driver.switchTo().window(windowHandlesList.get(1));
		Custom_click(home.click_cancelbttn_Cookie(), " cancel cookie");
		
		Select state = new Select(home.click_on_State());
		state.selectByVisibleText("Goa");
		
		Select city = new Select(home.click_on_City());
		city.selectByVisibleText("South Goa");
		
		Select locality = new Select(home.click_on_Locality());
		locality.selectByVisibleText("Curchorem");
		
		Custom_click(home.click_on_SearchBttn(), "Serach Button clickable");
		Custom_click(home.click_cancelbttn_Cookie(), " cancel cookie");
		Wait(home.get_DealerName());
		VerifyElementPresent(home.get_DealerName(), "");
		Custom_click(home.click_DirectionText(), "text Clickable");
		
		
		// Get all window handles and hold them in a list.
				Set<String> windowHandles1 = driver.getWindowHandles();
				List<String> windowHandlesList1 = new ArrayList<>(windowHandles1); // Set to List Conversion
				// Switch to second window
				Set<String> windows1 = null;
				windows1 = driver.getWindowHandles();
				System.out.println(windows1.size());
				Thread.sleep(3000);
				driver.switchTo().window(windowHandlesList1.get(2));
				Thread.sleep(2000);
				PageLoaded();
				driver.close();
				driver.switchTo().window(windowHandlesList.get(1));
				
				Custom_click(home.click_ViewMoreText(),"Text Clickable");
				Custom_click(home.click_cancelbttn_Cookie(), " cancel cookie");
				PageLoaded();
				driver.navigate().back();
				Custom_click(home.click_cancelbttn_Cookie(), " cancel cookie");
				Custom_click(home.click_requestCallBackText(),"Text Clickable");
				Wait(home.click_requestCallBackCancel());
				Custom_click(home.click_requestCallBackCancel(),"cross Bttn Clickable");
				PageLoaded();
				driver.close();
				driver.switchTo().window(windowHandlesList.get(0));
				PageLoaded();

				
	}
	
	
	
}
