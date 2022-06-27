package SpringBootProject.OnlineGroceryDeliverySystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.OrderDetail;
import SpringBootProject.OnlineGroceryDeliverySystem.exception.GivenIdNotFoundException;
import SpringBootProject.OnlineGroceryDeliverySystem.exception.RecordNotFoundException;
import SpringBootProject.OnlineGroceryDeliverySystem.repository.OrderDetailRepository;
import SpringBootProject.OnlineGroceryDeliverySystem.service.OrderDetailService;


@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	private OrderDetailRepository orderDetailRepository;

	public OrderDetailServiceImpl(OrderDetailRepository orderDetailRepository) {
		super();
		this.orderDetailRepository = orderDetailRepository;
	}

	@Override
	public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
		return orderDetailRepository.save(orderDetail) ;
	}

	@Override
	public List<OrderDetail> getAllOrderDetail() {
		return orderDetailRepository.findAll();
	}

	@Override
	public OrderDetail getOrderDetailById(long id) {
		Optional<OrderDetail> OrderDetail =	orderDetailRepository.findById(id);
		if(OrderDetail.isPresent()) {
			return OrderDetail.get();
		}
		else {
			throw new RecordNotFoundException();
		}
	}

	@Override
	public OrderDetail updateOrderDetail(OrderDetail orderDetail, long id) {
		OrderDetail existingOrderDetail = orderDetailRepository.findById(id).orElseThrow(
				() -> new GivenIdNotFoundException());
		
		existingOrderDetail.setOrderId(orderDetail.getOrderId());
		existingOrderDetail.setUserId(orderDetail.getUserId());
		existingOrderDetail.setProductId(orderDetail.getProductId());
		existingOrderDetail.setProductName(orderDetail.getProductName());
		existingOrderDetail.setTotalNoOfProdInCart(orderDetail.getTotalNoOfProdInCart());
		existingOrderDetail.setDiscount(orderDetail.getDiscount());
		existingOrderDetail.setGrandTotal(orderDetail.getGrandTotal());
		existingOrderDetail.setPaymentMode(orderDetail.getPaymentMode());
		existingOrderDetail.setPaymentStatus(orderDetail.getPaymentStatus());
		
		orderDetailRepository.save(existingOrderDetail);
		return existingOrderDetail ;
	}
	
	@Override
	public void deleteOrderDetail(long id) {
		
		orderDetailRepository.findById(id).orElseThrow(
				() -> new GivenIdNotFoundException());
		
		orderDetailRepository.deleteById(id);
	}
	
	
	
	

}
