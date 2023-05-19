package com.enesergen.fashionbackend.fashion.dto;

import com.enesergen.fashionbackend.fashion.entity.Weather;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MakeCombineRequestDto {
    private Weather weather;
    private String username;
}
