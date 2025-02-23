.PHONY: gen lint format init help
BUF_CMD := docker run --rm \
--volume $(PWD):/workspace \
--workdir /workspace \
bufbuild/buf

gen:
	$(BUF_CMD) generate

lint:
	$(BUF_CMD) lint

format:
	$(BUF_CMD) format

init:
	$(BUF_CMD) config init

help:
	$(BUF_CMD) help
