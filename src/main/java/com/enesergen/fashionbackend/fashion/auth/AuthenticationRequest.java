package com.enesergen.fashionbackend.fashion.auth;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    private String email;
    private String password;
}
