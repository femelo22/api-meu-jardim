FROM openjdk:11
COPY target/meu-jardim-1.0.jar /app/meu-jardim.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "meu-jardim.jar"]
