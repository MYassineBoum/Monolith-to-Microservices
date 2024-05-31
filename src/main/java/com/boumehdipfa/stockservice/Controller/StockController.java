package com.boumehdipfa.stockservice.Controller;

import com.boumehdipfa.stockservice.Service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/check")
    public void checkStock(@RequestParam Long stockId) {
        stockService.checkStock(stockId);
    }

}
