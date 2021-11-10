# ddm-starter-error-handler

### Overview

* Project with configuration for handling system and validation errors.

### Usage

1. Specify dependency in your service:

```xml

<dependencies>
  ...
  <dependency>
    <groupId>com.epam.digital.data.platform</groupId>
    <artifactId>ddm-starter-error-handler</artifactId>
    <version>...</version>
  </dependency>
  ...
</dependencies>
```
2. Auto-configuration should be activated through the `@SpringBootApplication`
   or `@EnableAutoConfiguration` annotation in main class.

### Test execution

* Tests could be run via maven command:
    * `mvn verify` OR using appropriate functions of your IDE.

### License

The ddm-starter-error-handler is released under version 2.0 of
the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).