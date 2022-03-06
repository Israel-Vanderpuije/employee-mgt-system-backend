package com.izzy.employeemanager.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Long employeeId;

    private String firstName, lastName, gender, citizenship, email, phoneNumber, address, maritalStatus, socialSecurity, project;

    private Long age;

    private Date dateOfBirth, startDate;

    public Employee(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
