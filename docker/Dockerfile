FROM eclipse-temurin:21-jre-alpine AS BUILD_IMAGE

COPY --from=BUILD_IMAGE  serviceA/target/serviceA-0.0.1-SNAPSHOT.jar serviceA-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","serviceA-0.0.1-SNAPSHOT.jar"]