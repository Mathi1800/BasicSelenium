package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "https://www.leafground.com/alert.xhtml";
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(baseUrl);

//		WebElement url = driver.findElement(By.id("APjFqb"));
//		url.sendKeys("selenium" + Keys.ENTER);
//		String title = driver.getTitle();
//		System.out.println("Title:" + title);

//		WebElement link = driver.findElement(By.linkText("Go to Dashboard"));
//		link.click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//
//		WebElement partial = driver.findElement(By.partialLinkText("Dashboard"));
//		partial.click();
//		Thread.sleep(3000);

//		WebElement name = driver.findElement(By.id("j_idt88:name"));
//		name.sendKeys("Mathivanan");
//		String value = name.getAttribute("value");
//		System.out.println(value);
//
//		WebElement append = driver.findElement(By.id("j_idt88:j_idt91"));
//		append.sendKeys(" city");
//
//		WebElement enable = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
//		Boolean result = enable.isEnabled();
//		System.out.println(result);
//
//		WebElement clear = driver.findElement(By.id("j_idt88:j_idt95"));
//		clear.clear();
//
//		WebElement val = driver.findElement(By.id("j_idt88:j_idt97"));
//		String val1 = val.getAttribute("value");
//		System.out.println(val1);
//
//		WebElement type = driver.findElement(By.id("j_idt88:j_idt99"));
//		type.sendKeys("mathimathi1800@gmail.com" + Keys.TAB);

//		WebElement drop = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
//		Select value = new Select(drop);
//		value.selectByIndex(1);

//		WebElement mutiple = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button/span[1]"));
//		mutiple.click();
//		Select m = new Select(mutiple);
//		m.deselectByVisibleText("JMeter");
//		m.deselectByVisibleText("PostMan");
//
//		Thread.sleep(5000);
//		m.deselectAll();
//
//		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));
//		Boolean result1 = button1.isEnabled();
//		System.out.println(result1);
//
//		WebElement position = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
//		Point data = position.getLocation();
//		int X = data.getX();
//		int Y = data.getY();
//		System.out.println(X + Y);
//
//		WebElement color = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
//
//		String Colour = color.getCssValue("color");
//		System.out.println(Colour);
//
//		WebElement h = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
//		int H = h.getSize().getHeight();
//		int W = h.getSize().getWidth();
//		System.out.println(H + W);

		WebElement alert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		alert.click();
		Alert v = driver.switchTo().alert();
		v.accept();

		WebElement alert1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		alert1.click();
		Alert v1 = driver.switchTo().alert();
		v1.dismiss();

		WebElement alert2 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		alert2.click();
		Alert v2 = driver.switchTo().alert();
		v2.sendKeys("good");
		v2.accept();
	}

}
