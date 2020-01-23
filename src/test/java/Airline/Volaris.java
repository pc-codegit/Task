package Airline;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Volaris {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PRETHIK\\eclipse-workspace\\Testing\\D2\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.smartwings.com/en/");
		
		Actions a = new Actions(d);
		
		Robot r = new Robot();
		JavascriptExecutor j = (JavascriptExecutor) d;
		
		AirlineInput ai = new AirlineInput();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement btnorgn = d.findElement(By.xpath("//span[contains(text(),'Ruzyne')]"));
		 btnorgn.click();

}
}
