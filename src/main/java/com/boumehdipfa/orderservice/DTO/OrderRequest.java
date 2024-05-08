package com.boumehdipfa.orderservice.DTO;

import com.boumehdipfa.orderservice.Model.ItemsTotal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderRequest {

    private List<ItemsTotalRequest> totalItems;

}
