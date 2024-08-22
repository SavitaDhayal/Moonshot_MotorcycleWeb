package com.utility;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
public class base_class implements config_data_provider, excel_data_provider, library , extent_reports_generator{
	
	public static WebDriver driver;
	public static Logger log;
	public static WebDriverWait wait;
	public static ExtentTest test;
	public static listner lis;
	public static ExtentSparkReporter report;
	public static ExtentReports extent;
	String confipath = System.getProperty("user.dir") + "\\config_data\\config.properties";
	String excelpath = System.getProperty("user.dir") + "\\data\\data1.xlsx";
	
	
	@Parameters({ "browser_name" })
	@BeforeTest
	public void getlaunchURL(@Optional("chrome") String browsername) {
		try {

//			DesiredCapabilities dc = new DesiredCapabilities();
//			if (browsername.equalsIgnoreCase("chrome")) {
//
//				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
//		//		SetDriver(new ChromeDriver()); //new changes
////				dc.setBrowserName("chrome");
////				driver =new RemoteWebDriver(new URL("http://localhost:4444"), dc);
//			} else if (browsername.equalsIgnoreCase("edge")) {
//				 WebDriverManager.edgedriver().setup();
//				 driver=new EdgeDriver();
//			//	 SetDriver(new EdgeDriver()); //new changes
////				dc.setBrowserName("edge");
////				driver = new RemoteWebDriver(new URL("http://localhost:4444"), new EdgeOptions());
//			} else if (browsername.equalsIgnoreCase("firefox")) {
//				 WebDriverManager.firefoxdriver().setup();
//				 driver=new FirefoxDriver();
//			//	 SetDriver(new FirefoxDriver()); //new changes
////				dc.setBrowserName("firefox");
////				driver = new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions());
//			}
			
	//		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Welcome\\Documents\\GitHub\\Moonshot_Master\\data\\chromedriver.exe");
			BrowserFactory.getInstance().SetDriver("chrome");
			 driver=BrowserFactory.getInstance().getDriver();
			
			driver.get(config_getdata("stageurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			log = LogManager.getLogger("MoonShot_Web");
			lis = new listner();
			
		} catch (Exception e) {
			System.out.println("Problem in launch browser" + e);
		}
	}

	@Override
	public String config_getdata(String key) {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(confipath);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);

		} catch (Exception e) {
			System.out.println("Problem in read data from property file" + e);
		} 
		return value;
	}

