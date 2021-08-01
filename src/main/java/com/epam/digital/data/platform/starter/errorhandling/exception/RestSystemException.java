package com.epam.digital.data.platform.starter.errorhandling.exception;

import com.epam.digital.data.platform.starter.errorhandling.dto.SystemErrorDto;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class RestSystemException extends SystemException {

  private final HttpStatus httpStatus;

  public RestSystemException(SystemErrorDto systemErrorDto, HttpStatus httpStatus) {
    super(systemErrorDto);
    this.httpStatus = httpStatus;
  }
}
