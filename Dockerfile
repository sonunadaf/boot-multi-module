FROM java:8
EXPOSE 8080
ADD application/target/application-0.0.1-SNAPSHOT.jar application-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","application-0.0.1-SNAPSHOT.jar"]