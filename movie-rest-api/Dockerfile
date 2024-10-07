FROM openjdk:17-jdk
EXPOSE 8100
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} movie-service.jar
 
ENTRYPOINT ["java", "-jar", "/movie-service.jar"]