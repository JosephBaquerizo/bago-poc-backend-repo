package com.pocbackend.demo.controller;

import com.pocbackend.demo.entity.Employee;
import com.pocbackend.demo.entity.EmployeeBirthday;
import com.pocbackend.demo.service.EmployeeService;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET })
@AllArgsConstructor
public class EmployeesController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() throws IOException {
        return ResponseEntity.ok(employeeService.getEmployees());
    }

    @GetMapping("/birthdays")
    public ResponseEntity<List<EmployeeBirthday>> getEmployeesBirthdays() throws IOException {
        return ResponseEntity.ok(employeeService.getEmployeesBirthdays());
    }

}
