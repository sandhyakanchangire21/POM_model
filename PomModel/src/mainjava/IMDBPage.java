package mainjava;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import testjava.BaseTest;

public class IMDBPage extends BaseTest {
	public static WebDriver driver;
	//All locators
	@FindBy(xpath="//a[text()='Release date']/following::a[1]")
	WebElement imdbDate;


	@FindBy(xpath="//span[text()='Country of origin']/following::a[1]")
	WebElement imdbcountry;

	@FindBy(xpath ="//*[text()='17 December 2021']")
	WebElement wikiDate;

	@FindBy(xpath="//td[text()='India']")
	WebElement wikicountry;



	//initialization 
	public IMDBPage(WebDriver driver) {
		IMDBPage.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//action Method
	public String getImdbDate() {
		return imdbDate.getText();
	}

	public String getImdbCountry() {
		return imdbcountry.getText();
	}
	public String getWikicountry() {
		return  wikiDate.getText();

	}
	public String getWikiDate() {
		return  wikicountry.getText();

	}

	public void scrollDownImdb() {
		WebElement ele=  driver.findElement(By.xpath("//div[@data-testid='title-details-header']//div[@class='ipc-title__wrapper']"));

		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	

	public void VerifyDetail() {
		String imdbDate1=imdbDate.getText();

		String imdbcountry1= imdbcountry.getText();


	}
}
