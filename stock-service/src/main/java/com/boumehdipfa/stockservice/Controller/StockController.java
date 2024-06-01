package com.boumehdipfa.stockservice.Controller;

import com.boumehdipfa.stockservice.DTO.StockResponse;
import com.boumehdipfa.stockservice.Service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/check")
    public List<StockResponse> checkStock(@RequestParam List<Long> stockIds) {
        return stockService.checkStock(stockIds);
    }

}
