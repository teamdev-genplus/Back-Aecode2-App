FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/aecode-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} aecode.jar
ENTRYPOINT ["java","-jar","/aecode.jar"]
