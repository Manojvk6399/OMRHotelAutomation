package com.omrbranch.payload.address;

import com.omrbranch.payloadmanager.PayloadObjectManager;
import com.omrbranch.pojo.address.AddUserAddress_Input_Pojo;
import com.omrbranch.pojo.address.CityList_Input_Pojo;
import com.omrbranch.pojo.address.DeleteAddress_Input_Pojo;
import com.omrbranch.pojo.address.UpdateUserAddress_Input_Pojo;

public class AddressPayload {
	
	
	public AddUserAddress_Input_Pojo addAddressPayload(String first_name, String last_name, String mobile,
			String apartment, int state, int city, int country, String zipcode, String address, String address_type) {
		AddUserAddress_Input_Pojo address_Input_Pojo = new AddUserAddress_Input_Pojo(first_name, last_name, mobile,
				apartment, state, city, country, zipcode, address, address_type);

		return address_Input_Pojo;
	}

	public CityList_Input_Pojo getCityListPayload(String state_id) {
		CityList_Input_Pojo cityList_Input_Pojo = new CityList_Input_Pojo(state_id);
		return cityList_Input_Pojo;
	}

	public UpdateUserAddress_Input_Pojo updateAddressPayload(String address_id, String first_name, String last_name,
			String mobile, String apartment, int state, int city, int country, String zipcode, String address,
			String address_type) {
		UpdateUserAddress_Input_Pojo updateUserAddress_Input_Pojo = new UpdateUserAddress_Input_Pojo(address_id,
				first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
		return updateUserAddress_Input_Pojo;

	}

	public DeleteAddress_Input_Pojo deleteAddressPayload(String addressId) {
		DeleteAddress_Input_Pojo deleteAddress_Input_Pojo = new DeleteAddress_Input_Pojo(addressId);
		return deleteAddress_Input_Pojo;

	}

}
