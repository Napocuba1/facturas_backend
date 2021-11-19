FROM maven:3.8.3-openjdk-17-slim as build
RUN mkdir -p /home/app/src
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


FROM openjdk:17-jdk-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]