package com.omrbranchPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class BookingConfirmedPage extends BaseClass{
	
	public BookingConfirmedPage() {
		PageFactory.initElements(driver, this); 
	}
	public static String orderId;
	public static String HotelName;
	
	
	@FindBy(xpath = "//h2[text()=' Booking is Confirmed ']")
	private WebElement bookingConfirmation;
	
	@FindBy(xpath = "//h2[text()=' Booking is Confirmed ']//strong")
	private static WebElement bookingId;
	
	@FindBy(xpath = "//div[@class='seccess-box text-center']//p//strong")
	private WebElement bookedHotelName;

	public WebElement getBookingConfirmation() {
		return bookingConfirmation;
	}

	public static WebElement getBookingId() {
		return bookingId;
	}

	public WebElement getBookedHotelName() {
		return bookedHotelName;
	}
	
	public String getOrderId() {
		String textBookingSuccessMsg = getText(getBookingConfirmation());
		String orderId = textBookingSuccessMsg.substring(1, 11);
		return orderId;
	}
	public String BookHotelName() {
		String BookHotelName = getText(getBookedHotelName());
		return BookHotelName;
	}
	public String BookingSuccessMsg() {
		String textBookingSuccessMsg = getText(getBookingConfirmation());
		String BookHotel = textBookingSuccessMsg.substring(12);
		System.out.println(BookHotel);
		return BookHotel;
	}
	
}
