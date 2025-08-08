FROM openjdk:17-jdk-slim
ARG JAR_FILE=service/target/discount-server-*.jar
COPY ${JAR_FILE} app.jar

LABEL org.opencontainers.image.source https://github.com/sebeib/discount-server

ENTRYPOINT ["java","-jar","/app.jar"]