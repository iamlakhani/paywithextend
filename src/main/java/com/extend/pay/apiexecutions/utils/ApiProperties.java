package com.extend.pay.apiexecutions.utils;

import com.extend.pay.apiexecutions.model.config.ApiProperty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Configuration properties.
 *
 * @author Imran Lakhani
 */
@Component
@ConfigurationProperties(prefix = "extend")
@Data
public class ApiProperties {
    private Map<String, ApiProperty> apis;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}