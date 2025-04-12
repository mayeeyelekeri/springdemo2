
FROM openjdk:18-jdk-alpine
MAINTAINER Mahesh

# Variables, which would be used here 
ARG JAR="springdemo2-1.0.0.jar"

# Default value is "development", could be changed by passing other env 
ENV MY_ENV=development 

CMD echo msg is $JAR
COPY target/springdemo2-1.0.0.jar springdemo2-1.0.0.jar 
#COPY "target/${JAR}"  $JAR 

ENV WELCOME_MESSAGE="message from dockerfile on April 12th 2025" 

ENTRYPOINT ["java","-jar","springdemo2-1.0.0.jar"]
#ENTRYPOINT ["java","-jar","/$JAR"]

