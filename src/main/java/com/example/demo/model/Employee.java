package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="employee")
@Getter
@Setter
@NoArgsConstructor

public class Employee {
	@Id
	public int EmpID;
	public String EmpName;
	public int EmpAge;
	public String EmpSalary;
	public String EmpPhoneNumber;
	public String EmpAddress;
	
	@Column
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int EmpID) {
		this.EmpID = EmpID;
	}
	@Column
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}
	@Column
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int EmpAge) {
		this.EmpAge = EmpAge;
	}
	@Column
	public String getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(String EmpSalary) {
		this.EmpSalary = EmpSalary;
	}
	@Column
	public String getEmpPhoneNumber() {
		return EmpPhoneNumber;
	}
	public void setEmpPhoneNumber(String EmpPhoneNumber) {
		this.EmpPhoneNumber = EmpPhoneNumber;
	}
	@Column
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String EmpAddress) {
		this.EmpAddress = EmpAddress;
	}
	//Default Constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int EmpID, String EmpName, int EmpAge, String EmpSalary, String EmpPhoneNumber,
			String EmpAddress) {
		super();
		this.EmpID = EmpID;
		this.EmpName = EmpName;
		this.EmpAge = EmpAge;
		this.EmpSalary = EmpSalary;
		this.EmpPhoneNumber = EmpPhoneNumber;
		this.EmpAddress = EmpAddress;
	}
	@Override
	public String toString() {
		return "EmployeeModel [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpAge=" + EmpAge + ", EmpSalary="
				+ EmpSalary + ", EmpPhoneNumber=" + EmpPhoneNumber + ", EmpAddress=" + EmpAddress + "]";
	}
}
