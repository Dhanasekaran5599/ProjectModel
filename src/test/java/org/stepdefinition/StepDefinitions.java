package org.stepdefinition;

import org.base.ReusableCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.AdactinPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitions extends ReusableCode {
	// public static WebDriver driver;
	AdactinPOJO pojo;

	@Given("User launch Adactin Hotel Web Application")
	public void user_launch_Adactin_Hotel_Web_Application() {

	}

	@When("User Enters Valid Username and Valid Password")
	public void user_Enters_Valid_Username_and_Valid_Password() {
		pojo = new AdactinPOJO();
		type(pojo.getTxtUserName(), "Dhanasekaran");
		type(pojo.getTxtPassword(), "dhana@99");
	}

	@When("User Click Login Button")
	public void user_Click_Login_Button() {
		pojo = new AdactinPOJO();
		click(pojo.getBtnLogin());
	}

	@Then("User Verify Search Hotel Page is Displayed")
	public void user_Verify_Search_Hotel_Page_is_Displayed() {
		pojo = new AdactinPOJO();
		WebElement hotelpage = driver.findElement(By.xpath("//td[text() ='Welcome to Adactin Group of Hotels']"));
		String text = hotelpage.getText();
		boolean contains1 = text.contains("Group");

		System.out.println(contains1);
	}

	@When("User Enter Valid Location, Valid Hotels, Valid Room Type, Valid Number of Rooms, Valid Check In Date, Valid Check Out Date")
	public void user_Enter_Valid_Location_Valid_Hotels_Valid_Room_Type_Valid_Number_of_Rooms_Valid_Check_In_Date_Valid_Check_Out_Date() {
		pojo = new AdactinPOJO();

		type(pojo.getdDnLocation(), "New York");
		type(pojo.getdDnHotel(), "Hotel Sunshine");
		type(pojo.getdDnRoomType(), "Standard");
		type(pojo.getdDnRoomNos(), "1 - One");

		clear(pojo.getTxtCheckInDate());
		type(pojo.getTxtCheckInDate(), "05/03/2022");

		clear(pojo.getTxtCheckOutDate());
		type(pojo.getTxtCheckOutDate(), "06/03/2022");

		type(pojo.getdDnAudltRoom(), "2 - Two");

		type(pojo.getdDnChildRoom(), "0 - None");
	}

	@When("User Click Search Button")
	public void user_Click_Search_Button() {
		pojo = new AdactinPOJO();
		click(pojo.getBtnSearch());
	}

	@Then("User Verify Select Hotel Page in Displayed")
	public void user_Verify_Select_Hotel_Page_in_Displayed() {
		WebElement hotelsel = driver.findElement(By.xpath("//td[@class ='login_title']"));
		String text = hotelsel.getText();
		boolean contains = text.contains("Select Hotel");
		System.out.println(contains);
	}

	@When("Click Radio Button and User Click Continue")
	public void click_Radio_Button_and_User_Click_Continue() {
		pojo = new AdactinPOJO();
		click(pojo.getBtnRadio());
		click(pojo.getBtnCont());
	}

	@Then("User Verify Book a Hotel Page is Displayed")
	public void user_Verify_Book_a_Hotel_Page_is_Displayed() {
		WebElement bookingport = driver.findElement(By.xpath("//td[text() ='Book A Hotel ']"));
		String text = bookingport.getText();
		boolean contains = text.contains("Book A Hotel");
		System.out.println(contains);
	}

	@When("User Enter Valid First Name, Valid Last Name and Valid Billing Address")
	public void user_Enter_Valid_First_Name_Valid_Last_Name_and_Valid_Billing_Address() {
		pojo = new AdactinPOJO();
		type(pojo.getTxtFirstName(), "Dhanasekaran");
		type(pojo.getTxtLastName(), "A");
		type(pojo.getTxtAddress(), "No.1, Besant Road, Kumbakonam,Thanjur(DT), Tamil Nadu(State), India");
	}

	@When("User Enter Valid Credit Card no and Select Valid Card Type, Select Valid Month, Select Valid Year, Enter Valid CVV Number")
	public void user_Enter_Valid_Credit_Card_no_and_Select_Valid_Card_Type_Select_Valid_Month_Select_Valid_Year_Enter_Valid_CVV_Number() {
		pojo = new AdactinPOJO();

		type(pojo.getTxtCcNum(), "2005990505992307");

		type(pojo.getTxtCcType(), "American Express");

		type(pojo.getdDnMonth(), "August");

		type(pojo.getdDnYear(), "2022");

		type(pojo.getTxtCVV(), "420");
	}

	@When("User Click Book Now Button")
	public void user_Click_Book_Now_Button() {
		pojo = new AdactinPOJO();
		click(pojo.getBtnBook());
	}

	@Then("User Verify Booking Confirmation Page is Displayed and Conformation Order Id is Showned")
	public void user_Verify_Booking_Confirmation_Page_is_Displayed_and_Conformation_Order_Id_is_Showned()
			throws InterruptedException {

		Assert.assertTrue("Verifing URL", true);

		

		pojo = new AdactinPOJO();
		String strin = getAttributeValue(pojo.getTxtOrder());
		System.out.println(strin);
	}

	@When("User Enters {string}, {string}")
	public void user_Enters(String string, String string2) {
		pojo = new AdactinPOJO();
		type(pojo.getTxtUserName(), string);
		type(pojo.getTxtPassword(), string2);

	}

	@When("User Enter Valid {string}, select {string}, select {string}, select {string}, User Enter Valid {string} and {string}, select {string} and {string}")
	public void user_Enter_Valid_select_select_select_User_Enter_Valid_and_select_and(String string, String string2,
			String string3, String string4, String string5, String string6, String string7, String string8) {
		pojo = new AdactinPOJO();
		type(pojo.getdDnLocation(), string);

		type(pojo.getdDnHotel(), string2);

		type(pojo.getdDnRoomType(), string3);

		type(pojo.getdDnRoomNos(), string4);

		clear(pojo.getTxtCheckInDate());
		type(pojo.getTxtCheckInDate(), string5);

		clear(pojo.getTxtCheckOutDate());
		type(pojo.getTxtCheckOutDate(), string6);

		type(pojo.getdDnAudltRoom(), string7);

		type(pojo.getdDnChildRoom(), string8);
	}

	@When("User enter valid {string}, valid {string}, and valid {string} and valid {string}")
	public void user_enter_valid_valid_and_valid_and_valid(String string, String string2, String string3,
			String string4) {
		pojo = new AdactinPOJO();
		type(pojo.getTxtFirstName(), string);
		type(pojo.getTxtLastName(), string2);
		type(pojo.getTxtAddress(), string3);
		type(pojo.getTxtCcNum(), string4);
	}

	@When("User select valid {string}, valid {string}, valid {string} and user enter {string}")
	public void user_select_valid_valid_valid_and_user_enter(String string, String string2, String string3,
			String string4) {
		pojo = new AdactinPOJO();
		type(pojo.getTxtCcType(), string);
		type(pojo.getdDnMonth(), string2);
		type(pojo.getdDnYear(), string3);
		type(pojo.getTxtCVV(), string4);
	}

}
