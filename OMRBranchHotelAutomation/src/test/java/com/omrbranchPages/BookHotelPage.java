package com.omrbranchPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class BookHotelPage extends BaseClass{
	public BookHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'Book Hotel')]")
	private WebElement txtBookHotel;


	@FindBy(xpath="//input[@value='own']")
	private WebElement btnRadio;
	
	@FindBy(id="user_title")
	private WebElement txtUserTitle;
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="user_phone")
	private WebElement txtPhone;
	
	@FindBy(id="user_email")
	private WebElement txtEmail;
	
	@FindBy(id="gst")
	private WebElement btnGST;
	
	@FindBy(id="gst_registration")
	private WebElement txtGSTNo;
	
	@FindBy(id="company_name")
	private WebElement txtCompanyName;
	
	@FindBy(id="company_address")
	private WebElement txtCompanyAdd;
	
	@FindBy(id="step1next")
	private WebElement btnNext;
	
	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement clickCard;
	
	@FindBy(id="high")
	private WebElement txtCheckBox;
	
	@FindBy(id="other_request")
	private WebElement txtSplReq;
	
	@FindBy(id="step2next")
	private WebElement btnNext1;
	
	@FindBy(xpath="//h5[text()='Credit/Debit/ATM Card']")
	private WebElement selectCard;
	
	@FindBy(id="payment_type")
	private WebElement paymentType;
	
	@FindBy(id="card_type")
	private WebElement cardType;
	
	@FindBy(id="card_no")
	private WebElement txtCardNo;
	
	@FindBy(id="card_name")
	private WebElement txtCardName;
	
	@FindBy(id="card_month")
	private WebElement txtCardMonth;
	
	@FindBy(id="card_year")
	private WebElement txtCardYear;
	
	@FindBy(id="cvv")
	private WebElement txtCVV;

	@FindBy(id="submitBtn")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@id='invalid-payment_type']")
	private WebElement selectPaymentTypeError;
	
	@FindBy(xpath = "//div[@id='invalid-card_type']")
	private WebElement selectCardTypeError;
	
	@FindBy(xpath = "//div[@id='invalid-card_no']")
	private WebElement cardNoError;
	
	@FindBy(xpath = "//div[@id='invalid-card_name']")
	private WebElement cardNameError;
	
	@FindBy(xpath = "//div[@id='invalid-card_month']")
	private WebElement cardMonthError;
	
	@FindBy(xpath = "//div[@id='invalid-cvv']")
	private WebElement cvvError;
	
	
	
	
	public WebElement getTxtBookHotel() {
		return txtBookHotel;
	}
	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getTxtUserTitle() {
		return txtUserTitle;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getBtnGST() {
		return btnGST;
	}

	public WebElement getTxtGSTNo() {
		return txtGSTNo;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAdd() {
		return txtCompanyAdd;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getTxtCheckBox() {
		return txtCheckBox;
	}
	
	public WebElement getTxtSplReq() {
		return txtSplReq;
	}

	public WebElement getBtnNext1() {
		return btnNext1;
	}
	
	public WebElement getClickCard() {
		return clickCard;
	}

	public WebElement getSelectCard() {
		return selectCard;
	}

	public WebElement getPaymentType() {
		return paymentType;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	public WebElement getTxtCardMonth() {
		return txtCardMonth;
	}

	public WebElement getTxtCardYear() {
		return txtCardYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	
	public WebElement getSelectPaymentTypeError() {
		return selectPaymentTypeError;
	}
	public WebElement getSelectCardTypeError() {
		return selectCardTypeError;
	}
	public WebElement getCardNoError() {
		return cardNoError;
	}
	public WebElement getCardNameError() {
		return cardNameError;
	}
	public WebElement getCardMonthError() {
		return cardMonthError;
	}
	public WebElement getCvvError() {
		return cvvError;
	}
	public String getBookHotelSuccessMsg() {
		String textBookHotel = getText(getTxtBookHotel());
		return textBookHotel;
	}
	public void clickCardType() {
		click(getClickCard());
	}
	public void addGuestDetails(String userTitle,String firstName,String lastName,String phone,String email) {
		click(getBtnRadio());
		sendText(getTxtUserTitle(), userTitle);
		sendText(getTxtFirstName(), firstName);
		sendText(getTxtLastName(), lastName);
		sendText(getTxtPhone(), phone);
		sendText(getTxtEmail(), email);
	}
	public void addGSTDetails(String gstNo,String companyName,String companyAdd) {
		click(getBtnGST());
		sendText(getTxtGSTNo(), gstNo);
		sendText(getTxtCompanyName(), companyName);
		sendText(getTxtCompanyAdd(), companyAdd);
		}
	public void nextBtn() {
		javaScriptClick(btnNext);
	}
	public void specialReq() {
		click(getTxtCheckBox());
		
	}
	public void textSpecialRequest(String specialRequests) {
		javaScriptInput(getTxtSplReq(), specialRequests);
	}
	public void next1Btn() {
		click(btnNext1);
	}
	public void addPayment(String cardType,String selectCard,String cardNo,String cardName,String month,String year,String cvv) {
		click(getSelectCard());
		sendText(getPaymentType(), cardType);
		sendText(getCardType(), selectCard);
		sendText(getTxtCardNo(), cardNo);
		sendText(getTxtCardName(), cardName);
		sendText(getTxtCardMonth(), month);
		sendText(getTxtCardYear(), year);
		sendText(getTxtCVV(), cvv);
		
		
	}
	public void bookSubmitBtn() {
		click(getBtnSubmit());
	}
	public String getCardOptionErrorMsg() {
		String textPaymentTypeError = getText(getSelectPaymentTypeError());
		return textPaymentTypeError;
	}
	public String getCardTypeErrorMsg() {
		String textCardTypeError = getText(getSelectCardTypeError());
		return textCardTypeError;
	}
	public String getCardNameErrorMsg() {
		String textCardNameError = getText(getCardNameError());
		return textCardNameError;
	}
	public String getCardNoErrorMsg() {
		String textCardNoError = getText(getCardNoError());
		return textCardNoError;
	}
	public String getCardMonthErrorMsg() {
		String textCardMonthError = getText(getCardMonthError());
		return textCardMonthError;
	}
	public String getCardCVV() {
		String textCvvError = getText(getCvvError());
		return textCvvError;
	}
	
}
