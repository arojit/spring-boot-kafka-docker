# spring-boot-kafka-docker
Storing user activity log

**prerequisite**
```
Docker
```

**Run the following three commands for setting up MYSQL in your machine as a docker container.**
```
docker pull mysql/mysql-server
docker run --name=mysql-docker -e MYSQL_USER=arojit -e MYSQL_ROOT_PASSWORD=root -e MYSQL_PASSWORD=root -e MYSQL_DATABASE=techmantra -d mysql/mysql-server
```

**You can login to the mysql by running the following command**
```
docker exec -it mysql-docker mysql -u arojit -p
```
