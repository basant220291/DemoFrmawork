package com.qa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PropertiesReader;
import static Utility.Reusable.*;
public class Pagesone extends PropertiesReader{
	
	public Pagesone() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;

	@FindBy(id="twotabsearchtextbox")
	public static WebElement searchbutton;
	
	@FindBy(className="nav-input")
	public static WebElement inputdata;
	
	@FindBy(className="a-price-whole")
	public static WebElement price;
	
	@FindBy(className="a-price-whole")
	public static WebElement priceamazon;
	
	@FindBy(xpath="//button[contains(text(), '✕')]")
	public static WebElement closebutton;
	
	@FindBy(className="LM6RPg")
	public static WebElement image;
	
	@FindBy(className="vh79eN")
	public static WebElement image2;
	
	@FindBy(xpath="(\"//div[@class='_1vC4OE _2rQ-NK']")
	public static WebElement replace;
	
	public void testaction() {
		setvalue(searchbutton, "iPhone XR (64GB) - Yellow");
		inputdata.click();
	}

	public void testactiontwo() {
		closebutton.click();
		setvalue(image, "iPhone XR (64GB) - Yellow");
		image2.click();
		
	}
}
