FROM adoptopenjdk/openjdk11:jre

COPY target/*.jar /apps/app.jar
COPY ./entrypoint.sh /
RUN chmod +x /entrypoint.sh
VOLUME /apps

CMD ["/entrypoint.sh"]
