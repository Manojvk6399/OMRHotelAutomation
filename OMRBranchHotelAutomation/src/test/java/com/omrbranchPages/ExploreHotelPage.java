package com.omrbranchPages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class ExploreHotelPage extends BaseClass{
	public ExploreHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[contains(text(),' Welcome Manoj')]")
	private WebElement txtWelcome;
	
	@FindBy(xpath="//h5[contains(text(),'Explore Hotels')]")
	private WebElement txtExploreHotel;
	
	@FindBy(id="state")
	private WebElement txtState;
	
	@FindBy(id="city")
	private WebElement selectCity;
	
	@FindBy(id= "room_type")
	private WebElement txtRoomType;
	
	@FindBy(name="check_in")
	private WebElement selectInDate;
	
	@FindBy(name="check_out")
	private WebElement selectOutDate;
	
	@FindBy(id="no_rooms")
	private WebElement txtNoOfRoom;
	
	@FindBy(name="no_adults")
	private WebElement txtNoOfAdults;
	
	@FindBy(id="no_child")
	private WebElement txtNoOfChild;
	
	@FindBy(id="hotelsearch_iframe")
	private WebElement switchFrame;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath="//h5[@class='font35 font-weight-bold mb-4']")
	private WebElement txtSelectHotel;
	
	@FindBy(id="invalid-state")
	private WebElement txtErrorState;
	
	@FindBy(id="invalid-city")
	private WebElement txtErrorCity;
	
	@FindBy(id="invalid-check_in")
	private WebElement txtErrorInDate;
	
	@FindBy(id="invalid-check_out")
	private WebElement txtErrorOutDate;
	
	@FindBy(id="invalid-no_rooms")
	private WebElement txtErrorRoom;
	
	@FindBy(id="invalid-no_adults")
	private WebElement txtErrorAdult;
	
	@FindBy(id="room_type")
	private WebElement roomTypeSuccessMsg;
	
	@FindBy(xpath="//input[@id='value_nasc']")
	private WebElement btnNameAsc;
	
	@FindBy(xpath="//div[@class='col-md-5 hotel-suites']//h5")
	private List<WebElement> txtHotelNames;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private List<WebElement> txtHotelprice;
	
	@FindBy(xpath="//input[@id='value_phtol']")
	private WebElement btnpriceAsc;
	
	public List<WebElement> getTxtHotelNames() {
		return txtHotelNames;
	}

	public List<WebElement> getTxtHotelprice() {
		return txtHotelprice;
	}

	public WebElement getBtnpriceAsc() {
		return btnpriceAsc;
	}


	public WebElement getTxtExploreHotel() {
		return txtExploreHotel;
	}
	
	public WebElement getTxtWelcome() {
		return txtWelcome;
	}


	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getSelectInDate() {
		return selectInDate;
	}

	public WebElement getSelectOutDate() {
		return selectOutDate;
	}

	public WebElement getTxtNoOfRoom() {
		return txtNoOfRoom;
	}

	public WebElement getTxtNoOfAdults() {
		return txtNoOfAdults;
	}
	public WebElement getTxtNoOfChild() {
		return txtNoOfChild;
	}

	public WebElement getSwitchFrame() {
		return switchFrame;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}
	public WebElement getTxtErrorState() {
		return txtErrorState;
	}


	public WebElement getTxtErrorCity() {
		return txtErrorCity;
	}


	public WebElement getTxtErrorInDate() {
		return txtErrorInDate;
	}


	public WebElement getTxtErrorOutDate() {
		return txtErrorOutDate;
	}


	public WebElement getTxtErrorRoom() {
		return txtErrorRoom;
	}


	public WebElement getTxtErrorAdult() {
		return txtErrorAdult;
	}
	
	public WebElement getRoomTypeSuccessMsg() {
		return roomTypeSuccessMsg;
	}
	
	public List<WebElement> getTxtHotelNamesAsc() {
		return txtHotelNames;
	}

	public List<WebElement> getTxtHotelpriceAsc() {
		return txtHotelprice;
	}


	
	public WebElement getBtnNameAsc() {
		return btnNameAsc;
	}


	public String getLoginSuccessMsg() {
		String textWelcome = getText(getTxtWelcome());
		return textWelcome;	
	}
	public void exploreHotels(String state,String city,String roomType,String checkInDate,String checkOutDate,String noOfRoom,String noOfAdults,String noOfChild) {
		selectOptionbyText(getTxtState(), state);
		selectOptionbyText(getSelectCity(), city);
		selectOptionbyText(getTxtRoomType(), roomType);
		javaScriptInput(getSelectInDate(), checkInDate);
		javaScriptInput(getSelectOutDate(), checkOutDate);
		selectOptionbyText(getTxtNoOfRoom(), noOfRoom);
		selectOptionbyText(getTxtNoOfAdults(), noOfAdults);
		sendText(getTxtNoOfChild(), noOfChild);
		frameByWebElement(getSwitchFrame());
		click(getBtnSearch());
		
		
	}
	public  void selectRoomType(WebElement txtRoomType ,String roomType) {
		String[] split = roomType.split("/");
		for (String text : split) {
			selectOptionbyText(txtRoomType,text );
		}
	}


	public void selectAllRoomType(String state,String city,String roomType,String checkInDate,String checkOutDate,String noOfRoom,String noOfAdults,String noOfChild) throws InterruptedException {
		selectOptionbyText(getTxtState(), state);
		selectOptionbyText(getSelectCity(), city);
		Thread.sleep(3000);
		selectRoomType(getTxtRoomType(), roomType);
		javaScriptInput(getSelectInDate(), checkInDate);
		javaScriptInput(getSelectOutDate(), checkOutDate);
		selectOptionbyText(getTxtNoOfRoom(), noOfRoom);
		selectOptionbyText(getTxtNoOfAdults(), noOfAdults);
		sendText(getTxtNoOfChild(), noOfChild);
		frameByWebElement(getSwitchFrame());
		click(getBtnSearch());
		
		
	}
	public void exploreHotelWithMandary(String state,String city,String checkInDate,String checkOutDate,String noOfRoom,String noOfAdults) {
		selectOptionbyText(getTxtState(), state);
		selectOptionbyText(getSelectCity(), city);
		javaScriptInput(getSelectInDate(), checkInDate);
		javaScriptInput(getSelectOutDate(), checkOutDate);
		selectOptionbyText(getTxtNoOfRoom(), noOfRoom);
		selectOptionbyText(getTxtNoOfAdults(), noOfAdults);
		frameByWebElement(getSwitchFrame());
		click(getBtnSearch());
		
	}
	public void ClickSearchHotel() {
		frameByWebElement(getSwitchFrame());
		click(getBtnSearch());
		
	}
	
	public String getAllRoomTypeSuccessMsg() {
		String RoomTypeSuccessMsg = getText(getRoomTypeSuccessMsg());
		return RoomTypeSuccessMsg;
	}
	public String StateErrorMsg() {
		String textStateError = getText(txtErrorState);
		return textStateError;
		
	}
	public String getCityErrorMsg() {
		String textCityError = getText(getTxtErrorCity());
		return textCityError;
		
	}	
	public String getCheckInErrorMsg() {
		String textInDateError = getText(getTxtErrorInDate());
		return textInDateError;
	}
	public String getCheckOutErrorMsg() {
		String textCheckOutError = getText(getTxtErrorOutDate());
		return textCheckOutError;
	}
	public String getNoOfRoomErrorMsg() {
		String textRoomError = getText(getTxtErrorRoom());
		return textRoomError;
	}
	public String getNoOfAdultErrorMsg() {
		String textAdultError = getText(getTxtErrorAdult());
		return textAdultError;
	}
	public void btnClickNameAsc() throws InterruptedException {
		javaScriptClick(getBtnNameAsc());
		Thread.sleep(3000);
	}

	public void btnClickPriceAsc() throws InterruptedException {
		javaScriptClick(getBtnpriceAsc());
		Thread.sleep(3000);
	}
	 
	public boolean sortByHotelNameAsc() {
		
		List listExpAsc= new ArrayList();
		List listActAsc= new ArrayList();
		
		for (int i = 0; i < getTxtHotelNamesAsc().size(); i++) {
			WebElement webElement = getTxtHotelNamesAsc().get(i);
			String hotelName = webElement.getText(); 
			listActAsc.add(hotelName);
		}
	
		listExpAsc.addAll(listActAsc);
		Collections.sort(listExpAsc);
		boolean equalsAsc = listActAsc.equals(listExpAsc);
		return equalsAsc;
		
	}
	public boolean sortByHotelNameDsc() {
		
		List listExpDcs= new ArrayList();
		List listActDcs= new ArrayList();
		
		for (int i = 0; i <getTxtHotelNamesAsc().size(); i++) {
			WebElement webElement = getTxtHotelNamesAsc().get(i);
			String hotelName = webElement.getText(); 
			listActDcs.add(hotelName);
		}
		listExpDcs.addAll(listActDcs);
		Collections.sort(listExpDcs);
		Collections.reverse(listExpDcs);
		boolean equalsDsc = listExpDcs.equals(listActDcs);
		return equalsDsc;
	}
	public boolean sortByHotelPriceAsc() {
		List listpriceExpAsc= new ArrayList();
		List listpriceActAsc= new ArrayList();
		
		for (int i = 0; i < getTxtHotelpriceAsc().size(); i++) {
			WebElement webElement = getTxtHotelpriceAsc().get(i);
			String hotelPrice = webElement.getText(); 
			listpriceActAsc.add(hotelPrice);
		}
		listpriceExpAsc.addAll(listpriceActAsc);
		Collections.sort(listpriceExpAsc);
		Collections.reverse(listpriceExpAsc);
		System.out.println(listpriceActAsc);
		System.out.println(listpriceExpAsc);
		boolean equalsAsc = listpriceExpAsc.equals(listpriceActAsc);
		System.out.println(equalsAsc);
		return equalsAsc;
		
			}
	
	
	
	
	

}
