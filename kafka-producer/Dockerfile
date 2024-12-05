# Imagen base de Maven con OpenJDK 17
FROM maven:3.8.5-openjdk-17 AS builder

# Establece el directorio de trabajo
WORKDIR /kafka-producer

# Copia el proyecto al contenedor
COPY . .

# Construye el paquete de la aplicación
RUN mvn clean package -DskipTests

# Crea una nueva etapa para un contenedor más liviano
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el artefacto generado en la etapa anterior
COPY --from=builder /kafka-producer/target/*.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "app.jar"]
