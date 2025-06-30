# Spring Data JPA O/R Mapping Demonstration

This project demonstrates comprehensive Object-Relational Mapping (O/R Mapping) using Spring Data JPA with various relationship types and annotations.

## 🎯 Features Demonstrated

### 1. **@ManyToOne Relationships**
- Employee → Department (Many employees belong to one department)
- Employee → Manager (Self-referencing relationship)
- Address → Employee (Many addresses belong to one employee)

### 2. **@OneToMany Relationships**
- Department → Employees (One department has many employees)
- Employee → Addresses (One employee has many addresses)
- Manager → Subordinates (Self-referencing relationship)

### 3. **@ManyToMany Relationships**
- Department ↔ Project (Many departments work on many projects)
- Project ↔ Employee (Many projects have many assigned employees)

### 4. **Key Annotations Used**
- `@JoinColumn` - Specifies foreign key columns
- `@JoinTable` - Defines join tables for many-to-many relationships
- `mappedBy` - Specifies the inverse side of bidirectional relationships
- `FetchType.EAGER` - Immediate loading of related entities
- `FetchType.LAZY` - On-demand loading of related entities
- `CascadeType.ALL` - Cascade all operations to related entities
- `orphanRemoval = true` - Delete orphaned entities

## 🏗️ Entity Relationships

```
Department (1) ←→ (*) Employee (1) ←→ (*) Address
     ↕                    ↕
     |                    |
     ↓                    ↓
   Project (*)  ←→  (*) Employee
```

### Self-Referencing Relationships
```
Employee (Manager) (1) ←→ (*) Employee (Subordinates)
```

## 🚀 Running the Application

### Prerequisites
- Java 17+
- Maven 3.6+

### Steps to Run
1. Navigate to the project directory
2. Compile the project: `mvn clean compile`
3. Run the application: `mvn spring-boot:run`

### Application URLs
- **Application**: http://localhost:8081
- **H2 Database Console**: http://localhost:8081/h2-console
- **REST API Base**: http://localhost:8081/api
- **Custom Demo API**: http://localhost:8081/api/demo

### Database Configuration
- **JDBC URL**: `jdbc:h2:mem:ormappingdb`
- **Username**: `sa`
- **Password**: `password`

## 🔍 Key Demonstrations

### 1. Fetch Types
- **EAGER**: Employee → Department (loaded immediately)
- **LAZY**: Department → Employees (loaded on-demand)

### 2. Cascade Operations
- **CascadeType.ALL**: Department → Employee (all operations cascade)
- **CascadeType.PERSIST, MERGE**: Project → Employee (specific operations cascade)

### 3. Bidirectional Relationships
- Helper methods maintain relationship integrity
- Proper use of `@JsonManagedReference` and `@JsonBackReference`

### 4. Join Operations
- Repository methods with implicit joins
- Custom JPQL queries with explicit joins
- Complex queries across multiple entities

## 📚 API Endpoints

### Demo Endpoints
- `GET /api/demo/overview` - Overview of all data
- `GET /api/demo/department/{id}/employees` - Department with employees
- `GET /api/demo/employee/{id}/details` - Employee with all relationships
- `GET /api/demo/project/{id}/relationships` - Project with departments and employees
- `GET /api/demo/managers` - All managers
- `GET /api/demo/statistics` - Relationship statistics

### Spring Data REST Endpoints
- `GET /api/departments` - All departments
- `GET /api/employees` - All employees
- `GET /api/projects` - All projects
- `GET /api/addresses` - All addresses

## 🏛️ Database Schema

### Tables Created
- `department` - Department information
- `employee` - Employee information
- `address` - Address information
- `project` - Project information
- `department_project` - Many-to-many join table
- `project_employee` - Many-to-many join table

### Key Relationships
- `employee.department_id` → `department.id`
- `employee.manager_id` → `employee.id` (self-reference)
- `address.employee_id` → `employee.id`

## 📖 Learning Objectives

This project helps understand:
1. Different types of JPA relationships
2. Proper use of relationship annotations
3. Fetch strategies and their impact
4. Cascade operations and their effects
5. Bidirectional relationship management
6. Join table configurations
7. Self-referencing relationships
8. Repository pattern with JPA
9. Spring Data REST integration
10. JSON serialization with relationships

## 🛠️ Best Practices Demonstrated

1. **Bidirectional Relationship Management**: Helper methods to maintain consistency
2. **JSON Serialization**: Proper use of `@JsonManagedReference` and `@JsonBackReference`
3. **Fetch Strategy**: Appropriate use of EAGER vs LAZY loading
4. **Cascade Configuration**: Careful selection of cascade types
5. **Repository Pattern**: Clean separation of data access logic
6. **Transaction Management**: Proper use of `@Transactional`

## 🔧 Technologies Used

- **Spring Boot 3.2.0**
- **Spring Data JPA**
- **Spring Data REST**
- **Hibernate**
- **H2 Database**
- **Jackson JSON**
- **Maven**
- **Java 17**

## 📝 Sample Data

The application automatically creates sample data including:
- Multiple departments (IT, HR, Finance, Marketing)
- Employees with various positions and relationships
- Manager-subordinate hierarchies
- Multiple addresses per employee
- Projects with cross-departmental involvement
- Complex many-to-many relationships

## 🎓 Reference

This implementation follows best practices from:
- [Baeldung Spring Data REST Relationships](https://www.baeldung.com/spring-data-rest-relationships)
- Spring Data JPA Documentation
- Hibernate Documentation
