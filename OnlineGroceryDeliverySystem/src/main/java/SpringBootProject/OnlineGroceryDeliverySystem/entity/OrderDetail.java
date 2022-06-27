package SpringBootProject.OnlineGroceryDeliverySystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "OrderDetail")

public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	
	@Column (name = "userId")
    private long userId;
    
	@Column (name = "productId")
    private long productId;
    
	@Column (name = "name")
    private String productName;
    
    @Column (name = "total_product", nullable=false)
    private int totalNoOfProdInCart;
    
    @Column (name = "discount")
    private double Discount;
    
    @Column (name = "total", nullable=false)
    private long grandTotal;
    
    @Column (name = "pay_mode")
    private String paymentMode;
    
    @Column (name = "payment_status", nullable=false)
    private String paymentStatus;
    
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getTotalNoOfProdInCart() {
		return totalNoOfProdInCart;
	}
	public void setTotalNoOfProdInCart(int totalNoOfProdInCart) {
		this.totalNoOfProdInCart = totalNoOfProdInCart;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public long getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(long grandTotal) {
		this.grandTotal = grandTotal;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public OrderDetail(long orderId, long userId, long productId, String productName, int totalNoOfProdInCart,
			double discount, long grandTotal, String paymentMode, String paymentStatus) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.totalNoOfProdInCart = totalNoOfProdInCart;
		this.Discount = discount;
		this.grandTotal = grandTotal;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
	}
	
	@Override
	public String toString() {
		return "OrderDetail [orderId=" + orderId + ", userId=" + userId + ", productId=" + productId + ", productName="
				+ productName + ", totalNoOfProdInCart=" + totalNoOfProdInCart + ", Discount=" + Discount
				+ ", grandTotal=" + grandTotal + ", paymentMode=" + paymentMode + ", paymentStatus=" + paymentStatus
				+ "]";
	}
	
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

