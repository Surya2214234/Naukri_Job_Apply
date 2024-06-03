package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Filters extends TestBase{

	//Finding Elements 
	@FindBy(xpath="//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]")
	WebElement workmode_CheckBoxes;

	@FindBy(xpath="//*[@data-filter-id=\"wfhType\"]/div[1]")
	WebElement work_mode;

	@FindBy(xpath="//*[@data-filter-id=\"functionalAreaGid\"]/div[1]")
	WebElement Department;

	@FindBy(xpath="//*[@data-filter-id=\"salaryRange\"]/div[1]")
	WebElement Salary;

	@FindBy(xpath = "//*[@data-filter-id=\"business_size\"]/div[1]")
	WebElement Company_type;

	@FindBy(xpath="//*[@data-filter-id=\"glbl_RoleCat\"]/div[1]")
	WebElement Role_category;

	@FindBy(xpath="//*[@id=\"jobs-list-header\"]/div[2]/span/div/ul/li[1]")
	WebElement Sort_by;

	public Filters() {
		PageFactory.initElements(driver, this);
	}

	public void clickOn_workmode(String Values1) throws InterruptedException {
		List<WebElement> get_data=Arrays.asList(work_mode);
		for(WebElement loop:get_data) {
			Thread.sleep(2000);
			if(loop.getText().contains(Values1)) {
				loop.click();
				//System.out.println(loop);
				break;
			}
		}
	}

	public void clickOn_wrkmode_Chkbox() {
		workmode_CheckBoxes.click();
	}

	public void ClickOn_Department(String Values2) throws InterruptedException {
		List<WebElement> get_data=Arrays.asList(Department);
		for(WebElement loop:get_data) {
			Thread.sleep(2000);
			if(loop.getText().contains(Values2)) {
				loop.click();
				//System.out.println(loop);
				break;
			}
		}
	}

	public void ClickOn_Company_type(String Values3) throws InterruptedException {
		List<WebElement> get_Company_type=Arrays.asList(Company_type);
		for(WebElement loop:get_Company_type) {
			Thread.sleep(2000);
			if(loop.getText().contains(Values3)) {
				loop.click();
				System.out.println(loop);
				break;
			}
		}
	}

	public void ClickOn_Salary(String Values4) throws InterruptedException {
		List<WebElement> get_data=Arrays.asList(Salary); //Salary
		for(WebElement loop:get_data) {
			Thread.sleep(2000);
			if(loop.getText().contains(Values4)) {
				loop.click();
				//System.out.println(loop);
				break;
			}
		}
	}

//	public void ClickOn_Role_category(String Values5) throws Exception {
//		List<WebElement> get_Role_category=Arrays.asList(Role_category);
//		try {
//		for(WebElement loop:get_Role_category) {
//			Thread.sleep(2000);
//			if(loop.getText().equalsIgnoreCase(Values5)) {
//				loop.click();	
//				break;
//			}
//		}
//		}
//		catch(Exception E) {
//			throw new Exception ("values is not inside");
//		}
//	}
	
	public void ClickOnRole_category(String values) {
		List<WebElement> element=Arrays.asList(Role_category);
		for(WebElement ele:element) {
			if(ele.getText().equalsIgnoreCase(values)) {
				ele.click();
				break;
			}
		}
	}

	public void ClickOn_Sort_by(String Values6) throws InterruptedException {
		List<WebElement> get_Sort_by=Arrays.asList(Sort_by);
		for(WebElement loop:get_Sort_by) {
			Thread.sleep(2000);
			if(loop.getText().contains(Values6)) {
				loop.click();
				//System.out.println(loop);
				break;
			}
		}
	}
}
