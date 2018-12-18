package com.test.hystrixdashborad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
@EnableTurbineStream
public class HystrixDashboradApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboradApplication.class, args);
	}
}
