package com.epam.digital.data.platform.starter.errorhandling.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemErrorDto {

  private String traceId;
  @JsonAlias("type")
  private String code;
  private String message;
  private String localizedMessage;
}
