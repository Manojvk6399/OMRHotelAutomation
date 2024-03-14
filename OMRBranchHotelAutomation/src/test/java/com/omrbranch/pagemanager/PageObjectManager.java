package com.omrbranch.pagemanager;

import com.omrbranchPages.BookHotelPage;
import com.omrbranchPages.BookingConfirmedPage;
import com.omrbranchPages.ExploreHotelPage;
import com.omrbranchPages.LoginPage;
import com.omrbranchPages.MyBookingPage;
import com.omrbranchPages.SelectHotelPage;

public class PageObjectManager {
	LoginPage loginpage;
	ExploreHotelPage exploreHotelPage;
	SelectHotelPage selectHotelPage;
	BookHotelPage bookHotelPage;
	BookingConfirmedPage bookingConfirmedPage;
	MyBookingPage myBookingPage;
	public LoginPage getLoginpage() {
		return (loginpage==null)?loginpage = new LoginPage():loginpage;
	}
	public ExploreHotelPage getExploreHotelPage() {
		return (exploreHotelPage==null)?exploreHotelPage = new ExploreHotelPage():exploreHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage = new SelectHotelPage():selectHotelPage ;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage = new BookHotelPage():bookHotelPage;
	}
	public BookingConfirmedPage getBookingConfirmedPage() {
		return (bookingConfirmedPage==null)?bookingConfirmedPage = new BookingConfirmedPage():bookingConfirmedPage;
	}
	public MyBookingPage getMyBookingPage() {
		return (myBookingPage==null)?myBookingPage = new MyBookingPage():myBookingPage ;
	}
	
	

}
