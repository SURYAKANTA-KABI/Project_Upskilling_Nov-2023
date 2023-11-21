package com.spring.health.model;

import lombok.Data;

@Data
public class Appointment {
	private String patientName;
	private String phoneNumber;
	private int age;
	private String consultationFor;
	
	
	public Appointment(String patientName, String phoneNumber, int age, String consultationFor) {
		super();
		this.patientName = patientName;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.consultationFor = consultationFor;
		;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getConsultationFor() {
		return consultationFor;
	}
	public void setConsultationFor(String consultationFor) {
		this.consultationFor = consultationFor;
	}
	
	

}
