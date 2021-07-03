FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-fib-docker.jar spring-boot-fib-docker.jar 
ENTRYPOINT ["java", "-jar", "/spring-boot-fib-docker.jar"]