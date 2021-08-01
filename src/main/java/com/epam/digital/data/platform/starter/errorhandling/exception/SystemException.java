package com.epam.digital.data.platform.starter.errorhandling.exception;

import com.epam.digital.data.platform.starter.errorhandling.dto.SystemErrorDto;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SystemException extends RuntimeException {

  private String traceId;
  private String code;
  private String message;
  private String localizedMessage;

  public SystemException(SystemErrorDto systemErrorDto) {
    if (Objects.nonNull(systemErrorDto)) {
      this.traceId = systemErrorDto.getTraceId();
      this.code = systemErrorDto.getCode();
      this.message = systemErrorDto.getMessage();
      this.localizedMessage = systemErrorDto.getLocalizedMessage();
    }
  }
}
