# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="Lavanya.Ramakrishnan@publicissapient.com"

# Add a volume pointing to /tmp
VOLUME /tmp

<<<<<<< HEAD
EXPOSE 443

# The application's jar file
ARG JAR_FILE=target/pension-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} pension.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/pension.jar","-Dspring.profiles.active=staging"]


