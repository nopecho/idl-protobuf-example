# Java Example

* protobuf 관련 `build.gradle` 의존성 추가

```groovy
dependencies {
    // protobuf 의존성 추가
    implementation "com.google.protobuf:protobuf-java:$protobufVersion"
    implementation "com.google.protobuf:protobuf-java-util:$protobufVersion"
    // jackson 의존성 추가 json <-> protobuf 변환
    implementation "com.hubspot.jackson:jackson-datatype-protobuf:$jacksonProtobufVersion"
}

// 자동 생성된 코드 source set 설정
sourceSets {
    main {
        java.srcDirs += "generated/java"
    }
}
```

<br>

* protobuf 객체 Json 변환을 위한 `ObjectMapper` 빈 등록

```java
@Configuration
public class ObjectMapperConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper()
                .registerModule(new ProtobufModule());
    }
}
```