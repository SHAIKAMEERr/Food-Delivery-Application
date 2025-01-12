# Food Delivery Application

## Overview
The Food Delivery Application is a robust and efficient platform that connects customers with their favorite restaurants, enabling them to browse menus, place orders, and have food delivered to their doorstep. This project is built using **Java**, **Spring Boot**, and follows a microservices architecture.

## Features
- **User Management**: Registration, login, and profile management for customers and restaurant owners.
- **Restaurant Management**: Restaurant owners can manage their menus, update prices, and availability.
- **Order Management**: Customers can browse menus, place orders, and track delivery status.
- **Payment Integration**: Secure and seamless payment gateway integration.
- **Admin Dashboard**: Administrative control for managing users, restaurants, and orders.

## Technologies Used
- **Backend**: Java, Spring Boot
- **Architecture**: Microservices
- **Database**: MySQL
- **API Standards**: RESTful APIs
- **Security**: Spring Security, OAuth 2.0
- **Mapping**: ModelMapper, Lombok
- **SQL Operations**: NamedParameterJdbcTemplate

## Microservices
1. **User Management Service**: Handles user authentication, authorization, and profile management.
2. **Restaurant Service**: Manages restaurant data, including menus and availability.
3. **Order Service**: Processes orders, tracks status, and integrates with payment systems.

## Setup Instructions

### Prerequisites
- Java 17
- MySQL
- Maven
- Git
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/SHAIKAMEERr/Food-Delivery-Application.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Food-Delivery-Application
   ```
3. Configure the database:
   - Create a MySQL database named `food_delivery`.
   - Update the database credentials in `application.properties` for each microservice.
4. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
5. Access the application:
   - API Endpoints: `http://localhost:<port>/<endpoint>`

## API Endpoints
### User Management Service
- **POST** `/register`: Register a new user
- **POST** `/login`: Authenticate user

### Restaurant Service
- **GET** `/restaurants`: Fetch a list of restaurants
- **POST** `/restaurants`: Add a new restaurant (Admin only)

### Order Service
- **POST** `/orders`: Place a new order
- **GET** `/orders/{id}`: Track order status

## Future Enhancements
- Add real-time notifications for order updates.
- Implement advanced search and filtering for restaurants.
- Integrate AI for personalized food recommendations.
- Add support for multi-language and multi-currency.

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Push the changes to your fork.
5. Submit a pull request.

## License
This project is licensed under the [MIT License](LICENSE).

## Contact
For questions or support, please contact:
**SHAIK AMEER** - Java Developer
- Email: [G-Mail](shaikameerjann@email.com)
- LinkedIn: [LinkedIn](https://www.linkedin.com/in/ameer-shaikk/)
