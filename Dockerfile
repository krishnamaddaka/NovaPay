FROM eclipse-temurin:25-jdk-alpine

WORKDIR /app

COPY target/NovaPay-0.0.1-SNAPSHOT.jar NovaPay.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "NovaPay.jar"]