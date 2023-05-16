package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserApi {
public ResponseEntity<ChangePasswordResponseDto>changePassword(ChangePasswordRequestDto requestDto);
}
