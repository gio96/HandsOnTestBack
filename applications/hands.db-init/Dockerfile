#FROM openjdk:8-jdk-alpine
#FROM anapsix/alpine-java:8
#WORKDIR /app
#COPY build/libs/applications-clean.db-init.jar /app/app.jar
##Puerto por el cual se hara las peticiones
#EXPOSE 8080
##le dice a docker que debe ejecutar cuando se levante
#CMD java -jar /app/app.jar

#FROM anapsix/alpine-java:8
#WORKDIR /app
## exponer puerto desde el contenedor
#EXPOSE 8080
#
#RUN gradlew build
#
## The application's jar file
#ARG JAR_FILE=build/libs/applications-clean.db-init.jar
#
## Add the application's jar to the container
#COPY ${JAR_FILE} /app/correrias-api.jar
#
## Run the jar file
##ENTRYPOINT exec java $JVM_OPTS -jar /app/correrias-api.jar
#CMD java -jar /app/correrias-api.jar

FROM openjdk:8-jdk-alpine
WORKDIR /app
EXPOSE 8080
## deberia correr gradlew build
#RUN gradlew build --no-daemon
ARG JAR_FILE=build/libs/applications-clean.db-init.jar
COPY ${JAR_FILE} /app/correriasprueba.jar
ENTRYPOINT ["java","-jar","/app/correriasprueba.jar"]
