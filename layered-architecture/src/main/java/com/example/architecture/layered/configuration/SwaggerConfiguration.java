package com.example.architecture.layered.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@RequiredArgsConstructor
@Configuration(proxyBeanMethods = false)
public class SwaggerConfiguration {

  @Bean
  public OpenAPI publicApi(@Value("${server.port}") Integer port) {
    final String securitySchemeName = "Access token";
    return new OpenAPI()
        .info(apiInfo())
        .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
        .components(
            new Components()
                .addSecuritySchemes(securitySchemeName,
                    new SecurityScheme()
                        .name(securitySchemeName)
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("bearer")
                )
        )
        .servers(servers(port));
  }

  private List<Server> servers(Integer port) {
    Server local = new Server();
    local.setUrl("http://localhost:" + port);
    return List.of(local);
  }

  private Info apiInfo() {
    return new Info().title("Application")
        .description("APIs")
        .version("1.0.0")
        .contact(new Contact().name("Sean Do").email("quangdtptit@gmail.com"));
  }

}
