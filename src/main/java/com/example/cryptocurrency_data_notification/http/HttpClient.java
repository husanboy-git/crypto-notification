package com.example.cryptocurrency_data_notification.http;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class HttpClient {
    private final RestTemplate restTemplate;

    public String execute(String url, HttpMethod method, HttpHeaders headers) {
        return restTemplate.exchange(
                url,
                method,
                new HttpEntity<>(headers),
                new ParameterizedTypeReference<String>() {
        }).getBody();
    }
}
