package com.enesergen.fashionbackend.fashion.dto;

import com.enesergen.fashionbackend.fashion.entity.ClotheType;
import com.enesergen.fashionbackend.fashion.entity.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetOneClothesResponseDto {
    private long clothesId;
    private ClotheType clotheType;
    private Color color;
}
