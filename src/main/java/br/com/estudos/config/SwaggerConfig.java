package br.com.estudos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/api/**"))
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfo(
                "Notification API",                                                                 // Nome da API
                "API para gerenciamento e envio de notificações, como email, push entre outros",    // Descrição
                "1.0",                                                                              // Versão
                "",                                                                                 // URL de Termos de uso
                new Contact("React-it Solutions", "https://react-it.com", "contact@react-it.com"),  // Contato
                "React-it Solutions",                                                               // Licensa
                "https://react-it.com",                                                             // URL de licensa
                Collections.emptyList()                                                             // Extensão de fornecedores
        );
    }
}
