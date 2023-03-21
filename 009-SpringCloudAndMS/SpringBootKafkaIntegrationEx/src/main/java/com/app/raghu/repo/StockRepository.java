package com.app.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.raghu.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer>{

}
