package com.onrcnk.bookStore.dto.bookDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListPrice {

    private double amount;
    private String currencyCode;
}
