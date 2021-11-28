package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

	@Transactional()
	@Modifying()
	@Query(value="UPDATE employee e SET e.emp_address = ?1 , e.emp_age = ?2, e.emp_name = ?3 ,e.emp_phone_number = ?4, e.emp_salary = ?5 where e.empID = ?6",nativeQuery = true)
	int update(String EmpAddress,int EmpAge,String EmpName,String EmpPhoneNumber,String EmpSalary, int EmpID);

}