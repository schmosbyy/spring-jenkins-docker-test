package com.example.spring_jenkins_docker_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDockerTestApplication.class, args);
		System.out.println("hello world");
	}

}
