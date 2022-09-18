package testjava;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import mainjava.IMDBPage;

public class IMDBTest extends BaseTest {

	@Test(priority = 1)
	public void imdbDetail() {
		IMDBPage obj = new IMDBPage (super.driver);

		driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
		obj.scrollDownImdb();
		String imdbDate=obj.getImdbDate();
		String imdbcountry=obj.getImdbCountry();


		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Pushpa: The Rise");
		driver.findElement(By.xpath("//input[@id='searchButton']")).click();



		WebElement element=  driver.findElement(By.xpath("//*[text()='17 December 2021']"));
		JavascriptExecutor jr= (JavascriptExecutor)driver;
		jr.executeScript("arguments[0].scrollIntoView(true);", element);

		String wikiDate=obj.getWikicountry();
		String wikicountry=obj.getWikiDate();

		SoftAssert softassert = new SoftAssert();

		softassert.assertEquals(imdbcountry, wikicountry);
		softassert.assertEquals(imdbDate, wikiDate);
		softassert.assertAll();
	}










}



