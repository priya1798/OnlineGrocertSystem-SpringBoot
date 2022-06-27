package SpringBootProject.OnlineGroceryDeliverySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootProject.OnlineGroceryDeliverySystem.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
