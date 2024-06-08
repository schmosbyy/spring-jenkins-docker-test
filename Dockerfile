FROM openjdk:17
EXPOSE 8080
ADD out/artifacts/spring_jenkins_docker_test_jar/spring-jenkins-docker-test.jar spring-jenkins-docker-test.jar
ENTRYPOINT["java","-jar","spring-jenkins-docker-test.jar"]