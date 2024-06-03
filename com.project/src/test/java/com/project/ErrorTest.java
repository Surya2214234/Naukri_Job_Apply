package com.project;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import testBase.TestBase;

public class ErrorTest extends TestBase {


	@Test
	public void payload_field() throws Exception {
		
		//Login credentials
		loginpage.Enter_emailid("Username");
		loginpage.Enter_Password("Passowrd");
		loginpage.Click_login_Button();
		
		//Landing Page
		landing_page.ClickonSearch();
		Thread.sleep(1000);
		landing_page.ClickOnValues("Software Testing", Keys.ENTER);
		Thread.sleep(1000);
		landing_page.getDropDown_option();
		Thread.sleep(1000);
		landing_page.Select_expe();
		Thread.sleep(1000);
		landing_page.Enter_Destination("Chennai");
		
		//Filters selection for own use
		filters.clickOn_workmode("Work from office");
		filters.ClickOn_Department("Engineering - Software & QA");
		filters.ClickOn_Salary("0-3 Lakhs");
		filters.ClickOn_Company_type("Corporate");
		Thread.sleep(2000);
		filters.ClickOn_Sort_by("Date");
		Thread.sleep(2000);
		filters.ClickOnRole_category("Quality Assurance and Testing");
		
		
	}
}
