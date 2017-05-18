import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class WhatsApp {
	AndroidDriver driver;
	DesiredCapabilities capability;
	@Test
	public void testwhatsApp() throws MalformedURLException, InterruptedException{
		 capability=new DesiredCapabilities();
		capability.setCapability("AutomationName", "Appium");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "5.1.1");
		capability.setCapability("deviceName", "Yu Yuphoria");
		capability.setCapability("app","E://Deep_javapractise//Appium_Patanjali//Appium_TYSS//apk//HealthifyMe Weight Loss Coach_vv4.9.2_apkpure.com.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		List<WebElement> ele=driver.findElements(By.className("android.widget.ImageView"));
		System.out.print("Size is"+ele.size());
		Thread.sleep(2000);
		ele.get(0).click();
	    driver.findElement(By.name("Login")).click();
		driver.findElement(By.name("Enter Email")).sendKeys("tatae90@gmail.com");
		driver.findElement(By.id("com.healthifyme.basic:id/et_password")).sendKeys("NTSS7821");
		try{
			driver.hideKeyboard();
		}
		catch(Exception e)
		{
			
		}
		driver.findElement(By.id("com.healthifyme.basic:id/btn_login_signup")).click();
		Thread.sleep(10000);
		driver.swipe(275, 771, 275, 376, 1000);
		Thread.sleep(5000);
		driver.findElement(By.id("com.healthifyme.basic:id/dp_water_progress")).click(); 
		driver.findElement(By.id("com.healthifyme.basic:id/track")).click();
		for(int i=1;i<=10;i++)
		{
		driver.findElement(By.id("com.healthifyme.basic:id/ib_plus")).click();
		}
		driver.navigate().back();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		//driver.swipe(275, 771, 275, 276, 1000);
		Thread.sleep(2000);
		List<WebElement> e=driver.findElements(By.className("android.widget.LinearLayout"));
		System.out.print("Size is"+e.size());
		
		for(int i=1;i<=e.size();i++)
		{
			boolean flag=e.get(i).getText().contains("water");
			System.out.println(flag);
			System.out.println(e.get(i).getText());
		if(flag)
		{
			e.get(i).click();
		}
	
		
		
		}
		
		
		List<WebElement> cardTitle = driver.findElements(By.id("com.healthifyme.basic:id/tv_card_title"));
		System.out.println(cardTitle.size());
		System.out.println(cardTitle.get(2).getText());
			List<WebElement> greenTick = driver.findElements(By.className("android.widget.ImageView"));
		System.out.println("----------------------------------------------"+greenTick.size());
		
		for(int i=0;i<cardTitle.size();i++)
		{
			if(cardTitle.get(i).getText().contains("eat"))
			{
				System.out.println(greenTick.get(i+2).isDisplayed());
			}
		}
		
	}
	
	

}
