package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	//CREATE
	@CrossOrigin
	@PostMapping("/create")
	public Employee create(@RequestBody Employee employee)
	{
		return employeeService.Create(employee);
	}
	//READ
	@CrossOrigin
	@GetMapping("/read")
	public List<Employee> read(Employee employee)
	{
		return employeeService.Read(employee);
	}
	//UPDATE
	@CrossOrigin
	@PutMapping("/update/{EmpID}")
	public int update(@PathVariable int EmpID,@RequestBody Employee employee)
	{
		return employeeService.Update(EmpID,employee);
	}
	//DELETE
	@CrossOrigin
	@DeleteMapping("/delete/{EmpID}")
	public Employee delete(@PathVariable int EmpID)
	{
		return employeeService.Delete(employeeService.Findbyid(EmpID));
	}
	//findByID
	@CrossOrigin
	@GetMapping("/findbyid/{EmpID}")
	public Employee findbyid(@PathVariable int EmpID)
	{
		return employeeService.Findbyid(EmpID);
	}
}