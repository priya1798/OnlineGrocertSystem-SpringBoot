package SpringBootProject.OnlineGroceryDeliverySystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "GroceryTbl")
public class Grocery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	@Column (name = "category")
	private String productCategory;
	
	@Column (name = "product_name")
	private String productName;
	
	@Column (name = "quantity")
	private int quantity;
	
	@Column (name = "price")
	private String productPrice;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public Grocery(long productId, String productCategory, String productName, int quantity, String productPrice) {
		super();
		this.productId = productId;
		this.productCategory = productCategory;
		this.productName = productName;
		this.quantity = quantity;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Grocery [productId=" + productId + ", productCategory=" + productCategory + ", productName="
				+ productName + ", quantity=" + quantity + ", productPrice=" + productPrice + "]";
	}
	public Grocery() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
