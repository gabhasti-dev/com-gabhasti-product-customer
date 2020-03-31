FROM openjdk:8-jre

MAINTAINER Marsh Dsilva , dsilvamarsh@gmail.com

ARG JAR_FILE=target/*.jar 

WORKDIR /app

COPY ${JAR_FILE} com-gabhasti-product-customer.jar

ENTRYPOINT ["java", "-jar" , "com-gabhasti-product-customer.jar"]

