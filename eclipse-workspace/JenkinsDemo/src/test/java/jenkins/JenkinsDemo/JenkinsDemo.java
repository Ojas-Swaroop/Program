package jenkins.JenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsDemo {
	
	@Test
	public void LaunchApp()
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com");
	driver.manage().window().maximize(); 
	System.out.println("Spicejet opened successfully");
	
	}
}
