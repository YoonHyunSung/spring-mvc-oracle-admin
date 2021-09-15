package shop.cofin.oracle.order.domain;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import oracle.sql.DATE;

@Component @Data
public class OrderDto {
	private int orderId;
	private int custId;
	private int bookId;
	private int orderPrice;
	private String orderDate;
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		// TODO Auto-generated method stub
		this.orderDate = orderDate;
	}

}
