package SpringBootProject.OnlineGroceryDeliverySystem.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.OrderDetail;
import SpringBootProject.OnlineGroceryDeliverySystem.service.OrderDetailService;

@RestController
@RequestMapping("/api/OrderDetail")
public class OrderDetailController {
	private OrderDetailService orderDetailService;

	public OrderDetailController(OrderDetailService orderDetailService) {
		super();
		this.orderDetailService = orderDetailService;
	}
	
	@PostMapping
	public ResponseEntity<OrderDetail> saveOrderDetail(OrderDetail orderDetail){
		return new ResponseEntity<OrderDetail>(orderDetailService.saveOrderDetail(orderDetail), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<OrderDetail> getAllOrderDetail(){
	return orderDetailService.getAllOrderDetail();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<OrderDetail> getOrderDetailById(@PathVariable ("id") long id){
		return new ResponseEntity<OrderDetail>(orderDetailService.getOrderDetailById(id), HttpStatus.OK);
	}
	
	@DeleteMapping ("{id}")
	public ResponseEntity<String> deleteOrderDetail(@PathVariable ("id") long id){
		orderDetailService.deleteOrderDetail(id);
		return new ResponseEntity<String>("Record Deleted Successfully.", HttpStatus.OK);
	}
	
}

