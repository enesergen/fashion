package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.UserRegisterRequestDto;
import com.enesergen.fashionbackend.fashion.dto.UserRegisterResponseDto;
import com.enesergen.fashionbackend.fashion.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/user")
@AllArgsConstructor
@RestController
public class UserController implements UserApi{
    private final UserService userService;


}
