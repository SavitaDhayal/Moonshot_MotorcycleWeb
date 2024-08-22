package com.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public interface library {
public void custom_sendkeys(WebElement element,String value,String fieldname);
public void Custom_click(WebElement element,String fieldname); 
public void VerifyElementPresent(WebElement ele, String fieldname);
public void VerifyIconPresent(WebElement ele, String fieldname); 
public void VerifyImagePresent(WebElement image, String fieldname); 
public void PageLoaded();		
public void VerifyTextByAttribute(WebElement ele, String fieldname, String Text); 
public void Check_IfSelected(WebElement ele, String fieldname, String Text);
public void TextOfElement(String ele, String fieldname);
public void verify_if_Clickable(WebElement ele, String fieldname);
public void mouse_hover(WebElement ele , String fieldname);
public void change_window(int tab_index ,String fieldname );
}
