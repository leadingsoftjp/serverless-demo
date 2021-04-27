#!/bin/bash

exec java $JAVA_OPTS \
  -Djava.security.egd=file:/dev/./urandom \
  --illegal-access=deny \
  -jar /apps/app.jar
