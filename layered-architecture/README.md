# LAYERED ARCHITECTURE

## Structure project
```
├── src
| ├── main
| | ├── java
| | | └── com.example.architecture.layered
| | |     ├── MainApplication.java  # Main Application
| | |     ├── configuration         # Configuration layer
| | |     ├── controller            # Controller layer
| | |     ├── model                 # Model layer
| | |     | ├── dto                 # Dto class
| | |     | | ├── request           # Request class
| | |     | | └── response          # Response class
| | |     | ├── entity              # Entity class
| | |     | └── exception           # Exception class
| | |     ├── repository            # Repository layer
| | |     ├── service               # Business logic layer
| | |     | ├── impl                # Service handler
| | |     | └── mapper              # Mapping logic
| | |     └── utils                 # Utils, helper function
| | └── resources
| |     ├── application.yaml        # Config application file properties, env ...
| |     └── migration               # Database migration files
| └── test                          # Testing
|     └── java

```

## Flow
```
Client → Controller → Service → Repository → Database
             ↓           ↓          ↓
            DTO     ↔  Mapper  ↔  Entity
```