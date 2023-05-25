package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {

		// 1.OpenChrome
		// 2.Google home page

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");

		// Enter the search term
		// click the wikipedia link
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Agni" + Keys.ENTER);

		// driver.quit();

	}

}
