package lesson8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/auto/index8.html");
		String title = driver.getTitle();
		System.out.println(title);

		List<WebElement> listOfOptions = driver.findElements(By.tagName("option"));
		for (int i = 0; i < listOfOptions.size(); i++) {

			System.out.println(listOfOptions.get(i).getText());
		}
	}

}
