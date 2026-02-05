FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY ./build/libs/*.jar /app/mapbuilder_backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/mapbuilder_backend.jar"]