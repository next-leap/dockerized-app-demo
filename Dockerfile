#
# Build stage
#
FROM maven:3.9.1 AS build
WORKDIR /app
COPY . .
RUN mvn clean package spring-boot:repackage

#
# Package stage
#
FROM openjdk:15-jdk-alpine
WORKDIR /app
COPY --from=build /app .
EXPOSE 8080
ENTRYPOINT ["java", "-jar","target/DockerDemo-0.0.1-SNAPSHOT.jar"]