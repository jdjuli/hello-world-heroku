FROM openjdk:11-jre

COPY target/hello-world-heroku-1.0-SNAPSHOT.jar /opt/webapp.jar

CMD ["java", "-jar", "/opt/webapp.jar"]