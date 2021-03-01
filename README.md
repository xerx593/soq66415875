# soq66415875
Answer code for https://stackoverflow.com/q/66415875/592355 (Cannot reproduce/works like charm)

Demonstrates log4j2 usage in spring-boot. Uses configuration from `src/main/resources/log4j2.xml`.
Prints DEBUG log messages to console as to `${working_dir}/app-info.log` (according to configuration) and exits.


Tiny(iest) changes to original Post:
- removed (redundant) `<log4j2.version/>` from pom.xml (2.13.3 - same version as managed by spring-boot-starter:2.4.2)
- relative addressing of the log file.

(Clean) Test with:

    mvn clean test
    
(Clean) Run with:

    mvn clean spring-boot:run
