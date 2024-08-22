package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.page_object.login_page;
import com.utility.base_class;
import com.utility.library;
import com.utility.listner;

@Listeners(com.utility.listner.class)
public class Incorrect_Login_Creds extends base_class {
	public static login_page login;
	public static ExtentTest test;
	public static listner lis;

	@Test(priority=0)
	public void Incorrect_number() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		Thread.sleep(3000);
		Custom_click(login.clickLoginTab(), "loginTab");

		custom_sendkeys(login.getusername(), config_getdata("incorrectNum"), "incorrectNum");
		WebElement num = driver.findElement(By.xpath("//input[@id='number']"));
		num.sendKeys(Keys.ENTER);
		VerifyElementPresent(login.get_incorrectNum_Msg(), "Error: ");
//		if (login.getPassword().isEnabled()) {
//			custom_sendkeys(login.getPassword(), config.getpassword(), "Can not enter OTP");
//		} else {
//			System.out.println("Cant enter value");
//			custom_sendkeys(login.getPassword(), config.getpassword(), "Can not enter OTP");
//		}
	
		verify_if_Clickable(login.getClick_submit_Button(), " Can not click");
		
		driver.navigate().refresh();

	}
  @Test(priority=1)
	public void Incorrect_otp() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		Thread.sleep(3000);
		Wait(login.clickLoginTab());
		Custom_click(login.clickLoginTab(), "loginTab");
		

		custom_sendkeys(login.getusername(), config_getdata("MobileNo"), "MobileNo");
		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		login.getPassword().sendKeys(Keys.ENTER);
		VerifyElementPresent(login.get_WrongOTPMsg(), "Error: " );
		verify_if_Clickable(login.getClick_submit_Button(), " Can not click");
		
		// Wait(login.getClick_submit_Button());
		//Custom_click(login.getClick_submit_Button(), "Button");
		driver.navigate().refresh();

	}
      
  @Test(priority=2)
	public void Enter_OTP_only() throws Exception {
		login = PageFactory.initElements(driver, login_page.class);
		Thread.sleep(3000);
		Wait(login.clickLoginTab());
		Custom_click(login.clickLoginTab(), "loginTab");

		custom_sendkeys(login.getPassword(), config_getdata("OTP"), "OTP");
		
		verify_if_Clickable(login.getClick_submit_Button(), " Can not click");
		VerifyElementPresent(login.get_incorrectNum_Msg(), "Error: ");
		//driver.navigate().refresh();

	}

}
