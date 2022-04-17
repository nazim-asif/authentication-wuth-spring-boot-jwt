package com.sha.springbootauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootDeviceSellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeviceSellerApplication.class, args);
	}

}
