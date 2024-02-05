FROM maven:3.8.5-openjdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM adoptopenjdk:11-jre-hotspot
COPY --from=build /target/blogpessoal-0.0.1-SNAPSHOT.jar blogpessoal.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]