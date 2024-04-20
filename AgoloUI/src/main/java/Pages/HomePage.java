package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		System.out.println("****************");
		wait = new WebDriverWait(driver, 10);
		System.out.println("++++++++++++++++++");


	}

	public ArrayList<String> getPlannames() {

		List<WebElement> PlannamesElements =driver.findElements(By.xpath("//*[@class=\"plan-names\"]//strong"));
		ArrayList<String> Plannames= new ArrayList<String>();
		for (int i=0 ; i<PlannamesElements.size(); i++) {

			Plannames.add(PlannamesElements.get(i).getText());

		}
		
		return Plannames;
	}	
	public String getLitePrice() {

		String litePrice= driver.findElement(By.id("currency-لايت")).getText();
	    
		return litePrice;



	}

	public String getCLASSICPrice() {

		String CLASSICPrice= driver.findElement(By.id("currency-الأساسية")).getText();
		
		return CLASSICPrice;



	}

	public String getPREMIUMPrice() {

		String PREMIUMPrice= driver.findElement(By.id("currency-بريميوم")).getText();
		
		return PREMIUMPrice;





	}

	public void getCurrentCountry() {

		String currentCountry = driver.findElement(By.id("country")).getText();
		System.out.println(currentCountry);


	}

	public void clickCountryBtn() {

		wait.until(ExpectedConditions.elementToBeClickable(By.id("country-btn"))).click();


	}


	public void switchToCountry(String countryId) {
		clickCountryBtn();

		if (countryId.equals("Emirates")) {


			driver.findElement(By.id("ae")).click();

		}

		else if (countryId.equals("Algeria")) {

			driver.findElement(By.id("dz")).click();



		}


	}




}
