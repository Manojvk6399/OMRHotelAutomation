package com.omrbranchPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class MyBookingPage extends BaseClass{
	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//button[@class='btn filter_btn'])[1]")
	private WebElement btnGoToHome;
	
	@FindBy(xpath="//button[@class='btn filter_btn'][2]")
	private WebElement btnMyBooking;

	@FindBy(xpath="(//a[@data-toggle='dropdown'])[1]")
	private WebElement  btnWelcome;
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement btnMyAccount;
	
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement btnEdit;
	
	@FindBy(xpath="//input[@name='check_in']")
	private WebElement txtDateChangeIn;
	
	@FindBy(xpath="//input[@name='check_out']")
	private WebElement txtDateChangeOut;
	
	@FindBy(xpath = "//div[@class='row px-3 py-2']//button")
	private WebElement btnconform;
	
	@FindBy(xpath="//li[text()='Booking updated successfully']")
	private WebElement txtUpdateSuccess;
	
	@FindBy(xpath = "//input[@class='form-control w-50 d-inline-block']")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//div[@class='room-code']")
	private WebElement txtOrderId;
	
	@FindBy(xpath = "(//div[@class='col-md-7 mobile-space-none'])//h5")
	private WebElement txtHotelName;
	
	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement txtHotelPrice;
	
	@FindBy(xpath = "//h4[contains(text(),'Bookings')]")
	private WebElement bookings;
	
	@FindBy(xpath="(//a[text()='Cancel'])[1]")
	private WebElement btnCancel;
	
	@FindBy(className="alertMsg")
	private WebElement bookingCancel;

	@FindBy(xpath="//h5[text()='//div[@class='col-md-5 hotel-suites']//h5']")
	private WebElement txtFirstHotelName;
	

	
	
	public WebElement getTxtFirstHotelName() {
		return txtFirstHotelName;
	}

	public WebElement getBookings() {
		return bookings;
	}

	public WebElement getBtnGoToHome() {
		return btnGoToHome;
	}

	public WebElement getBtnWelcome() {
		return btnWelcome;
	}

	public WebElement getBtnMyAccount() {
		return btnMyAccount;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getTxtDateChangeIn() {
		return txtDateChangeIn;
	}

	public WebElement getTxtDateChangeOut() {
		return txtDateChangeOut;
	}

	public WebElement getBtnconform() {
		return btnconform;
	}

	public WebElement getTxtUpdateSuccess() {
		return txtUpdateSuccess;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}
	
	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public WebElement getTxtHotelName() {
		return txtHotelName;
	}

	public WebElement getTxtHotelPrice() {
		return txtHotelPrice;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getBookingCancel() {
		return bookingCancel;
	}
	
	public WebElement getBtnMyBooking() {
		return btnMyBooking;
	}
	
	public void navigateToMyBookingPage() {	
		click(getBtnWelcome());
		click(getBtnMyAccount());
		
	}
	public void btnMyBooking() {
		javaScriptClick(getBtnMyBooking());
	}
	
	public String bookingSuccessMsg() {
		String textBookingSuccessMsg = getText(getBookings());
		return textBookingSuccessMsg;
	}
	public void searchOrderId(String OrderId) {
		sendText(getTxtSearch(), OrderId);
	}
	public String getOrderIdMsg() {
		String OrderId = getText(getTxtOrderId());
		return OrderId;
	}
	public String getHotelNameMsg() {
		String textHotelName = getText(getTxtHotelName());
		return textHotelName;
	}
	public String getHotelPriceMsg() {
		String textHotelPrice = getText(getTxtHotelPrice());
		return textHotelPrice;
	}
	public void modifyCheckInDate(String checkInDate) throws InterruptedException {
		javaScriptClick(getBtnEdit());
		javaScriptInput(getTxtDateChangeIn(), checkInDate);
		Thread.sleep(3000);
		
		
	}
	
	public void btnconformkey() {
		
		javaScriptClick(getBtnconform());
	}
	public String bookingUpdateSuccessMsg() {
		String textUpdateSuccess = getText(getTxtUpdateSuccess());
		return textUpdateSuccess;
	}
	public void clickFirstOrderIdEditButton() {
		click(getTxtFirstHotelName());
	}
	public void cancelOrderId() {
		javaScriptClick(getBtnCancel());
		implicitWait();
		acceptAlert();
		
	}
	public String cancelBookinSuccessMsg() {
		String textBookingCancelSuccessMsg = getText(getBookingCancel());
		return textBookingCancelSuccessMsg;
	}
	public void cancelFirstOrderId() {
		click(getTxtFirstHotelName());
		
		
	}
	
	
	
	
	
}
