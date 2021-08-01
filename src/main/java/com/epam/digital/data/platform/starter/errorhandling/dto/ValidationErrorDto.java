package com.epam.digital.data.platform.starter.errorhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidationErrorDto {

  private String traceId;
  private String code;
  private String message;
  private ErrorsListDto details;
}
