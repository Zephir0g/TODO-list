# TODO List Application

## Overview

This is a Spring Boot-based TODO list application. It allows users to manage their tasks effectively. Users can add, mark as complete, and delete tasks.

## Features

- Add new tasks
- Mark tasks as complete
- Delete tasks
- View all tasks

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- HTML, CSS, JavaScript
- Database: MySQL 

## Project Structure

- `SpringTodoListApplication.java`: Main Spring Boot application file.
- `Config.java`: Configuration file for the Spring application.
- `MainContoller.java`: Main controller for handling HTTP requests.
- `TodoElement.java`: Entity class for the TODO elements.
- `TodoElementRepo.java`: Repository interface for the TODO elements.
- `TodoElementService.java`: Service class for managing TODO elements.
- `application.properties`: Spring Boot application properties.
- Front-end files: `css.css`, `index.html`, `markTaskAsComplete.js`, `script.js`
- HTML fragments: `completeTaskFragment.html`, `notCompletedTaskFragment.html`
- Test files: `SpringTodoListApplicationTests.java`

## Database Configuration

This project uses MySQL for database management. The login credentials are as follows:

- Username: `root`
- Password: None (No password)
- Name of the database: `TODOList`

## How to Run

1. Clone the repository
2. Navigate to the project directory
3. Run `./gradlew bootRun`
