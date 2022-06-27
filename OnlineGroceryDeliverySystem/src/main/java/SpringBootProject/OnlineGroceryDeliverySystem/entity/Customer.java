package SpringBootProject.OnlineGroceryDeliverySystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
@Entity 
@Table (name = "CustomerTbl")
public class Customer {

	@Id
	@GeneratedValue(generator = "seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "seq", initialValue = 11)
	private long id;
	
	@Column (name = "first_name", nullable=false)
	private String firstName;
	
	@Column (name = "last_name")
	private String lastName;
	
	@NotNull
	@Column (name = "email", unique = true)
	@NotBlank (message = "Email is mandatory")
	@Email(message = "Invalid email id")
	private String email;
	
	@Column (name = "phone_no", nullable=false)
	private String phoneNo;
	
	public long getUserId() {
		return id;
	}
	public void setUserId(long userId) {
		this.id = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Customer(long id, String firstName, String lastName, String email, String phoneNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNo=" + phoneNo + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
