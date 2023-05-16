package com.enesergen.fashionbackend.fashion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateClothesRequestDto {
    private String username;
    private long clothesId;
    private String clothesType;
    private String color;
}
