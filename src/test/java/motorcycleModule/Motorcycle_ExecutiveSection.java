package motorcycleModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycle_ExecutiveModule;
import com.page_object.Motorcycles_practical;
import com.page_object.home_page;
import com.utility.base_class;

@Listeners(com.utility.listner.class)


public class Motorcycle_ExecutiveSection extends base_class {

	public Motorcycles_practical ob;
	public Motorcycle_ExecutiveModule exe;
	public home_page home;
	SoftAssert asert = new SoftAssert();
	
	@Test(priority=0)
	public void Executive_page() throws Exception {
		ob = new Motorcycles_practical();		
		exe=new Motorcycle_ExecutiveModule(); 
		home=new home_page();
		
		
		PageLoaded();
		Wait(exe.motorcycles());
		Custom_click(exe.motorcycles(), "Motorcycles");
//		Custom_click(exe.Executive(), " Executive Text Clickable");
		Thread.sleep(1000);
		PageLoaded();
//		Wait(exe.Executive());
		VerifyElementPresent(exe.Executive(), " EXECUTIVE >>>> ");		
//		Custom_click(exe.Executive(), " Executive Text ");
//		Thread.sleep(1000);
//		PageLoaded();

	}
	
	
	@Test(priority=1)
	public void TC_049_ExecutiveSection_ClickAllBikes() throws Exception {
		exe=new Motorcycle_ExecutiveModule();

		Thread.sleep(2000);
		PageLoaded();

		exe.Executive_Bikes_AllLinks();
		// click all bikes images
		
		
		Custom_click(exe.Executive(), " Executive Text ");
			

			
		}
		
	
	@Test(priority=2)
	public void TC_050_Executive_Banner_BikeImages() throws Exception {
	
		
//		PageLoaded();
//		Wait(exe.motorcycles());
//		Custom_click(exe.motorcycles(), "Motorcycles");
//		PageLoaded();
//		Wait(exe.Executive());
//		VerifyElementPresent(exe.Executive(), " EXECUTIVE >>>> ");		
//		Custom_click(exe.Executive(), " Executive Text Clickable");
//		Thread.sleep(2000);
//		PageLoaded();
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
		exe.Executive_slider();
		VerifyElementPresent(ob.heading_1(), "");
		asert.assertEquals(ob.heading_1().getText(), "Our Style, Our Offerings");
		asert.assertAll();
		System.out.println(ob.heading_1().getText());
		
		
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
		Wait(exe.SuperSplendorXtecImage());
		ScrollIntoView(exe.SuperSplendorXtecImage());
		VerifyImagePresent(exe.SuperSplendorXtecImage(), " SUPER SPLENDOR XTEC IMAGE");
//		Custom_click(exe.SuperSplendorXtecImage(),"SUPER SPLENDOR XTEC Img Clickable" );
//		PageLoaded();
//		Thread.sleep(500);
//		driver.navigate().back();
		
//		
//		Wait(exe.GlamourXtecImage());
		VerifyImagePresent(exe.GlamourXtecImage(), " GLAMOUR XTEC IMAGE");
//		Custom_click(exe.GlamourXtecImage(),"GLAMOUR XTEC Img Clickable" );
//		PageLoaded();
//		Thread.sleep(500);
//		driver.navigate().back();
////		
////	
//		Wait(exe.PassionXtecImg());
		VerifyImagePresent(exe.PassionXtecImg(), " PASSION XTEC IMAGE");
//		Custom_click(exe.PassionXtecImg(),"PASSION XTEC Img Clickable" );
//		PageLoaded();
//		Thread.sleep(500);
//		driver.navigate().back();
////		
//		Wait(exe.SuperSplendorImage());
		VerifyImagePresent(exe.SuperSplendorImage(), " SUPER SPLENDOR IMAGE");
//		Custom_click(exe.SuperSplendorImage(),"SUPER SPLENDOR Img Clickable" );
//		PageLoaded();
//		Thread.sleep(500);
//		driver.navigate().back();
////		
//		Wait(exe.GlamourImage());
		VerifyImagePresent(exe.GlamourImage(), " GLAMOUR IMAGE");
//		Custom_click(exe.GlamourImage(),"GLAMOUR Img Clickable" );
//		PageLoaded();
//		Thread.sleep(500);
//		driver.navigate().back();
//	
////		Wait(exe.GlamourCanvasImage());
////		VerifyImagePresent(exe.GlamourCanvasImage(), " GLAMOUR CANVAS IMAGE");
////		Custom_click(exe.GlamourCanvasImage(),"GLAMOUR CANVAS Img Clickable" );
////		PageLoaded();
////		Thread.sleep(2000);
////		driver.navigate().back();
////		
//		Wait(exe.PassionPlusImage());
		VerifyImagePresent(exe.PassionPlusImage(), " PASSION PLUS IMAGE");
//		Custom_click(exe.PassionPlusImage(),"PASSION PLUS Img Clickable" );
//		PageLoaded();
//		Thread.sleep(500);
//		driver.navigate().back();
//		Thread.sleep(500);

		
	}
	
	
	@Test(priority=3)
	public void TC_051_ExecutivePage_GlamourXTec() throws Exception {		
		
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
//		Wait(exe.GlamourXtec_Bike_img());
		VerifyImagePresent(exe.GlamourXtec_Bike_img(), " Glamour Xtec image Present");
		mouse_hover(exe.GlamourXtec_Bike_img(), " on Glamour XTec Bike Image");
		Thread.sleep(1000);
		VerifyElementPresent(exe.GlamourXtec_QuickView(), " check if present>> ");


		if(exe.GlamourXtec_QuickView().isDisplayed()) {
			
		Custom_click(exe.GlamourXtec_QuickView(), " check if clickable"); 
		PageLoaded();}
		else {
			mouse_hover(exe.GlamourXtec_Bike_img(), " on Glamour XTec Bike Image");
			Thread.sleep(1000);	
			Custom_click(exe.GlamourXtec_QuickView(), " check if clickable"); 
			PageLoaded();
		}
		exe.all_bike_image_button_for_Glamour_Xtec();
		
		VerifyElementPresent(exe.GlamourXtec_ViewDetails(), " check View Details tab text if present");
		Custom_click(exe.GlamourXtec_ViewDetails(), "view details tab clickable");
		change_window(1, " Next window");
		Thread.sleep(500);
		PageLoaded();

//		driver.navigate().back();
		Thread.sleep(500);
		PageLoaded();
		Thread.sleep(500);
		if(home.click_CancelCookies().isDisplayed()){
		Custom_click(home.click_CancelCookies(), "CANCEL COOKIES");	
		}
		ScrollIntoView(exe.GlamourXtec_BookNow());
		VerifyElementPresent(exe.GlamourXtec_BookNow(), "Buy Now button  >> ");
		Wait(exe.GlamourXtec_BookNow());
		Thread.sleep(1000);
		Custom_click(exe.GlamourXtec_BookNow(), "  on Buy Now Button");
		Thread.sleep(500);
		PageLoaded();
//		driver.navigate().back();
//		PageLoaded();
//		Thread.sleep(1000);
		WebElement ele= driver.findElement(By.xpath("//h4[@class='bg-white fw-bold pb-5 pb-sm-10 vf-heading d-flex justify-content-sm-center']//span"));
		Custom_click(ele, "Cross button of login Popup");
		//driver.quit();
		change_window(0, " Previous  window");
		Wait(exe.GlamourXtec_CloseButton());
		Custom_click(exe.GlamourXtec_CloseButton(), " on cross button");
		driver.navigate().back();
		
		
	}

	
	//need to fix
//	@Test(priority=4)
	public void TC_052_ExecutivePage_SuperSplendorXTec() {
		
		Wait(exe.SuperSpl_XtecBike_img());
		VerifyImagePresent(exe.SuperSpl_XtecBike_img() , "Super Splendor XTec");
		mouse_hover(exe.SuperSpl_XtecBike_img(), " on Super Splendor XTec Bike Image");
		VerifyElementPresent(exe.SuperSplendorXtec_QickView(), "check if present>>");
//		if(exe.SuperSplendorXtec_QickView().isEnabled()) {
//			Custom_click(exe.SuperSplendorXtec_QickView(), " ");
//		}
		
		
		
	}
	

//	@Test(priority=5)  //Bike no more Available
	public void TC_053_ExecutivePage_GlamourCanvas() throws Exception {
		
		
		Wait(exe.GlamourCanvas_Bike_img());
		VerifyImagePresent(exe.GlamourCanvas_Bike_img(), " Glamour Xtec image Present");
		mouse_hover(exe.GlamourCanvas_Bike_img(), " on Glamour Canvas Bike Image");
		
		VerifyElementPresent(exe.GlamourCanvas_QuickView(), "check if present>>");
		if(exe.GlamourCanvas_QuickView().isDisplayed()) {
		Custom_click(exe.GlamourCanvas_QuickView(), " on Quick View tab");}

		exe.all_bike_image_button_for_Glamour_Canvas();
		
		VerifyElementPresent(exe.GlamourCanvas_ViewDetails(), " check View Details tab text if present");
		Custom_click(exe.GlamourCanvas_ViewDetails(), "view details tab clickable");
		Thread.sleep(1000);
		PageLoaded();

		driver.navigate().back();
		PageLoaded();
		Thread.sleep(1000);
		VerifyElementPresent(exe.GlamourCanvas_BookNow(), "BookNOW button  >> ");
		Wait(exe.GlamourCanvas_BookNow());
		Thread.sleep(1000);
		Custom_click(exe.GlamourCanvas_BookNow(), "  on Book Now Button");
		Thread.sleep(1000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Wait(exe.GlamourCanvas_CloseButton());
		Custom_click(exe.GlamourCanvas_CloseButton(), " on Cross Button");
	}
	
	
//	@Test(priority=6)
	public void TC_054_ExecutivePage_PassionPlus() throws Exception{
		
		
		
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)");
		Wait(exe.PassionPlus_Bike_img());
		VerifyImagePresent(exe.PassionPlus_Bike_img(), " Passion plus image Present");
		mouse_hover(exe.PassionPlus_Bike_img(), " on Passion plus Bike Image");

		VerifyElementPresent(exe.PassionPlus_QuickView(), "check if present>>");
		if(exe.PassionPlus_QuickView().isDisplayed()) {
		Custom_click(exe.PassionPlus_QuickView(), " on Quick View tab");}

		exe.all_bike_image_button_for_PassionPlus();
		
		VerifyElementPresent(exe.PassionPlus_ViewDetails(), " check View Details tab text if present");
		Custom_click(exe.PassionPlus_ViewDetails(), "view details tab clickable");

		Thread.sleep(1000);
		PageLoaded();
		
		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();

		VerifyElementPresent(exe.PassionPlus_BookNow(), "BookNow button  >> ");
		Wait(exe.PassionPlus_BookNow());
		Thread.sleep(2000);
		Custom_click(exe.PassionPlus_BookNow(), "  on Book Now Button");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();

		Wait(exe.PassionPlus_CloseButton());
		Custom_click(exe.PassionPlus_CloseButton(), " on close button");
		
	}
	

	
//	@Test(priority=7)
	public void TC_055_ExecutivePage_Glamour() throws Exception {
		
		
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		Wait(exe.Glamour_Bike_img());
		VerifyImagePresent(exe.Glamour_Bike_img(), " Glamour  image Present");
		mouse_hover(exe.Glamour_Bike_img(), " on Glamour Bike Image");
		
		VerifyElementPresent(exe.Glamour_QuickView(), "check if present>>");
		if(exe.Glamour_QuickView().isDisplayed()) {
		Custom_click(exe.Glamour_QuickView(), " on Quick View tab");}

		exe.all_bike_image_button_for_Glamour();
		
		VerifyElementPresent(exe.Glamour_ViewDetails(), " check View Details tab text if present");
		Custom_click(exe.Glamour_ViewDetails(), "view details tab clickable");
//		change_window(1, " Next window");
		Thread.sleep(1000);
		PageLoaded();
//		GetCurrentUrl();

//		driver.close();
//		change_window(0, " Previous window");
		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();

		VerifyElementPresent(exe.Glamour_BookNow(), "BookNOW button  >> ");
		Wait(exe.Glamour_BookNow());
		Thread.sleep(2000);
		Custom_click(exe.Glamour_BookNow(), "  on Book Now Button");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(2000);
		Wait(exe.Glamour_CrossButton());
		Custom_click(exe.Glamour_CrossButton(), "on cross button");
		
	}
	
//	@Test(priority=8)
	public void TC_056_ExecutivePage_SuperSplendor() throws Exception {
	
		
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		Thread.sleep(2000);
		Wait(exe.SuperSplendor_Bike_img());
		VerifyImagePresent(exe.SuperSplendor_Bike_img(), " Super Splendor image Present");
		mouse_hover(exe.SuperSplendor_Bike_img(), " on Super Splendor Bike Image");
		
		VerifyElementPresent(exe.Supersplendor_QuickView(), "check if present>>");
//		if(exe.Supersplendor_QuickView().isDisplayed()) {
		Custom_click(exe.Supersplendor_QuickView(), " on Quick View tab");

		exe.all_bike_image_button_for_SuperSplendor();
		
		VerifyElementPresent(exe.Supersplendor_ViewDetails(), " check View Details tab text if present");
		Custom_click(exe.Supersplendor_ViewDetails(), "view details tab clickable");
//		change_window(1, " Next window");
		Thread.sleep(1000);
		PageLoaded();
//		GetCurrentUrl();

//		driver.close();
//		change_window(0, " Previous window");
		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();

		VerifyElementPresent(exe.Supersplendor_BookNow(), "BookNOW button  >> ");
		Wait(exe.Supersplendor_BookNow());
		Thread.sleep(2000);
		Custom_click(exe.Supersplendor_BookNow(), "  on Book Now Button");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Wait(exe.Supersplendor_CloseButton());
		Custom_click(exe.Supersplendor_CloseButton(), " on Cross Button");
	}
	
//	@Test(priority=9)
	public void TC_057_ExecutivePage_PassionXTec() throws Exception {
		
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");
		Wait(exe.PassionXtec_Bike_img());
		VerifyImagePresent(exe.PassionXtec_Bike_img(), "Passion Xtec image Present");
		mouse_hover(exe.PassionXtec_Bike_img(), " on Passion Xtec Bike Image");
		
		VerifyElementPresent(exe.PassionXtec_QuickView(), "check if present>>");
		if(exe.PassionXtec_QuickView().isDisplayed()) {
		Custom_click(exe.PassionXtec_QuickView(), " on Quick View tab");}

		exe.all_bike_image_button_for_PassionXtec();
		
		VerifyElementPresent(exe.PassionXtec_ViewDetails(), " check View Details tab text if present");
		Custom_click(exe.PassionXtec_ViewDetails(), "view details tab clickable");
//		change_window(1, " Next window");
		Thread.sleep(1000);
		PageLoaded();
//		GetCurrentUrl();

//		driver.close();
//		change_window(0, " Previous window");
		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
		
		VerifyElementPresent(exe.PassionXtec_BookNow(), "BookNOW button  >> ");
		Wait(exe.PassionXtec_BookNow());
		Thread.sleep(2000);
		Custom_click(exe.PassionXtec_BookNow(), "  on Book Now Button");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Wait(exe.PassionXtec_CloseButton());
		Custom_click(exe.PassionXtec_CloseButton(), " on Close Button");
		
		
		
	}
	
	
}
