package motorcycleModule;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycles_practical;
import com.page_object.home_page;
import com.utility.base_class;

@Listeners(com.utility.listner.class)
public class Motorcycles_PracticalPage extends base_class {

	public Motorcycles_practical ob;
	SoftAssert asert = new SoftAssert();
	public home_page home;
	
	
	@Test(priority = 0)
	public void TC_001_motorcycles_practicle_banner() throws InterruptedException {
	
		ob = new Motorcycles_practical();
		home=new home_page();
		Custom_click(ob.motorcycles(), "Motorcycles");
		Custom_click(ob.practical(), "Practical");
		PageLoaded();
		ob.slider();
		VerifyElementPresent(ob.heading_1(), "");
		asert.assertEquals(ob.heading_1().getText(), "Our Style, Our Offerings");
		asert.assertAll();
		System.out.println(ob.heading_1().getText());
	}

	@Test(priority = 1)
	public void TC_002_Verify_HF_100_Motorcycle() throws InterruptedException {
//	JavascriptExecutor jsExec = (JavascriptExecutor) driver;
//	jsExec.executeScript("arguments[0].scrollIntoView(true);",hf_100_bike_image);
		VerifyIconPresent(ob.hf_100_bike_image(), "HF 100 Bike Image");
		mouse_hover(ob.hf_100_bike_image(), " on HF 100 Bike Image");
		Thread.sleep(1000);
		Custom_click(ob.HF_100_quick_view(), "Quick View");
		Thread.sleep(1000);
		String h1 = ob.heading_hf_100().getText();
		asert.assertEquals(h1, "HF 100");
		Thread.sleep(1000);
		Custom_click(ob.black_red_image_button(), " Black red image button");
		VerifyImagePresent(ob.hf_100_black_red_image(), "HF 100 Black red bike image is present inside of quick view.");
		
		Wait(ob.Nexus_Blue_image_button());
		Custom_click(ob.Nexus_Blue_image_button(), " Nexus blue image buton");
		Thread.sleep(1000);
		VerifyImagePresent(ob.hf_100_Nexus_Blue_image(),"HF 100 Nexus blue bike image");
		
		VerifyElementPresent(ob.view_detail_button(), " View detail button in HF 100 Black red bike");
		VerifyElementPresent(ob.book_now_button(), " Book now button in HF 100 Black red bike");
		
		Custom_click(ob.view_detail_button(), " on view details button in HF 100 Black red bike ");	
		Thread.sleep(2000);
		PageLoaded();
		Custom_click(ob.Cancel_Cookies(), "click on cross button of cookies");
		
		String module_hf_100 = ob.bike_view_details().getText();
		asert.assertEquals(module_hf_100, "HF 100");
//		driver.close();
//		change_window(0, " Previous window");
		driver.navigate().back();
		Thread.sleep(2000);
		PageLoaded();
		Custom_click(ob.book_now_button(), " on Book now");
		Thread.sleep(3000);
		PageLoaded();
		driver.navigate().back();
	

		Custom_click(ob.HF_100_close_button(), "HF 100 close button");
	//	asert.assertAll();
		}

//	@Test(priority = 2)
	public void TC_003_Verify_HF_Deluxe_Motorcycle() throws Exception {
		VerifyImagePresent(ob.hf_Deluxe_bike_image(), " HF Deluxe Bike Image");
		mouse_hover(ob.hf_Deluxe_bike_image(), " on HF Deluxe Bike Image");
		Thread.sleep(2000);
		Custom_click(ob.HF_Deluxe_quick_view(), "Quick View");
		Thread.sleep(2000);
		PageLoaded();
		String h1 = ob.heading_HF_DELUXE().getText();
		asert.assertEquals(h1, "HF DELUXE");
		ob.all_bike_image_button_for_HF_DELUXE();
		VerifyElementPresent(ob.view_detail_button_hf_Deluxe(), " View detail button for HF Deluxe");
		VerifyElementPresent(ob.book_now_button_hf_Deluxe(), " Book now button for HF Deluxe");
		Custom_click(ob.view_detail_button_hf_Deluxe(), " on view details button in HF Deluxe ");
//		change_window(1, " Next window");
		Thread.sleep(1000);
		PageLoaded();
		String module_hf_Deluxe = ob.bike_view_details().getText();
		System.out.println(module_hf_Deluxe);
		asert.assertEquals(module_hf_Deluxe, "HF DELUXE");
//		driver.close();
//		change_window(0, " Previous window");
		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
		Wait(ob.book_now_button_hf_Deluxe());
		Custom_click(ob.book_now_button_hf_Deluxe(), " on Book now for HF Deluxe");
		Thread.sleep(1000);
		PageLoaded();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		Wait(ob.HF_Deluxe_close_button());
		Custom_click(ob.HF_Deluxe_close_button(), "HF Deluxe close button");
	//	asert.assertAll();
		
	}
	
	
//	@Test(priority = 3)
	public void TC_004_Verify_splendor_plus_Motorcycle() throws InterruptedException 
	{
		VerifyIconPresent(ob.splendor_plus_bike_image(), " Splendor plus Bike Image");
		mouse_hover(ob.splendor_plus_bike_image(), " on Splendor plu Bike Image");
		Thread.sleep(2000);
		Custom_click(ob.splendor_plus_quick_view(), "Quick View");
		Thread.sleep(2000);
		PageLoaded();
		String h1 = ob.heading_splendor_plus().getText();
		asert.assertEquals(h1, "SPLENDOR+");
		ob.all_bike_image_button_for_splendor_plus();
		VerifyElementPresent(ob.view_detail_button_splendor_plus(), " View detail button for Splendor plus");
		VerifyElementPresent(ob.book_now_button_splendor_plus(), " Book now button for Splendor plus");
		Custom_click(ob.view_detail_button_splendor_plus(), " on view details button in Splendor plus ");
//		change_window(1, " Next window");
		Thread.sleep(1000);
		PageLoaded();
		String module_splendor_plus = ob.bike_view_details().getText();
		System.out.println(module_splendor_plus);
		asert.assertEquals(module_splendor_plus, "SPLENDOR+");
//		driver.close();
//		change_window(0, " Previous window");
		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
		Custom_click(ob.book_now_button_splendor_plus(), " on Book now for Splendor plus");
		Thread.sleep(3000);
		PageLoaded();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		Custom_click(ob.splendor_plus_close_button(), " Splendor plus close button");
	//	asert.assertAll();
		
	}
	
	
	
//	@Test(priority = 4)
	public void TC_005_Verify_splendorXTec_Motorcycle() throws Exception {
		VerifyImagePresent(ob.splendorPlusXTec_bike_image(), " SplendorPlusXTec Bike Image");
		mouse_hover(ob.splendorPlusXTec_bike_image(), " on SplendorPlusXTec Bike Image");
		Thread.sleep(2000);
		Wait(ob.splendorPlusXTec_quickView());
		Custom_click(ob.splendorPlusXTec_quickView(), "Quick View");
		Thread.sleep(1000);
		PageLoaded();
		VerifyElementPresent(ob.heading_splendorPlusXTec(), "Heading ");
		String h1 = ob.heading_splendorPlusXTec().getText();
		asert.assertEquals(h1, "SPLENDOR+ XTEC");
		ob.all_bike_image_button_for_splendorPlusXtec();
		VerifyElementPresent(ob.viewDetail_button_splendorPlusXtec(), " View detail button for SplendorPlusXTec");
		VerifyElementPresent(ob.bookNow_bttn_splendorPlusXtec(), " Book now button for SplendorPlusXTed");
		Custom_click(ob.viewDetail_button_splendorPlusXtec(), " view details button in SplendorPlusXTec ");
//		change_window(1, " Next window");
		Thread.sleep(1000);
		PageLoaded();
		String module_splendorPlusXTec = ob.bike_view_details().getText();
		System.out.println(module_splendorPlusXTec);
		asert.assertEquals(module_splendorPlusXTec, "SPLENDOR+");
//		driver.close();
//		change_window(0, " Previous window");
		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
		Custom_click(ob.bookNow_bttn_splendorPlusXtec(), " Book now for SplendorPlusXTec");
		Thread.sleep(1000);
		PageLoaded();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		Custom_click(ob.splendorPlusXtec_close_bttn(), " SplendorPlusXTec close button");
		PageLoaded();
		
	}
	
//	@Test(priority = 5)
	public void TC_006_PracticalSection_clickAllBikes() throws Exception {
		Wait(home.click_Hero());
		Custom_click(home.click_Hero(), "");
		Thread.sleep(2000);
		Wait(ob.motorcycles());
		Custom_click(ob.motorcycles(), "Motorcycles");
		Thread.sleep(2000);
		PageLoaded();
		Wait(ob.SplendorPlus_Image());
		VerifyImagePresent(ob.SplendorPlus_Image(), "SplendorPlus");
		//driver.findElement(By.xpath("(//p[contains(text(),'SPLENDOR+')])[1]/preceding-sibling::img")).click();
		Custom_click(ob.SplendorPlus_Image(), " SplndorPlus image clickable");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.SplendorPlusXtec_Image());
		VerifyImagePresent(ob.SplendorPlusXtec_Image(),"Splendor+ Xtec");
		Custom_click(ob.SplendorPlusXtec_Image(), "Splendor+ Xtec image clickable");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.HFDeluxe_Image());
		VerifyImagePresent(ob.HFDeluxe_Image(),"HF Deluxe");
		Custom_click(ob.HFDeluxe_Image(), "HF Deluxe image clickbale");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.HF100_Image());
		VerifyImagePresent(ob.HF100_Image(),"HF 100");
		Custom_click(ob.HF100_Image(), " HF 100 clickable");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
