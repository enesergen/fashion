package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.*;
import com.enesergen.fashionbackend.fashion.service.ClothesService;
import com.enesergen.fashionbackend.fashion.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@AllArgsConstructor
@RestController
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
    @GetMapping("/clothes/getAll")
    public ResponseEntity<List<GetMyAllClothesResponseDto>> getNyAllClothes(@RequestBody GetMyAllClothesRequestDto requestDto) {
        return ResponseEntity.ok(clothesService.getMyAllClothes(requestDto));
    }
    @GetMapping("/clothes/getOne")
    @Override
    public ResponseEntity<GetOneClothesResponseDto> getOneClohtes(@RequestBody GetOneClothesRequestDto requestDto) {
        return ResponseEntity.ok(clothesService.getOneClothes(requestDto));
    }
}
