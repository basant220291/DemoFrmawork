package com.qa.tescase;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.test.pages.Pagesone;

import Utility.PropertiesReader;
import Utility.Reusable.*;
import static Utility.Reusable.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class testcaseone extends PropertiesReader{
	
	Pagesone pone;
	WebDriver driver;
	
	public testcaseone(){
		super();
		
}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		pone = new Pagesone();
		driver.navigate().to(prop.getProperty("url"));
		
	}
	
	@Test(priority=1)
	public void firstetst(){
		driver.get(prop.getProperty("url"));
		maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Pagesone p= new Pagesone();
		p.testaction();
		String flipkartvalue=p.replace.getText().replace(",", "" );
		
	}
	@Test(dependsOnMethods="firstetst")
	public void testtwo() throws IOException {
		qauitebrowser("chrome");
	}
	
	@Test(priority=2)
	public void testmethodtwo() throws InterruptedException{
		driver.navigate().to(prop.getProperty("url1"));
		maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Pagesone p1= new Pagesone();
		p1.testactiontwo();
		String flipkartvalue=p1.replace.getText().replace(",", "" );
		String amaznvalue=p1.priceamazon.getText().replace(",", "" );
		
		Double amazon =Double.parseDouble(amaznvalue);
		Double flipkart =Double.parseDouble(flipkartvalue);
		
		if(amazon < flipkart){
			System.out.println("Minimum price on Amazon : " + amazon);
		}else{
			System.out.println("Minimum price on Flipkart : " + flipkart);
		}

	}
	
	@AfterClass
	public void closeconnection() throws IOException{
		qauitebrowser("chrome");
	}
}
