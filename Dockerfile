FROM maven:3.9.2-openjdk-22-slim AS builder

WORKDIR /app
COPY . .
RUN ./mvnw clean package

FROM openjdk:22-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/api-my-app.jar api-my-app.jar

EXPOSE 8080
CMD ["java", "-jar", "api-my-app.jar"]
