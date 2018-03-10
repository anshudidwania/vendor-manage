package com.manage.vendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class VendorApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(VendorApplication.class, args);
	}	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(VendorApplication.class);
	}
}
