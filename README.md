# [Kata](https://github.com/dbtedman/kata) // [Hoist](https://github.com/dbtedman/kata-hoist)

> ⚠️ WARNING: Not production ready code.

[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/dbtedman/kata-hoist/ci?style=for-the-badge&logo=github&label=ci)](https://github.com/dbtedman/kata-hoist/actions/workflows/cy.yml)
![language: java](https://img.shields.io/badge/language-java-blue.svg?style=for-the-badge&logo=java)
![language: typescript](https://img.shields.io/badge/language-typescript-blue.svg?style=for-the-badge&logo=typescript)
![framework: react](https://img.shields.io/badge/framework-react-red.svg?style=for-the-badge&logo=react)
![framework: spring](https://img.shields.io/badge/framework-spring-red.svg?style=for-the-badge&logo=spring)

Lift simulation.

-   [Getting Started](#getting-started)
-   [Design](#design)
-   [License](#license)

## Getting Started

```shell
nvm use && make
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

> 🚧 Placeholder

## Design

### Domain Entities

| Entity       | Notes                                                                   |
| :----------- | :---------------------------------------------------------------------- |
| `Door`       | An entry/exit point that can be the origin or destination of a person.  |
| `Floor`      | One or more doors or lift doors can appear on a floor.                  |
| `LiftCar`    |                                                                         |
| `LiftDoor`   |                                                                         |
| `LiftQueue`  | People who are waiting on a floor for a lift.                           |
| `LiftShaft`  | Lift cars move up and down in this shaft.                               |
| `Person`     | Someone who will use a lift.                                            |
| `Scheduler`  | Populates people though doors on a defined schedule.                    |
| `Simulation` | Contains an initial state and series of rules that the system executes. |

### Domain Use Cases

| Use Case       | Notes                                           |
| :------------- | :---------------------------------------------- |
| `SchedulePath` | Schedules a person to travel between two doors. |
| `Tick`         | Move the scenario forward one unit of time.     |

### Gateways

| Gateway | Notes |
| :------ | :---- |
|         |       |

### Security Mitigations

> Initially based on the [OWASP Top 10 - 2021](https://owasp.org/www-project-top-ten/).

| Security Risk                                                                                                                       | Mitigation |
| :---------------------------------------------------------------------------------------------------------------------------------- | :--------- |
| [A01:2021-Broken Access Control](https://owasp.org/Top10/A01_2021-Broken_Access_Control/)                                           |            |
| [A02:2021-Cryptographic Failures](https://owasp.org/Top10/A02_2021-Cryptographic_Failures/)                                         |            |
| [A03:2021-Injection](https://owasp.org/Top10/A03_2021-Injection/)                                                                   |            |
| [A04:2021-Insecure Design](https://owasp.org/Top10/A04_2021-Insecure_Design/)                                                       |            |
| [A05:2021-Security Misconfiguration](https://owasp.org/Top10/A05_2021-Security_Misconfiguration/)                                   |            |
| [A06:2021-Vulnerable and Outdated Components](https://owasp.org/Top10/A06_2021-Vulnerable_and_Outdated_Components/)                 |            |
| [A07:2021-Identification and Authentication Failures](https://owasp.org/Top10/A07_2021-Identification_and_Authentication_Failures/) |            |
| [A08:2021-Software and Data Integrity Failures](https://owasp.org/Top10/A08_2021-Software_and_Data_Integrity_Failures/)             |            |
| [A09:2021-Security Logging and Monitoring Failures](https://owasp.org/Top10/A09_2021-Security_Logging_and_Monitoring_Failures/)     |            |
| [A10:2021-Server-Side Request Forgery](https://owasp.org/Top10/A10_2021-Server-Side_Request_Forgery_%28SSRF%29/)                    |            |

## References

-   [Setting up esbuild for TypeScript libraries](https://jamesthom.as/2021/05/setting-up-esbuild-for-typescript-libraries/)

## License

The [MIT License](./LICENSE.md) is used by this project.
