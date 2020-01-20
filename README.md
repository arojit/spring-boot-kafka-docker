# spring-boot-kafka-docker
The idea is to capture user activity logs into a MySQL database, having three different containers for MySQL, Kafka, and ZooKeeper.

**Tools and Techniques**
```
Java Spring Boot, JPA-Hibernate, Rest APIs, Docker, MySQL, Kafka
```

**prerequisite**
```
Docker
git
```

**Run the following commands for setting up MYSQL in your machine as a docker container.**
```
> git clone https://github.com/arojit/spring-boot-kafka-docker.git
> cd tech-mantra
> docker-compose up 
     or 
> docker-compose up -d
>java -jar build/libs/tech-mantra-0.0.1-SNAPSHOT.jar
```
**Available APIs**
```
1.Add User to MySQL

POST http://localhost:8085/user/add-user
Request Body 
  {
    "email": "ghosh.ari6@gmail.com",
    "phoneNumber": 8906653242
  }

2. Add User Activity Log

POST http://localhost:8085/user/user-activity
Request Body
  {
    "user":{
      "email": "ghosh.ari6@gmail.com"
    },
    "activity": "Visit Page 1"
  }
```