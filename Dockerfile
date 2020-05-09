FROM tomcat:latest
ADD target/devopsDemo.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8885
RUN sed -i 's/port="8080"/port="8885"/' /usr/local/tomcat/conf/server.xml
RUN echo "I am creating an docker image for my spring boot application"
MAINTAINER "dibyajyotidjpatra209@gmail.com"
CMD ["catalina.sh", "run"]
