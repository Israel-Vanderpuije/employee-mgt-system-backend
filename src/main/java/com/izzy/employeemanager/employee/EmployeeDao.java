package com.izzy.employeemanager.employee;

import com.izzy.employeemanager.employee.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    List<Employee> findAll();
    Employee save(Employee employee);
    void delete(Long id);
    Optional<Employee> findById(Long id);
    Employee update(Employee employee);
}
