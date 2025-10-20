package com.example.architecture.layered.controller;

import com.example.architecture.layered.model.dto.response.ApiResult;
import com.example.architecture.layered.model.exception.BadRequestException;
import com.example.architecture.layered.model.exception.NotFoundException;
import com.example.architecture.layered.utils.MessageUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
public class BaseController {

  @ExceptionHandler({MethodArgumentNotValidException.class})
  public ResponseEntity<ApiResult<Void>> handleMethodArgumentNotValidException(
      MethodArgumentNotValidException exception) {
    String message = "Invalid request";
    try {
      message = MessageUtils.getMessage(
          exception.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    } catch (Exception ex) {
      log.error(ex.getMessage(), ex);
    }
    var response = ApiResult.badRequest(message);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
  }

  @ExceptionHandler({BadRequestException.class})
  public ResponseEntity<ApiResult<Void>> handleBadRequestException(BadRequestException exception) {
    var response = ApiResult.badRequest(exception.getMessage());
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
  }

  @ExceptionHandler({NotFoundException.class})
  public ResponseEntity<ApiResult<Void>> handleNotFoundException(NotFoundException exception) {
    var response = ApiResult.badRequest(exception.getMessage());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
  }

  @ExceptionHandler({Exception.class})
  public ResponseEntity<ApiResult<Void>> handleException(Exception exception) {
    log.error(exception.getMessage(), exception);
    var response = ApiResult.internalServer();
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
  }

  private static List<String> stackTraceToListMessages(StackTraceElement[] elements) {
    return elements != null
        ? Arrays.stream(elements).map(StackTraceElement::toString).collect(Collectors.toList())
        : Collections.emptyList();
  }

}
