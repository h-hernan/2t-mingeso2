package com.example.backendexcelservice.repository;

import com.example.backendexcelservice.entity.Excel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcelRepository extends JpaRepository <Excel, Long> {
}
