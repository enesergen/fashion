package com.enesergen.fashionbackend.fashion.service;

import com.enesergen.fashionbackend.fashion.dto.MakeCombineRequestDto;
import com.enesergen.fashionbackend.fashion.dto.MakeCombineResponseDto;
import com.enesergen.fashionbackend.fashion.entity.Combine;
import org.springframework.stereotype.Service;

@Service
public interface CombineService {

    public MakeCombineResponseDto makeCombine(MakeCombineRequestDto requestDto);
}
