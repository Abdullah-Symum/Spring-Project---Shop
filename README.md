# Shop Microservices Project

Welcome to the Shop Microservices project! This Java Spring-based application employs microservices architecture to create a modular and scalable shopping platform. The project includes features such as Google authentication for security, basic product and category management, and a shopping cart for an enhanced user experience.

## Project Overview

The Shop Microservices project is built using Java Spring with a microservices architecture. It incorporates Google authentication for secure access. The basic features include:

- Admin functionalities:
  - Add, update, and delete products to the shop
  - Add, update, and delete product categories using CRUD operations

- MySQL Database:
  - Utilizes MySQL for data storage

- Frontend:
  - Thymeleaf is used for rendering HTML templates

- Shopping Cart:
  - Implements a shopping cart to enhance the shopping experience
    
- Security:
  - Integration of Google Authentication for enhanced security.
 
## Tools needed for the development
  To set up and run the Shop Microservices project with Spring Boot, you will need the following tools:
  
  - Java Development Kit (JDK):
    - Ensure that you have Java Development Kit (JDK) installed. You can download it from the official Oracle website or use an OpenJDK distribution.
  
  - Maven:
    - Install Apache Maven, a build and project management tool for Java projects. You can download Maven from the official Apache Maven website.
  
  - MySQL Database:
    - Install MySQL database to store and manage data. You can download MySQL from the official MySQL website.
    
  - Git:
    - Install Git for version control. You can download Git from the official Git website.
    
  - Google API Credentials: 
    - Configure Google API credentials for enabling Google Authentication in the application. Follow the steps to create credentials on the Google Cloud Console.


## Getting Started

Follow these steps to set up and run the project locally:

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd <project-directory>`

### Database Configuration

3. Update the database credentials in the application properties files:

   - Open `microservice-product/src/main/resources/application.properties` and set the MySQL username and password.

   - Open `microservice-category/src/main/resources/application.properties` and set the MySQL username and password.

4. Save the changes.

### Running the Application

5. Build the project: 
   ```bash
   ./mvnw clean install
   ```

   (For Unix) or 

   ```bash
   mvnw.cmd clean install
   ```

   (For Windows)

6. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

   (For Unix) or 

   ```bash
   mvnw.cmd spring-boot:run
   ```

   (For Windows)

7. Access the application on [http://localhost:8080](http://localhost:8080)

## Usage

Once the application is running, you can access it from your local machine. Admin users can log in using Google authentication and perform the specified actions. Guests can browse the shop, add products to the cart, and enjoy a seamless shopping experience.

Feel free to reach out if you have any questions or encounter issues.

Happy Shopping! 🛍️
