package firstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//searchbox & submit
		//By.id
		WebElement element = driver.findElement(By.id("search_query_top"));
		
		element.sendKeys("T-Shirts");
		//By.name
		driver.findElement(By.name("submit_search")).click();
		//By.Link text & Partial Link Text
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		//Partial Link Text
		driver.findElement(By.partialLinkText("Summer")).click();
		
		
	}

}
