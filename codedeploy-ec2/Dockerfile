FROM openjdk:18-jdk-alpine
MAINTAINER Mahesh

# Default value is "development", could be changed by passing other env 
ENV WELCOME_MESSAGE="Hi, msg from Dockerfile" 

COPY springdemo2-1.0.0.jar springdemo2-1.0.0.jar

ENTRYPOINT ["java","-jar","/springdemo2-1.0.0.jar"]

