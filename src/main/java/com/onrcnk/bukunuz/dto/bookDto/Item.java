package com.onrcnk.bukunuz.dto.bookDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item{
    private String id;
    private VolumeInfo volumeInfo;
    private SaleInfo saleInfo;

}
