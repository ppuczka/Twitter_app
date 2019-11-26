FROM java:8-jdk-alpine

COPY ./target/twitter_app-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch target/twitter_app-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar", "twitter_app-0.0.1-SNAPSHOT.jar"]