package com.msrdevxpert.msrDevXpertpProfile;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "MSR Dev Xpert API",
                version = "1.0.0",
                description = "API documentation for the company profile system",
                contact = @Contact(
                        name = "Support Team",
                        email = "msrdevxpert@gmail.com",
                        url = "https://msrdevxpert.netlify.app/"
                )
        )
)
@Configuration
public class OpenAPIConfig {
}

