# Cinema-app
RESTful web application that offers user authentication, authorization, and multiple CRUD operations. It includes role-based access with "user" and "admin" roles. This application is built using the Spring framework for handling the application's core logic and Hibernate for database operations.

# Functionality
The web application consists of two main functionalities: Admin and User.

* Admin Functionality:

1. Can add, update, and delete movies, cinema halls, and movie sessions.
2. Can find users by their email addresses.

* User Functionality:

1. Can register and log in to the application.
2. Can view the list of movies, cinema halls, and available movie sessions.
3. Can search for available movie sessions.
4. Сan purchase tickets for movie sessions.
5. Сan view their shopping cart containing selected movie sessions.
6. Сan view and complete their orders for purchased tickets.

# Structure
1. The Controller receives requests from the client and forwards them to the Service layer.
2. The Service layer accepts requests from the Controller, processes all the business logic, and forwards them to the DAO layer.
3. The DAO (Data Access Object) layer receives requests from the Service layer, executes all SQL queries, and interacts with the database to perform data operations.

# Endpoints
Here is the list of endpoints categorized by their access:

Admin-only Endpoints:
* POST: /cinema-halls - Add a new cinema hall.
* POST: /movies - Add a new movie.
* POST: /movie-sessions - Add a new movie session.
* PUT: /movie-sessions/{id} - Update a movie session by ID.
* DELETE: /movie-sessions/{id} - Delete a movie session by ID.
* GET: /users/by-email - Find a user by email.

User-only Endpoints:
* GET: /orders - View your orders.
* POST: /orders/complete - Complete your order.
* PUT: /shopping-carts/movie-sessions - Update the shopping cart with movie sessions.
* GET: /shopping-carts/by-user - View your shopping cart.

User and Admin Endpoints:
* POST: /register - Register a new user.
* GET: /cinema-halls - View cinema halls.
* GET: /movies - View movies.
* GET: /movie-sessions/available - View available movie sessions.

# Technologies
* Java 17
* Maven 3.1.1
* MySQL 8.0.22
* Tomcat 9.0.75
* Java Servlet 4.0.1
* Spring 5.3.20
* Spring-Web 5.3.20
* Spring-Security 5.6.10
* Hibernate 5.6.14.Final
* JDBC

# How to run
To run the project, follow these steps:

1. Clone the project from GitHub onto your computer.
2. Install Apache Tomcat version 9.0.xx.
3. Install MySQL version 8 or higher.
4. Install Postman, a tool for convenient API interactions.
5. Configure the field values in the "db.properties" file according to your specific database properties.
6. Start the project by running it on Apache Tomcat.
7. Use Postman to interact with the application and test its functionalities.
