package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.MakeCombineRequestDto;
import com.enesergen.fashionbackend.fashion.dto.MakeCombineResponseDto;
import com.enesergen.fashionbackend.fashion.service.CombineService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/combine")
public class CombineController implements CombineApi{
    private final CombineService combineService;
    @Override
    @GetMapping("/makeCombine")
    public ResponseEntity<MakeCombineResponseDto> makeCombine(@RequestBody MakeCombineRequestDto requestDto) {
        return ResponseEntity.ok(combineService.makeCombine(requestDto));
    }
}
