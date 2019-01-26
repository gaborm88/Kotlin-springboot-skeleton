FROM java:8

VOLUME /tmp

ADD kotlin-springboot-skeleton-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=prod", "-jar","/app.jar"]
