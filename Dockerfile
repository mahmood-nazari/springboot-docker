FROM openjdk:21-slim-buster
WORKDIR /apps
EXPOSE 8030
COPY ./target/springdocker*.jar /apps/springdocker.jar
ENTRYPOINT ["java","-jar","/apps/springdocker.jar"]