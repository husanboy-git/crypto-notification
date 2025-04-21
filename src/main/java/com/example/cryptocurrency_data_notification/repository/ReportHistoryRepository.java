package com.example.cryptocurrency_data_notification.repository;

import com.example.cryptocurrency_data_notification.entity.ReportHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReportHistoryRepository {
    private final ReportHistoryJpaRepository repository;

    public void save(String market, String price) {

        repository.save(new ReportHistory(market, price));
    }
}
