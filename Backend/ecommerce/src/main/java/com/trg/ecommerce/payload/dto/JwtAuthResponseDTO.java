package com.trg.ecommerce.payload.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JwtAuthResponseDTO {

    private String token;
    private String type = "Bearer";

    public JwtAuthResponseDTO(String accessToken) {
        this.token = accessToken;
    }
}
