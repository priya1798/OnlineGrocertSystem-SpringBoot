package SpringBootProject.OnlineGroceryDeliverySystem.service;

import java.util.List;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);

	List<Customer> getAllCustomer();

	Customer getCustomerById(long id);
	
	Customer updateCustomer(Customer customer, long id);
	
	void deleteCustomer(long id);
}
