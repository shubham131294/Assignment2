package com.qa.assignment2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.assignment2.base.TestBase;

public class TAPlaceReviewPage extends TestBase{
	
	WebElement bubble;

	// Elements
	private By overAllRating = By.id("bubble_rating");

	private By reviewTitle = By.id("ReviewTitle");

	private By review = By.id("ReviewText");

	private By serviceRating = By.id("qid12_bubbles");

	private By submit = By.id("SUBMIT");

	// Methods
	public void hoverAndClickOnOverAllRating() {

		bubble = driver.findElement(overAllRating);

		action.moveToElement(bubble, -48, 0).perform();
		Assert.assertEquals(bubble.getAttribute("className"), "ui_bubble_rating fl bubble_10");
		action.moveToElement(bubble, -16, 0).perform();
		Assert.assertEquals(bubble.getAttribute("className"), "ui_bubble_rating fl bubble_20");
		action.moveToElement(bubble, 0, 0).perform();
		Assert.assertEquals(bubble.getAttribute("className"), "ui_bubble_rating fl bubble_30");
		action.moveToElement(bubble, 20, 0).perform();
		Assert.assertEquals(bubble.getAttribute("className"), "ui_bubble_rating fl bubble_40");
		action.moveToElement(bubble, 52, 0).click().perform();
		Assert.assertEquals(bubble.getAttribute("className"), "ui_bubble_rating fl bubble_50");

	}

	public void addReviewTitleAndReview() {

		driver.findElement(reviewTitle).sendKeys("Awesome Place");
		driver.findElement(review).sendKeys("Ocean front, gorgeous pool areas, beautiful bar and restaurant, excellent service with historic, very well appointed rooms. The only thing I can think here is that people are trying to keep this resort a secret. Do not miss out if you are headed to St. Simons Island, we stayed in an ocean front room (more of a junior suite), that was very large, beautifully appointed, very comfortable bed. Two large screen TVs. More than everything you could want in a hotel on the National Historic register.");
		
	}
	
	public void hoverAndClickOnServiceRating() {

		bubble = driver.findElement(serviceRating);

		action.moveToElement(bubble, -36, 0).perform();
		Assert.assertEquals(bubble.getAttribute("className"), "answersBubbles ui_bubble_rating fl qid12 bubble_10");
		action.moveToElement(bubble, -12, 0).perform();
		Assert.assertEquals(bubble.getAttribute("className"), "answersBubbles ui_bubble_rating fl qid12 bubble_20");
		action.moveToElement(bubble, 0, 0).perform();
		Assert.assertEquals(bubble.getAttribute("className"), "answersBubbles ui_bubble_rating fl qid12 bubble_30");
		action.moveToElement(bubble, 16, 0).perform();
		Assert.assertEquals(bubble.getAttribute("className"), "answersBubbles ui_bubble_rating fl qid12 bubble_40");
		action.moveToElement(bubble, 40, 0).click().perform();
		Assert.assertEquals(bubble.getAttribute("className"), "answersBubbles ui_bubble_rating fl qid12 bubble_50");

	}
	
	public void submitReview() {
		
		driver.findElement(submit).click();
		
	}

}
