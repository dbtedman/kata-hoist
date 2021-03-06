.DEFAULT_GOAL := all

all: install lint compile test

install:
	@pnpm install

lint:
	@pnpm run lint

format:
	@pnpm run format

compile:
	@pnpm run build && ./gradlew build

test:
	@pnpm run test && ./gradlew test
