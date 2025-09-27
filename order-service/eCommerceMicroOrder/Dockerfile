# ---------- build stage ----------
FROM eclipse-temurin:25-jdk AS build

WORKDIR /app

# Maven wrapper és pom bemásolása
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Dependency cache
RUN chmod +x mvnw && ./mvnw -B dependency:go-offline

# Forrás bemásolása és build
COPY src src
RUN ./mvnw -B clean package -DskipTests

# ---------- runtime stage ----------
FROM eclipse-temurin:25-jre

WORKDIR /app

# csak a kész jar másolódik át
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
