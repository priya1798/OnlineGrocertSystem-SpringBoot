package SpringBootProject.OnlineGroceryDeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

}
