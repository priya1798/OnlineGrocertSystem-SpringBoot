package SpringBootProject.OnlineGroceryDeliverySystem.service;

import java.util.List;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.OrderDetail;

public interface OrderDetailService {
	
	OrderDetail saveOrderDetail(OrderDetail orderDetail);
	
	List<OrderDetail> getAllOrderDetail();
	
	OrderDetail getOrderDetailById(long id);
	
	OrderDetail updateOrderDetail(OrderDetail orderDetail , long id);
	
	void deleteOrderDetail(long id);
	
}