package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");

		WebElement first = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		first.click();

		WebElement diabled = driver.findElement(By.id("j_idt87:j_idt102"));

		Boolean result = diabled.isEnabled();

		System.out.println(result);

	}

}