	@Override
	public String excel_getdata(int sheetno, int row_No, int col_No) {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			XSSFWorkbook wf = new XSSFWorkbook(fis);
			XSSFSheet sheet = wf.getSheetAt(sheetno);
			value = sheet.getRow(row_No).getCell(col_No).getStringCellValue();

		} catch (Exception e) {
			System.out.println("Problem in read data from excel file" + e);
		}
		return value;
	}

	@Override
	public int getRowCount(int sheetno) {
		int count = 0;
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			XSSFWorkbook wf = new XSSFWorkbook(fis);
			XSSFSheet sheet = wf.getSheetAt(sheetno);
			count = sheet.getLastRowNum();

		} catch (Exception e) {
			System.out.println("Problem in read data from excel file for Row_Count" + e);
		}
		return count;
	}

	@Override
	public int getColCount(int sheetno) {
		int count = 0;
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			XSSFWorkbook wf = new XSSFWorkbook(fis);
			XSSFSheet sheet = wf.getSheetAt(sheetno);
			count = sheet.getRow(0).getLastCellNum();
		} catch (Exception e) {
			System.out.println("Problem in read data from excel file for Row_Count" + e);
		}
		return count;
	}

	@Override
	public void custom_sendkeys(WebElement element, String value, String fieldname) {
		try {
			if (element.isEnabled() || element.isDisplayed() == true) {
				wait = new WebDriverWait(driver,Duration.ofSeconds(10) );
				wait.until(ExpectedConditions.visibilityOf(element));
				element.sendKeys(value);
				test.log(Status.PASS, fieldname + "==Value Successfully send==" + value);
				log.info("Successfully send Value " + fieldname);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To Send  Value==");
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
			log.error("==Unable to send Value " + fieldname);
			
		}
	}

	@Override
	public void Custom_click(WebElement element, String fieldname) {
		try {
			if (element.isDisplayed() || element.isEnabled() == true) {
			  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				test.log(Status.PASS, "Successfully click==" + fieldname);
				log.info("Successfully Click " + fieldname);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To Click ==" + e);
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
			log.error("==Unable to Click " + fieldname);

		}
	}

	@Override
	public void VerifyElementPresent(WebElement ele, String fieldname) {
		try {
			if (ele.isDisplayed() == true) {
				String Text = ele.getText();
				test.log(Status.PASS, "Element is present:  " + fieldname + ": " + Text);
				log.info("Text present: " + fieldname + " " + Text);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Element is not present ==" + e);
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
			log.error(" text is not present: " + fieldname);

		}
	}

	@Override
	public void VerifyIconPresent(WebElement ele, String fieldname) {
		try {
			if (ele.isDisplayed() == true) {

				test.log(Status.PASS, "Image is present:  " + fieldname);
				log.info("Image is present " + fieldname);
			}

		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Image is not present ==" + e);
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
			log.error("Image is not present" + fieldname);

		}
	}

	@Override
	public void VerifyImagePresent(WebElement image, String fieldname) {
		try {
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			
			Boolean ImagePresent = (Boolean)((JavascriptExecutor) driver)
.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
					image);
			if (ImagePresent) {
				test.log(Status.PASS, "Image is present:  " + fieldname);
				log.info("Image is present " + fieldname);
			}
			else
			{
				test.log(Status.FAIL, fieldname + "==Image is not present ==" );
				log.error("Image is not present " + fieldname);
				test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
				
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Image is not present ==" + e);
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
			log.error("Image is not present " + fieldname);
		}
	}

	@Override
	public void PageLoaded() {
		try {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		String	Title = driver.getTitle();
			test.log(Status.PASS, "Page is loaded : " + Title);
			log.info("Page is loaded " + Title);
		} catch (Exception e) {
			test.log(Status.FAIL, "==page is not loaded :" + e);
			test.addScreenCaptureFromPath(lis.getcapcture(driver.getTitle()));
			
		}
	}
	
	public void GetCurrentUrl() {
		try {
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String	Url = driver.getCurrentUrl();
			test.log(Status.PASS, "Current URL is  : " + Url);
			log.info("Current URL is  " + Url);
		} catch (Exception e) {
			test.log(Status.FAIL, "==url is not loaded :" + e);
			test.addScreenCaptureFromPath(lis.getcapcture(driver.getCurrentUrl()));
			
		}
	}

//////////////////////////////// Explicit Wait ///////////////////////////////	
	public void Wait(WebElement element) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	@Override
	public void VerifyTextByAttribute(WebElement ele, String fieldname, String Text) {
		try {
			if (ele.isDisplayed() == true) {
				Wait(ele);
				 
				test.log(Status.PASS, "Element is present:  " + fieldname + ": " + Text);
				log.info("Text present " + fieldname+ ":"+Text);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Element is not present ==" + e);
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
		}
	}

	@Override
	public void Check_IfSelected(WebElement ele, String fieldname, String Text) {
		try {
			if (ele.isSelected() == true) {
				Wait(ele);
				Text = ele.getText();
				test.log(Status.PASS, "Element is present:  " + fieldname + ": " + Text);
				log.info("Element is already selected " + fieldname);
			} else {
				Text = ele.getText();
				test.log(Status.PASS, "Element is present:  " + fieldname + ": " + Text);
				Wait(ele);
				ele.click();
				log.info("Element is  clickable " + fieldname);
			}
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Element is not present ==" + e);
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
		}
	}

	@Override
	public void TextOfElement(String ele, String fieldname) {
		try {
			// if(( ele.isDisplayed()==true) {
			test.log(Status.PASS, "Text is visibile :" + fieldname + ":" + ele);
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To find ==" + e);
			log.error("==Unable to find " + fieldname);
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
		}
	}

	@Override
	public void verify_if_Clickable(WebElement ele, String fieldname) {
		ele.click();
		// test.log(Status.PASS, "Element is clickabale:"+ fieldname);

		test.log(Status.FAIL, fieldname + "=Element is not clickbale ==");
		log.error("==Unable to click " + fieldname);
//		test.addScreenCaptureFromBase64String(lis.getcapcture());
	}

	@Override
	public void excel_writedata(int sheetno, int row_No, int col_No, String value) {
		try {

			try {
				FileInputStream fis = new FileInputStream(excelpath);
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheetAt(sheetno);
				sheet.createRow(row_No).createCell(col_No).setCellValue(value);
				FileOutputStream fos = new FileOutputStream(excelpath);
				workbook.write(fos);
				workbook.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println("Problem in Write data in excel file" + e);
		}
	}

	@Override
	public void mouse_hover(WebElement ele, String fieldname) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			test.log(Status.PASS, "Mouse over sucessfully : " + fieldname);
			log.info("Mouse overed sucessfully" + fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To Mouse over");
			log.error("Unable to Mouse over " + fieldname);
	//		lis.onTestFailure(null);
		}
	}

	@Override
	public void change_window(int tab_index , String fieldname) {
		try {
			Set<String> window = driver.getWindowHandles();
			ArrayList<String> tab = new ArrayList<>(window);
			driver.switchTo().window(tab.get(tab_index));
			test.log(Status.PASS, " Window switched sucessfully : " + fieldname);
			log.info("Window switched sucessfully" + fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, fieldname + "==Unable To Switched");
			log.error("Unable to switched " + fieldname);
			test.addScreenCaptureFromPath(lis.getcapcture(fieldname));
		}
		
	}
	@Override
	public ExtentReports getreports() {
		{
			String path=System.getProperty("user.dir")+"\\Report\\index.html";
			report=new ExtentSparkReporter(path);
			report.config().setDocumentTitle("MoonShot-Automation Test Report");
			report.config().setReportName("MoonShot");
			report.config().setTheme(Theme.DARK);
			extent=new ExtentReports();
			extent.attachReporter(report);
			extent.setSystemInfo("System Name", "Project Name");
			extent.setSystemInfo("Laptop-Dell", "MoonShot Web Application");
			extent.setSystemInfo("QA", "Savita Dhayal");
			extent.setSystemInfo("Operating system", "Windows 10 pro");
			extent.setSystemInfo("BrowserName", "Chrome");
			return extent;
		}
}
	
	public void ScrollIntoView(WebElement element) {
		 
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
	
		
	//	BrowserFactory.getInstance().closeBrowser();	
	//	System.out.println(Thread.currentThread().getId());
	//	driver.quit();
		//driver.remove();
		
	}
	
}
