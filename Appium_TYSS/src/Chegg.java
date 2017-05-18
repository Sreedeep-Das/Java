import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Chegg {
AndroidDriver driver;
DesiredCapabilities capability;
@Test
public void testwhatsApp() throws MalformedURLException, InterruptedException{
	 capability=new DesiredCapabilities();
	capability.setCapability("automationName", "Appium");
	capability.setCapability("platformName", "Android");
	capability.setCapability("platformVersion", "5.1.1");
	capability.setCapability("deviceName", "Yu Yuphoria");
	capability.setCapability("app","E://Deep_javapractise//Appium_Patanjali//Appium_TYSS//apk//Chegg Tutors Online Tutoring_v1.1.2_apkpure.com.apk");
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	Thread.sleep(1000);
	driver.findElement(By.id("com.chegg.tutors:id/nux_skip")).click();
	driver.findElement(By.id("com.chegg.tutors:id/nux_signin_bottom_button")).click();
	driver.findElement(By.id("com.chegg.tutors:id/editText_authenticate_email")).sendKeys("tatae90@gmail.com");
	driver.findElement(By.id("com.chegg.tutors:id/editText_authenticate_password")).sendKeys("NTSS7821");
	driver.findElement(By.id("com.chegg.tutors:id/login_btn")).click();
	try{
		driver.hideKeyboard();
	}
	catch(Exception e)
	{
		
	}
	Thread.sleep(2000);
	List<WebElement> e=driver.findElements(By.id("com.chegg.tutors:id/tab_icon"));
	System.out.print("Size is"+e.size());
	Thread.sleep(2000);
	e.get(1).click();
		
}}
