# CidApp

A web platform for public service requests and civic issue reporting, focused on transparency, traceability, and citizen engagement.

##  About

CidApp is a Spring Boot application designed to connect citizens and public authorities through a centralized platform for reporting urban problems and requesting public services.

The system allows citizens to create service requests and civic reports, track their progress, and monitor actions taken by responsible authorities.

---

##  Features

### Public Service Requests
- Create public service requests
- Define category, priority, and sector
- Track request status
- Service-level deadline (SLA) management
- Request history and movements
- File attachments

### Civic Reports
- Create civic issue reports
- Anonymous reporting support
- Authority assignment
- Report tracking
- Evidence attachments
- Movement history

### User Management
- User registration
- User profile management
- Request ownership
- Report ownership

### Transparency & Traceability
- Protocol generation
- Status tracking
- History of actions
- Responsible sector assignment
- Citizen engagement

---

##  Technologies

- Java 21
- Spring Boot 
- Spring Data JPA
- H2 Database
- Maven
- Lombok

---

##  Project Structure

```text
src
└── main
    └── java
        └── com.cidapp.aep
            ├── controller
            ├── service
            ├── repository
            └── model
                ├── user
                ├── request
                └── report
```

---

##  Architecture
MVC
---

##  Main Entities

### User
Represents system users.

### Request
Represents public service requests.

### Report
Represents civic issue reports.

### Authority
Represents the public authority responsible for a report.

### Attachment
Stores files attached to requests and reports.

### Movement
Stores tracking history and status updates.

---

##  Request Enums

### Category
Defines the type of public service request.

### Priority
Defines request urgency.

### Status
Defines request lifecycle status.

### Sector
Defines the responsible public sector.

---

##  Report Enums

### ReportType
Defines the type of civic report.

### ReportStatus
Defines report lifecycle status.

### AuthorityType
Defines the authority responsible for handling reports.

---

##  API Endpoints

### Users

```http
GET    /users
GET    /users/{id}
POST   /users
PUT    /users/{id}
DELETE /users/{id}
```

### Requests

```http
GET    /requests
GET    /requests/{id}
POST   /requests
PUT    /requests/{id}
DELETE /requests/{id}
```

### Reports

```http
GET    /reports
GET    /reports/{id}
POST   /reports
PUT    /reports/{id}
DELETE /reports/{id}
```

---

##  Running the Project

Clone the repository:

```bash
git clone https://github.com/your-username/citizen-request-system.git
```

Access the project:

```bash
cd citizen-request-system
```

Run the application:

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
