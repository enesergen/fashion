package com.enesergen.fashionbackend.fashion.auth;

import com.enesergen.fashionbackend.fashion.config.JwtService;
import com.enesergen.fashionbackend.fashion.dto.UserInfo;
import com.enesergen.fashionbackend.fashion.dto.UserRegisterRequestDto;
import com.enesergen.fashionbackend.fashion.entity.Role;
import com.enesergen.fashionbackend.fashion.entity.User;
import com.enesergen.fashionbackend.fashion.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(UserRegisterRequestDto userRegisterRequestDto){
        var user= User.builder()
                .firstName(userRegisterRequestDto.getFirstname())
                .lastName(userRegisterRequestDto.getLastname())
                .email(userRegisterRequestDto.getEmail())
                .password(passwordEncoder.encode(userRegisterRequestDto.getPassword()))
                .role(Role.USER)
                .build();
        userRepository.save(user);
        var jwtToken=jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
    public AuthenticationResponse authenticate(AuthenticationRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                request.getEmail(),
                request.getPassword()
        ));
        var user=userRepository.findByEmail(request.getEmail()).orElseThrow();
        var jwtToken=jwtService.generateToken(user);
        var userInfo=new UserInfo(user.getFirstName(), user.getLastName(), user.getEmail());
        return AuthenticationResponse.builder().token(jwtToken).userInfo(userInfo).build();
    }
}
