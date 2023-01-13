package com.arnab.employeemanager.repo;

import com.arnab.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository for Employee operations
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    /**
     * Delete an Employee by id
     * @param id the id of the Employee to delete
     */
    void deleteEmployeeById(Long id);

    /**
     * Find Employee by id
     * @param id the id of the Employee
     * @return the Employee with the specified id
     */
    Optional<Employee> findEmployeeById(Long id);
}