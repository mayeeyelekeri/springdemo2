FROM openjdk:18-jdk-alpine
MAINTAINER Mahesh

# Default value is "development", could be changed by passing other env 
ENV MY_ENV=development 

COPY target/springdemo2-1.0.0-SNAPSHOT.jar springdemo2-1.0.0-SNAPSHOT.jar

ENV WELCOME_MESSAGE="message from dockerfile" 

ENTRYPOINT ["java","-jar","/springdemo2-1.0.0-SNAPSHOT.jar"]

