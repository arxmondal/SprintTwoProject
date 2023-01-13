package com.arnab.employeemanager.exception;

/**
 * The UserNotFoundException is a custom runtime exception that is thrown when a user is not found.
 */
public class UserNotFoundException extends RuntimeException {
    /**
     * Constructs a new UserNotFoundException with the specified message.
     * @param message the detail message. The detail message is saved for later retrieval by the getMessage() method.
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}