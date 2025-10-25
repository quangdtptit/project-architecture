package com.example.architecture.layered.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BadRequestException extends RuntimeException {

  public BadRequestException(String message) {
    super(message);
    this.message = message;
  }

  private String message;
  private Object error;

}
