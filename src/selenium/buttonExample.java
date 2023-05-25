package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		// get position

		WebElement getPosition = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));

		Point xypoint = getPosition.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("xvalue:" + xvalue + "yvalue:" + yvalue);

		// find the color

		WebElement getColor = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
		String color = getColor.getCssValue("color");
		System.out.println(color);

		// find the size

		WebElement getSize = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		int height = getSize.getSize().getHeight();
		int width = getSize.getSize().getWidth();
		System.out.println("height:" + height + "width:" + width);

		// Click the button

		WebElement getClick = driver.findElement(By.id("j_idt88:j_idt90"));
		getClick.click();
	}

}
