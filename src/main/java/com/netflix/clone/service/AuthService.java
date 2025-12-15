package com.netflix.clone.service;

import com.netflix.clone.dto.request.UserRequest;
import com.netflix.clone.dto.response.EmailValidationResponse;
import com.netflix.clone.dto.response.LoginResponse;
import com.netflix.clone.dto.response.MessageResponse;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.jspecify.annotations.Nullable;

public interface AuthService {
	
	MessageResponse signup(UserRequest userRequest);
	
	LoginResponse login(String email, String password);
	
	EmailValidationResponse validateEmail(String email);
	
	MessageResponse verifyEmail(String token);
	
	MessageResponse resendVerificationEmail(String email);
	
	MessageResponse forgotPassword(String email);
	
	MessageResponse resetPasswod(String token, String newPassword);
	
	MessageResponse changePassword(String email, String currentPassword, String newPassword);
	
	LoginResponse currentUser(String email);
}
