package capg.com.cap;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Order_Details")
public class OrderDetails {
	@Id
	private int order_id;
	private String order_name;
	private String order_description;
	public OrderDetails(int order_id, String order_name, String order_description) {
		super();
		this.order_id = order_id;
		this.order_name = order_name;
		this.order_description = order_description;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getOrder_description() {
		return order_description;
	}
	public void setOrder_description(String order_description) {
		this.order_description = order_description;
	}
	@Override
	public String toString() {
		return "OrderDetails [order_id=" + order_id + ", order_name=" + order_name + ", order_description="
				+ order_description + "]";
	}
	

}