package com.dev.APIDiscount.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "\"SP_DISCOUNTS\"")
public class Discount {
	
	@Id
	@Column(name = "\"DISCOUNTS_ID\"")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	@Column(name = "\"DISCOUNT_NAME\"")
	private String name;
    
	@Column(name = "\"DISCOUNT_TYPE\"")
	private String type;
	
	@Column(name = "\"DISCOUNT_EXPIRED_DATE\"")
    private Date endDate;
	
	@Column(name = "\"DISCOUNT_START_DATE\"")
	private Date startDate;
	
	@Column(name = "\"DISCOUNT_START_TIME\"")
    private Time startTime;
	
	@Column(name = "\"DISCOUNT_EXPIRED_TIME\"")
    private Time endTime;

    public Discount(String id, String name, String type, Date startDate, Date endDate, Time startTime, Time endTime) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public Discount() {
	       
	}
    
}
