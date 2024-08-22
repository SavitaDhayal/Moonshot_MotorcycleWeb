package serviceLogin_Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.BookNowModule;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;
@Listeners(com.utility.listner.class)
public class BookNowService extends base_class {
	public static BookNowModule booknow;
	public static login_page login;
	
	
	@Test(priority=0)
	public void Login() throws Exception {  

		login = PageFactory.initElements(driver, login_page.class);
		Wait(login.clickLoginTab());
		Custom_click(login.clickLoginTab(), "loginTab");
		custom_sendkeys(login.getusername(), config_getdata("MobileNo"), "MobileNo");
		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		Wait(login.getClick_submit_Button());
		Custom_click(login.getClick_submit_Button(), "Button");
	}

	@Test(dependsOnMethods="Login", priority=1)
	public void BookNow_service() throws Exception {

		booknow = PageFactory.initElements(driver, BookNowModule.class);
		Thread.sleep(3000);

		login = PageFactory.initElements(driver, login_page.class);
		Wait(booknow.click_on_BookNow());
		if (booknow.click_on_BookNow().isDisplayed()) {

			Custom_click(booknow.click_on_BookNow(), "BookNow");
			Thread.sleep(2000);

			Custom_click(booknow.select_FirstAvailableDate(), "AvailableDate");
			Custom_click(booknow.select_Time(), "SelectTime");
			custom_sendkeys(booknow.getOdodmeterReading(), config_getdata("OdometerReading"), "OdometerReading");

			Custom_click(booknow.Click_NextButton(), "Click_NextBttn");
			Thread.sleep(5000);
			VerifyElementPresent(booknow.DealerPage(), "Dealer page");
			
			Custom_click(booknow.StateDropDown(), "StateDropDown");
			List<WebElement> allStates = driver.findElements(By.xpath("//ul[@class='dropdown-menu dealer-state-dropdown show']/li"));
			for (WebElement states : allStates) {
				// System.out.println(states.getText());

				if (states.getText().equalsIgnoreCase("DELHI"))
					states.click();
			}

			Custom_click(booknow.CityDropDown(), "CityDropDown");
			Thread.sleep(3000);

			List<WebElement> allCities = driver.findElements(By.xpath("//ul[@class='dropdown-menu dealer-city-dropdown show']/li"));
			for (WebElement Cities : allCities) {
				System.out.println(Cities.getText());
				if (Cities.getText().equalsIgnoreCase("DELHI"))
					Cities.click();
			}
		} else {

			String BookNowService = driver.findElement(By.xpath("//section[@data-subtype='book-service']")).getText();
			System.out.println(BookNowService);

		}
		
		Thread.sleep(3000);
		Custom_click(booknow.Select_Dealer(), "Dealer");
		Thread.sleep(5000);

//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//	    js.executeScript("return document.readyState").toString().equals("complete");

		Custom_click(booknow.NextButton_DealerPage(), "Next bttn2");
		Wait(booknow.NextButton_SelfJobCard());
		
		VerifyElementPresent(booknow.SelfJobCard_Page(), "job Card page ");
		Thread.sleep(3000);
		Wait(booknow.NextButton_SelfJobCard());
		Custom_click(booknow.NextButton_SelfJobCard(), "Next bttn3");
		

	}
	
	@Test(dependsOnMethods="BookNow_service", priority=2)
	public void BookNow_summaryPage() throws Exception {
		
		booknow = PageFactory.initElements(driver, BookNowModule.class);
		VerifyElementPresent(booknow.get_summaryHeading(),"SummaryPage ");
		VerifyElementPresent(booknow.get_summaryDate(), "service date ");
		VerifyElementPresent(booknow.get_summaryTime(), "service time ");
		VerifyElementPresent(booknow.get_serviceType(), "service type ");
		VerifyElementPresent(booknow.get_dealerName(), " Dealer name ");
		VerifyElementPresent(booknow.get_dealerAddress(), "Dealer address");
		VerifyElementPresent(booknow.get_dealerContactnum(), "Dealer contact number ");
		Custom_click(booknow.click_changeBasicDetails(), " change BASIC DETAILS");
		Custom_click(booknow.click_selfJobcardtab(), "On job card page");
		Thread.sleep(3000);
		Wait(booknow.NextButton_SelfJobCard());
		
		Custom_click(booknow.NextButton_SelfJobCard(), "Next bttn3");
		Thread.sleep(2000);
		Wait(booknow.click_changeDealer());
		VerifyElementPresent(booknow.get_summaryHeading(),"SummaryPage ");
		Custom_click(booknow.click_changeDealer(), " change DEALER");
		Thread.sleep(2000);
		Custom_click(booknow.click_selfJobcardtab(), "On job card page");
		Thread.sleep(3000);
		Wait(booknow.NextButton_SelfJobCard());
		Custom_click(booknow.NextButton_SelfJobCard(), "Next bttn3");
		VerifyElementPresent(booknow.get_summaryHeading(),"SummaryPage ");

	}

}
