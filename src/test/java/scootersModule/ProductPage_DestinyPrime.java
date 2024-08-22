package scootersModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.ScootersModuleLocators;
import com.utility.base_class;

@Listeners(com.utility.listner.class)
public class ProductPage_DestinyPrime  extends base_class {
		
	public ScootersModuleLocators sc;
	
	@Test()
	public void DestinyPrime_Bannner() {
		
		sc =new ScootersModuleLocators();
		
		 Wait(sc.ScootersTab());
		 Custom_click(sc.ScootersTab(), " on Scooters Tab ");
		 Custom_click(sc.DestiniPrime_Name(), " on Destiny Prime Name");
		 
		 Custom_click(sc.CloseCookies(), " On cross cookies bttn");
		 Wait(sc.AvailFinance());
		 Custom_click(sc.AvailFinance(), " Avail Finance");
		 VerifyElementPresent(sc.Availfin_Heading(), " Text");
		 VerifyElementPresent(sc.Availfin_GetVerCodeTab(), "Element");
		 Custom_click(sc.AvailFinanace_closeBttn(), "On closeBttn");

		 
	}
}
