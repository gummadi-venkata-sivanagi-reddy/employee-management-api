\# 🚀 Employee Management REST API (Java Full-Stack Backend)



A professional Backend system built with \*\*Spring Boot 3.2.5\*\* and \*\*MySQL\*\* for managing employee records. This project demonstrates clean architecture, DTO pattern, and API documentation standards.



\## 🛠️ Technology Stack

\* \*\*Language:\*\* Java 17

\* \*\*Framework:\*\* Spring Boot 3.2.5 (Spring Data JPA, Web, Validation)

\* \*\*Database:\*\* MySQL 8.0

\* \*\*API Documentation:\*\* Swagger / OpenAPI 3.0

\* \*\*Testing Tool:\*\* Postman



\## 🌟 Key Features

\* \*\*Full CRUD Logic:\*\* Create, Read, Update, and Delete employees.

\* \*\*DTO Pattern:\*\* Decoupled Entity and API layers for security and flexibility.

\* \*\*Global Exception Handling:\*\* Custom error responses for a clean API experience.

\* \*\*Auto-Documentation:\*\* Interactive Swagger UI for live endpoint testing.



\## 📸 Project Verification

\### 1. API Documentation (Swagger UI)

Accessible at: `http://localhost:8087/swagger-ui/index.html`

!\[Swagger UI](screenshots/swagger\_ui.png)



\### 2. Database Verification (MySQL)

Screenshot showing persistent data in MySQL Workbench.

!\[MySQL](screenshots/mysql\_database.png)



\### 3. API Testing (Postman)

Verified POST (Create) and GET (Fetch) requests with proper status codes.

!\[Postman POST](screenshots/postman\_post.png)

!\[Postman GET](screenshots/postman\_get.png)



\## ⚙️ How to Run Locally

1\. \*\*Clone the repo:\*\* `git clone <your-repo-url>`

2\. \*\*Setup Database:\*\* Run the SQL script found in `database/db\_setup.sql` in your MySQL Workbench.

3\. \*\*Configure Settings:\*\* Update `src/main/resources/application.properties` with your MySQL username and password.

4\. \*\*Build \& Run:\*\* Run the application from IntelliJ or use `mvn spring-boot:run`.



\## 📂 Project Structure

\* `backend/` - Spring Boot Source Code (src + pom.xml)

\* `database/` - MySQL Schema Script

\* `postman/` - API Collection for testing

\* `screenshots/` - Visual proof of project success



\---

\*\*Developed by Siva Reddy\*\*

