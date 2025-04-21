package com.example.cryptocurrency_data_notification.config;

import com.example.cryptocurrency_data_notification.exception.UpbitClientException;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        try {
            return builder
                    .setConnectTimeout(Duration.of(5, ChronoUnit.SECONDS))
                    .setReadTimeout(Duration.of(5, ChronoUnit.SECONDS))
                    .build();
        } catch (RestClientException e) {
            throw new UpbitClientException(e.getMessage());
        }

    }
}
