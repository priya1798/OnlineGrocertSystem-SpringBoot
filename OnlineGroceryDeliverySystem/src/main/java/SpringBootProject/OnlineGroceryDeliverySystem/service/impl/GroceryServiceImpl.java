package SpringBootProject.OnlineGroceryDeliverySystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Grocery;
import SpringBootProject.OnlineGroceryDeliverySystem.exception.GivenIdNotFoundException;
import SpringBootProject.OnlineGroceryDeliverySystem.exception.RecordNotFoundException;
import SpringBootProject.OnlineGroceryDeliverySystem.repository.GroceryRepository;
import SpringBootProject.OnlineGroceryDeliverySystem.service.GroceryService;

@Service
public class GroceryServiceImpl implements GroceryService{

	private GroceryRepository groceryRepository;
	
	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		super();
		this.groceryRepository = groceryRepository;
	}

	@Override
	public Grocery saveGrocery(Grocery grocery) {
		return groceryRepository.save(grocery);
	}

	@Override
	public List<Grocery> getAllGrocery() {
		return groceryRepository.findAll();
	}

	@Override
	public Grocery getGroceryById(long id) {
		Optional<Grocery> grocery = groceryRepository.findById(id);
		if(grocery.isPresent()) {
			return grocery.get();
		}
		else {
			throw new RecordNotFoundException();
		}
	}

	@Override
	public Grocery updateGrocery(Grocery grocery, long id) {
		Grocery existingGrocery = groceryRepository.findById(id).orElseThrow(
				()-> new GivenIdNotFoundException());
		
		existingGrocery.setProductId(grocery.getProductId());
		existingGrocery.setProductCategory(grocery.getProductCategory());
		existingGrocery.setProductName(grocery.getProductName());
		existingGrocery.setQuantity(grocery.getQuantity());
		existingGrocery.setProductPrice(grocery.getProductPrice());
		
		groceryRepository.save(existingGrocery);
		return existingGrocery;
	}

	@Override
	public void deleteGrocery(long id) {
		groceryRepository.findById(id).orElseThrow(
				()-> new GivenIdNotFoundException());
		groceryRepository.deleteById(id);
		
	}
	
	
 
	

}
