package com.enesergen.fashionbackend.fashion.service;

import com.enesergen.fashionbackend.fashion.dto.*;
import com.enesergen.fashionbackend.fashion.entity.Clothes;
import com.enesergen.fashionbackend.fashion.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {
    public UserRegisterResponseDto register(UserRegisterRequestDto requestDto);


    public ChangePasswordResponseDto changePassword(ChangePasswordRequestDto requestDto);


}
