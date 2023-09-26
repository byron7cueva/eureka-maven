ARG profiles_default=default

FROM busybox:1.35.0-uclibc as busybox
FROM gcr.io/distroless/java17-debian11
#FROM amazoncorretto:17-alpine

ENV TZ ${TZ}

# Default to UTF-8 file.encoding
ENV LANG C.UTF-8

ARG profiles_default
ARG app
ENV SPRING_PROFILES_ACTIVE=$profiles_default
ENV APP=$app

# Copy the static shell into base image.
COPY --from=busybox /bin/sh /bin/sh

# Copy all necessary executables into distroless image.
COPY --from=busybox /bin/chmod /bin/chmod

WORKDIR /app
COPY ../$APP/target/*.jar ./app.jar

# Copy shell executable
COPY /docker/start.sh ./start.sh
RUN chmod +x ./start.sh

#CMD ["sh","/app/start.sh"]
ENTRYPOINT ["/bin/sh", "/app/start.sh"]