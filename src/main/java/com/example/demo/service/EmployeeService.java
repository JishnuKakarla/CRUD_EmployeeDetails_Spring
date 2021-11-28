package com.example.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	List<Employee> list;
	//CRUD operations
	
	//CREATE
	public Employee Create(Employee employee)
	{	
		employee.setEmpID((int)new Random().nextInt(90001));
		return employeeRepository.save(employee);
	}
	//READ
	public List<Employee> Read(Employee employee)
	{
		return employeeRepository.findAll();
	}
	//UPDATE
	public int Update(int EmpID,Employee employee)
	{
		return employeeRepository.update(employee.getEmpAddress(),employee.getEmpAge(),employee.getEmpName(),employee.getEmpPhoneNumber(),employee.getEmpSalary(),EmpID);
	}
	//DELETE
	public Employee Delete(Employee employee)
	{
		employeeRepository.delete(employee);
		return null;
	}
	//findbyid
	public Employee Findbyid(int EmpID)
	{
		return employeeRepository.findById(EmpID).get();
	}
}
