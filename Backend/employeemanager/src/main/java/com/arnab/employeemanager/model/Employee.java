package com.arnab.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The Employee class represents an employee object in the system.
 * It is annotated with the JPA @Entity annotation, indicating that it is a JPA entity.
 * It also implements the Serializable interface, allowing it to be serialized.
 */
@Entity
public class Employee implements Serializable {
    /**
     * The id field is annotated with the JPA @Id and @GeneratedValue annotations,
     * indicating that it is the primary key of the entity and that its value is generated automatically.
     * The @Column annotation is used to specify the column name in the database table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    /**
     * The name field represents the name of the employee.
     */
    private String name;

    /**
     * The email field represents the email address of the employee.
     */
    private String email;

    /**
     * The jobTitle field represents the job title of the employee.
     */
    private String jobTitle;

    /**
     * The phone field represents the phone number of the employee.
     */
    private String phone;

    /**
     * The imageUrl field represents the URL of an image of the employee.
     */
    private String imageUrl;

    /**
     * The employeeCode field represents the employee code of the employee.
     */
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    /**
     * The default constructor for the Employee class.
     */
    public Employee() {
    }

    /**
     * The constructor for the Employee class.
     *
     * @param name         the name of the employee
     * @param email        the email address of the employee
     * @param jobTitle     the job title of the employee
     * @param phone        the phone number of the employee
     * @param imageUrl     the URL of an image of the employee
     * @param employeeCode the employee code of the employee
     */
    public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    /**
     * Getter for the id field.
     *
     * @return the id of the employee
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for the id field.
     *
     * @param id the new id of the employee
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for the name field.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name field.
     *
     * @param name the new name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the email field.
     *
     * @return the email address of the employee
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for the email field.
     *
     * @param email the new email address of the employee
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for the jobTitle field.
     *
     * @return the job title of the employee
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Setter for the jobTitle field.
     *
     * @param jobTitle the new job title of the employee
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Getter for the phone field.
     *
     * @return the phone number of the employee
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for the phone field.
     *
     * @param phone the new phone number of the employee
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for the imageUrl field.
     *
     * @return the URL of an image of the employee
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter for the imageUrl field.
     *
     * @param imageUrl the new URL of an image of the employee
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter for the employeeCode field.
     *
     * @return the employee code of the employee
     */
    public String getEmployeeCode() {
        return employeeCode;
    }

    /**
     * Setter for the employeeCode field.
     *
     * @param employeeCode the new employee code of the employee
     */
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    /**
     * Returns a string representation of the Employee object.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}