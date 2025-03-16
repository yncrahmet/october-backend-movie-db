package com.movieBackend.services.abstracts;

import com.movieBackend.dtos.auth.AuthenticationResponse;
import com.movieBackend.dtos.auth.LoginRequest;
import com.movieBackend.dtos.auth.RegisterRequest;

public interface IAuthService {

    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse login(LoginRequest request);

    void requestPasswordReset(String email);

}
