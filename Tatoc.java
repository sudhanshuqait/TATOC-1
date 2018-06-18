package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tatoc {

	public static void main (String args[])
	{
		System.setProperty("webdriver.firefox.marionette","/root/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.0.1.86/tatoc");
		driver.findElement(By.linkText("Basic Course")).click();
		driver.findElement(By.className("greenbox")).click();
		driver.switchTo().frame("main");
		String str = driver.findElement(By.id("answer")).getAttribute("className"), str2;
		while (true)
		{
			driver.switchTo().frame("child");
			str2 = driver.findElement(By.id("answer")).getAttribute("className");
			if (str.equals(str2)) 
			{
				driver.switchTo().parentFrame();
				driver.findElement(By.linkText("Proceed")).click();
				break;
			}
			driver.switchTo().parentFrame();
			driver.findElement(By.linkText("Repaint Box 2")).click();
		}
		Actions act = new Actions(driver);	
		WebElement from = driver.findElement(By.id("dragbox"));
		WebElement to = driver.findElement(By.id("dropbox"));
		act.dragAndDrop(from, to).build().perform();
		driver.findElement(By.linkText("Proceed")).click();
		driver.findElement(By.linkText("Launch Popup Window")).click();
		
	}
}
