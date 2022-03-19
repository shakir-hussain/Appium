package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Tttt {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		//	dc.setCapability("platformName", "Android");
		//	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			
			dc.setCapability(CapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
			dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30");
			
			dc.setCapability("appPackage", "com.android.settings");
			dc.setCapability("appActivity", "com.android.settings.Settings");
			
		URL	url= new URL("http://localhost:4723/wd/hub");  //"http://127.0.0.1:4723/wd/hub"
			
		AndroidDriver <MobileElement>    androidDriver=new AndroidDriver<MobileElement>(url,dc);
		    androidDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
		    
			String text = androidDriver.findElement(By.id("com.android.settings:id/search_action_bar_title")).getText();
			Assert.assertEquals(text, "Search settings");
			System.out.println("Search settings ===== "+text);
			
			List<MobileElement> element=androidDriver.findElements(By.className("android.widget.TextView"));
			
		for(MobileElement element2:element) {
			
			System.out.println("Elements---"+element2.getText());
			
			if(element2.getText().equals("Battery")) {
				element2.click();
				androidDriver.navigate().back();
				break;
				
				
							
	}
	
			}	}

}
