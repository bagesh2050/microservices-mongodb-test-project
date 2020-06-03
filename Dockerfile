FROM openjdk:8-jdk-alpine
LABEL name="Test Project Server"
LABEL description="Test Project Server Docker Image"
LABEL maintainer="mail.bagesh@gmail.com"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]