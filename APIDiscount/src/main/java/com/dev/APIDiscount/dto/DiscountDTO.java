package com.dev.APIDiscount.dto;

import java.sql.Date;
import java.sql.Time;

import com.dev.APIDiscount.model.Discount;

public class DiscountDTO {
	 	private String id;
	    private String name;
	    private String type;
	    private Date startDate;
	    private Date endDate;
	    private Time startTime;
	    private Time endTime;
	    private String outletId;
	    private String outletName;
	    
	    public DiscountDTO(Discount discount) {
			
		}
	    
		public DiscountDTO( String id, String name, String type, Date startDate, Date endDate, Time startTime,
			Time endTime, String outletId, String outletName) {
			this.id = id;
			this.name = name;
			this.type = type;
			this.startDate = startDate;
			this.endDate = endDate;
			this.startTime = startTime;
			this.endTime = endTime;
			this.outletId = outletId;
			this.outletName = outletName;
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

		public String getOutletId() {
			return outletId;
		}

		public void setOutletId(String outletId) {
			this.outletId = outletId;
		}

		public String getOutletName() {
			return outletName;
		}

		public void setOutletName(String outletName) {
			this.outletName = outletName;
		}
}
