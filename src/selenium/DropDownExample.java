package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		driver.manage().window().maximize();
		//
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select value = new Select(dropDown);

		value.selectByIndex(2);

		value.selectByVisibleText("Cypress");
		List<WebElement> listOfOptions = value.getOptions();
		int size = listOfOptions.size();
		System.out.println("Number of element:" + size);

		dropDown.sendKeys("playwright");
	}

}
