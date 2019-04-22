FROM java:8-jdk-alpine


COPY ./target/TechPublishing-0.0.1-SNAPSHOT.war /usr/app/
WORKDIR /usr/app


