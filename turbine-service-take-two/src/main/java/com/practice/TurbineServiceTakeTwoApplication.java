package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
public class TurbineServiceTakeTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineServiceTakeTwoApplication.class, args);
	}
}
