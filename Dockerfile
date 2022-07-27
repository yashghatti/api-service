FROM gradle:7.4.2-jdk11-alpine

COPY ./ /home/api
WORKDIR /home/api

RUN gradle clean bootJar

EXPOSE 8080/tcp

ENTRYPOINT /opt/java/openjdk/bin/java -jar "./build/libs/api-1.0.0.jar"