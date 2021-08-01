package com.epam.digital.data.platform.starter.errorhandling.dto;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorsListDto implements Serializable {

  private List<ErrorDetailDto> errors;
}
