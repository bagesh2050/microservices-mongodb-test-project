# Build a JAR File
FROM maven:3.6.3-jdk-8-slim AS maven
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /build/src/
# -o flag will instruct maven to build on offline mode
RUN mvn package


# Create an Image
FROM openjdk:8-jre-alpine
EXPOSE 5000
COPY --from=maven /build/target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/app.jar"]