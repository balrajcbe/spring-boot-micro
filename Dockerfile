FROM openjdk:8
ADD target/spring-boot-micro--1.jar spring-boot-micro--1.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","spring-boot-micro--1.jar"]