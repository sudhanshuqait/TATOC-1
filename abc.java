package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class abc extends Implementation{

	@Test
	public void page1(){
		
		Assert.assertEquals("Test Automation Training Obstacle Course", driver.findElement(By.className("subtext")).getText());
	}
	
	
	@Test
	public void checkingthecorrecturl() {
		automate_Task_GridGate();
		String url = driver.getCurrentUrl();
	  assertEquals(url,"http://10.0.1.86/tatoc/basic/frame/dungeon");
	}
}