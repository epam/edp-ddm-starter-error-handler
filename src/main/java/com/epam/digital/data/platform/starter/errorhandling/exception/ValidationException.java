package com.epam.digital.data.platform.starter.errorhandling.exception;

import com.epam.digital.data.platform.starter.errorhandling.dto.ErrorsListDto;
import com.epam.digital.data.platform.starter.errorhandling.dto.ValidationErrorDto;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ValidationException extends RuntimeException {

  private String traceId;
  private String code;
  private String message;
  private ErrorsListDto details;

  public ValidationException(ValidationErrorDto validationErrorDto) {
    if (Objects.nonNull(validationErrorDto)) {
      this.traceId = validationErrorDto.getTraceId();
      this.code = validationErrorDto.getCode();
      this.message = validationErrorDto.getMessage();
      this.details = validationErrorDto.getDetails();
    }
  }
}
