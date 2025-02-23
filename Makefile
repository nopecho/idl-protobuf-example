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
	@test -f buf.yaml || ( \
    	$(BUF_CMD) config init && \
    	echo "version: v2\nclean: true\nmanaged:\n  enabled: true" > buf.gen.yaml \
    )

help:
	$(BUF_CMD) help
