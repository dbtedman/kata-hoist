# [Hoist](https://github.com/dbtedman/kata-hoist)

> **⚠️ WARNING:** Not production ready code, instead a [Code Kata](https://github.com/dbtedman#code-kata) intended to
> hone my programming skills through practice and repetition.

[![ci workflow status](https://img.shields.io/github/workflow/status/dbtedman/kata-hoist/ci?style=for-the-badge&logo=github&label=ci)](https://github.com/dbtedman/kata-hoist/actions/workflows/ci.yml)
[![sast workflow status](https://img.shields.io/github/workflow/status/dbtedman/kata-hoist/sast?style=for-the-badge&logo=github&label=sast)](https://github.com/dbtedman/kata-hoist/actions/workflows/sast.yml)

Lift simulation.

-   [Getting Started](#getting-started)
-   [Verification](#verification)
-   [Design](#design)
-   [Security](#security)
-   [References](#references)
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

#### [Door](./src/main/java/com/danieltedman/hoist/internal/domain/entity/door/)

An entry/exit point that can be the origin or destination of a person.

#### [Floor](./src/main/java/com/danieltedman/hoist/internal/domain/entity/floor/)

One or more doors or lift doors can appear on a floor.

#### [Lift Car](./src/main/java/com/danieltedman/hoist/internal/domain/entity/liftcar/)

_Placeholder_

#### [Lift Door](./src/main/java/com/danieltedman/hoist/internal/domain/entity/liftdoor/)

_Placeholder_

#### [Lift Queue](./src/main/java/com/danieltedman/hoist/internal/domain/entity/liftqueue/)

People who are waiting on a floor for a lift.

#### [Lift Shaft](./src/main/java/com/danieltedman/hoist/internal/domain/entity/liftshaft/)

Lift cars move up and down in this shaft.

#### [Person](./src/main/java/com/danieltedman/hoist/internal/domain/entity/person/)

Someone who will use a lift.

#### [Scheduler](./src/main/java/com/danieltedman/hoist/internal/domain/entity/scheduler/)

Populates people though doors on a defined schedule.

#### [Simulation](./src/main/java/com/danieltedman/hoist/internal/domain/entity/simulation/)

Contains an initial state and series of rules that the system executes.

### [Universe](./src/main/java/com/danieltedman/hoist/internal/domain/entity/universe/)

The top level coordination object that knows about all simulations.

### Gateways

_Placeholder_

## Security

See the [Security Policy](./SECURITY.md).

## References

-   2021-02-15: [How can I serve static html from spring boot?](https://stackoverflow.com/questions/42393211#answer-48862637)
-   2021-02-15: [Serve Static Resources with Spring](https://www.baeldung.com/spring-mvc-static-resources)
-   2021-02-15: [Setting up esbuild for TypeScript libraries](https://jamesthom.as/2021/05/setting-up-esbuild-for-typescript-libraries/)
-   2022-05-29: [AssertJ Core Documentation](https://assertj.github.io/doc/)

## License

The [MIT License](./LICENSE.md) is used by this project.
