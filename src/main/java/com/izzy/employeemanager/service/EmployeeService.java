package com.izzy.employeemanager.service;

import com.izzy.employeemanager.entity.Employee;
import com.izzy.employeemanager.repository.EmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public Employee addEmployee(Employee employee){
        employeeDao.findByEmail(employee.getEmail())
                .ifPresentOrElse(x -> System.out.println("Email already exists please enter another email"),
                        () -> {employeeDao.save(employee);});
        return null;
    }

    public List<Employee> findAll(){
        return employeeDao.findAll();
    }

    public void deleteById(Long id){
        employeeDao.delete(id);
    }

    public Employee updateEmployee(Employee employee){
        return employeeDao.update(employee);
    }

    public Optional<Employee> findById(Long id){
        return employeeDao.findById(id);
    }


}
