FROM openjdk:8-jdk-alpine
WORKDIR /app
EXPOSE 8080
ARG JAR_FILE=build/libs/applications-hands.db-init.jar
COPY ${JAR_FILE} /app/handsOnTest.jar
ENTRYPOINT ["java","-jar","/app/handsOnTest.jar"]
