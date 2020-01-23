package eCom;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hottopic {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PRETHIK\\eclipse-workspace\\Testing\\D2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hottopic.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement btnclose = driver.findElement(By.xpath("//button[@class=\"ui-dialog-titlebar-close ae-button\"]"));
		btnclose.click();
		
		readinput r = new readinput();
		
		WebElement srch = driver.findElement(By.xpath("//input[@id=\"q\"]"));
		srch.sendKeys("batman");
		
		srch.sendKeys(Keys.ENTER);
		
		List<WebElement> Listpage1 = driver.findElements(By.xpath("//a[contains(text(),'Batman')]"));
		
		System.out.println("No item in page"  + Listpage1.size());
		
		List<String> page1 = new ArrayList<String>();
		for(int i =1; i<=46; i++) 
		{
			String Listitem = Listpage1.get(i).getText();
			System.out.println(Listitem);
			page1.add(Listitem);
		
			writedata w = new writedata();
			
			w.writedata(page1);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'DC Comics Batman Logo T-Shirt')]"));
			
			findElement.click();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//driver.findElement(By.cssSelector("path.fsrAbandonButton")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'SM')]")).click();
			
			Thread.sleep(1000);

			WebElement findElement2 = driver.findElement(By.id("add-to-cart"));
			findElement2.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			TakesScreenshot t = (TakesScreenshot)driver;
			File temp = t.getScreenshotAs(OutputType.FILE);
			File save = new File("C:\\Users\\PRETHIK\\eclipse-workspace\\Task\\ScreenShot\\hottopic.png");
			
			FileUtils.copyFile(temp, save); 
}
}
}
