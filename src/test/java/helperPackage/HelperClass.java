package helperPackage;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import basePackage.BaseClass;
public class HelperClass extends BaseClass implements IRetryAnalyzer {


	public static String createScreenshot(WebDriver driver, String method_name) throws IOException {
		String imageLocation = "C://FHE-Finance//AutomationSelenium//OnlineShopping//src//test//java//Report//ScreenShots";
		String image_path = imageLocation + method_name + ".png";		
		// generate screenshot as a file object
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(image_path));
		return image_path;

	}
	
	public void switchWindow() throws InterruptedException {

		// Storing parent window reference into a String Variable
		// Switching from parent window to child window
		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
		}
		// // Switching back to Parent Window
		// driver.switchTo().window(Parent_Window);
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}		
		//Counter to keep track of retry attempts
		int retryAttemptsCounter = 0;
		
		//The max limit to retry running of failed test cases
		//Set the value to the number of times we want to retry
		int maxRetryLimit = 1;

		//Method to attempt retries for failure tests
		public boolean retry(ITestResult result) {
			if (!result.isSuccess()) {
				if(retryAttemptsCounter < maxRetryLimit){
					retryAttemptsCounter++;
					return true;
				}
			}
			return false;
		}

		
}
