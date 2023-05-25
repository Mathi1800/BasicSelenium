package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");

		WebElement checked = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/label"));

		Boolean status1 = checked.isSelected();
		Boolean status2 = unchecked.isSelected();

		System.out.println(status1);
		System.out.println(status2);

		WebElement click = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/label"));

		click.click();
	}

}
