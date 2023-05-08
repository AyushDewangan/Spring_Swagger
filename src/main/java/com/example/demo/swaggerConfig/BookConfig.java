package com.example.demo.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
//@Component
@EnableWebMvc
@EnableSwagger2
public class BookConfig {
	@Bean
//	public Docket postsApi() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("Swagger_Test").apiInfo(apiInfo()).select()
//				.paths(regex("/book/*")).build();
//	}
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Swagger_Test").apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.any()).paths(regex(("/book/*"))).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Service")
				.description("Sample Documentation Generateed Using SWAGGER2 for our Book Rest API")
				.termsOfServiceUrl("https://www.google.com")
				.license("Swagger_Test")
				.licenseUrl("https://www.google.com")
				.version("1.0").build();
	}
}
