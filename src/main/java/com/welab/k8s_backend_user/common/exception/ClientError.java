package com.welab.k8s_backend_user.common.exception;

import lombok.Getter;

@Getter
public abstract class ClientError extends ApiError {
  public ClientError(String errorCode, String message) {
    this.errorCode = errorCode;
    this.errorMessage = message;
  }
}
