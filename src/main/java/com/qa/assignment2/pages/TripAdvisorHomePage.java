package com.qa.assignment2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.qa.assignment2.base.TestBase;

public class TripAdvisorHomePage extends TestBase{

	// Elements
	private By topBarSearch = By.xpath("//div[@id = 'taplc_global_nav_component_0']//*[contains(@title, 'Search')]");
	
	private By middleSearchBar = By.xpath("//div[@id = 'taplc_cx_single_search_on_hero_0']//input[contains(@title, 'Search')]");

	private By mainSearchBar = By.id("mainSearch");
	
	private By newSmallSearch = By.xpath("//div[@class = 'i3bZ_gBa _2RTs3_Ee _2vChPWwI _1KTTRnER']/form/input[1]");
	
	// Methods
	public TASearchReslutPage searchPlace() {

		try {
			try {
				driver.findElement(topBarSearch).click();
				driver.findElement(mainSearchBar).sendKeys("Club Mahindra");
				driver.findElement(mainSearchBar).sendKeys(Keys.RETURN);
			}catch(Exception e) {
				System.out.println("One SearchBar is not working");
				driver.findElement(middleSearchBar).sendKeys("Club Mahindra");
				driver.findElement(middleSearchBar).sendKeys(Keys.RETURN);
			}
		} catch (Exception e) {
			driver.findElement(topBarSearch).click();
			driver.findElement(newSmallSearch).sendKeys("Club Mahindra");
			driver.findElement(newSmallSearch).sendKeys(Keys.RETURN);
		}
		
		return new TASearchReslutPage();

	}

}
