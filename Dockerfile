FROM java:8-jdk-alpine


ADD ./target/TechPublishing-0.0.1-SNAPSHOT.war  tech.war
ENTRYPOINT ["java","-jar","tech.war"]


