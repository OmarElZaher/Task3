# Task 3

To Run Tests:  
In application.properties file, change the value of spring.data.mongodb.uri to mongodb://localhost:27017/  
Then run the following commands:  

```
docker-compose up -d mongo mongo-express
mvn clean install
mvn package
```

Then To Run Dockerized Application:  
In application.properties file, change the value of spring.data.mongodb.uri to mongodb://mongo:27017/  
Then run the following command:
```
docker-compose up -d
```
