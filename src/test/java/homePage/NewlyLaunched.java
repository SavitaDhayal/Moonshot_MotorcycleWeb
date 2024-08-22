package homePage;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.utility.base_class;
import com.utility.library;

@Listeners(com.utility.listner.class)
public class NewlyLaunched extends base_class {
	public home_page home;
	
	@Test
	public void NewlyLanchedDetails() throws Exception {
		//check image, left/right carousel and know more tab
		home= new home_page();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Wait(home.get_NewlyLaunched_Text());
		VerifyElementPresent(home.get_NewlyLaunched_Text(), "");
		Custom_click(home.click_LeftCarousel(), "left carousel clickable");
		Thread.sleep(2000);
		Custom_click(home.click_RightCarousel(), "Right carousel clickable");
		
		List<WebElement> sliders = driver
				.findElements(By.xpath("//div[@id='adcarousel37860603']//ul[@class='carousel-indicators']//li"));
		int s = sliders.size();

		System.out.println("total tabs present: " + sliders.size());
		for (int i=0; i<s; i++) {
		//	VerifyImagePresent(driver, home.check_OfferImage() ,"OfferImage present");
			WebElement t = driver.findElement(By.xpath("//div[@id='adcarousel37860603']//ul[@class='carousel-indicators']//li[" + (i + 1) + "]"));
			Custom_click(t, "sliders Clickable");
			VerifyImagePresent(home.check_OfferImage() ,"(OfferImage present "+(i+1)+")");
			Wait(home.click_OfferImage_KnowMore());
			Custom_click(home.click_OfferImage_KnowMore(), "clickable");
			Thread.sleep(2000);
			PageLoaded();
			Custom_click(home.click_HeroLogo(), "Hero Logo Cilckable");
			
			
		}

}
	
}
