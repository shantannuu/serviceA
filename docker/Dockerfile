FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY serviceA/target/serviceA-0.0.1-SNAPSHOT.jar serviceA-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","serviceA-0.0.1-SNAPSHOT.jar"]