package com.dev.APIDiscount.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "\"SP_DISCOUNTS_DETAIL\"")

public class DiscountDetail {
	@Id
	@Column(name = "\"DISCOUNTS_DETAIL_ID\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "\"DISCOUNTS_ID\"")
	private String discountId;
	
	@Column(name = "\"DISCOUNT_DETAIL_STATUS\"")
	private String status;
	
	@Column(name = "\"DISCOUNTS_DETAIL_RULES\"")
    private String rules;
	
	@Column(name = "\"DISCOUNTS_DETAIL_AMMOUNT\"")
	private String ammount;
    
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDiscountId() {
		return discountId;
	}


	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getRules() {
		return rules;
	}


	public void setRules(String rules) {
		this.rules = rules;
	}


	public String getAmmount() {
		return ammount;
	}


	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}



	

	public DiscountDetail() {
	       
	}
    
}
