FROM openjdk:8-jdk-alpine
EXPOSE 8083
ARG JAR_FILE=order-service-0.0.1-SNAPSHOT.jar
COPY target/${JAR_FILE} order-service.jar
ENTRYPOINT ["java", "-jar", "order-service.jar"]