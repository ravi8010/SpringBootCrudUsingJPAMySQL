package com.capgemini.application.SpringMVCdb.service;

import java.util.List;  
import java.util.Optional;  
import java.util.ArrayList;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.application.SpringMVCdb.beans.Employee;
import com.capgemini.application.SpringMVCdb.repo.EmployeeRepository;  

@Service  
public class EmployeeService {  
   
	@Autowired  
    private EmployeeRepository employeeRepository;  
  
	public List<Employee> getAllEmployees(){  
     
		/*List<Employee> EmployeeRecords = new ArrayList<>();  
     
		employeeRepository.findAll().forEach(EmployeeRecords::add);  
		*/
      
		return (List<Employee>) employeeRepository.findAll();
    }  
	
	
	
  
	
	public Employee getEmployee(int id){  
       
		return employeeRepository.findById(id).get();  
    }  
   
	
	public void addEmployee(Employee employeeRecord){  
        
		
		employeeRepository.save(employeeRecord);  
    }  
   
	public void delete(int id){  
      
	 	employeeRepository.deleteById(id);  
    }  
}  