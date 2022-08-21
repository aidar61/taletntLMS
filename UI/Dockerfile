#
# Build stage
#
FROM maven:3.8.6-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install "-Dcucumber.options= --tags @goto"
RUN ls -la
WORKDIR /home/app/target
ENTRYPOINT ["java","-jar","my-first-UI-maven-docker.jar"]

#
# Package stage
#
#FROM openjdk:11-jre-slim
#
#COPY --from=build /home/app/target/my-first-UI-maven-docker.jar /usr/local/lib/UI.jar
#WORKDIR /usr/local/lib
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","UI.jar"]
