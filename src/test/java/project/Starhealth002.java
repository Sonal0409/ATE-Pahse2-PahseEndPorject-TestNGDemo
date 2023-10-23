package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Starhealth002 {

	
	
	@Test
	public void print_link()
	{
		WebDriver driver = new ChromeDriver();
		
	String link1=	driver.findElement(By.linkText("Glossary")).getText();
	
	}
}
