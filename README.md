# Spring Boot Starter
A simple introductory application demonstrating use of Spring Boot Framework integarted with Hibernate.

## Prerequisits 
- Java 11
- Spring Boot 2.3.9
- Maven 0.28.0

## Development
- Clone the repo:
  ```bash
  $ https://github.com/avani1998/spring-boot-starter.git 
  ```
- In Visual Studio Code open the project directory and install the dependencies

- Run the application

- Check the status of the application using http://localhost:8080/actuator/health. Should display ```{"status":"UP"}```

- Open http://localhost:8080/h2-console. Note the JDBC URL. If you have used Spring Boot H2 the first time, you might see a different URL.In such a case, change it to ```jdbc:h2:mem:testdb``` Leave the password and username fields as default values and click **Connect** to view **h2 console** view.

- Query data using 
  ```mysql
  SELECT * FROM VEHICLE;
  ```

## Credits
[ProgressiveCoder](http://progressivecoder.com/the-anatomy-of-a-spring-boot-application/)
