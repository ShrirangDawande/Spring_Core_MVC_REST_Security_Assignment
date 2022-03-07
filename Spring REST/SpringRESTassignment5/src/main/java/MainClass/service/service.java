package MainClass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainClass.model.Employee;
import MainClass.repository.RepositoryConfig;

@Service
public class service {
    
	@Autowired
	RepositoryConfig repositoryConfig;

	public void addNewEmployee(Employee employee) {
       repositoryConfig.save(employee);		
	}

	public void deleteemp(int id) {
       repositoryConfig.deleteById(id);	
	}

	public List<Employee> getAllEmp(Employee employee) {
		return repositoryConfig.findAll();
	}

	public void getbyid(int id) {
        repositoryConfig.getById(id);		
	}
	
	
}
