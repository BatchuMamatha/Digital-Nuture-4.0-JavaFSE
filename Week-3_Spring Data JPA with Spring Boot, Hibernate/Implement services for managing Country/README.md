# Country Management Service

A Spring Boot application that implements country management services using Spring Data JPA and Hibernate.

## Features

This application provides the following features for country management:

1. **Find a country based on country code** - GET `/api/countries/{countryCode}`
2. **Add new country** - POST `/api/countries`
3. **Update country** - PUT `/api/countries/{countryCode}`
4. **Delete country** - DELETE `/api/countries/{countryCode}`
5. **Find list of countries matching a partial country name** - GET `/api/countries/search?name={partialName}`

## Additional Features

- **Get all countries** - GET `/api/countries`
- **Get country count** - GET `/api/countries/count`
- **Check if country exists** - GET `/api/countries/{countryCode}/exists`

## Technology Stack

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- Hibernate
- H2 Database (in-memory)
- Maven
- JUnit 5 & Mockito (for testing)

## Database Configuration

The application uses H2 in-memory database with the following configuration:

```properties
# Hibernate ddl auto (create, create-drop, update, validate)
spring.jpa.hibernate.ddl-auto=create-drop
```

The `ddl-auto` configuration options:
- **create** - drops existing tables data and structure, then creates new tables
- **validate** - check if the table and columns exist or not, throws an exception if a matching table or column is not found
- **update** - if a table does not exist, it creates a new table; if a column does not exist, it creates a new column
- **create-drop** - creates the table, once all operations are completed, the table is dropped

## Database Schema

The application uses a `country` table with the following structure:

```sql
CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(100) NOT NULL
);
```

## Data Population

The application automatically populates the country table with all world countries on startup using the `DataInitializer` component.

## API Endpoints

### 1. Get All Countries
```
GET /api/countries
```

### 2. Get Country by Code
```
GET /api/countries/{countryCode}
```

### 3. Add New Country
```
POST /api/countries
Content-Type: application/json

{
    "countryCode": "XX",
    "countryName": "Example Country"
}
```

### 4. Update Country
```
PUT /api/countries/{countryCode}
Content-Type: application/json

{
    "countryName": "Updated Country Name"
}
```

### 5. Delete Country
```
DELETE /api/countries/{countryCode}
```

### 6. Search Countries by Name
```
GET /api/countries/search?name={partialName}
```

### 7. Get Country Count
```
GET /api/countries/count
```

### 8. Check if Country Exists
```
GET /api/countries/{countryCode}/exists
```

## How to Run

1. Navigate to the project directory
2. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
3. The application will start on port 8080

## Access Points

- **Application**: http://localhost:8080
- **H2 Console**: http://localhost:8080/h2-console
  - JDBC URL: jdbc:h2:mem:testdb
  - Username: sa
  - Password: password
- **API Base URL**: http://localhost:8080/api/countries

## Testing

Run the tests using Maven:
```bash
mvn test
```

## Example Usage

### Get all countries:
```bash
curl -X GET http://localhost:8080/api/countries
```

### Get a specific country:
```bash
curl -X GET http://localhost:8080/api/countries/US
```

### Add a new country:
```bash
curl -X POST http://localhost:8080/api/countries \
  -H "Content-Type: application/json" \
  -d '{"countryCode": "XX", "countryName": "Example Country"}'
```

### Update a country:
```bash
curl -X PUT http://localhost:8080/api/countries/XX \
  -H "Content-Type: application/json" \
  -d '{"countryName": "Updated Example Country"}'
```

### Delete a country:
```bash
curl -X DELETE http://localhost:8080/api/countries/XX
```

### Search countries by partial name:
```bash
curl -X GET "http://localhost:8080/api/countries/search?name=United"
```

## Error Handling

The application includes comprehensive error handling:

- **404 Not Found** - When a country is not found
- **409 Conflict** - When trying to add a duplicate country
- **400 Bad Request** - When validation fails
- **500 Internal Server Error** - For unexpected errors

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/cognizant/countryservice/
│   │       ├── CountryServiceApplication.java
│   │       ├── config/
│   │       │   └── DataInitializer.java
│   │       ├── controller/
│   │       │   └── CountryController.java
│   │       ├── entity/
│   │       │   └── Country.java
│   │       ├── exception/
│   │       │   ├── CountryNotFoundException.java
│   │       │   ├── DuplicateCountryException.java
│   │       │   └── GlobalExceptionHandler.java
│   │       ├── repository/
│   │       │   └── CountryRepository.java
│   │       └── service/
│   │           └── CountryService.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/cognizant/countryservice/
            └── service/
                └── CountryServiceTest.java
```
