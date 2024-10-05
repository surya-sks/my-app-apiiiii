# Use the official OpenJDK image as the base image
FROM openjdk:22-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the target directory to the container
COPY target/api-my-app.jar api-my-app.jar

# Expose the port your application runs on (update if necessary)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "api-my-app.jar"]
