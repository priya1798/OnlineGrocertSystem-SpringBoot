package SpringBootProject.OnlineGroceryDeliverySystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Address;
import SpringBootProject.OnlineGroceryDeliverySystem.exception.GivenIdNotFoundException;
import SpringBootProject.OnlineGroceryDeliverySystem.exception.RecordNotFoundException;
import SpringBootProject.OnlineGroceryDeliverySystem.repository.AddressRepository;
import SpringBootProject.OnlineGroceryDeliverySystem.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;
	
	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}

	@Override
	public Address getAddressById(long id) {
		Optional<Address> address = addressRepository.findById(id);
		if (address.isPresent()) {
			return address.get();
		}
		else {
			throw new RecordNotFoundException();
		}
	}

	@Override
	public Address updateAddress(Address address, long id) {
		Address existingAddress = addressRepository.findById(id).orElseThrow(
				() -> new GivenIdNotFoundException());
		
		existingAddress.setUserId(address.getUserId());
		existingAddress.setAddressName(address.getAddressName());
		existingAddress.setAddres(address.getAddres());
		
		addressRepository.save(existingAddress);
		return existingAddress;
	}

	@Override
	public void deleteCustomer(long id) {
	    addressRepository.findById(id).orElseThrow(
	    		() -> new GivenIdNotFoundException());
	    
	    addressRepository.deleteById(id);
	}

}
