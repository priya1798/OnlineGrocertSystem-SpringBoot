package SpringBootProject.OnlineGroceryDeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Grocery;

public interface GroceryRepository extends JpaRepository<Grocery, Long> {

}
