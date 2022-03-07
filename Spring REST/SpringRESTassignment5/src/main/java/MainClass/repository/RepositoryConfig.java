package MainClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import MainClass.model.Employee;

@Repository
public interface RepositoryConfig extends JpaRepository<Employee, Integer> {
    public Employee findById(int id);

}
