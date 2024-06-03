package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Landing_Page extends TestBase{

	@FindBy(xpath="/html/body/div[3]/div[2]/nav/ul/li[1]/a/div")
	WebElement Jobs;

	@FindBy(xpath="/html/body/div[3]/div[2]/nav/ul/li[2]/a/div")
	WebElement Companies;

	@FindBy(xpath="/html/body/div[3]/div[2]/nav/ul/li[3]/a/div")
	WebElement Services;

	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div/button/span")
	WebElement Search;

	@FindBy(className ="suggestor-input")
	WebElement EnterValues;

	@FindBy(xpath="//span[@class='ni-gnb-icn ni-gnb-icn-bell']")
	WebElement Notification;

	@FindBy(xpath="/html/body/div[3]/div[2]/div[3]/div/div[2]/img")
	WebElement ViewProfile;

	@FindBy(linkText = "View")
	WebElement ViewProfile2;

	@FindBy(xpath="//input[@id='experienceDD']")
	WebElement Click_Experiance;

	@FindBy(xpath = "//*[@id=\"sa-dd-scrollexperienceDD\"]/div[1]/ul")
	WebElement drop_down;

	@FindBy(xpath="//*[@id=\"sa-dd-scrollexperienceDD\"]/div[1]/ul/li[2]")
	WebElement Select_ex;

	@FindBy(xpath="//input[@placeholder='Enter location']")
	WebElement Enter_Location;

	public Landing_Page() {
		PageFactory.initElements(driver, this);
	}
	public void ClickonJobs() {
		Jobs.click();
	}

	public void ClickonCompanies() {
		Companies.click();
	}

	public void ClickonServices() {
		Services.click();
	}

	public void ClickonSearch() {
		Search.click();
	}

	public void ClickOnValues(String Values, Keys enter ) {
		EnterValues.sendKeys(Values);
	}

	public void getDropDown_option() {
		Click_Experiance.click();
	}
	public void Select_expe() {
		Select_ex.click();
	}
	public void select_dropdown(String title) throws InterruptedException {
		List<WebElement> os = Arrays.asList(drop_down);
		for(WebElement element:os){
			Thread.sleep(5000);
			if(element.getText().contains(title)) {
				element.click();
				break;
			}
		}
	}
	public void Enter_Destination(String Location){
		Enter_Location.sendKeys(Location, Keys.ENTER);
	}
}
