package com.example.architecture.layered.controller;

import com.example.architecture.layered.model.dto.request.CreateUserRequest;
import com.example.architecture.layered.model.dto.response.ApiResult;
import com.example.architecture.layered.model.dto.response.CreateUserResponse;
import com.example.architecture.layered.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping
  public ApiResult<CreateUserResponse> create(@RequestBody @Valid CreateUserRequest request) {
    return ApiResult.success(userService.createUser(request));
  }

}
