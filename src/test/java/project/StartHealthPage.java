package project;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import org.testng.Assert;

public class StartHealthPage {

	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
	}
	
	@Test(priority='1')
	public void Validate_title()
	{
		System.out.println("The title of the page");
		String ExpectedTitle = "Star";
		String ActualTitle = "Star"; // replace it with selenum code
       assertEquals(ActualTitle, ExpectedTitle , "The title is not valid");
	}
	
	@Parameters({"name","mobile","email" })
	@Test(priority='2')
	public void Test_Header_plan(String name, String mobile, String email)
	{
		System.out.println("Selenium code to hover over health Plan menu");
		System.out.println("Selenium code to click on familty option");
		System.out.println("Selenium code to check if checkbox is selected or not");
		// boolean selection = driver.findElement(By.("locatorvalue)).isSelected();
		Assert.assertTrue(true); // check if the Authorize checkbox is slected or not
		System.out.println("Selenium code for sendkeys via parameters" + name);
		System.out.println("Selenium code for sendkeys via parameters" + mobile);
		System.out.println("Selenium code for sendkeys via parameters" + email);
		
	}
	
	@Test(priority='3',dataProvider = "testdata" )
	public void validatedatafromExcel(String input1, String input2, String input3, String input4 )
	{
		// String youtube = driver.findElement(By.locator)).getAttribute(href);
	String	ActaulDetails1 = driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[2]")).getAttribute("href");
		System.out.println("write code to fetch the social media details for twitter");
		String Expecteddetail1 = input1;
		
		Assert.assertEquals(ActaulDetails1,Expecteddetail1);
		//if(ActaulDetails1.contains(Expecteddetail1))
		System.out.println("write code to fetch the social media details for twitter");
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] datasupplier() throws EncryptedDocumentException, IOException
	{
		
		Object[][] inputdata = XLS_DataProvider.getTestData("Sheet2");
		
		return inputdata;
	}
	
	
	
	@Test(priority='4')
	public void Clickontwitter()
	{
		System.out.println("Inspect twitter link and click on it");
		
		System.out.println("Validate title of the page");
	}
	
	
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
