package com.enesergen.fashionbackend.fashion.controller;

import com.enesergen.fashionbackend.fashion.dto.*;
import com.enesergen.fashionbackend.fashion.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/user")
@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class UserController implements UserApi{
    private final UserService userService;

    @PutMapping("/changePassword")
    @Override
    public ResponseEntity<ChangePasswordResponseDto> changePassword(@RequestBody  ChangePasswordRequestDto requestDto) {
        return ResponseEntity.ok(userService.changePassword(requestDto));
    }



}
