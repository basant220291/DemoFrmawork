package com.qa.tescase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static Utility.Reusable.*;

import java.io.IOException;

import com.qa.test.pages.Pageforsecond;
import com.qa.test.pages.Pagesone;

import Utility.PropertiesReader;

public class testtwocase extends PropertiesReader{

	Pagesone pone;
	WebDriver driver;
	
	public testtwocase(){
		super();
		
}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		pone = new Pagesone();
		driver.navigate().to(prop.getProperty("url2"));
		
	}
	
	@Test(priority=1)
	public void testcasetwo() throws InterruptedException {
		Pageforsecond p2=new Pageforsecond();
		p2.testtwo();
	}
	
	@AfterClass
	public void closeconnection() throws IOException{
		qauitebrowser("chrome");
	}
	
}
