package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.MakeCombineRequestDto;
import com.enesergen.fashionbackend.fashion.dto.MakeCombineResponseDto;
import com.enesergen.fashionbackend.fashion.service.CombineService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/combine")
@CrossOrigin(origins = "http://localhost:8081")
public class CombineController implements CombineApi{
    private final CombineService combineService;
    @Override
    @GetMapping("/makeCombine")
    public ResponseEntity<MakeCombineResponseDto> makeCombine(@RequestBody MakeCombineRequestDto requestDto) {
        return ResponseEntity.ok(combineService.makeCombine(requestDto));
    }
}
