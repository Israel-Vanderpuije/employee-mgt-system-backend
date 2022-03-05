package com.izzy.employeemanager.registration;

import lombok.Data;

@Data
public class RegistrationRequest {

    private final String firstName, lastName, password, email;
}
