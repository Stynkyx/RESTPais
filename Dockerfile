FROM openjdk:11
VOLUME /tmp
ADD ./target/RESTPais-1.0.jar rest-pais.jar
ENTRYPOINT ["java","-jar","/rest-pais.jar"]