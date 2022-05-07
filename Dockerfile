FROM openjdk:11
EXPOSE 8085
ADD Springbootapp-DB/target/SpringbootApp-DB.war SpringbootApp-DB.war
ENTRYPOINT ["java","-war","/SpringbootApp-DB.war"]