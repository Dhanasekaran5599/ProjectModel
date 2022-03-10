package org.base;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableCode {
	public static WebDriver driver;
	
	public void type(WebElement element, String string) {
		element.sendKeys(string);
	}
	public void implicity() {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void clear(WebElement element) {
		element.clear();
	}

	// 1.Get driver launch
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// 2. Get current URl
	public String getCurrentURl() {
		String string = driver.getCurrentUrl();
		return string;
	}

	// 3.to load URL
	public void loadURL(String url) {
		driver.get(url);
	}

	// 4.To get text from website
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 5.to get Title
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 6.Insert value in TextBox
	public void insertValue(WebElement element, String data) {
		element.sendKeys(data);

	}

	// 7.to click button
	public void click(WebElement element) {
		element.click();

	}

	// 8.to click ok in alert
	public Alert simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;

	}

	// 9.to click cancel in alert
	public Alert confirmAlert() {
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		return confirmAlert;
	}

	// 10. to click prompt alert
	public Alert promptAlert(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
		alert.accept();
		return alert;
	}

	// 11.to get the text from alert
	public String getTextAlert() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;

	}

	// 12.to get page source
	public String getPageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	// 13.Find the locator using ID
	public WebElement findElementByID(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;

	}

	// 14.Find the locator using Name
	public WebElement finElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	// 15.Find the locator using class Name
	public WebElement finElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	// 16.find locator using xPath
	public WebElement finElementByXpath(String attributeValue) {
		WebElement element = driver.findElement(By.xpath(attributeValue));
		return element;

	}

	// 17.to get parent window
	public String getParentWindow() {
		String parentWindow = driver.getWindowHandle();
		return parentWindow;

	}

	// 18.to get all windows
	public Set<String> getAllWindows() {
		Set<String> allWindows = driver.getWindowHandles();
		return allWindows;

	}
	
	public Set<String> closeAllWindows() {
		Set<String> allWindows = driver.getWindowHandles();
		return allWindows;
	}
	// 19.To get child window
	public void getChildWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String childWindow : allWindow) {
			if (!parentWindow.equals(allWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
	}

	// 20.Navigate commands refresh
	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	// 21.clear the text box value
	public void clearTextBox(WebElement element) {
		element.clear();

	}

	// 22.to get color/size/font of particular webelement
	public String getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	// 23.to get TagName
	public String getTagName(WebElement element) {
		String tegName = element.getTagName();
		return tegName;
	}

	// 24.To find multiple element
	public List<WebElement> findElementByTagName(WebElement element, String tagValue) {
		List<WebElement> elements = element.findElements(By.tagName(tagValue));
		return elements;

	}

	// 25.to find the multiple element by xpath
	public WebElement findElementByXpath(WebElement element, String path) {
		WebElement element2 = element.findElement(By.xpath(path));
		return element2;

	}

	// 26.to check whether the webelement is displayed or not
	public boolean isWebElementDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	// 27.to check whether the text box is enabled to insert value
	public boolean isTextBoxEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}

	// 28.to check whether the radion button or dro[down selected or not
	public boolean isElected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	// 29.to select Dropdown by index
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	// 30.to select Dropdown by value
	public void selectOptionBy(WebElement element, String atrributeValue) {
		Select select = new Select(element);
		select.selectByValue(atrributeValue);

	}

	// 31. to select Dropdown by text
	public void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	// 32.to get ALL options from DropDown
	public List<WebElement> toGetAlloptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;

	}

	// 33.to get all selected options from DropDown
	public List<WebElement> toGetAllSelectedOptions(WebElement element) {
		;
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;

	}
	// 34.to get first selected options

	public WebElement getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;

	}

	// 35.to check whether it is a single value drop down or multivalue dropdown
	public boolean isDropDownMultiplt(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;

	}

	// 36. to deselect option by value
	public void deSelectOptionsByValue(WebElement element) {
		Select select = new Select(element);
		select.deselectByValue(getCurrentURl());

	}

	// 37.to Deselect Dropdown by Index
	public void deselectOPtionsByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);

	}

	// 38.to deselect dropdown by text
	public void deselectOptionsByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);

	}

	// 39.to deselect all dropdown list
	public void deSelectAllOptions(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();

	}

	// 40.Insert value using js
	public void setAttributeWithJs(WebElement element, String attributeValue) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','attributeValue')", element);

	}

	// 41.Return value using JS
	public Object getAttributeWithJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object script = js.executeScript("return arguments[0].getAttribute('value')", element);
		return element;

	}

	// 42.click using JS
	public void clickUsigJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0]", element);

	}

	// 43.Scrolldown using JS
	public void toScrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	// 44.Scroll up using Js
	public void toScrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// 45.Right click using Action class
	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	// 46.Double click using Action class
	public void dubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	// 47.to insert values in caps using Action class
	public void toInsertAllInCaps(WebElement element, String value) {
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys(element, value).keyUp(Keys.SHIFT);
	}

	// 48.to take screenshot of the webelement
	public File takeScreenShotofWebElement(WebElement element) {
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}
//maximize window 
	public void windowMaximize() {
driver.manage().window().maximize();
	}
	
}



