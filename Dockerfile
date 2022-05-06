FROM openjdk:11
LABEL maintainer="Arjuna Rajasekhar"
ADD target/SpringbootApp-DB-0.0.1-SNAPSHOT.war SpringbootApp-DB-0.0.1-SNAPSHOT.war
EXPOSE 8085
ENTRYPOINT ["java","-war","SpringbootApp-DB-0.0.1-SNAPSHOT.war"]