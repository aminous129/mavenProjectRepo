package maven_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//Please press Ctrl+S save your program
		driver.get("http://tutorialsninja.com/demo");

	}

}
