package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	protected AndroidDriver<MobileElement> androidDriver;
	private URL url;
	@BeforeMethod
	public void setUp() throws MalformedURLException{
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
		
		url= new URL("http://localhost:4723/wd/hub");  //"http://127.0.0.1:4723/wd/hub"
		
	    androidDriver=new AndroidDriver<MobileElement>(url,dc);
	    androidDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	
	
     @AfterMethod
	public void tearUp() {
//    	  androidDriver.closeApp();
//          androidDriver.quit();
	}
}
