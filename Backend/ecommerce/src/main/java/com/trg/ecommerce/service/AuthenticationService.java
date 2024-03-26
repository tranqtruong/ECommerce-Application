package com.trg.ecommerce.service;

import com.trg.ecommerce.payload.dto.LoginDTO;

public interface AuthenticationService {

    String login(LoginDTO loginDTO);
}
