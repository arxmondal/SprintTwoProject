package com.arnab.employeemanager.service;

import com.arnab.employeemanager.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arnab.employeemanager.model.Employee;
import com.arnab.employeemanager.repo.EmployeeRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

/**
 * Service class for Employee operations
 */
@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    /**
     * Constructor for EmployeeService
     * @param employeeRepo the repository for Employee operations
     */
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    /**
     * Add a new Employee
     * @param employee the Employee to add
     * @return the added Employee
     */
    public Employee addEmployee(Employee employee) {
        // generate unique code for employee
        employee.setEmployeeCode(UUID.randomUUID().toString());
        // save employee to repository
        return employeeRepo.save(employee);
    }

    /**
     * Find all Employees
     * @return list of all Employees
     */
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    /**
     * Update an existing Employee
     * @param employee the Employee to update
     * @return the updated Employee
     */
    public Employee updateEmployee(Employee employee) {
        // save employee to repository
        return employeeRepo.save(employee);
    }

    /**
     * Find Employee by id
     * @param id the id of the Employee
     * @return the Employee with the specified id
     */
    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    /**
     * Delete an Employee by id
     * @param id the id of the Employee to delete
     */
    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}