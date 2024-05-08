package com.boumehdipfa.orderservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemsTotalRequest {

    private Long id;
    private BigDecimal totalPrice;
    private Integer quantity;

}
