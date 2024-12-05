# Kafka Demonstration

This project demonstrates the use of Kafka in a simple way. It is a simple demonstration of how to use Kafka to send and receive messages.

## Requirements

For building and running the application you need:

- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or later
- [Maven 3](https://maven.apache.org)
- [Docker](https://www.docker.com/products/docker-desktop)
- [Docker Compose](https://docs.docker.com/compose/install/)


## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.rasys.kafkademo.KafkaDemoApplication` class from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:

```shell
mvn spring-boot:run
```

## Running the application with Docker

You can run the application with Docker using the following commands:

```shell
docker build -t kafka-demo .
docker run -p 8080:8080 kafka-demo
```

## Running the application with Docker Compose

You can run the application with Docker Compose using the following commands:

```shell
docker-compose up
```

## Accessing the application

You can access the application at [http://localhost:8080](http://localhost:8080).

## Author

* **Raul Bolivar Navas** - *Initial work* - [Raul Bolivar]()

## License
MIT License