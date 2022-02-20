package com.izzy.employeemanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long employeeId;

    private String firstName, lastName, gender, citizenship, email, address, phoneNumber, maritalStatus, socialSecurity, team;

    private Long age;

    private Date dateOfBirth, startDate;

    public Employee(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
