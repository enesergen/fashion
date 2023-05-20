package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface ClothesApi {
    public ResponseEntity<AddClothesResponseDto> addClothes(AddClothesRequestDto requestDto);

    public ResponseEntity<DeleteClothesResponseDto>deleteClothes(DeleteClothesRequestDto requestDto);

    public ResponseEntity<UpdateClothesResponseDto>updateClothes(UpdateClothesRequestDto requestDto);
    public ResponseEntity<List<GetMyAllClothesResponseDto>>getNyAllClothes(GetMyAllClothesRequestDto requestDto);
    public ResponseEntity<GetOneClothesResponseDto>getOneClohtes(GetOneClothesRequestDto requestDto);
}
