package com.thinkconstructive.rest_demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Cloud Vendor API Application")
						.description("Cloud Vendor Documentation")
						.version("1.0")
						.termsOfService("http://thinkconstructive.com/terms")
						.contact(new Contact()
								.name("Esha Puri")
								.url("http://thinkconstructive.com")
								.email("contact@thinkconstructive.com"))
						.license(new License()
								.name("Think Constructive License")
								.url("http://thinkconstructive.com")));
	}

	@Bean
	public GroupedOpenApi cloudVendorApi() {
		return GroupedOpenApi.builder()
				.group("cloudvendor")
				.pathsToMatch("/cloudvendor/**")
				.packagesToScan("com.thinkconstructive.rest_demo")
				.build();
	}



}
