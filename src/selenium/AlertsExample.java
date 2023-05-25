package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");

		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		alertBox.click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

//Confirmation box

		WebElement confirmAlert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));

		confirmAlert.click();

		Alert alerts = driver.switchTo().alert();
		Thread.sleep(3000);
		alerts.dismiss();
//prompt box

		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		promptBox.click();

		Alert box = driver.switchTo().alert();
		box.sendKeys("ok");
		Thread.sleep(3000);
		box.accept();
	}

}
