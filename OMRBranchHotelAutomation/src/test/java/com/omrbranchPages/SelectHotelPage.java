package com.omrbranchPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static String FirstHotelName;
	public static String FirstHotelPrice;
	
	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']//h5")
	private WebElement txtFirstHotelName;
	
	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement txtFirstHotelPrice;
	
	@FindBy(xpath="(//a[text()='Continue'])[1]")
	private WebElement btnContinue;
	
	@FindBy(xpath="//h2[contains(text(),'Book Hotel')]")
	private WebElement txtBookHotel;
	
	@FindBy(xpath="//h5[@class='font35 font-weight-bold mb-4']")
	private WebElement txtSuccessMsg;
	

	public WebElement getTxtSuccessMsg() {
		return txtSuccessMsg;
	}

	public WebElement getTxtFirstHotelName() {
		return txtFirstHotelName;
	}

	public WebElement getTxtFirstHotelPrice() {
		return txtFirstHotelPrice;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtBookHotel() {
		return txtBookHotel;
	}
	public String selectHotelSuccessMsg() {
		String textSuccessMsg = getText(getTxtSuccessMsg());
		return textSuccessMsg;
	}
	public void getRoomTypeHeading() {

	}
	public void getFirstHotelName() {
		 FirstHotelName = getText(getTxtFirstHotelName());
		 System.out.println(FirstHotelName);
		
		
		
	}
	public void getFirstHotelPrice() {
		 FirstHotelPrice = getText(getTxtFirstHotelPrice());
		
	}
	public void clickContinue() {
		click(getBtnContinue());
	}
	public void acceptHotelSelect() {
		acceptAlert();
	}
	public void dismissHotelSelect() {
		dismissAlert();
	}
	
	
	
	

}
