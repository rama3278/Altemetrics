package com.Altemetrics.Locator;

import org.openqa.selenium.By;

public interface FlipkartHomePageLocators {
	By closeButton=By.xpath("//button[contains(@class,'_2AkmmA')]");
	By electronicsTab=By.xpath("//span[contains(text(),'Electronics')]");
	By mobile=By.xpath("//a[@title='Realme']/preceding::li//a[@title=\"Mi\"]");
	By selectRam=By.xpath("//div[text()='6 GB & Above']");
	By selectedRam=By.xpath("//span[text()='Filters']/parent::div/parent::div/following-sibling::div//div[text()='6 GB & Above']");
}
