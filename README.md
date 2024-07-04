# ShopDemoP
ShopDemoP is demonstration program of Backend competency. The project simulates an online shop. Prepared for interviews.
## Description

ShopDemoP is a sample online shop application built with Spring Boot. The project includes basic features for user
management, authentication, and authorization, as well as interaction with a PostgreSQL database.

## Features

- User registration
- User authentication
- User management
- PostgreSQL database integration

## Project Structure
src/
├── main/
│ ├── java/
│ │ ├── com/
│ │ │ ├── demop/
│ │ │ │ ├── ShopDemoPApplication.java
│ │ │ │ ├── config/
│ │ │ │ │ └── SecurityConfig.java
│ │ │ │ ├── controller/
│ │ │ │ │ └── UserController.java
│ │ │ │ ├── model/
│ │ │ │ │ └── User.java
│ │ │ │ ├── repository/
│ │ │ │ │ └── UserRepository.java
│ │ │ │ ├── service/
│ │ │ │ │ └── UserService.java
├── resources/
│ ├── application.properties

## Prerequisites

- Java 17
- Maven 3.8.1 or later
- PostgreSQL

## Setup Instructions

### Database Setup

1. Install PostgreSQL.
2. Create a new database:

```sql
CREATE DATABASE shopdemop;
CREATE USER shopuser WITH PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE shopdemop TO shopuser;
```
## Application Setup
### Clone the repository:
git clone https://github.com/your-username/ShopDemoP.git
cd ShopDemoP
### Configure the database connection in src/main/resources/application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/shopdemop
spring.datasource.username=shopuser
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

### Build and run the application:
./mvnw spring-boot:run

The application should now be running at http://localhost:8080.
## REST API Endpoints
### User Registration
- URL: /api/register
- Method: POST
- Request Body:

{
"username": "exampleUser",
"email": "user@example.com",
"password": "examplePassword"
}

Response: 201 Created on success
## User Authentication
- URL: /api/login
- Method: POST
- Request Body:

  {
  "username": "exampleUser",
  "password": "examplePassword"
  }
- Response: 200 OK on success

## Contributing
Contributions are welcome! Please open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

This `README.md` provides a comprehensive overview of the project, setup instructions, and details about the REST API
endpoints. Adjust the content as needed to fit your specific implementation and requirements.
