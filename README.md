# Protocol Buffers IDL repository

[Protocol Buffers(protobuf)](https://protobuf.dev/overview/)와 [Buf CLI](https://buf.build/docs/cli/) 기반으로 protobuf IDL을
관리하는 중앙 저장소 구현 예제

## Getting Started

1. [buf.yaml](https://buf.build/docs/configuration/v2/buf-yaml/), [buf.gen.yaml](https://buf.build/docs/configuration/v2/buf-gen-yaml/)
   설정 파일 추가

```shell
make init
```


2. `buf.gen.yaml` 설정

```yaml
version: v2
clean: true
managed:
  enabled: true
plugins:
  # java
  - remote: buf.build/protocolbuffers/java
    out: generated/java # generated code output directory
  # kotlin
  - remote: buf.build/protocolbuffers/kotlin
    out: generated/kotlin
  # javascript/typescript
  - remote: buf.build/bufbuild/es
    out: generated/js
```

3. `.proto` 파일 작성

```protobuf
syntax = "proto3";

package example;

message Foo {
  string name = 1;
  int32 age = 2;
}
```

4. 코드 생성
```shell
make gen
```

## Example Code

- [example-java](./example/example-java/README.md)
- [example-kotlin](./example/example-kotlin/README.md)
- [example-react](./example/example-react/README.md)
- [example-node](./example/example-node/README.md)