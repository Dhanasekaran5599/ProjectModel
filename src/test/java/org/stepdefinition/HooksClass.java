package org.stepdefinition;

import org.base.ReusableCode;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends ReusableCode {
	
	
	@Before
	public void beforeExecution() {
		getDriver();
		windowMaximize();
		loadURL("http://adactinhotelapp.com/");
		implicity();
	}
	@After
	public void afterExecution() {
		closeAllWindows();
	}
}
