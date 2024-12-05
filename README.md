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

## Create Topic

You can create a topic using the following command:

```shell
docker exec -it kafka bash
kafka-topics.sh --bootstrap-server localhost:9092 --create --topic my_first_topic --partitions 1 --replication-factor 1

// List topics
kafka-topics.sh --bootstrap-server localhost:9092 --list
```

## Send Message

You can send a message to a topic using the following command:

```shell
docker exec -it kafka bash
kafka-console-producer.sh --topic my_first_topic --bootstrap-server localhost:9092
```

## Consumer List

You can receive a message from a topic using the following command:

```shell
docker exec -it kafka bash
kafka-consumer-groups.sh --list --bootstrap-server localhost:9092
kafka-consumer-groups.sh --describe --group console-consumer-70207 --bootstrap-server localhost:9092
```

## Partition Modification

You can modify the number of partitions of a topic using the following command:

```shell
docker exec -it kafka bash
kafka-topics.sh --bootstrap-server localhost:9092 --alter --topic my_first_topic --partitions 3
```

## Consumer Group

You can create a consumer group using the following command:

```shell
docker exec -it kafka bash
kafka-console-consumer.sh --topic my_first_topic --bootstrap-server localhost:9092 --group my_first_group
```

## UI for Apache Kafka

You can access the UI for Apache Kafka at [http://localhost:7000](http://localhost:7000).


## Reading Messages

You can read messages from a topic using the following command:

```shell
docker exec -it kafka bash
kafka-console-consumer.sh --topic my_first_topic --bootstrap-server localhost:9092
```

## Test the application Producer and Consumer Microservices

You can test the application using the following commands:

For the producer microservice:

```shell
docker exec -it kafka kafka-console-producer --broker-list localhost:29092 --topic test-topic
```

For the consumer microservice:

```shell
docker exec -it kafka kafka-console-consumer --bootstrap-server localhost:29092 --topic test-topic --from-beginning
```

## Author

* **Raul Bolivar Navas** - *Initial work* - [Raul Bolivar]()

---
## License
MIT License