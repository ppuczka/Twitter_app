FROM java:8-jdk-alpine

COPY ./target/twitter_app-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar", "twitter_app-0.0.1-SNAPSHOT.jar"]