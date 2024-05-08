package com.boumehdipfa.orderservice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "total_items")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class ItemsTotal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal totalPrice;
    private Integer quantity;

}
