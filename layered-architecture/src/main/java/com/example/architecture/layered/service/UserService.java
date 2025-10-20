package com.example.architecture.layered.service;

import com.example.architecture.layered.model.dto.request.CreateUserRequest;
import com.example.architecture.layered.model.dto.response.CreateUserResponse;

public interface UserService {

  CreateUserResponse createUser(CreateUserRequest createUserRequest);

}
