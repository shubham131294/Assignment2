package com.qa.assignment2.pages;

import org.openqa.selenium.By;

import com.qa.assignment2.base.TestBase;

public class TASearchReslutPage extends TestBase {

	// Elements
	private By firstResult = By.xpath("//span[@class = 'title-match'][contains(text(), 'Top result matching')]/ancestor::div[@class = 'search-results-list']//div[@class = 'result-title']/span");

	// Methods
	public TAPlaceDetailsPage clickOnFirstResult() {
		
		driver.findElement(firstResult).click();
		
		// Switch driver to new tab
		for(String winHandle: driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		
		return new TAPlaceDetailsPage();
		
	}
	
}
