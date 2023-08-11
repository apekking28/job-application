## SpringBoot REST API Project: Job Portal

This repository contains a Java SpringBoot project that implements a simple Job Portal application with the following functionalities:

1. **Login API**
   - Validates username and password against a database of valid credentials.
   - Utilizes JSON Web Token (JWT) for secure authentication.

2. **Register API**
   - The API is used to create a new user by providing a username, email, and password.

3. **Get Job List API**
   - Requires a valid JWT token for access.
   - Fetches job listings from an external API and returns them as a response payload.

4. **Get Job Detail API**
   - Requires a valid JWT token for access.
   - Retrieves detailed information about a specific job using its ID from an external API and returns the data as a response payload.

### Technologies Used

- Java SpringBoot framework for building the REST APIs.
- JPA (Java Persistence API) for managing relational data.
- Maven for project management and build automation.
- PostgreSQL for the relational database management system.
- JSON Web Token (JWT) for secure authentication.
- An external API from `http://dev3.dansmultipro.co.id/api/recruitment/positions.json` for fetching job data.

### Project Structure

The project is organized into the following main components:

1. **`src/main/java/com/example/jobportal`**
   - **`JobPortalApplication.java`**: The main SpringBoot application class.
   - **`config`**: Contains configuration classes for JWT and database setup.
   - **`controller`**: Contains the controller classes for handling API requests and responses.
   - **`entity`**: Defines the data models used in the application.
   - **`repository`**: Contains JPA repositories for database interactions.
   - **`dtos`**: Data Transfer Object for the Response API.
   - **`service`**: Contains service classes that handle business logic.

2. **`src/main/resources`**
   - **`application.properties`**: Configuration properties for the application, including database connection and external API URLs.

### How to Run

1. Clone this repository to your local machine.
2. Set up a compatible database (MySQL, PostgreSQL, etc.) and update the database connection details in `application.properties`.
3. Build and run the SpringBoot application using your preferred IDE or by running `mvn spring-boot:run` from the project root directory.

### API Endpoints

1. **Login API**
   - URL: `/auth/login`
   - Method: POST
   - Request Body: `{"username": "yourUsername", "password": "yourPassword"}`
   - Response: JWT token upon successful login.

2. **Register API**
   - URL: `/auth/register`
   - Method: POST
   - Request Body: `{"username": "yourUsername","email": "yourEmail", "password": "yourPassword"}`
   - Response: JWT token upon successful login.
     
3. **Get Job List API**
   - URL: `/jobs`
   - Method: GET
   - Requires: JWT token in the request header `"Authorization" : "Bearer Token"`.
   - Response: List of job listings from the external API.

4. **Get Job Detail API**
   - URL: `/jobs/{jobId}`
   - Method: GET
   - Requires: JWT token in the request header `"Authorization" : "Bearer Token"`.
   - Response: Detailed information about the specified job.
