package com.izzy.employeemanager.employee;

import com.izzy.employeemanager.EmployeeRowMapper;
import com.izzy.employeemanager.employee.Employee;
import com.izzy.employeemanager.employee.EmployeeDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employee> findAll() {
        String sql = """
                SELECT * FROM employee;
                """;
        return jdbcTemplate.query(sql, new EmployeeRowMapper());
    }

    @Override
    public Employee save(Employee employee) {
        String sql = """
        INSERT INTO employee(first_name, last_name, email, gender, citizenship,
        address, social_security, project, marital_status, phone_number, age,
        start_date, date_of_birth) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
        """;
        jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getEmail(),
                employee.getGender(), employee.getCitizenship(), employee.getAddress(),
                employee.getSocialSecurity(), employee.getProject(), employee.getMaritalStatus(),
                employee.getPhoneNumber(), employee.getAge(),
                employee.getStartDate(), employee.getDateOfBirth());
        return employee;
    }

    @Override
    public void delete(Long employee_id) {
        String sql = """
                DELETE FROM employee WHERE employee_id = ?;
                """;
        jdbcTemplate.update(sql, employee_id);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        String sql = """
                SELECT * FROM employee WHERE employee_id = ?;
                """;
        return jdbcTemplate.query(sql, new EmployeeRowMapper(), id).stream().findFirst();
    }

    @Override
    public Employee update(Employee employee) {
        String sql = """ 
                UPDATE employee SET first_name = ?, last_name = ?, email = ?, gender = ?, citizenship = ?, address = ?,
                social_security = ?, project = ?, marital_status = ?, phone_number = ?, age = ?, start_date = ?, date_of_birth = ?
                WHERE employee_id = ?;
                """;
        jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getEmail(),
                employee.getGender(), employee.getCitizenship(), employee.getAddress(),
                employee.getSocialSecurity(), employee.getProject(),
                employee.getMaritalStatus(), employee.getPhoneNumber(), employee.getAge(),
                employee.getStartDate(), employee.getDateOfBirth(), employee.getEmployeeId());
        return employee;
    }

    public Optional<Employee> findByEmail(String email){
        String sql = """
                SELECT * FROM employee WHERE email = ?;
                """;
        return jdbcTemplate.query(sql, new EmployeeRowMapper(), email).stream().findFirst();
    }
}
