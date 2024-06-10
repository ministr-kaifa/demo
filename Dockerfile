FROM maven AS build
WORKDIR /app
COPY src /app/src
COPY pom.xml /app

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar
CMD ["java", "-jar", "demo.jar"]
