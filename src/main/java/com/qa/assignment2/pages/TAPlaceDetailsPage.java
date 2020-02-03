package com.qa.assignment2.pages;

import org.openqa.selenium.By;

import com.qa.assignment2.base.TestBase;

public class TAPlaceDetailsPage extends TestBase {

	// Elements
	private By writeAReview = By.xpath("//h2[contains(text(), 'Review')]/following-sibling::div[@class = 'hotels-community-content-common-ContextualCTA__wrapper--1QPc2']//a");

	// Methods
	public TAPlaceReviewPage clickOnWriteAReview() {

		while(true) {
			try {
				driver.findElement(writeAReview).click();
				break;
			}catch(Exception e) {
				System.out.println("Try");
				driver.navigate().refresh();
			}
		}

		// Switch driver to new tab
		for(String winHandle: driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		return new TAPlaceReviewPage();

	}

}
