package com.Altemetrics.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Altemetrics.Locator.FlipkartHomePageLocators;

public class FlipkartHomePage implements FlipkartHomePageLocators{

	private WebDriver driver;
	
	public FlipkartHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnCloseButton() {
		driver.findElement(closeButton).click();
	}
	
	public void selectMobileUnderElectronics() throws InterruptedException {
		WebElement electronic = driver.findElement(electronicsTab);
		Actions action=new Actions(driver);
		action.moveToElement(electronic).build().perform();
		Thread.sleep(2000);
		driver.findElement(mobile).click();
	}
	
	public void selectRam() throws InterruptedException {
		
		driver.findElement(selectRam).click();
	}
	
	public void verifyRam(String ram) {
		
		if( ram.equalsIgnoreCase(driver.findElement(selectedRam).getText())) {
			System.out.println("Test Success");
		}else {
			new Exception("Test failed as the element is not matching");
		}
	}
}
