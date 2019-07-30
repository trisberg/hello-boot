package com.example.helloboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(prefix="app")
public class HelloBootAppConfig {

	private String message = "Boot";

	private String test = "$ecret";

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTest() {
		return this.test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}
