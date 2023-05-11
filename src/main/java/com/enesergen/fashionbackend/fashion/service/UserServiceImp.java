package com.enesergen.fashionbackend.fashion.service;

import com.enesergen.fashionbackend.fashion.dto.*;
import com.enesergen.fashionbackend.fashion.entity.Role;
import com.enesergen.fashionbackend.fashion.entity.User;
import com.enesergen.fashionbackend.fashion.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserRegisterResponseDto register(UserRegisterRequestDto requestDto) {

        var newUser = new User(requestDto.getFirstname(),
                requestDto.getLastname(),
                requestDto.getEmail(),
                requestDto.getPassword(),
                Role.USER,
                new ArrayList<>());
        var result = userRepository.save(newUser);


        if (userRepository.existsById(result.getId())) {
            return new
                    UserRegisterResponseDto(
                    true,
                    String.format("%s %s is saved.", result.getFirstName(), result.getLastName()));
        } else {
            return new UserRegisterResponseDto(false, "Error.");
        }

    }

    @Override
    public UserResponseDto getUserByUsername(UserRequestDto requestDto) {
        var user = userRepository.findByEmail(requestDto.getEmail());
        if (user.isPresent()) {
            return new UserResponseDto(
                    user.get().getFirstName(),
                    user.get().getLastName(),
                    user.get().getEmail()
            );
        } else {
            throw new UsernameNotFoundException("Username not found");
        }
    }

    @Override
    public ChangePasswordResponseDto changePassword(ChangePasswordRequestDto requestDto) {
        var user = userRepository.findById(Long.parseLong(requestDto.getUserId()));
        if (user.isPresent() && user.get().getPassword().equals(requestDto.getOldPassword())) {
            user.get().setPassword(requestDto.getNewPassword());
            userRepository.save(user.get());
            return new ChangePasswordResponseDto(true, "Password was changed");
        } else {
            return new ChangePasswordResponseDto(false, "Error");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).
                orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}

