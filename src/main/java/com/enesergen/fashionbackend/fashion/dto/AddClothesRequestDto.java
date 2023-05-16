package com.enesergen.fashionbackend.fashion.dto;

import com.enesergen.fashionbackend.fashion.entity.ClotheType;
import com.enesergen.fashionbackend.fashion.entity.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddClothesRequestDto {
    private String username;
    private String clothesType;
    private String url;
    private String color;

}
