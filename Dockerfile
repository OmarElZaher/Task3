FROM openjdk:25-ea-4-jdk-oraclelinux9

WORKDIR /app

COPY ./target/ target/

ENV FirstName="Omar"
ENV LastName="ElZaher"
ENV Instance="Instance"

EXPOSE 8080

# We change the name of the build file into task3 in pom.xml
ENTRYPOINT ["java", "-jar", "target/task3.jar"]