//		
		
	}
	
	
//	@Test(priority = 6 )
	public void TC_007_Practical_all_Links() throws Exception {
		
		Wait(home.click_Hero());
		Custom_click(home.click_Hero(), "");
		Thread.sleep(2000);
		Wait(ob.motorcycles());
		Custom_click(ob.motorcycles(), "Motorcycles");
		Thread.sleep(2000);
		Custom_click(ob.click_splendorplusText(),"Splendorplus - Text");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.click_splendorplus_100ccText());
		Custom_click(ob.click_splendorplus_100ccText(),"Splendorplus -  100cc Text");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.click_splendorplusXTecText());
		Custom_click(ob.click_splendorplusXTecText(), "SplendorplusXTec - Text");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.click_splendorplusXTec_100ccText());
		Custom_click(ob.click_splendorplusXTec_100ccText(), "SplendorplusXTec - 100cc Text");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.click_HFDeluxe_Text());
		Custom_click(ob.click_HFDeluxe_Text(), "HFDeluxe -Text");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();;
		Thread.sleep(2000);
		Wait(ob.click_HFDeluxe_100ccText());
		Custom_click(ob.click_HFDeluxe_100ccText(), "HFDeluxe - 100cc Text");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.click_HF100_Text());
		Custom_click(ob.click_HF100_Text(), "HF100 - Text");
		Thread.sleep(2000);
		PageLoaded();
		driver.navigate().back();
		Thread.sleep(2000);
		Wait(ob.click_HF100_100ccText());
		Custom_click(ob.click_HF100_100ccText(), "HF100 - 100ccText");
		PageLoaded();
		driver.navigate().back();
		
	}
	
}