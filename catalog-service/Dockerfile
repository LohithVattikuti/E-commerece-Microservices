FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY pom.xml .
RUN mvn -q -e -DskipTests dependency:go-offline || true
COPY src ./src
RUN mvn -q -DskipTests package
EXPOSE 8081
CMD ["java","-jar","target/catalog-service-0.0.1-SNAPSHOT.jar"]
