.PHONY: gen lint format init help gen-jvm
BUF_CMD := docker run --rm \
--volume $(PWD):/workspace \
--workdir /workspace \
bufbuild/buf

gen:
	$(BUF_CMD) generate --clean

lint:
	$(BUF_CMD) lint

format:
	$(BUF_CMD) format

init:
	@test -f buf.yaml || ( \
    	$(BUF_CMD) config init && \
    	echo "version: v2\nclean: true\nmanaged:\n  enabled: true" > buf.gen.yaml \
    )

help:
	$(BUF_CMD) help

gen-ex-jvm:
	$(BUF_CMD) generate --clean -o ./example/example-java && \
	rm -rf ./example/example-java/generated/ts && \
	$(BUF_CMD) generate --clean -o ./example/example-kotlin && \
	rm -rf ./example/example-kotlin/generated/ts

gen-ex-ts:
	$(BUF_CMD) generate --clean -o ./example/example-node && \
	rm -rf ./example/example-node/generated/java && \
	rm -rf ./example/example-node/generated/kotlin && \
	$(BUF_CMD) generate --clean -o ./example/example-react && \
	rm -rf ./example/example-react/generated/java && \
	rm -rf ./example/example-react/generated/kotlin