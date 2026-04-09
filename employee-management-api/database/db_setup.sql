-- #############################################################
-- # Project: Employee Management API
-- # Author: Siva Reddy
-- # Purpose: Database Setup Script
-- #############################################################

-- 1. Create Schema
CREATE DATABASE IF NOT EXISTS employee_db;
USE employee_db;

-- 2. Create Table Structure
-- (Note: Hibernate ddl-auto creates this, but manual script is provided for reference)
CREATE TABLE IF NOT EXISTS employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    department VARCHAR(255),
    email_id VARCHAR(255) NOT NULL UNIQUE,
    first_name VARCHAR(255) NOT NULL,
    salary DOUBLE NOT NULL
);

-- 3. Insert Sample Data for Testing
INSERT INTO employees (first_name, email_id, department, salary) 
VALUES ('Siva Reddy', 'siva@pro.com', 'IT', 75000);

-- 4. Verification Query
SELECT * FROM employees;