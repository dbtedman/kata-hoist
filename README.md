# [Kata](https://github.com/dbtedman/kata) // [Hoist](https://github.com/dbtedman/kata-hoist)

> ⚠️ WARNING: Not production ready code.

[![CI Results](https://github.com/dbtedman/kata-hoist/workflows/ci/badge.svg)](https://github.com/dbtedman/kata-hoist/actions?workflow=ci)

Lift simulation.

-   [Getting Started](#getting-started)
-   [Design](#design)
-   [License](#license)

## Getting Started

```shell
nvm use && make
```

## Design

### Domain Entities

-   **Door** - An entry/exit point that can be the origin or destination of a person.
-   **Floor** - One or more doors or lift doors can appear on a floor.
-   **Lift Car**
-   **Lift Door**
-   **Lift Queue** - People who are waiting on a floor for a lift.
-   **Lift Shaft** - Lift cars move up and down in this shaft.
-   **Person** - Someone who will use a lift.
-   **Scheduler** - Populates people though doors on a defined schedule.
-   **Simulation** - Contains an initial state and series of rules that the system executes.

### Domain Use Cases

-   **Schedule Path** - Schedules a person to travel between two doors.
-   **Tick** - Move the scenario forward one unit of time.

## License

The [MIT License](./LICENSE.md) is used by this project.
