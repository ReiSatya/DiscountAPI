package com.dev.APIDiscount.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "\"SP_OUTLET\"")

public class Outlet {
    @Id
    @Column(name = "\"OUTLET_ID\"")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)	
    private String id;
    
    @Column(name = "\"OUTLET_NAME\"")
    private String name;
    
    @Column(name = "\"OUTLET_EMAIL\"")
    private String email;
    
    @Column(name = "\"OUTLET_PHONE\"")
    private String phone;
    
//    @Column(name = "\"OUTLET_PERCENT\"")
//    private Integer percent;
//    
//    @Column(name = "\"OUTLET_STATUS\"")
//    private Integer status;
//    
//    @Column(name = "\"OUTLET_TYPE\"")
//    private Integer type;
    
	public Outlet(String id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
//		this.percent = percent;
//		this.status = status;
//		this.type = type;
	}	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
//	public int getPercent() {
//		return percent;
//	}
//	public void setPercent(Integer percent) {
//		this.percent = percent;
//	}
//	public int getStatus() {
//		return status;
//	}
//	public void setStatus(Integer status) {
//		this.status = status;
//	}
//	public int getType() {
//		return type;
//	}
//	public void setType(Integer type) {
//		this.type = type;
//	}
	
	public Outlet() {
	       
	}

	public void setDiscounts(List<Discount> validDiscounts) {
		
		
	}
    
}
