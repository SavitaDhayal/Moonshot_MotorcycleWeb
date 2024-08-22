package scootersModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.ScootersModuleLocators;
import com.utility.base_class;

@Listeners(com.utility.listner.class)
public class CateloguePage_Scooters extends base_class
{
	public ScootersModuleLocators sc;
	
	
	@Test(priority=0)
	public void CatLinks() {		 
		 sc =new ScootersModuleLocators();
		 
		 Wait(sc.ScootersTab());
		 Custom_click(sc.ScootersTab(), " on Scooters Tab ");
		 Custom_click(sc.ScootersText(), " On Scooters Text");
		 PageLoaded();		 		 
	}
	 
	@Test(priority=1)
	public void TC_04_CategoryPage_Xoom() throws Exception {
		
		VerifyImagePresent(sc.Xoom_scooter_Img(), " xoom scooter Image ");
		mouse_hover(sc.Xoom_scooter_Img(), " on Image");
		Custom_click(sc.Xoom_QuickView(), "");
		
		sc.click_all_colors_Xoom();
		
		Custom_click(sc.Xoom_ViewDetails(), "On View Details");
		Thread.sleep(1000);
		PageLoaded();

		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
	
		VerifyElementPresent(sc.Xoom_BookNow(), "BookNow button  >> ");
		Wait(sc.Xoom_BookNow());
		Thread.sleep(1000);
		Custom_click(sc.Xoom_BookNow(), "  on Book Now Button");
		Thread.sleep(1000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(1000);
		Wait(sc.Xoom_CloseButton());
		Custom_click(sc.Xoom_CloseButton(), "on cross button");

	}
	
	
	@Test(priority=2)
	public void TC_05_CategoryPage_PleasuePlusXtec() throws Exception {
		
		VerifyImagePresent(sc.PleasuePlusXtec_scooter_Img(), " xoom scooter Image ");
		mouse_hover(sc.PleasuePlusXtec_scooter_Img(), " on Image");
		Custom_click(sc.PleasuePlusXtec_QuickView(), "");
		
		sc.click_all_colors_pleasuePlusXtec();
		
		Custom_click(sc.PleasuePlusXtec_ViewDetails(), "On View Details");
		Thread.sleep(1000);
		PageLoaded();

		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
	
		VerifyElementPresent(sc.PleasuePlusXtec_BookNow(), "BookNow button  >> ");
		Wait(sc.PleasuePlusXtec_BookNow());
		Thread.sleep(1000);
		Custom_click(sc.PleasuePlusXtec_BookNow(), "  on Book Now Button");
		Thread.sleep(1000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(1000);
		Wait(sc.PleasuePlusXtec_CloseButton());
		Custom_click(sc.PleasuePlusXtec_CloseButton(), "on cross button");

	}
	
	@Test(priority=3)
	public void TC_06_CategoryPage_Destini125Xtec() throws Exception {
		
		VerifyImagePresent(sc.Destini125Xtec_scooter_Img(), " xoom scooter Image ");
		mouse_hover(sc.Destini125Xtec_scooter_Img(), " on Image");
		Custom_click(sc.Destini125Xtec_QuickView(), "");
		
		sc.click_all_colors_Destini125Xtec();
		
		Custom_click(sc.Destini125Xtec_ViewDetails(), "On View Details");	
		change_window(1, " Next window");
		Thread.sleep(2000);
		GetCurrentUrl();
		PageLoaded();
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();

//		driver.navigate().back();
//		Thread.sleep(1000);
//		PageLoaded();
		Thread.sleep(1000);
		VerifyElementPresent(sc.Destini125Xtec_BookNow(), "BookNow button  >> ");
		Wait(sc.Destini125Xtec_BookNow());
		Thread.sleep(1000);
		Custom_click(sc.Destini125Xtec_BookNow(), "  on Book Now Button");
		Thread.sleep(1000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(1000);
		Wait(sc.Destini125Xtec_CloseButton());
		Custom_click(sc.Destini125Xtec_CloseButton(), "on cross button");

	}
	

	@Test(priority=4)
	public void TC_07_CategoryPage_MaestroEdge125() throws Exception {
		
		VerifyImagePresent(sc.MaestroEdge125_scooter_Img(), " MaestroEdge125 scooter Image ");
		mouse_hover(sc.MaestroEdge125_scooter_Img(), " on MaestroEdge125 Image");
		Custom_click(sc.MaestroEdge125_QuickView(), "");
		
		sc.click_all_colors_MaestroEdge125();
		
		VerifyElementPresent(sc.MaestroEdge125_ViewDetails(), "MaestroEdge125- View Details Tab");
		Custom_click(sc.MaestroEdge125_ViewDetails(), "On MaestroEdge125 View Details Tab");
		Thread.sleep(1000);
		PageLoaded();

		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
	
		VerifyElementPresent(sc.MaestroEdge125_BookNow(), "MaestroEdge125 BookNow button  >> ");
		Wait(sc.MaestroEdge125_BookNow());
		Thread.sleep(1000);
		Custom_click(sc.MaestroEdge125_BookNow(), "  on MaestroEdge125 Book Now Button");
		Thread.sleep(1000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(1000);
		Wait(sc.MaestroEdge125_CloseButton());
		Custom_click(sc.MaestroEdge125_CloseButton(), "on MaestroEdge125 cross button");

	}
	
	@Test(priority=5)
	public void TC_08_CategoryPage_MaestroEdge110() throws Exception {
		
		VerifyImagePresent(sc.MaestroEdge110_scooter_Img(), " MaestroEdge110 scooter Image ");
		mouse_hover(sc.MaestroEdge110_scooter_Img(), " on MaestroEdge110 Image");
		Custom_click(sc.MaestroEdge110_QuickView(), "");
		
		sc.click_all_colors_MaestroEdge110();
		
		Custom_click(sc.MaestroEdge110_ViewDetails(), "On MaestroEdge110 View Details Tab");
		Thread.sleep(1000);
		PageLoaded();

		driver.navigate().back();
		Thread.sleep(1000);
		PageLoaded();
	
		VerifyElementPresent(sc.MaestroEdge110_BookNow(), "MaestroEdge110 BookNow button  >> ");
		Wait(sc.MaestroEdge110_BookNow());
		Thread.sleep(1000);
		Custom_click(sc.MaestroEdge110_BookNow(), "  on MaestroEdge110 Book Now Button");
		Thread.sleep(1000);
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		Thread.sleep(1000);
		Wait(sc.MaestroEdge110_CloseButton());
		Custom_click(sc.MaestroEdge110_CloseButton(), "on MaestroEdge110 cross button");
	}

}



