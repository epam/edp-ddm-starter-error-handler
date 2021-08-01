package com.epam.digital.data.platform.starter.errorhandling.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetailDto implements Serializable {

  private String message;
  private String field;
  private String value;
}
