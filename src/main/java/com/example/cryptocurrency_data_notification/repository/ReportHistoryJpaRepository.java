package com.example.cryptocurrency_data_notification.repository;

import com.example.cryptocurrency_data_notification.entity.ReportHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportHistoryJpaRepository extends JpaRepository<ReportHistory, Integer> {
}
