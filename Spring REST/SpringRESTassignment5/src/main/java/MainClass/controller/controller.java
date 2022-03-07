package MainClass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MainClass.model.Employee;
import MainClass.service.service;

@RestController
public class controller {
    
	@Autowired
	service serv;
	
	@PostMapping("/employee")
	public void addemp(@RequestBody Employee employee) {     // use requestbody when we want to add whole employee constructor with variable
		serv.addNewEmployee(employee);
	}
	
	@GetMapping("/employee/{id}")
	public void findemp(@PathVariable("id") int id) {
		this.serv.getbyid(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteemp(@PathVariable("id") int id) {
		this.serv.deleteemp(id);
	}
	
	@GetMapping("/employee")
	public List<Employee> allemp(Employee employee) {
		return serv.getAllEmp(employee);
	}
	
}
