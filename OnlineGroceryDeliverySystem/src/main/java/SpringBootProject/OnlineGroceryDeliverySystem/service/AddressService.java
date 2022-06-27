package SpringBootProject.OnlineGroceryDeliverySystem.service;

import java.util.List;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Address;

public interface AddressService {

	Address saveAddress(Address address);
	
	List<Address> getAllAddress();
	
	Address getAddressById(long id);
	
	Address updateAddress(Address address, long id);
	
	void deleteCustomer(long id);
}

