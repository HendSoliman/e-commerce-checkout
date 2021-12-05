# Spring Boot Application /elmenus e-commerce checkout process

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* [H2 In memory Databse ] 
* [git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)
* [Swagger](https://swagger.io/) - Open-Source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.
http://localhost:8080/swagger-ui.html#/
* [Lombok] https://projectlombok.org/


## Applied Mechanism
![alt text](https://github.com/HendSoliman/e-commerce-checkout/blob/main/Checkout.PNG?raw=true)
Swagger file : https://github.com/HendSoliman/e-commerce-checkout/blob/main/src/main/resources/api-docs.json
swagger view : https://github.com/HendSoliman/e-commerce-checkout/blob/main/swagger-view.PNG?raw=true
## Done
DB Schema at https://github.com/HendSoliman/e-commerce-checkout/blob/a2d5bf825ae7117d551f9f1c9fdd1279209e5460/E-commerce-db.PNG?raw=true
- [x] Spring Boot Application implement a multilayered architecture - Domain-Driven Design (DDD)
- [x] RESTful Web Service (CRUD)
- [x] Apply Design pattern (Builder, Factory , )
- [x] Logger (Console, File)

## To-DO
- [ ] Integrate with a credit card payment tool to deduct the money from the customer credit card. service layer is ready and to integrate with *https://stripe.com/ 
- [ ] Unit testing for each layer & integration testing for each endpoint.



## Running the application locally [Backend]

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in theclass from your IDE.
## For The First Time Run
* on application property of your profile to create tables  in the first load
```shell
spring.jpa.hibernate.ddl-auto=create-drop
```
to create lookups in the first load
```shell
spring.datasource.initialization-mode=always
```
then change properties to be 
```shell
then spring.jpa.hibernate.ddl-auto=update
```
```shell
spring.datasource.initialization-mode=never
```
## HOW To RUN 
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application
- go through http://localhost:8080/h2-console  to access DB 

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Running the application locally [frontEnd]

```shell
npm install
```
```shell
npm run serve
```

## Documentation
*  [Swagger](https://swagger.io/) - Documentation & Testing    with common-documents api folder
*  [sonarlint](https://www.sonarlint.org/)detect and fix quality issues as you write code.

"# e-commerce-checkout" 
