package com.altemetrics.flipkartTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Altemetrics.Base.BasePage;
import com.Altemetrics.Base.Browsers;
import com.Altemetrics.pages.FlipkartHomePage;

public class FlipkartTest extends BasePage{
	
	private WebDriver driver=null;
	FlipkartHomePage fpHp=null;
	
	@BeforeClass
	public void setUp() {
		driver=init(Browsers.chrome);
	}
	
	@Test
	public void testScenario() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(title, expectedTitle);
		fpHp=new FlipkartHomePage(driver);
		fpHp.clickOnCloseButton();
		fpHp.selectMobileUnderElectronics();
		Thread.sleep(2000);
		fpHp.selectRam();
		Thread.sleep(2000);
		fpHp.verifyRam("6 GB & Above");
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
