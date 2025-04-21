package com.example.cryptocurrency_data_notification.http;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SlackHttpClient {
    public void send(String message) {
        try {
            Slack instance = Slack.getInstance();
            Payload payload = Payload.builder()
                    .text(message)
                    .build();
            instance.send("https://hooks.slack.com/services/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", payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
