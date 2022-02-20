package com.izzy.employeemanager;

import com.izzy.employeemanager.entity.Employee;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(rs.getLong("employee_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("gender"),
                rs.getString("citizenship"),
                rs.getString("email"),
                rs.getString("address"),
                rs.getString("phone_number"),
                rs.getString("marital_status"),
                rs.getString("social_security"),
                rs.getString("team"),
                rs.getLong("age"),
                rs.getDate("date_of_birth"),
                rs.getDate("start_date")
        );
    }
}