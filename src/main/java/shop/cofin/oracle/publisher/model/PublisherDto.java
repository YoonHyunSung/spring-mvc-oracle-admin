package shop.cofin.oracle.publisher.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class PublisherDto {
	private int pubId;
	private String pubName;
	private String mgrName;
	private String phone;
	
	
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	public int getPubId() {
		return pubId;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public String getPubName() {
		return pubName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}

}
