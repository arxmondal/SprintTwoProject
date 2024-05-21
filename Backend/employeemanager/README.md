# Employee Management System Backend

This repository contains the backend implementation for an Employee Management System. The system provides RESTful APIs to manage employees including functionalities like adding, updating, deleting, and retrieving employees.

## Technologies Used

- **Java:** The backend is developed using Java programming language.
- **Spring Boot:** Spring Boot is used for creating stand-alone, production-grade Spring-based Applications.
- **Spring Data JPA:** Spring Data JPA provides support for creating JPA repositories and easily interacting with the database.
- **MySQL:** MySQL is used as the database to store employee information.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine
- Maven installed on your machine
- MySQL database server installed locally or accessible remotely

### Installation

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/your-username/employee-management-system-backend.git
   ```

2. Navigate to the project directory:

   ```bash
   cd employee-management-system-backend
   ```

3. Update the MySQL database configuration in `src/main/resources/application.properties` file according to your database setup.

4. Build the project using Maven:

   ```bash
   mvn clean install
   ```

5. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

### Usage

Once the application is running, you can use the following endpoints to interact with the Employee Management System:

- **GET /employee/all:** Get a list of all employees.
- **GET /employee/find/{id}:** Get employee details by ID.
- **POST /employee/add:** Add a new employee.
- **PUT /employee/update:** Update an existing employee.
- **DELETE /employee/delete/{id}:** Delete an employee by ID.
