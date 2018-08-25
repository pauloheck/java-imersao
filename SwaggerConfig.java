package br.com.tt.app20projeto01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		Docket docket = 
			new Docket(DocumentationType.SWAGGER_2);
		Predicate<RequestHandler> apis = 
				RequestHandlerSelectors.basePackage
					("br.com.tt.app20projeto01.api");
		return 	 docket.select().apis(apis).build();


	}

}
