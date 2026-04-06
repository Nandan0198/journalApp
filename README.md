Journal App

A secure and scalable Journal Management Application built using Java, Spring Boot, and MySQL. This application allows users to create, edit, and manage personal journal entries with proper authentication and authorization.

Features

• Secure user authentication and authorization using Spring Security
• Create, update, delete, and view journal entries
• User-specific data isolation (each user accesses only their entries)
• RESTful API design for efficient communication
• Exception handling and validation for robust performance
• Optimized MySQL schema for efficient data storage and retrieval

Tech Stack

Backend: Java, Spring Boot
Security: Spring Security
Database: MySQL
Build Tool: Maven
API Testing: Postman
Version Control: Git & GitHub

Project Structure

journalApp
│
├── src
│ ├── main
│ │ ├── java/org.example
│ │ │ ├── controller
│ │ │ ├── service
│ │ │ ├── repository
│ │ │ ├── model
│ │ │ ├── security
│ │ │ └── JournalAppApplication.java
│ │ └── resources
│ │ └── application.properties
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── .gitignore

Installation and Setup

Clone the repository
git clone https://github.com/Nandan0198/journalApp.git
Navigate to project directory
cd journalApp
Configure MySQL (update application.properties)

spring.datasource.url=jdbc:mysql://localhost:3306/journal_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Run the application
./mvnw spring-boot:run

API Endpoints (Sample)

POST /auth/register – Register new user
POST /auth/login – Login user
GET /journal – Get all entries
POST /journal – Create new entry
PUT /journal/{id} – Update entry
DELETE /journal/{id} – Delete entry

Security

• Spring Security implementation
• Role-based access control (RBAC)
• Password encryption using BCrypt
• Secure API endpoints

Future Enhancements

• Frontend integration (React or Angular)
• Deployment using Docker and AWS
• Search and filter functionality
• Analytics dashboard

Author

Nandan Kumar
B.Tech Information Technology Student
