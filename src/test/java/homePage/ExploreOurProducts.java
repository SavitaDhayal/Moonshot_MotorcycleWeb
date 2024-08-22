package homePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.utility.base_class;

@Listeners(com.utility.listner.class)
public class ExploreOurProducts extends base_class {

	public home_page home;

//	@Test(priority=0)
	public void ExploreProducts_NewRelease() {
		home = new home_page();
		home.products_NewLaunches(); // this action will mouse hover and get text of bike present

	} 

	
	@Test(priority = 1)
	public void ExploreProducts_Practical() throws Exception {

		home = new home_page();
	
		ScrollIntoView(home.click_Practical());
		Wait(home.click_Practical());
		Custom_click(home.click_Practical(), " click on practical tab");
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		
		home.Explore_PracticalBikes();
	}
	
	
//	@Test(priority=2)
	public void ExploreProducts_Executive() throws Exception {
		home = new home_page();
		ScrollIntoView(home.click_Executive());
		Wait(home.click_Executive());
		Custom_click(home.click_Executive(), " click on Executive tab");

//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(200);
		home.Explore_ExecutiveBikes();
	}

	
//	@Test(priority=3)
	public void ExploreProducts_Performance() throws Exception {
		home = new home_page();
		ScrollIntoView(home.click_Performance());
		
		Custom_click(home.click_Performance(), " click on Performance tab");
		home.Explore_PerformanceBikes();
	}

//	@Test(priority=4)
	public void ExploreProducts_Scooters() throws Exception {
		home = new home_page();
		Custom_click(home.click_ExploreScooters(), " click on scoooters tab");
		List<WebElement> scootersImage = driver
				.findElements(By.xpath("(//div[@id='menu-1287252785']//div[@class='bike-product-prant']//img)"));
		int n = scootersImage.size();
		System.out.println(n);
		List<WebElement> explorescootertext = driver
				.findElements(By.xpath("(//div[@id='menu-1287252785']//div[@class='bike-product-prant']//p)"));
		int scooterText = explorescootertext.size();
		System.out.println(scooterText);
		for (int i = 0; i < n; i++) {
			Wait(scootersImage.get(i));
			mouse_hover(scootersImage.get(i), "scooters Image");
			i++;
			Thread.sleep(2000);
			for (int j = 1; j < explorescootertext.size(); j++) {
				Wait(explorescootertext.get(j));
				VerifyElementPresent(explorescootertext.get(j), "scooters Name ");
			}
 		}
	}

}
