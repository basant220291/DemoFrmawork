package com.qa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static Utility.Reusable.*;

import java.util.ArrayList;

import Utility.PropertiesReader;
import static Utility.Reusable.*;
public class Pageforsecond {
	
	
	@FindBy(className="bubble_rating")
	public static WebElement bubble;
	
	@FindBy(className="ui_bubble_rating fl bubble_50")
	public static WebElement ratingbubble;
	
	@FindBy(xpath="//a[contains(text(), 'Write a review')]")
	public static WebElement writereview;
	
	public void testtwo() {
		writereview.click();
		waitforelement(writereview, 20);
		System.out.println("hi");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions act = new Actions(driver);
		movetoelement(bubble);
		ratingbubble.click();
		System.out.println("click");
	}
	

}
