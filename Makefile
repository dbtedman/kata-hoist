.DEFAULT_GOAL := all

all: install lint test

install:
	@pnpm install

lint:
	@pnpm run lint

format:
	@pnpm run format

test:
	@./gradlew test
