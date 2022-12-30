package com.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class MsCivilConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCivilConsumeApplication.class, args);
	}

	@Bean
	public RestTemplate rt()
	{
		RestTemplate re=new RestTemplate();
		return re;
	}
}
