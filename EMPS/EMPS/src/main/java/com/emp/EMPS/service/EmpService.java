package com.emp.EMPS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.EMPS.entity.Employee;
import com.emp.EMPS.repository.EmpRepo;

@Service
public class EmpService {
    
    @Autowired
    private EmpRepo repo;

    public void addEMP(Employee e) {
        repo.save(e);
    }
    public List<Employee> getAllEmp(){
        return repo.findAll();
    }
    public Employee getEmpById(int Id) {
        Optional<Employee> e = repo.findById(Id);
        if (e.isPresent()) {
            return e.get();
        }
        return null;
    }
    public void deleteEmp(int Id) {
        repo.deleteById(Id);
    }
    
    
}
