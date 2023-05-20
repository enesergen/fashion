package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.MakeCombineRequestDto;
import com.enesergen.fashionbackend.fashion.dto.MakeCombineResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CombineApi {
    public ResponseEntity<MakeCombineResponseDto> makeCombine(MakeCombineRequestDto requestDto);
}
