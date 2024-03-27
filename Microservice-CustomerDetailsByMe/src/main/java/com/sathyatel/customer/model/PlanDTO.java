package com.sathyatel.customer.model;

public class PlanDTO {

	private String planId;
	private String planName;
	private Integer validity;
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getValidity() {
		return validity;
	}
	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "PlanDTO [planId=" + planId + ", planName=" + planName + ", validity=" + validity + "]";
	}
	
	
}
