# spring-boot-starter
A simple application demonstrating use of Spring Boot and Hiberhate. 

## Requirements 
- Java (11)
- Spring Boot 2.3.9
- Maven 

## Development
- Clone the repo:
```$ https://github.com/avani1998/spring-boot-starter.git ```
- In VS Code open project directory and install dependencies
- Run the application.
- Check the status of the application using ```http://localhost:8080/actuator/health```. Should display ```{"status":"UP"}```
- Open (http://localhost:8080/h2-console). Note the JDBC URL.If you have used Spring Boot H2 the first time, you might see a different URL.In such a case, change it to ```jdbc:h2:mem:testdb``` Leave the password and username fields as default values.

## Credits
[ProgressiveCoder](http://progressivecoder.com/the-anatomy-of-a-spring-boot-application/)
