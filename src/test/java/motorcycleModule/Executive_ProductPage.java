package motorcycleModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycle_ExecutiveModule;
import com.page_object.Motorcycles_practical;
import com.page_object.home_page;
import com.utility.base_class;

@Listeners(com.utility.listner.class)

public class Executive_ProductPage extends base_class {
	public Motorcycles_practical ob;
	public Motorcycle_ExecutiveModule exe;
	public home_page home;
	SoftAssert asert = new SoftAssert();
	
	
	
	@Test()
	public void TC_058_ProductPage_All_heading_Tabs() throws Exception {
	
	exe=new Motorcycle_ExecutiveModule(); 
	ob = new Motorcycles_practical();
	home=new home_page();
	
	PageLoaded();
	home.click_Hero();
	Wait(exe.motorcycles());
	Custom_click(exe.motorcycles(), "Motorcycles");
	PageLoaded();
	
	Custom_click(exe.GlamourXtecText(), " on GlamourXtec ");
	if(home.click_CancelCookies().isDisplayed()){
		Custom_click(home.click_CancelCookies(), "CANCEL COOKIES");	
		}
	home.ReqCallBack();
	ob.click_headerBikes();
	
	ob.click_navbarTabs();
	
	Wait(home.click_HeroLogo());
	Custom_click(home.click_HeroLogo(), " on Hero Logo");
	}
	
	
	
	
	
	

}
