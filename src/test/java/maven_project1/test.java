package maven_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
	public static ChromeOptions options;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void main(String[] args) {
		options = new ChromeOptions();
	      options.addArguments("--start-maximized");
	      options.addArguments("--remote-allow-origins=*");
	      driver = new ChromeDriver(options);
	      driver.get("https://www.makemytrip.com/?ccde=us");

		//Please press Ctrl+S save your program
	

	}

}
