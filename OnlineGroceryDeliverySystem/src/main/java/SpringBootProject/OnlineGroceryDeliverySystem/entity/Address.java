package SpringBootProject.OnlineGroceryDeliverySystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "AddressTbl")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressNo;
  
	private long userId;
	
	@Column (name = "address_name")
	private String addressName;
	
	@Column (name = "address")
	private String addres;

	public long getAddressNo() {
		return addressNo;
	}

	public void setAddressNo(long addressNo) {
		this.addressNo = addressNo;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public Address(long addressNo, long userId, String addressName, String addres) {
		super();
		this.addressNo = addressNo;
		this.userId = userId;
		this.addressName = addressName;
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Address [addressNo=" + addressNo + ", userId=" + userId + ", addressName=" + addressName + ", addres="
				+ addres + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
