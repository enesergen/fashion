package com.enesergen.fashionbackend.fashion.service;

import com.enesergen.fashionbackend.fashion.dto.*;
import org.springframework.stereotype.Service;

@Service
public interface ClothesService {
    public AddClothesResponseDto addClothes(AddClothesRequestDto requestDto);

    public DeleteClothesResponseDto deleteClothes(DeleteClothesRequestDto requestDto);

    public UpdateClothesResponseDto updateClothes(UpdateClothesRequestDto requestDto);

}

