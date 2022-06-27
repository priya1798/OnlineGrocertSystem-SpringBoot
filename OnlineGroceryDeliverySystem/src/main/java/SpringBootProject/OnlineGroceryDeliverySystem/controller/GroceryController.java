package SpringBootProject.OnlineGroceryDeliverySystem.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Grocery;
import SpringBootProject.OnlineGroceryDeliverySystem.service.GroceryService;

@RestController
@RequestMapping ("/api/grocery")
public class GroceryController {
	
	private GroceryService groceryService;

	public GroceryController(GroceryService groceryService) {
		super();
		this.groceryService = groceryService;
	}
	
	@PostMapping
	public ResponseEntity<Grocery> saveGrocery(@RequestBody Grocery grocery){
		return new ResponseEntity<Grocery>(groceryService.saveGrocery(grocery), HttpStatus.CREATED);
	}
	
	@GetMapping 
	public List<Grocery> getAllGrocery(){
		return groceryService.getAllGrocery();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Grocery> getGroceryById(@PathVariable ("id") long id){
		return new ResponseEntity<Grocery>(groceryService.getGroceryById(id), HttpStatus.OK);
	}
	
	@PostMapping("{id}")
	public ResponseEntity<Grocery> updateGrocery(@PathVariable long id,
			                                     @RequestBody Grocery grocery){
		return new ResponseEntity<Grocery>(groceryService.updateGrocery(grocery, id), HttpStatus.OK);
	}
	
	@DeleteMapping ("{id}")
	public ResponseEntity<String> deleteGrocery(@PathVariable ("id")long id){
		groceryService.deleteGrocery(id);
		return new ResponseEntity<String>("Resource deleted sucessfully.", HttpStatus.OK);
	}


}
