package com.boumehdipfa.stockservice.Service;

import com.boumehdipfa.stockservice.Repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockService {

    private final StockRepository stockRepository;

    public void checkStock(Long stockId) {
        stockRepository.findById(stockId).orElseThrow(() -> new RuntimeException("Item not found in stock !"));
    }

}
