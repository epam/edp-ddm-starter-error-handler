package com.epam.digital.data.platform.starter.errorhandling.exception;

import com.epam.digital.data.platform.starter.errorhandling.dto.SystemErrorDto;

public class SoapSystemException extends SystemException{

  public SoapSystemException(SystemErrorDto systemErrorDto) {
    super(systemErrorDto);
  }
}
