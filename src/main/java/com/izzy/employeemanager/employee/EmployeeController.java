package com.izzy.employeemanager.employee;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/find")
    public Optional<Employee> findById(@RequestParam("id") Long id){
        return employeeService.findById(id);
    }

    @PutMapping("update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(@RequestParam("id") Long id){
        employeeService.deleteById(id);
    }

}
