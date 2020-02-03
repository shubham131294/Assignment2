package com.qa.assignment2.tests;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.assignment2.base.TestBase;
import com.qa.assignment2.pages.TAPlaceDetailsPage;
import com.qa.assignment2.pages.TAPlaceReviewPage;
import com.qa.assignment2.pages.TASearchReslutPage;
import com.qa.assignment2.pages.TripAdvisorHomePage;

public class AddReview extends TestBase{

	TripAdvisorHomePage tripAdvisorHomePage;
	TASearchReslutPage taSearchReslutPage;
	TAPlaceDetailsPage taPlaceDetailsPage;
	TAPlaceReviewPage taPlaceReviewPage;
	
	public AddReview() {
		super();
	}
	
	@BeforeMethod 
	public void setUpAmazon() throws AWTException {
		initialization();
		tripAdvisorHomePage = new TripAdvisorHomePage();
	}
	
	@Test
	public void searchAndReview() throws InterruptedException {
		taSearchReslutPage = tripAdvisorHomePage.searchPlace();
		
		taPlaceDetailsPage = taSearchReslutPage.clickOnFirstResult();
		
		taPlaceReviewPage = taPlaceDetailsPage.clickOnWriteAReview();
		
		taPlaceReviewPage.hoverAndClickOnOverAllRating();
		taPlaceReviewPage.addReviewTitleAndReview();
		taPlaceReviewPage.hoverAndClickOnServiceRating();
		//taPlaceReviewPage.submitReview();
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {

		// quit is for quitting all tabs and windows
		driver.quit();

	}
	
}