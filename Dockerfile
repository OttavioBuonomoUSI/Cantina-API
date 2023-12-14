# Create docker image for the application
FROM openjdk:17
VOLUME /tmp
EXPOSE 9000
COPY config config
ARG JAR_FILE=target/cantina_api-0.0.1.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/Users/ottavio/env.properties", "-jar","/app.jar"]