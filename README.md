# day11-workshop

## Spring Boot Introduction
1. Clean up maven project (Good practice to clean artifacts before running maven)
```
mvn clean
```
2. Running maven (includes compile and package)
```
mvn spring-boot:run
```
3. Configure springboot port with arguments
```
mvn spring-boot:run -Dspring-boot.run.arguments=--port=3000
```

## Deploying to railway

4. Login to railway
```
railway login
```
5. create new project in railway
```
railway init
```
6. deploy project (Ensure already in project directory)
```
railway up
```
7. alternate method to deploy (Link to Github)
```
Use browser to select Github option
```

## Creating spring project
1. initiate project structure with initialiser https://start.spring.io/
2. 