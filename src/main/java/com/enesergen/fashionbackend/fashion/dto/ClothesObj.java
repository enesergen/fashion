package com.enesergen.fashionbackend.fashion.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ClothesObj {
    List<GetMyAllClothesResponseDto> clothes;
}
