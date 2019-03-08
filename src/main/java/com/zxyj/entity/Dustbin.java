package com.zxyj.entity;

import java.util.Date;

public class Dustbin {

   
	private String id;
    private String address;
    private String description;
    private Date create_time;
    private String is_visible;
    private Double lat;
    private Double lng;
    private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getIs_visible() {
		return is_visible;
	}
	public void setIs_visible(String is_visible) {
		this.is_visible = is_visible;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 @Override
		public String toString() {
			return "Dustbin [getId()=" + getId() + ", getAddress()=" + getAddress() + ", getDescription()="
					+ getDescription() + ", getCreate_time()=" + getCreate_time() + ", getIs_visible()=" + getIs_visible()
					+ ", getLat()=" + getLat() + ", getLng()=" + getLng() + ", getStatus()=" + getStatus() + "]";
		}


}
