package com.example.architecture.layered.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NotFoundException extends RuntimeException {

  public NotFoundException(String message) {
    super(message);
    this.message = message;
  }

  private String message;
  private Object error;
}
