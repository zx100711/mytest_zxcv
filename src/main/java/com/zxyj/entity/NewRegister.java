package com.zxyj.entity;

import java.util.Date;

public class NewRegister {

	private Integer registerNum;
    private Date day;
    private Integer is_info;
    private Integer is_real;
    public Integer getIs_real() {
		return is_real;
	}
	public void setIs_real(Integer is_real) {
		this.is_real = is_real;
	}
	public Integer getIs_info() {
		return is_info;
	}
	public void setIs_info(Integer is_info) {
		this.is_info = is_info;
	}
	
	public Integer getRegisterNum() {
		return registerNum;
	}
	public void setRegisterNum(Integer registerNum) {
		this.registerNum = registerNum;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "NewRegister [getRegisterNum()=" + getRegisterNum() + ", getDay()=" + getDay() + "]";
	}
   

 
}
