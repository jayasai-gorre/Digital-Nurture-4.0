package com.gorrejayasai.jwt_hands_on.controller;

import com.gorrejayasai.jwt_hands_on.model.AuthRequest;
import com.gorrejayasai.jwt_hands_on.model.AuthResponse;
import com.gorrejayasai.jwt_hands_on.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author gorrejayasai
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest) {
        System.out.println("coming");
        // For demo: username=admin, password=password
        if ("admin".equals(authRequest.getUsername()) && "password".equals(authRequest.getPassword())) {
            String token = jwtUtil.generateToken(authRequest.getUsername());
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
