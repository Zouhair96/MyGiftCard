package org.zouhair.gift;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DashboardTest {
	@Test
	public void Test() {
		System.out.println("Hello Zouhair");
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200/");
	}
}
