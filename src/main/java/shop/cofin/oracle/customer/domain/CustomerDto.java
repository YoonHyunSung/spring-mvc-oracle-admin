package shop.cofin.oracle.customer.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class CustomerDto {
	private int custId;
	private String custName;
	private String address;
	private String phone;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CustomerDto [custId=" + custId + ", custName=" + custName + ", address=" + address + ", phone=" + phone
				+ "]";
	}
	
}
