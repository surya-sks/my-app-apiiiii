FROM openjdk:22-jdk-slim AS builder

# Install Maven
RUN apt-get update && apt-get install -y maven

WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:22-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/api-my-app.jar api-my-app.jar

EXPOSE 8080
CMD ["java", "-jar", "api-my-app.jar"]
