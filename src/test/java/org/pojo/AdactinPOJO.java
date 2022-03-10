package org.pojo;

import org.base.ReusableCode;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPOJO extends ReusableCode {
	public AdactinPOJO() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	public WebElement txtUserName;
	@FindBy(id="password")
	public WebElement txtPassword;
	@FindBy(id="login")
	public WebElement btnLogin;
	
	@FindBy(xpath = "//td[text() ='Welcome to Adactin Group of Hotels']")
	public WebElement text;
	
	@FindBy(id="location")
	public WebElement dDnLocation;
	
	@FindBy(id="hotels")
	public WebElement dDnHotel;
	@FindBy(id="room_type")
	public WebElement dDnRoomType;
	@FindBy(id="room_nos")
	public WebElement dDnRoomNos;
	@FindBy(id="datepick_in")
	public WebElement txtCheckInDate;
	@FindBy(id="datepick_out")
	public WebElement txtCheckOutDate;
	@FindBy(id="adult_room")
	public WebElement dDnAudltRoom;
	@FindBy(id="child_room")
	public WebElement dDnChildRoom;
	@FindBy(id="Submit")
	public WebElement btnSearch;
	
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	public WebElement txtUser;
	
	@FindBy(id="radiobutton_0")
	public WebElement btnRadio;
	@FindBy(id="continue")
	public WebElement btnCont;	@FindBy(xpath="//td[contains(text(),'Book')]")
	
	public WebElement txthello;
	
	@FindBy(id="first_name")
	public WebElement txtFirstName;
	@FindBy(id="last_name")
	public WebElement txtLastName;
	@FindBy(id="address")
	public WebElement txtAddress;
	@FindBy(id="cc_num")
	public WebElement txtCcNum;
	@FindBy(id="cc_type")
	public WebElement txtCcType;
	@FindBy(id="cc_exp_month")
	public WebElement dDnMonth;
	@FindBy(id="cc_exp_year")
	public WebElement dDnYear;
	@FindBy(id="cc_cvv")
	public WebElement txtCVV;
	@FindBy(id="book_now")
	public WebElement btnBook;
	@FindBy(id="order_no")
	public WebElement txtOrder;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
//	private Object xpath(String string) {
		// TODO Auto-generated method stub
	//	return null;
	//}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getText() {
		return getText();
	}
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnHotel() {
		return dDnHotel;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getdDnAudltRoom() {
		return dDnAudltRoom;
	}
	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnCont() {
		return btnCont;
	}
	public WebElement getTxthello() {
		return txthello;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCcNum() {
		return txtCcNum;
	}
	public WebElement getTxtCcType() {
		return txtCcType;
	}
	public WebElement getdDnMonth() {
		return dDnMonth;
	}
	public WebElement getdDnYear() {
		return dDnYear;
	}
	public WebElement getTxtCVV() {
		return txtCVV;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
	public WebElement getTxtOrder() {
		return txtOrder;
	}

}
