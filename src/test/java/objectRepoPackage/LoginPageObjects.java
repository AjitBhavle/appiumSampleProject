package objectRepoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import helperPackage.HelperClass;

public class LoginPageObjects extends HelperClass {
	
	//public static String Base_Url = "https://www.myntra.com/login";
	public static WebElement lgnBox(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@class='login-box']"));
		return element;
	}
	
	public static WebElement lgnButton(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@id='mountRoot']/div/div/div/div[4]/a"));
		return element;
	}
	
	public static WebElement userName(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(By.name("email"));
		return element;
	}
	public static WebElement password(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement loginBtn(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(By.className("login-login-button"));
		return element;
	}
	
	
}
