An example showing that in Spring Boot 3.3.3 (Spring Security 6.3.3) it is not enough to register a bean of type `CorsConfigurationSource` to enable CORS, but `UrlBasedCorsConfigurationSource` is needed.

There are two tests running exactly the same tests, but with different configuration:
* `CorsWithUrlBasedCorsConfigurationSourceTest` - `@Bean` returning `UrlBasedCorsConfigurationSource`
* `CorsWithCorsConfigurationSourceTest` - `@Bean` returning `CorsConfigurationSource`

When you run the tests with `./gradlew test` you will see the `CorsWithCorsConfigurationSourceTest` has multiple failures because CORS is not enabled in this scenario.