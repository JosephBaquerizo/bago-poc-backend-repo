package com.pocbackend.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pocbackend.demo.entity.Employee;

import com.pocbackend.demo.entity.EmployeeBirthday;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    public List<Employee> getEmployees() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("/app/employees.json");
        Employee[] employees = mapper.readValue(file, Employee[].class);
        return Arrays.asList(employees);
    }

    public List<EmployeeBirthday> getEmployeesBirthdays() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("/app/birthdays.json");
        EmployeeBirthday[] employees = mapper.readValue(file, EmployeeBirthday[].class);
        return Arrays.asList(employees);
    }

}
