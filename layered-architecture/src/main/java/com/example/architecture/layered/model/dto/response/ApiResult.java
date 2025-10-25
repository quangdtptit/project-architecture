package com.example.architecture.layered.model.dto.response;

import com.example.architecture.layered.utils.MessageUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResult<T> {

  private String code;
  private String message;
  private T data;

  public static <T> ApiResult<T> success(T data) {
    return ApiResult.<T>builder().code("200").message("success").data(data).build();
  }

  public static ApiResult<Void> badRequest() {
    return ApiResult.<Void>builder().code("400")
        .message("bad request")
        .build();
  }

  public static ApiResult<Void> badRequest(String message) {
    return ApiResult.<Void>builder().code("400")
        .message(message)
        .build();
  }

  public static <T> ApiResult<T> badRequest(String message, T data) {
    return ApiResult.<T>builder().code("400")
        .message(message)
        .data(data)
        .build();
  }

  public static ApiResult<Void> unauthorized() {
    return ApiResult.<Void>builder().code("401")
        .message("unauthorized")
        .build();
  }

  public static ApiResult<Void> unauthorized(String message) {
    return ApiResult.<Void>builder().code("401")
        .message(message)
        .build();
  }

  public static ApiResult<Void> forbidden() {
    return ApiResult.<Void>builder().code("403")
        .message("forbidden")
        .build();
  }

  public static ApiResult<Void> notFound(String message) {
    return ApiResult.<Void>builder().code("404")
        .message(message)
        .build();
  }

  public static ApiResult<Void> internalServer() {
    return ApiResult.<Void>builder().code("500")
        .message(MessageUtils.getMessage("system.error"))
        .build();
  }
}
