# Student Attendance Management System

A beginner-friendly console-based Java application created to practice Object-Oriented Programming concepts and basic MySQL database connectivity using JDBC.

## Features
- Add student records
- Mark student attendance (Present/Absent)
- Store and retrieve data from MySQL

## Technologies Used
- Java
- MySQL
- JDBC

## Project Purpose
This project was implemented as a learning exercise to understand core Java backend concepts such as classes, objects, and database interaction.

--------------------------------------------------------------------------------------WORKFLOW_DIAGRAM-----------------------------------------------------------------------------------------------------
## Workflow Diagram

![Workflow Diagram](docs/workflow.png)

------------------------------------------------------------------------------------------DB---------------------------------------------------------------------------------------------------------------

    ## Database Setup (MySQL)

The application uses a MySQL database.  
Below are the SQL commands required to create the database and tables:

```sql
CREATE DATABASE attendance_db;
USE attendance_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    roll_no VARCHAR(20)
);

CREATE TABLE attendance (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    date DATE,
    status VARCHAR(10)
);


