package com.example.cryptocurrency_data_notification.service;

import com.example.cryptocurrency_data_notification.http.SlackHttpClient;
import com.example.cryptocurrency_data_notification.http.UpbitHttpClient;
import com.example.cryptocurrency_data_notification.http.UpbitTickerDto;
import com.example.cryptocurrency_data_notification.repository.ReportHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpbitSlackService {
    private final SlackHttpClient slackHttpClient;
    private final UpbitHttpClient upbitHttpClient;
    private final ReportHistoryRepository reportHistoryRepository;

    public void execute(String market) {
        // upbit
        UpbitTickerDto tickerByMarket = upbitHttpClient.getTickerByMarket(market);

        // slack;
        StringBuilder sb = new StringBuilder();
        sb.append("[실시간 데이터] ");
        sb.append(market);
        sb.append(" price = ");
        sb.append(tickerByMarket.getTrade_price());
        slackHttpClient.send(sb.toString());

        reportHistoryRepository.save(market, String.valueOf(tickerByMarket.getTrade_price()));

    }
}
