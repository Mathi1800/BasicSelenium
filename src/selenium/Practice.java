package selenium;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {

		String baseUrl = "https://www.dunzo.com/bangalore";
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(baseUrl);

		List<WebElement> lk = driver.findElements(By.tagName("a"));
		System.out.println(lk.size());

		for (WebElement l : lk) {
			String data = l.getAttribute("href");

			URL url = new URL(data);

			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

			con.setConnectTimeout(3000);
			con.connect();
			if (con.getResponseCode() >= 400) {
				System.out.println(l + "" + con.getResponseCode() + "inavlid");
			} else {
				System.out.println(l + "" + con.getResponseCode() + "valid");
			}

		}

	}

}
