package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.UserRegisterRequestDto;
import com.enesergen.fashionbackend.fashion.dto.UserRegisterResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserApi {
    ResponseEntity<UserRegisterResponseDto> register(UserRegisterRequestDto requestDto);

}
