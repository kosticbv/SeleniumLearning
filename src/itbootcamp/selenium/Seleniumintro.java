package itbootcamp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kosti\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // driveri se nazivaju drajverima!!! (driver)
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		driver.findElement(By.id("suggestion-search")).sendKeys("tom hardy");
		driver.findElement(By.id("suggestion-search")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("suggestion-search-button")).click();
		
		

	}

}
