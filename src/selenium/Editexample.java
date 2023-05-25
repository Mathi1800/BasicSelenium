package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editexample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:\\Selenium_training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		// Enter the text

		WebElement text = driver.findElement(By.id("j_idt88:name"));
		text.sendKeys("Mathivanan");

		// Enter the append text with xpath
		WebElement appenbox = driver.findElement(By.name("j_idt88:j_idt91"));
		appenbox.sendKeys("Text");

		// Get default enter

		WebElement getTextBox = driver.findElement(By.id("j_idt88:j_idt95"));
		String value = getTextBox.getAttribute("value");

		System.out.println(value);

		// Clear text:

		WebElement clearBox = driver.findElement(By.name("j_idt88:j_idt95"));
		clearBox.clear();

		WebElement disableBox = driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean result = disableBox.isEnabled();
		System.out.println(result);
	}

}
