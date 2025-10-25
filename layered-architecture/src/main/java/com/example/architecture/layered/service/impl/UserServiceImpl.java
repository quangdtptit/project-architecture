package com.example.architecture.layered.service.impl;

import com.example.architecture.layered.model.dto.request.CreateUserRequest;
import com.example.architecture.layered.model.dto.response.CreateUserResponse;
import com.example.architecture.layered.model.entity.User;
import com.example.architecture.layered.model.exception.BadRequestException;
import com.example.architecture.layered.repository.UserRepository;
import com.example.architecture.layered.service.UserService;
import com.example.architecture.layered.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  private final UserMapper userMapper;

  @Transactional
  @Override
  public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
    boolean isEmailExists = userRepository.findByEmail(createUserRequest.getEmail(), null).isPresent();
    if (isEmailExists) {
      throw new BadRequestException("Email %s already exists".formatted(createUserRequest.getEmail()));
    }
    User user = userMapper.toUser(createUserRequest);
    userRepository.save(user);
    return userMapper.toCreateUserResponse(user);
  }


}
