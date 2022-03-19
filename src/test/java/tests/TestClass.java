package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;


public class TestClass extends BaseClass {
	@Test
	public void testSearch() throws InterruptedException {
		String text = androidDriver.findElement(By.id("com.android.settings:id/search_action_bar_title")).getText();
		Assert.assertEquals(text, "Search setting");
		System.out.println("Search settings ===== "+text);
		
//		List<MobileElement> element=androidDriver.findElements(By.className("android.widget.TextView"));
//		
//		for(int i=0; i<element.size();i++) {
//			
//			System.out.println("value of Element---"+ element.get(i).getText());
//			
//			element.get(i).click();
//			Thread.sleep(2000);
//			androidDriver.navigate().back();
//			Thread.sleep(2000);	
//			
//			if(element.get(i).getText().equals("Battery")) {
//			
//				break;	
			}
			
			
		
		
	}


