FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8888

ARG WAR_FILE=/target/*.war

COPY ${WAR_FILE} app.war

RUN echo "Creation of your docker image is in progress, please hold on for a moment"

ENTRYPOINT ["java", "-jar", "app.war"]

MAINTAINER "dibyajyotidjpatra209@gmail.com"
