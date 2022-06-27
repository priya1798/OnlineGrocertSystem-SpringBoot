package SpringBootProject.OnlineGroceryDeliverySystem.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Customer;
import SpringBootProject.OnlineGroceryDeliverySystem.service.CustomerService;

@RestController
@RequestMapping ("/api/customer")
public class CustomerController {

	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	//build customer rest APIs
	//Post=Create
	@PostMapping
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		return new ResponseEntity<Customer> (customerService.saveCustomer(customer),HttpStatus.CREATED);
	}
	
	//Get=Read
	@GetMapping
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	//Get by id
	@GetMapping("{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable ("id")long customerid){
		return new ResponseEntity<Customer>(customerService.getCustomerById(customerid), HttpStatus.OK);
	}
	
	//Put by id - update using id
	@PutMapping("{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable ("id") long id
			                                      ,@RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerService.updateCustomer(customer, id), HttpStatus.OK); 
	}
	
    //delete 
	@DeleteMapping ("{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable ("id") long id){
		//delete record from db
		customerService.deleteCustomer(id);
		return new ResponseEntity<String>("Record Deleted Successfully.", HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
