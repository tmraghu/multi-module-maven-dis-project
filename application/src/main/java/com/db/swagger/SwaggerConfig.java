package com.db.swagger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  //    public static final Contact DEFAULT_CONTACT =
  //            new Contact("raghu", "http://www.gmail.com",
  // "in28minutes@gmail.com");

  public static final ApiInfo DEFAULT_API_INFO =
      new ApiInfo(
          "New API Title",
          "New API Description",
          "1.0",
          "urn:tos",
          "Raghu",
          "Apache 2.0",
          "http://www.apache.org/licenses/LICENSE-2.0");

  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES =
      new HashSet(Arrays.asList("application/json", "application/xml"));

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(DEFAULT_API_INFO)
        .produces(DEFAULT_PRODUCES_AND_CONSUMES)
        .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
  }
}
