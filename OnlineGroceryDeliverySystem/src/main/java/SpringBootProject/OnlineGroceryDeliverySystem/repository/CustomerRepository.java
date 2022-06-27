package SpringBootProject.OnlineGroceryDeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
