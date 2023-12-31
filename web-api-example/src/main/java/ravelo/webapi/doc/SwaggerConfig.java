package ravelo.webapi.doc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato(){
        return  new Contact(
                "Seu nome",
                "https://www.seusite.com.br",
                "you@seusite.com.br"

        );
    }

    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("Rest-Api");
        apiInfoBuilder.description("Exemplo de uso de Spring Boot Rest API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInfoBuilder.license("License: Sua Empresa");
        apiInfoBuilder.licenseUrl("http://www.oswaldoravelo.com");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }

    @Bean
    public Docket detalheApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("ravelo.webapi.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(List.of("application/json")))
                .produces(new HashSet<String>(List.of("application/json")));
        return docket;
    }

}
