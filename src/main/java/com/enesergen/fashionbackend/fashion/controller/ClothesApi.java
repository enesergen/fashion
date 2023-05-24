package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.*;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ClothesApi {
    public ResponseEntity<AddClothesResponseDto> addClothes(AddClothesRequestDto requestDto);

    public ResponseEntity<DeleteClothesResponseDto>deleteClothes(DeleteClothesRequestDto requestDto);

    public ResponseEntity<UpdateClothesResponseDto>updateClothes(UpdateClothesRequestDto requestDto);
    public JSONPObject getNyAllClothes(GetMyAllClothesRequestDto requestDto);
    public ResponseEntity<GetOneClothesResponseDto>getOneClohtes(GetOneClothesRequestDto requestDto);
}
