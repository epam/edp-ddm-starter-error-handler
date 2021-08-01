package com.epam.digital.data.platform.starter.errorhandling.config;

import com.epam.digital.data.platform.starter.errorhandling.BaseRestExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BaseRestExceptionHandler.class)
public class ErrorHandlingAutoConfiguration {

}
