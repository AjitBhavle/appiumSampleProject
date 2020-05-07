package mainPackage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import objectRepoPackage.LoginPageObjects;
import readExcelData.ReadExcelData;

/*public class LoginPage extends ReadExcelData {

	@Test(dataProvider = "Login")
	public void Login(String uname, String pass) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPageObjects.userName(driver).sendKeys(uname);
		LoginPageObjects.password(driver).sendKeys(pass);
		Thread.sleep(2000);
		LoginPageObjects.loginBtn(driver).click();
		Thread.sleep(2000);
	}

}*/
public class LoginPage extends BaseClass {

	@Test
	public void Login() throws InterruptedException {

		System.out.println("This is appium test......");
	}

}
