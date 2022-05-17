# [Kata](https://github.com/dbtedman/kata) // [Hoist](https://github.com/dbtedman/kata-hoist)

> ⚠️ WARNING: Not production ready code.

[![ci workflow status](https://img.shields.io/github/workflow/status/dbtedman/kata-hoist/ci?style=for-the-badge&logo=github&label=ci)](https://github.com/dbtedman/kata-hoist/actions/workflows/ci.yml)
[![sast workflow status](https://img.shields.io/github/workflow/status/dbtedman/kata-hoist/sast?style=for-the-badge&logo=github&label=sast)](https://github.com/dbtedman/kata-hoist/actions/workflows/sast.yml)
![languages: java and typescript](https://img.shields.io/badge/languages-java%20and%20typescript-blue.svg?style=for-the-badge)
![framework: react](https://img.shields.io/badge/frameworks-spring%20and%20react-blue.svg?style=for-the-badge)

Lift simulation.

-   [Getting Started](#getting-started)
-   [Design](#design)
-   [License](#license)

## Getting Started

```shell
nvm use && make
```

Run SPA in development mode.

```shell
pnpm run dev
```

In another terminal window, start Spring BFF.

```shell
./gradlew bootRun
```

## Verification

### Linting

-   [Prettier](https://prettier.io)

```shell
make lint
```

These rules can then be automatically applied:

```shell
make format
```

### Unit Testing

```shell
make test
```

## Design

### Domain

#### [Door](./src/main/java/com/danieltedman/hoist/internal/domain/door/)

An entry/exit point that can be the origin or destination of a person.

#### [Floor](./src/main/java/com/danieltedman/hoist/internal/domain/floor/)

One or more doors or lift doors can appear on a floor.

#### [Lift Car](./src/main/java/com/danieltedman/hoist/internal/domain/liftcar/)

_Placeholder_

#### [Lift Door](./src/main/java/com/danieltedman/hoist/internal/domain/liftdoor/)

_Placeholder_

#### [Lift Queue](./src/main/java/com/danieltedman/hoist/internal/domain/liftqueue/)

People who are waiting on a floor for a lift.

#### [Lift Shaft](./src/main/java/com/danieltedman/hoist/internal/domain/liftshaft/)

Lift cars move up and down in this shaft.

#### [Person](./src/main/java/com/danieltedman/hoist/internal/domain/person/)

Someone who will use a lift.

#### [Scheduler](./src/main/java/com/danieltedman/hoist/internal/domain/scheduler/)

Populates people though doors on a defined schedule.

#### [Simulation](./src/main/java/com/danieltedman/hoist/internal/domain/simulation/)

Contains an initial state and series of rules that the system executes.

### Gateways

_Placeholder_

### Security Mitigations

> Initially based on the [OWASP Top 10 - 2021](https://owasp.org/www-project-top-ten/).

#### [A01:2021-Broken Access Control](https://owasp.org/Top10/A01_2021-Broken_Access_Control/)

[Github Security](https://github.com/features/security) detects secrets incorrectly committed into the repository.

#### [A02:2021-Cryptographic Failures](https://owasp.org/Top10/A02_2021-Cryptographic_Failures/)

_Placeholder_

#### [A03:2021-Injection](https://owasp.org/Top10/A03_2021-Injection/)

_Placeholder_

#### [A04:2021-Insecure Design](https://owasp.org/Top10/A04_2021-Insecure_Design/)

_Placeholder_

#### [A05:2021-Security Misconfiguration](https://owasp.org/Top10/A05_2021-Security_Misconfiguration/)

_Placeholder_

#### [A06:2021-Vulnerable and Outdated Components](https://owasp.org/Top10/A06_2021-Vulnerable_and_Outdated_Components/)

[Snyk](https://snyk.io) and [Github Security](https://github.com/features/security) scan Gradle and NPM dependencies for know vulnerabilities and create pull requests to resolve the vulnerabilities when available.

#### [A07:2021-Identification and Authentication Failures](https://owasp.org/Top10/A07_2021-Identification_and_Authentication_Failures/)

_Placeholder_

#### [A08:2021-Software and Data Integrity Failures](https://owasp.org/Top10/A08_2021-Software_and_Data_Integrity_Failures/)

_Placeholder_

#### [A09:2021-Security Logging and Monitoring Failures](https://owasp.org/Top10/A09_2021-Security_Logging_and_Monitoring_Failures/)

_Placeholder_

#### [A10:2021-Server-Side Request Forgery](https://owasp.org/Top10/A10_2021-Server-Side_Request_Forgery_%28SSRF%29/)

_Placeholder_

## References

-   [2021-02-15: How can I serve static html from spring boot?](https://stackoverflow.com/questions/42393211#answer-48862637)
-   [2021-02-15: Serve Static Resources with Spring](https://www.baeldung.com/spring-mvc-static-resources)
-   [2021-02-15: Setting up esbuild for TypeScript libraries](https://jamesthom.as/2021/05/setting-up-esbuild-for-typescript-libraries/)

## License

The [MIT License](./LICENSE.md) is used by this project.
