package com.enesergen.fashionbackend.fashion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordResponseDto {
    private boolean isPasswordChanged;
    private String message;
}
