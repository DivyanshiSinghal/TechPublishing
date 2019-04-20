FROM java:8-jdk-alpine

#RUN \
# Update
#apt-get update -y && \
# Install Java
#apt-get install default-jre -y

ADD ./target/TechPublishing-0.0.1-SNAPSHOT.jar tech.jar

EXPOSE 10001

