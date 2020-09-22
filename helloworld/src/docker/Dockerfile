FROM openjdk:8-jdk-alpine

COPY @project.artifactId@.jar /app/@project.artifactId@.jar

ENTRYPOINT ["java","-jar","/app/@project.artifactId@.jar"]