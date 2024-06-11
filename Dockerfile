FROM maven AS build
WORKDIR /app
COPY src /app/src
COPY pom.xml /app
RUN mvn clean package -Dmaven.test.skip

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
