FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY /var/jenkins_home/workspace/docker-ci-pipeline/target/serviceA-0.0.1-SNAPSHOT.jar serviceA-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/app/serviceA-0.0.1-SNAPSHOT.jar"]