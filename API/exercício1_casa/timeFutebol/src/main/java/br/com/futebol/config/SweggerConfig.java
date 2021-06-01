package br.com.futebol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SweggerConfig {
	
	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(regex("/api.*"))
				.build()
				.apiInfo(info());
	}
	private ApiInfo info() {
		return new ApiInfo(
				"API REST Time de Futebol", 
				"API REST para Jogadores do Time de Futebol", 
				"1.0",
				"Termos de Serviço",
				new Contact("Natan Melo",
						"https://www.linkedin.com/in/natan-melo-03272b70/",
						"natan.tere2012@gmail.com") ,
				"Apache License Version 2.0",
				"https://www.apache.org/licesen.html",
				new ArrayList<VendorExtension>());
	}
}
