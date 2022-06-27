package SpringBootProject.OnlineGroceryDeliverySystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Customer;
import SpringBootProject.OnlineGroceryDeliverySystem.exception.GivenIdNotFoundException;
import SpringBootProject.OnlineGroceryDeliverySystem.exception.RecordNotFoundException;
import SpringBootProject.OnlineGroceryDeliverySystem.repository.CustomerRepository;
import SpringBootProject.OnlineGroceryDeliverySystem.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
 
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(long id) {
		Optional<Customer> customer = customerRepository.findById(id);
		if(customer.isPresent()) {
			return customer.get();
		}
		else {
		throw new RecordNotFoundException();
	    }
    }

	@Override
	public Customer updateCustomer(Customer customer, long id) {
		// whether to check given id customer is existing or not
		Customer existingCustomer = customerRepository.findById(id).orElseThrow(
				                    () -> new GivenIdNotFoundException());
		
		// update all the customer details in existingCustomer
		existingCustomer.setFirstName(customer.getFirstName());
		existingCustomer.setLastName(customer.getLastName());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setPhoneNo(customer.getPhoneNo());
		
		//save existing employee to db
		customerRepository.save(existingCustomer);
		return existingCustomer;
	}

	@Override
	public void deleteCustomer(long id) {
		//whether to check given id customer is existing or not
		customerRepository.findById(id).orElseThrow(
				() -> new GivenIdNotFoundException());
		
	    customerRepository.deleteById(id);
	}


}
