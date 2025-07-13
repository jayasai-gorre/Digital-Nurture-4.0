package com.gorrejayasai.jwt_hands_on.model;

/**
 * @author gorrejayasai
 */
public class AuthRequest {
    private String username;
    private String password;

    public String getUsername() { 
        return username; 
    }

    public void setUsername(String username) { 
        this.username = username; 
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) { 
        this.password = password; 
    }
}
