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
    private long userId;
    private String clotheType;
    private String url;
    private String color;

}
