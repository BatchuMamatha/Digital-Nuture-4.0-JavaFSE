package com.cognizant.jwt.model;

/**
 * JWT Token Response Model
 */
public class JwtResponse {
    
    private String token;
    
    public JwtResponse() {
    }
    
    public JwtResponse(String token) {
        this.token = token;
    }
    
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    @Override
    public String toString() {
        return "JwtResponse{" +
                "token='" + token + '\'' +
                '}';
    }
}
