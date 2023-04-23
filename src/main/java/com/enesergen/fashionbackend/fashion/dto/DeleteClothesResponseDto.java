package com.enesergen.fashionbackend.fashion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteClothesResponseDto {
    private boolean isDelete;
    private String message;
}
