FROM openjdk:8-jre-slim

ENV USER=appuser UID=100 GID=1000

RUN addgroup -gid ${GID} ${USER} \
	&&adduser \
	${USER}

RUN apk add maven

RUN mkdir CucumberJava

User Root

Copy --chown =$USER:USER

WORKDIR /regression-test/CucumberJava

Run sed -i -e 's/\r$//' /regression-test/CucumberJava/runPach.sh &&/
	chmod 755 //regression-test/CucumberJava/* && \
	chmod -R $USER:USER /regression-test/CucumberJava/*

USER $USER

CMD /regression-test/CucumberJava/runPack.sh
