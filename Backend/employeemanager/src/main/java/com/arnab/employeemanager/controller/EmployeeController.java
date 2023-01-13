package com.arnab.employeemanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.arnab.employeemanager.model.Employee;
import com.arnab.employeemanager.service.EmployeeService;

import java.util.List;

/**
 * REST controller for Employee resource
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    /**
     * Constructor for EmployeeResource
     * @param employeeService the service for Employee operations
     */
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Endpoint for getting all employees
     * @return list of all employees
     */
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees () {
        // call service to find all employees
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    /**
     * Endpoint for getting employee by id
     * @param id the id of the employee
     * @return the employee with the specified id
     */
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Long id) {
        // call service to find employee by id
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    /**
     * Endpoint for adding a new employee
     * @param employee the employee to add
     * @return the added employee
     */
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        // call service to add employee
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    /**
     * Endpoint for updating an existing employee
     * @param employee the employee to update
     * @return the updated employee
     */
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        // call service to update employee
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    /**
     * Endpoint for deleting an employee
     * @param id the id of the employee to delete
     * @return HTTP status OK
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        // call service to delete employee
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}