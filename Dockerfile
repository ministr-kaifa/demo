FROM maven
WORKDIR /app
COPY src /app/src
COPY pom.xml /app
CMD [ "mvn", "spring-boot:run" ] 
