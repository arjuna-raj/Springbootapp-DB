FROM openjdk:11
EXPOSE 8085
ADD target/SpringbootApp-DB.war SpringbootApp-DB.war
ENTRYPOINT ["java","-war","SpringbootApp-DB-0.0.1-SNAPSHOT.war"]