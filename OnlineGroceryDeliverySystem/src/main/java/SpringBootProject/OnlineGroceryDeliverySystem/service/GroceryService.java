package SpringBootProject.OnlineGroceryDeliverySystem.service;

import java.util.List;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Grocery;

public interface GroceryService {
	
	Grocery saveGrocery(Grocery grocery);
	
	List<Grocery> getAllGrocery();
	
	Grocery getGroceryById(long id);
	
	Grocery updateGrocery(Grocery grocery, long id);
	
	void deleteGrocery(long id);

}
