package com.capgemini.application.SpringMVCdb.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.application.SpringMVCdb.beans.Employee;
import com.capgemini.application.SpringMVCdb.service.EmployeeService;

import java.util.List;  
import java.util.Optional;  


@RestController  
public class EmployeeController {  
  
	
	@Autowired  
    private EmployeeService employeeService;   
   
	
	@RequestMapping("/employees")  
    public List<Employee> getAllEmployee(){  
        return employeeService.getAllEmployees();  
    }     
	@RequestMapping("/test")
	public String test()
	{
		return "test";
	}
	
    @RequestMapping(value="/addEmployee", method=RequestMethod.POST)  
    public void addEmployee(@RequestBody Employee employeeRecord){  
        employeeService.addEmployee(employeeRecord);  
       }  
    
    
    @RequestMapping(value="/getEmployee/{id}", method=RequestMethod.GET)  
    public Employee getEmployee(@PathVariable int id){  
        return employeeService.getEmployee(id);  
    }  
    
    @RequestMapping(value="/deleteEmployee/{id}", method=RequestMethod.DELETE)  
    public void deleteEmployee(@PathVariable int id){  
         employeeService.delete(id);  
    }  
    
}  