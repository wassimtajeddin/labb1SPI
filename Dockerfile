FROM maven:3.9.1-eclipse-temurin-20 as build

COPY . /app
WORKDIR /app
RUN mvn clean package

FROM eclipse-temurin:20-jdk

COPY --from=build /app/consumer/target/*.jar /app/consumer.jar
COPY --from=build /app/provider/target/*.jar /app/provider.jar
COPY --from=build /app/service/target/*.jar /app/service.jar

ENTRYPOINT java -jar --module-path /app:/app/service.jar:/app/provider.jar -m org.example.consumer/org.example.consumer.Consumer

