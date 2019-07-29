package com.example.helloboot;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EnableScheduling
@SpringBootApplication
public class HelloBootApplication {

	private static Logger logger = LoggerFactory.getLogger(HelloBootApplication.class);

	@Autowired
	ContextRefresher refresher;

	@Scheduled(fixedRate = 60000, initialDelay = 120000)
	void refreshBeans() {
		logger.info("Refreshing @RefreshScope sources: ");
		Set<String> r = refresher.refresh();
		logger.info("Sources refreshed:" + r);
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloBootApplication.class, args);
	}
}
