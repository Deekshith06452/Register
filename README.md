# User Registration Web Application

A full-stack web application for user registration built with Java EE, following the MVC design pattern.

---

## Tech Stack

| Layer | Technology |
|---|---|
| Frontend | HTML, CSS |
| Backend | Java Servlets (Jakarta EE) |
| Architecture | MVC + DAO Pattern |
| Database | MySQL |
| DB Connectivity | JDBC |
| Server | Apache Tomcat 10 |

---

## Project Structure

RegisterJEE/
├── com.tap/
│   └── Register.java          # Controller (Servlet)
├── com.tap.model/
│   └── User.java              # Model
├── com.tap.DAO/
│   └── UserDAO.java           # DAO Interface
├── com.tap.DAOimp/
│   └── UserDAOImpl.java       # DAO Implementation
├── com.tap.util/
│   └── DBConnection.java      # Database Utility
└── webapp/
    ├── register.html          # Registration Form
    ├── success.html           # Success Page
    └── style.css              # Stylesheet

---

## Features

- User registration with Name, Email, Password and Phone Number
- MVC architecture for clean code separation
- DAO and DAOImpl pattern for database abstraction
- JDBC connectivity to MySQL database
- Styled with external CSS for a clean UI
