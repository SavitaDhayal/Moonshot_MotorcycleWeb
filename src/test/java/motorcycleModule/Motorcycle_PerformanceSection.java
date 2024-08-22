package motorcycleModule;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycle_ExecutiveModule;
import com.page_object.Motorcycle_PerfromanceModule;
import com.page_object.Motorcycles_practical;
import com.utility.base_class;

@Listeners(com.utility.listner.class)
public class Motorcycle_PerformanceSection extends base_class {
	public Motorcycle_PerfromanceModule pfm;
	public Motorcycles_practical ob;
	public Motorcycle_ExecutiveModule exe;
	SoftAssert asert = new SoftAssert();
	
	@Test(priority=0)
	public void PerformnaceSection_links() throws Exception {
		pfm=new Motorcycle_PerfromanceModule();
		exe=new Motorcycle_ExecutiveModule();
		ob = new Motorcycles_practical();
		
		PageLoaded();
		Wait(exe.motorcycles());
		Custom_click(exe.motorcycles(), "Motorcycles");
		Thread.sleep(1000);
		PageLoaded();
		Wait(pfm.Perfromance());
		VerifyElementPresent(pfm.Perfromance(), " PERFORMNCE >>>> ");		
		Custom_click(pfm.Perfromance(), " Perfromance Text Clickable");
		
		PageLoaded(); 
	}
	
	@Test(priority=1)
	public void TC_122_PerformanceSection_ClickAllBikes() throws Exception {
		
		//PageLoaded();
		//home.ReqCallBack();
		pfm.Performance_Bikes_AllLinks();
		if(pfm.Perfromance().isDisplayed()) {
		Wait(pfm.Perfromance());
		VerifyElementPresent(pfm.Perfromance(), " PERFORMNCE >>>> ");		
		Custom_click(pfm.Perfromance(), " Perfromance Text Clickable");
		Thread.sleep(2000);
		PageLoaded(); }
		else {
			Wait(exe.motorcycles());
			Custom_click(exe.motorcycles(), "Motorcycles");
			Wait(pfm.Perfromance());
			VerifyElementPresent(pfm.Perfromance(), " PERFORMANCE >>>> ");		
			Custom_click(pfm.Perfromance(), " Perfromance Text Clickable");
			Thread.sleep(2000);
		}
		
	}

	
//	@Test(priority=6)
	public void TC_123_PerformanceCateg_AllLinks() throws Exception{

		Wait(ob.BTR_HeadingText());
		VerifyElementPresent(ob.BTR_HeadingText(), " Heading ");
		
		Wait(pfm.Eshop_GoodLife_Link());
		Custom_click(pfm.Eshop_GoodLife_Link(), "GoodLife");
		Thread.sleep(1000);
		GetCurrentUrl();
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		
		
		Wait(pfm.Eshop_JoyRide_Link());
		Custom_click(pfm.Eshop_JoyRide_Link(), "JoyRide");
		Thread.sleep(1000);
		GetCurrentUrl();
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(1000);
		Wait(pfm.Eshop_Accessories_LinkCatPage());
		Custom_click(pfm.Eshop_Accessories_LinkCatPage(), "Accessories Sports Link CatPage");		
		change_window(1, " Next window");
		Thread.sleep(2000);
		GetCurrentUrl();
		PageLoaded();
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		
	}
	
//	@Test(priority=3)
	public void TC_124_PerformanceCategPage_XPulse2004V() throws Exception {
		
		Thread.sleep(1000);
		Wait(pfm.Xpulse2004V_Bike_img());
		VerifyImagePresent(pfm.Xpulse2004V_Bike_img(), " Xpulse2004V image Present");
		mouse_hover(pfm.Xpulse2004V_Bike_img(), " on Xpulse2004V Image");
		Thread.sleep(2000);
		VerifyElementPresent(pfm.Xpulse2004V_QuickView(), " check if present>> ");
		if(pfm.Xpulse2004V_QuickView().isDisplayed()) {
		Custom_click(pfm.Xpulse2004V_QuickView(), " check if clickable"); }
		PageLoaded();
		  
		pfm.all_bike_image_button_for_Xpulse2004V();
		
		VerifyElementPresent(pfm.Xpulse2004V_ViewDetails(), " check View Details tab text if present");
		Custom_click(pfm.Xpulse2004V_ViewDetails(), "view details tab clickable");

		Thread.sleep(1000);
		PageLoaded();
		GetCurrentUrl();

		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
		
		VerifyElementPresent(pfm.Xpulse2004V_BookNow(), "BookNow button  >> ");
		Wait(pfm.Xpulse2004V_BookNow());
		Thread.sleep(2000);
		Custom_click(pfm.Xpulse2004V_BookNow(), "  on Book Now Button");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(2000);
		Wait(pfm.Xpulse2004V_CloseButton());
		Custom_click(pfm.Xpulse2004V_CloseButton(), " on cross button");
		
	}
	
	
	
