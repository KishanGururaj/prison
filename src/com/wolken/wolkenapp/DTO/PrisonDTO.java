package com.wolken.wolkenapp.DTO;

public class PrisonDTO {
	private int inmateNo;
	private String Name;
	private int noOfYears;
	private String inmateCase;
	public void PrisonDTO() {
		
	}
	
	
	public int getInmateNo() {
		return inmateNo;
	}
	public void setInmateNo(int inmateNo) {
		this.inmateNo = inmateNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	public String getInmateCase() {
		return inmateCase;
	}
	public void setInmateCase(String inmateCase) {
		this.inmateCase = inmateCase;
	}
	@Override
	public String toString() {
		return "PrisonDTO [inmateNo=" + inmateNo + ", Name=" + Name + ", noOfYears=" + noOfYears + ", inmateCase="
				+ inmateCase + "]";
	}

}
