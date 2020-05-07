package mainPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenApp {
	public static  AppiumDriver<MobileElement> driver;
	@Test
	public void OpenApp1() throws MalformedURLException {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, " ");
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus4 with android 7.1");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		    capabilities.setCapability(MobileCapabilityType.APP, "D:\\AjitAltimetrik\\PracticeSession\\MobileAutomaion\\Massc-debug.apk");

			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			driver =new AppiumDriver<MobileElement>(url,capabilities);
		}catch(Exception e) {
			System.out.println("Cause Is: "+e.getCause());
			System.out.println("Message Is: "+e.getMessage());
			e.printStackTrace();
		}

	}
}