	@Test(priority=2)
	public void TC_125_PerformanceCategPage_Xtreme160R() throws Exception {
		
		
		Wait(pfm.Xtreme160R_Bike_img());
		VerifyImagePresent(pfm.Xtreme160R_Bike_img(), " Xtreme160R image Present");
		mouse_hover(pfm.Xtreme160R_Bike_img(), " on Xtreme160R Bike Image");
		Thread.sleep(2000);
		VerifyElementPresent(pfm.Xtreme160R_QuickView(), " check if present>> ");
		if(pfm.Xtreme160R_QuickView().isDisplayed()) {
		Custom_click(pfm.Xtreme160R_QuickView(), " check if clickable"); }
		PageLoaded();
		  
		pfm.all_bike_image_button_for_Xtreme160R();
		
		VerifyElementPresent(pfm.Xtreme160R_ViewDetails(), " check View Details tab text if present");
		Custom_click(pfm.Xtreme160R_ViewDetails(), "view details tab clickable");

		Thread.sleep(1000);
		PageLoaded();

		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
	
		VerifyElementPresent(pfm.Xtreme160R_BookNow(), "BookNow button  >> ");
		Wait(pfm.Xtreme160R_BookNow());
		Thread.sleep(1000);
		Custom_click(pfm.Xtreme160R_BookNow(), "  on Book Now Button");
		Thread.sleep(1000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(1000);
		Wait(pfm.Xtreme160R_CloseButton());
		Custom_click(pfm.Xtreme160R_CloseButton(), " on cross button");
		
	}
	
	
//	@Test(priority=4)
	public void TC_126_PerformanceCategPage_XPulse200T4V() throws Exception {
		
		Wait(pfm.Xpulse200T4V_Bike_img());
		VerifyImagePresent(pfm.Xpulse200T4V_Bike_img(), " Xpulse200T4V image Present");
		mouse_hover(pfm.Xpulse200T4V_Bike_img(), " on Xpulse200T4V Image");
		Thread.sleep(2000);
		VerifyElementPresent(pfm.Xpulse200T4V_QuickView(), " check if present>> ");
		if(pfm.Xpulse200T4V_QuickView().isDisplayed()) {
		Custom_click(pfm.Xpulse200T4V_QuickView(), " check if clickable"); }
		PageLoaded();
		  
		pfm.all_bike_image_button_for_Xpulse200T4V();
		
		VerifyElementPresent(pfm.Xpulse200T4V_ViewDetails(), " check View Details tab text if present");
		Custom_click(pfm.Xpulse200T4V_ViewDetails(), "view details tab clickable");
		Thread.sleep(1000);
		PageLoaded();

		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();

		VerifyElementPresent(pfm.Xpulse200T4V_BookNow(), "BookNow button  >> ");
		Wait(pfm.Xpulse200T4V_BookNow());
		Thread.sleep(2000);
		Custom_click(pfm.Xpulse200T4V_BookNow(), "  on Book Now Button");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(2000);
		Wait(pfm.Xpulse200T4V_CloseButton());
		Custom_click(pfm.Xpulse200T4V_CloseButton(), " on cross button");
		
	}
	
//	@Test(priority=5)  //need to change in automation estimation sheet
	public void TC_127_PerformanceCategPage_Xtreme200S4V() throws Exception {
		
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		Wait(pfm.Xtreme200S4V_Bike_img());
		VerifyImagePresent(pfm.Xtreme200S4V_Bike_img(), "Xtreme200S4V image Present");
		mouse_hover(pfm.Xtreme200S4V_Bike_img(), " on Xtreme200S4V Image");
		Thread.sleep(2000);
		Wait(pfm.Xtreme200S4V_QuickView());
		VerifyElementPresent(pfm.Xtreme200S4V_QuickView(), " check if present>> ");
		if(pfm.Xtreme200S4V_QuickView().isDisplayed()) {
		Custom_click(pfm.Xtreme200S4V_QuickView(), " check if clickable"); }
		PageLoaded();
		  
		pfm.all_bike_image_button_for_Xtreme200S4V();
		
		VerifyElementPresent(pfm.Xtreme200S4V_ViewDetails(), " check View Details tab text if present");
		Custom_click(pfm.Xtreme200S4V_ViewDetails(), "view details tab clickable");
		Thread.sleep(1000);
		PageLoaded();
		

		driver.navigate().back();
		Thread.sleep(2000);
		PageLoaded();

		VerifyElementPresent(pfm.Xtreme200S4V_BookNow(), "BookNow button  >> ");
		Wait(pfm.Xtreme200S4V_BookNow());
		Thread.sleep(2000);
		Custom_click(pfm.Xtreme200S4V_BookNow(), "  on Book Now Button");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(2000);
		Wait(pfm.Xtreme200S4V_CloseButton());
		Custom_click(pfm.Xtreme200S4V_CloseButton(), " on cross button");
	}
	

}
