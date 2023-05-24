package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.*;
import com.enesergen.fashionbackend.fashion.service.ClothesService;
import com.enesergen.fashionbackend.fashion.service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class ClothesController implements ClothesApi {
    private final UserService userService;
    private final ClothesService clothesService;

    @PostMapping("/clothes")
    @Override
    public ResponseEntity<AddClothesResponseDto> addClothes(@RequestBody AddClothesRequestDto requestDto) {
        return ResponseEntity.ok(clothesService.addClothes(requestDto));
    }


    @DeleteMapping("/clothes")
    @Override
    public ResponseEntity<DeleteClothesResponseDto> deleteClothes(@RequestBody DeleteClothesRequestDto requestDto) {
        return ResponseEntity.ok(clothesService.deleteClothes(requestDto));
    }

    @PutMapping("/clothes")
    @Override
    public ResponseEntity<UpdateClothesResponseDto> updateClothes(@RequestBody UpdateClothesRequestDto requestDto) {
        return ResponseEntity.ok(clothesService.updateClothes(requestDto));
    }

    @Override
    @PutMapping("/clothes/getAll")
    public JSONPObject getNyAllClothes(@RequestBody GetMyAllClothesRequestDto requestDto) {
        return new JSONPObject("data", clothesService.getMyAllClothes(requestDto));
    }

    @PutMapping("/clothes/getOne")
    @Override
    public ResponseEntity<GetOneClothesResponseDto> getOneClohtes(@RequestBody GetOneClothesRequestDto requestDto) {
        return ResponseEntity.ok(clothesService.getOneClothes(requestDto));
    }
}
