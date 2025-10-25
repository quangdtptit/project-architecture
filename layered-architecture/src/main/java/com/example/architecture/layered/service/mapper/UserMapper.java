package com.example.architecture.layered.service.mapper;

import com.example.architecture.layered.model.dto.request.CreateUserRequest;
import com.example.architecture.layered.model.dto.response.CreateUserResponse;
import com.example.architecture.layered.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  User toUser(CreateUserRequest createUserRequest);

  CreateUserResponse toCreateUserResponse(User user);
}
