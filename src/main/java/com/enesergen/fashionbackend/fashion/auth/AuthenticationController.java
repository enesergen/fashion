package com.enesergen.fashionbackend.fashion.auth;

import com.enesergen.fashionbackend.fashion.dto.UserRegisterRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody UserRegisterRequestDto requestDto) {
        return ResponseEntity.ok(authenticationService.register(requestDto));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse>authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
