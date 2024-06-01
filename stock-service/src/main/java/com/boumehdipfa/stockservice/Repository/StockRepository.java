package com.boumehdipfa.stockservice.Repository;

import com.boumehdipfa.stockservice.Model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    List<Stock> findByStockIdIn(List<Long> stockIds);
}
