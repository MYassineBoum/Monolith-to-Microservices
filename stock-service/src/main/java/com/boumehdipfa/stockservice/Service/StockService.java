package com.boumehdipfa.stockservice.Service;

import com.boumehdipfa.stockservice.DTO.StockResponse;
import com.boumehdipfa.stockservice.Repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockService {

    private final StockRepository stockRepository;

    public List<StockResponse> checkStock(List<Long> stockIds) {
        return stockRepository.findByStockIdIn(stockIds)
                .stream()
                .map(stock ->
                        StockResponse.builder()
                                .stockId(stock.getStockId())
                                .isAvailable(stock.getQuantity() > 0)
                                .build()
                )
                .toList();
    }

}
